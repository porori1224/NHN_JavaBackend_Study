import java.util.Scanner;

public class TicTacToeExample {
    private static char[][] board = new char[3][3];
    private static final char EMPTY = ' ';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== 틱택토 게임 ===");
        initializeBoard();

        char currentPlayer = PLAYER_X;
        boolean gameWon = false;
        int moves = 0;

        while (!gameWon && moves < 9) {
            printBoard();
            System.out.println("현재 플레이어: " + currentPlayer);

            if (makeMove(currentPlayer)) {
                moves++;
                gameWon = checkWinner(currentPlayer);

                if (gameWon) {
                    printBoard();
                    System.out.println("플레이어 " + currentPlayer + "가 승리했습니다!");
                } else {
                    currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
                }
            }
        }

        if (!gameWon) {
            printBoard();
            System.out.println("무승부입니다!");
        }
    }

    // TODO: 보드 초기화 메서드를 작성하세요
    // 3x3 보드의 모든 칸을 EMPTY로 설정
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    // TODO: 보드 출력 메서드를 작성하세요
    // 행 번호와 열 번호를 포함하여 보드 출력
    public static void printBoard() {
        System.out.println("\n현재 보드: ");
        System.out.println("  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d %c | %c | %c%n",
                    i, board[i][0], board[i][1], board[i][2]);

            if (i < 2) {
                System.out.println("  ---------");
            }
        }
        System.out.println();
    }

    public static boolean makeMove(char player) {
        System.out.print("행과 열을 입력하세요 (예: 1 2): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        if (isValidMove(row, col)) {
            board[row][col] = player;
            return true;
        } else {
            System.out.println("잘못된 위치입니다. 다시 시도하세요.");
            return false;
        }
    }

    // TODO: 유효한 이동인지 확인하는 메서드를 작성하세요
    // 범위 검사와 빈 칸 검사 필요
    public static boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }

        return board[row][col] == EMPTY;
    }

    // TODO: 승리 검사 메서드를 작성하세요
    // 행, 열, 대각선 검사 모두 구현
    public static boolean checkWinner(char player) {
        // 행 검사
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // 열 검사
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // 대각선 검사
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}