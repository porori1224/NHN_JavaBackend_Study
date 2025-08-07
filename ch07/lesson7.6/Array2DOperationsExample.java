public class Array2DOperationsExample {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        System.out.println("행렬 1:");
        printMatrix(matrix1);

        System.out.println("\n행렬 2:");
        printMatrix(matrix2);

        // 행렬 덧셈
        int[][] sum = addMatrices(matrix1, matrix2);
        System.out.println("\n행렬 덧셈 결과:");
        printMatrix(sum);

        // 행렬 전치
        int[][] transposed = transpose(matrix1);
        System.out.println("\n행렬 1의 전치:");
        printMatrix(transposed);

        // 행렬 곱셈
        int[][] product = multiplyMatrices(matrix1, matrix2);
        System.out.println("\n행렬 곱셈 결과:");
        printMatrix(product);

        // 통계 계산
        System.out.println("\n=== 통계 정보 ===");
        System.out.println("행렬 1 합계: " + calculateSum(matrix1));
        System.out.println("행렬 1 평균: " + calculateAverage(matrix1));
        System.out.println("행렬 1 최대값: " + findMax(matrix1));
        System.out.println("행렬 1 최소값: " + findMin(matrix1));
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }
    }

    // TODO: 행렬 덧셈 메서드를 작성하세요
    // 매개변수: int[][] a, int[][] b
    // 반환값: int[][] (a + b)
    // 조건: 두 행렬의 크기가 같아야 함
    public static int[][] addMatrices(int[][] a, int[][] b) {
        // TODO: 크기 검사
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("행렬 크기가 다릅니다");
        }

        // TODO: 결과 행렬 생성
        int[][] result = new int[a.length][a[0].length];

        // TODO: 각 요소를 더하기
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // TODO: 행렬 전치 메서드를 작성하세요
    // 매개변수: int[][] matrix
    // 반환값: int[][] (행과 열이 바뀐 행렬)
    public static int[][] transpose(int[][] matrix) {
        // TODO: 전치 행렬 생성 (행과 열 크기 바뀜)
        int[][] result = new int[matrix[0].length][matrix.length];

        // TODO: 요소들을 행↔열로 바꿔서 복사
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            throw new IllegalArgumentException("행렬 곱셈이 불가능합니다");
        }

        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // TODO: 행렬의 모든 요소 합 계산 메서드를 작성하세요
    // 매개변수: int[][] matrix
    // 반환값: int (모든 요소의 합)
    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        // TODO: for-each 루프로 모든 요소 더하기
        for (int[] row : matrix) {
            for (int v: row) {
                sum += v;
            }
        }
        return sum;
    }

    // TODO: 행렬의 평균값 계산 메서드를 작성하세요
    // 매개변수: int[][] matrix
    // 반환값: double (평균값)
    public static double calculateAverage(int[][] matrix) {
        int sum = calculateSum(matrix);
        // TODO: 전체 요소 개수 계산
        int totalElements = matrix.length * matrix[0].length;
        return (double) sum / totalElements;
    }

    // TODO: 행렬에서 최댓값 찾기 메서드를 작성하세요
    // 매개변수: int[][] matrix
    // 반환값: int (최댓값)
    public static int findMax(int[][] matrix) {
        // TODO: 첫 번째 요소로 초기화
        int max = matrix[0][0];

        // TODO: 모든 요소와 비교하여 최댓값 찾기
        for (int[] row : matrix) {
            for (int v : row) {
                if (v > max) {
                    max = v;
                }
            }
        }
        return max;
    }

    // TODO: 행렬에서 최솟값 찾기 메서드를 작성하세요
    // 매개변수: int[][] matrix
    // 반환값: int (최솟값)
    public static int findMin(int[][] matrix) {
        // TODO: 첫 번째 요소로 초기화
        int min = matrix[0][0];

        // TODO: 모든 요소와 비교하여 최솟값 찾기
        for (int[] row : matrix) {
            for (int v : row) {
                if (v < min) {
                    min = v;
                }
            }
        }
        return min;
    }
}