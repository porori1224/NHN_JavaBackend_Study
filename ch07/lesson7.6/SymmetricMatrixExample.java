public class SymmetricMatrixExample {

    // 대칭 행렬 클래스
    static class SymmetricMatrix {
        private double[][] data;  // 삼각형 배열로 저장
        private int size;

        // TODO: 생성자를 작성하세요
        // 삼각형 모양의 2차원 배열 생성 (메모리 절약)
        public SymmetricMatrix(int size) {
            this.size = size;
            this.data = new double[size][];
            for (int i = 0; i < size; i++) {
                data[i] = new double[i + 1]; // 하삼각(대각 포함)만 저장
            }
        }

        // TODO: 값 조회 메서드를 작성하세요
        // 대칭성을 이용하여 올바른 위치에서 값 반환
        public double get(int row, int col) {
            if (row < 0 || row >= size || col < 0 || col >= size) {
                throw new IndexOutOfBoundsException();
            }
            // 저장은 (max,row/col) 행의 (min,row/col) 열에 함
            int r = Math.max(row, col);
            int c = Math.min(row, col);
            return data[r][c];
        }

        // TODO: 값 설정 메서드를 작성하세요
        // 대칭성을 이용하여 올바른 위치에 값 저장
        public void set(int row, int col, double value) {
            if (row < 0 || row >= size || col < 0 || col >= size) {
                throw new IndexOutOfBoundsException();
            }
            int r = Math.max(row, col);
            int c = Math.min(row, col);
            data[r][c] = value;
        }

        public int getSize() {
            return size;
        }

        // TODO: 행렬 출력 메서드를 작성하세요
        // 전체 대칭 행렬을 보기 좋게 출력
        public void printMatrix() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    // get(i,j)로 전체 행렬 재구성해 출력
                    System.out.printf("%6.2f", get(i, j));
                }
                System.out.println();
            }
        }

        // TODO: 저장 정보 출력 메서드를 작성하세요
        // 실제 저장된 요소 개수와 메모리 절약량 출력
        public void printStorageInfo() {
            int total = size * size;                 // 전체 요소 수
            int stored = size * (size + 1) / 2;      // 대각 포함 하삼각 요소 수
            double saving = (1.0 - (stored / (double) total)) * 100.0;

            System.out.println("=== 저장 정보 ===");
            System.out.println("행렬 크기: " + size + "x" + size);
            System.out.println("전체 요소 수: " + total);
            System.out.println("실제 저장된 요소 수: " + stored);
            System.out.printf("메모리 절약률: %.1f%%%n", saving);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== 대칭 행렬 예제 ===");

        // 5x5 대칭 행렬 생성
        SymmetricMatrix matrix = new SymmetricMatrix(5);

        // 값 설정 (대칭으로 자동 저장됨)
        matrix.set(0, 0, 1.0);
        matrix.set(0, 1, 2.0);
        matrix.set(0, 2, 3.0);
        matrix.set(1, 1, 4.0);
        matrix.set(1, 2, 5.0);
        matrix.set(1, 3, 6.0);
        matrix.set(2, 2, 7.0);
        matrix.set(2, 3, 8.0);
        matrix.set(2, 4, 9.0);
        matrix.set(3, 3, 10.0);
        matrix.set(3, 4, 11.0);
        matrix.set(4, 4, 12.0);

        System.out.println("대칭 행렬:");
        matrix.printMatrix();

        System.out.println();
        matrix.printStorageInfo();

        // 대칭성 확인
        System.out.println("\n=== 대칭성 확인 ===");
        System.out.println("matrix[1][3] = " + matrix.get(1, 3));
        System.out.println("matrix[3][1] = " + matrix.get(3, 1));
        System.out.println("대칭? " + (matrix.get(1, 3) == matrix.get(3, 1)));

        // 상관관계 행렬 예제
        System.out.println("\n=== 상관관계 행렬 예제 ===");
        SymmetricMatrix correlation = createCorrelationMatrix();
        correlation.printMatrix();
    }

    public static SymmetricMatrix createCorrelationMatrix() {
        // 5개 변수간의 상관관계 행렬 (예시)
        SymmetricMatrix corr = new SymmetricMatrix(5);

        // 대각선은 1.0 (자기 자신과의 상관관계)
        for (int i = 0; i < 5; i++) {
            corr.set(i, i, 1.0);
        }

        // 상관관계 값들 설정
        corr.set(0, 1, 0.85);
        corr.set(0, 2, 0.72);
        corr.set(0, 3, 0.43);
        corr.set(0, 4, 0.67);
        corr.set(1, 2, 0.91);
        corr.set(1, 3, 0.58);
        corr.set(1, 4, 0.74);
        corr.set(2, 3, 0.39);
        corr.set(2, 4, 0.82);
        corr.set(3, 4, 0.51);

        return corr;
    }
}