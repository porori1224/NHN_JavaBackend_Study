public class CalculatorExample {
    public static void main(String[] args) {
        // TODO: 조건 연산자를 활용한 계산기를 만드세요
        // 힌트:
        // 1. "=== 계산기 예제 ===" 출력
        // 2. num1=10.5, num2=3.2, operator='*' 선언
        // 3. 조건 연산자를 사용하여 operator에 따라 사칙연산 수행
        // 4. validOperation으로 올바른 연산자인지 확인
        // 5. printf로 "10.5 * 3.2 = 결과" 형식으로 출력
        // 6. 나눗셈인 경우 나머지도 계산하여 출력

        // 여기에 코드를 작성하세요
        System.out.println("=== 계산기 예제 ===");

        double num1 = 10.5;
        double num2 = 3.2;
        char operator = '*';

        boolean validOperation = operator == '+' || operator == '-' ||
                operator == '*' || operator == '/' || operator == '%';

        double result = operator == '+' ? num1 + num2
                : operator == '-' ? num1 - num2
                : operator == '*' ? num1 * num2
                : operator == '/' ? num1 / num2
                : operator == '%' ? num1 % num2
                : 0.0;

        if (validOperation) {
            System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);

            if (operator == '/') {
                double remainder = num1 % num2;
                System.out.printf("나머지: %.2f%n", remainder);
            }
        } else {
            System.out.println("지원하지 않는 연산자입니다.");
        }
    }
}