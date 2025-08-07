import java.util.ArrayList;

public class Dynamic2DArray {
    public static void main(String[] args) {
        // TODO: 2차원 ArrayList를 생성하세요
        // ArrayList<ArrayList<Integer>> 타입
        ArrayList<ArrayList<Integer>> matrix =  new ArrayList<>();

        // TODO: 3x4 행렬을 초기화하세요
        // 각 행은 새 ArrayList이고, 값은 i * 4 + j + 1
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                row.add(i * 4 + j + 1);
            }
            matrix.add(row);
        }

        // TODO: 행렬을 출력하세요
        System.out.println("=== 초기 행렬 ===");
        printMatrix(matrix);

        // TODO: 특정 요소(1행 2열)를 99로 수정하세요
        // (0-based 인덱스 기준: 두 번째 행, 세 번째 열 -> 값 7이 99로 변경)
        matrix.get(1).set(2, 99);

        System.out.println("\n=== 수정 후 행렬 ===");
        printMatrix(matrix);

        // TODO: 새로운 행을 추가하세요
        // 100, 101, 102, 103을 포함하는 행
        ArrayList<Integer> newRow = new ArrayList<>();
        newRow.add(100);
        newRow.add(101);
        newRow.add(102);
        newRow.add(103);
        matrix.add(newRow);

        System.out.println("\n=== 행 추가 후 ===");
        printMatrix(matrix);

        // TODO: 각 행의 끝에 0을 추가하세요 (열 추가)
        for (ArrayList<Integer> row : matrix) {
            row.add(0);
        }

        System.out.println("\n=== 열 추가 후 ===");
        printMatrix(matrix);

        // TODO: 행렬의 모든 요소의 합을 계산하세요
        int sum = 0;
        for (ArrayList<Integer> row : matrix) {
            for (Integer v : row) {
                sum += v;
            }
        }

        System.out.println("\n행렬의 모든 요소 합: " + sum);
    }

    // TODO: 행렬 출력 메서드를 작성하세요
    // 메서드명: printMatrix
    // 매개변수: ArrayList<ArrayList<Integer>> matrix
    // 각 요소를 4자리로 정렬하여 출력
    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (Integer v : row) {
                System.out.printf("%4d", v);
            }
            System.out.println();
        }
    }
}