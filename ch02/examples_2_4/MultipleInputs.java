import textio.TextIO;

public class MultipleInputs {
    public static void main(String[] args) {
        // TODO: TextIO의 getln과 get의 차이를 활용하여 좌표 입력 프로그램을 만드세요
        // 힌트:
        // 1. "=== 좌표 입력 프로그램 ===" 출력
        // 2. 방법1: getlnInt()로 x, y 각각 입력받기
        // 3. 방법2: getInt()로 x, y를 한 줄에 입력받기 (getln()으로 줄 정리)
        // 4. 방법3: getInt()로 x, y, z를 한 줄에 입력받기
        // 5. Math.sqrt()를 사용하여 원점에서의 거리 계산
        // 6. printf로 좌표와 거리를 출력

        // 여기에 코드를 작성하세요
        System.out.println("=== 좌표 입력 프로그램 ===");

        // 2. 방법1: getlnInt()로 x, y 각각 입력받기
        System.out.println("\n[방법 1] 각 값을 별도의 줄에 입력:");
        System.out.print("x 좌표: ");
        int x1 = TextIO.getlnInt();
        System.out.print("y 좌표: ");
        int y1 = TextIO.getlnInt();
        System.out.printf("입력된 좌표: (%d, %d)\n", x1, y1);

        // 3. 방법2: getInt()로 x, y를 한 줄에 입력받기 (getln()으로 줄 정리)
        System.out.println("\n[방법 2] 한 줄에 두 값 입력 (공백으로 구분):");
        System.out.print("x y 좌표 입력: ");
        int x2 = TextIO.getInt();
        int y2 = TextIO.getInt();
        TextIO.getln(); // 줄 정리
        System.out.printf("입력된 좌표: (%d, %d)\n", x2, y2);

        // 4. 방법3: getInt()로 x, y, z를 한 줄에 입력받기
        System.out.println("\n[방법 3] 3차원 좌표 입력:");
        System.out.print("x y z 좌표 입력: ");
        int x3 = TextIO.getInt();
        int y3 = TextIO.getInt();
        int z3 = TextIO.getInt();
        TextIO.getln(); // 줄 정리
        System.out.printf("입력된 3D 좌표: (%d, %d, %d)\n", x3, y3, z3);

        // 5. Math.sqrt()를 사용하여 원점에서의 거리 계산
        double distance2D = Math.sqrt(x2 * x2 + y2 * y2);
        double distance3D = Math.sqrt(x3 * x3 + y3 * y3 + z3 * z3);

        // 6. printf로 좌표와 거리를 출력
        System.out.printf("\n2D 원점으로부터의 거리: %.2f\n", distance2D);
        System.out.printf("3D 원점으로부터의 거리: %.2f\n", distance3D);
    }
}