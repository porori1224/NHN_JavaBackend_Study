import java.util.Random;

public class GameOfLifeExample {
    private boolean[][] grid;
    private int rows, cols;

    public GameOfLifeExample(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new boolean[rows][cols];
    }

    public static void main(String[] args) {
        GameOfLifeExample game = new GameOfLifeExample(10, 20);

        System.out.println("=== Conway의 생명 게임 ===");

        // 글라이더 패턴 설정
        game.setGliderPattern(1, 1);

        // 5세대 진화 시뮬레이션
        for (int generation = 0; generation < 5; generation++) {
            System.out.println("세대 " + generation + ":");
            game.printGrid();
            System.out.println();

            game.nextGeneration();

            // 잠시 대기 (시각적 효과)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("세대 5:");
        game.printGrid();
    }

    public void setCell(int row, int col, boolean alive) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            grid[row][col] = alive;
        }
    }

    public void setGliderPattern(int startRow, int startCol) {
        // 글라이더 패턴:
        //  .X.
        //  ..X
        //  XXX
        setCell(startRow, startCol + 1, true);
        setCell(startRow + 1, startCol + 2, true);
        setCell(startRow + 2, startCol, true);
        setCell(startRow + 2, startCol + 1, true);
        setCell(startRow + 2, startCol + 2, true);
    }

    // TODO: 다음 세대 계산 메서드를 작성하세요
    // 모든 셀을 검사하여 생명 게임 규칙 적용
    public void nextGeneration() {
        boolean[][] next = new boolean[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int neighbors = countNeighbors(r, c);

                if (grid[r][c]) {
                    next[r][c] = (neighbors == 2 || neighbors == 3);
                } else {
                    next[r][c] = (neighbors == 3);
                }
            }
        }
        grid = next;
    }

    // TODO: 주변 이웃 개수 세기 메서드를 작성하세요
    // 8방향 이웃 셀 중 살아있는 셀의 개수 반환
    private int countNeighbors(int row, int col) {
        int count = 0;
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) continue; // 자기 자신 제외
                int nr = row + dr;
                int nc = col + dc;
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                    if (grid[nr][nc]) count++;
                }
            }
        }
        return count;
    }

    // TODO: 격자 출력 메서드를 작성하세요
    // 살아있는 셀은 ●, 죽은 셀은 ○로 출력
    public void printGrid() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(grid[r][c] ? '●' : '○');
            }
            System.out.println();
        }
    }

    // TODO: 랜덤 초기화 메서드를 작성하세요
    // 주어진 확률로 각 셀을 살아있게 설정
    public void randomize(double probability) {
        Random rnd = new Random();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                grid[r][c] = rnd.nextDouble() < probability;
            }
        }
    }
}