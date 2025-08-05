public class ArithmeticOperators {
    public static void main(String[] args) {
        // TODO: 기본 산술 연산을 수행하고 결과를 출력하세요
        // 힌트:
        // 1. 정수 a=17, b=5 선언
        // 2. "=== 정수 연산 ===" 출력 후 a, b 값과 +, -, *, /, % 연산 결과 출력
        // 3. 실수 x=17.0, y=5.0 선언 후 실수 나눗셈과 나머지 연산 출력
        // 4. 음수와 양수의 나머지 연산 결과 확인 (17%5, -17%5, 17%-5, -17%-5)

        // 여기에 코드를 작성하세요
        // 정수 선언
        int a = 17;
        int b = 5;

        System.out.println("=== 정수 연산 ===");
        System.out.printf("a = %d, b = %d\n", a, b);
        System.out.printf("a + b = %d\n", a + b);
        System.out.printf("a - b = %d\n", a - b);
        System.out.printf("a * b = %d\n", a * b);
        System.out.printf("a / b = %d\n", a / b);  // 정수 나눗셈
        System.out.printf("a %% b = %d\n", a % b); // %%는 % 출력용

        // 실수 선언
        double x = 17.0;
        double y = 5.0;

        System.out.println("\n=== 실수 연산 ===");
        System.out.printf("x = %.1f, y = %.1f\n", x, y);
        System.out.printf("x / y = %.1f\n", x / y);
        System.out.printf("x %% y = %.1f\n", x % y); // 실수 나머지

        // 음수와 나머지
        System.out.println("\n=== 음수와 나머지 ===");
        System.out.printf("17 %% 5 = %d\n", 17 % 5);
        System.out.printf("-17 %% 5 = %d\n", -17 % 5);
        System.out.printf("17 %% -5 = %d\n", 17 % -5);
        System.out.printf("-17 %% -5 = %d\n", -17 % -5);
    }
}