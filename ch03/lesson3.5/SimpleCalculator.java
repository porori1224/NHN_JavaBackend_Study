/* 요구사항
    지원 연산: +, -, *, /, %, ^ (거듭제곱)
    나눗셈과 나머지 연산 시 0으로 나누기 검사
    계산 결과가 정수면 정수값도 함께 표시
    결과의 부호(양수/음수/0) 표시
*/

import textio.TextIO;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("=== 간단한 계산기 ===");

        System.out.print("첫 번째 숫자: ");
        double num1 = TextIO.getlnDouble();

        System.out.print("연산자 (+, -, *, /, %, ^): ");
        String operator = TextIO.getln().trim();

        System.out.print("두 번째 숫자: ");
        double num2 = TextIO.getlnDouble();

        double result = 0;
        boolean validOperation = true;
        String operation = "";

        // TODO: 연산자별 계산
        // 힌트: if-else if 체인, equals() 사용
        // 여기에 코드를 작성하세요
        if (operator.equals("+")) {
            result = num1 + num2;
            operation = "덧셈";
        } else if (operator.equals("-")) {
            result = num1 - num2;
            operation = "뺄셈";
        } else if (operator.equals("*")) {
            result = num1 * num2;
            operation = "곱셈";
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다!");
                validOperation = false;
            } else {
                result = num1 / num2;
                operation = "나눗셈";
            }
        } else if (operator.equals("%")) {
            if (num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다!");
                validOperation = false;
            } else {
                result = num1 % num2;
                operation = "나머지";
            }
        } else if (operator.equals("^")) {
            result = Math.pow(num1, num2);
            operation = "거듭제곱";
        } else {
            System.out.println("지원하지 않는 연산자입니다.");
            validOperation = false;
        }

        if (validOperation) {
            System.out.println("\n=== 계산 결과 ===");
            System.out.println("연산: " + operation);
            System.out.printf("%.2f %s %.2f = %.2f%n", num1, operator, num2, result);

            // TODO: 추가 정보
            // 힌트: (int)result == result로 정수 확인
            // 여기에 코드를 작성하세요
            if ((int) result == result) {
                System.out.println("정수값: " + (int) result);
            }

            if (result > 0) {
                System.out.println("결과는 양수입니다.");
            } else if (result < 0) {
                System.out.println("결과는 음수입니다.");
            } else {
                System.out.println("결과는 0입니다.");
            }
        }
    }
}