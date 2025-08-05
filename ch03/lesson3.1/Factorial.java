public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        int counter = 1;

        System.out.print(n + "! = ");

        // TODO: 팩토리얼 계산 루프
        // 힌트:
        // 1. counter가 n 이하인 동안 반복
        // 2. factorial에 counter를 곱하기
        // 3. counter 출력 (n보다 작으면 " × " 추가)
        // 4. counter를 1 증가

        // 여기에 코드를 작성하세요
        while (counter <= n) {
            factorial *= counter;

            System.out.print(counter);
            if (counter < n) {
                System.out.print(" x ");
            }

            counter++;
        }

        System.out.println(" = " + factorial);
    }
}