/* 요구사항
    switch 표현식으로 사칙연산(+, -, *, /), 나머지(%), 거듭제곱(^) 계산
    나눗셈과 나머지 연산 시 0으로 나누기 검사
    각 연산 시 수행 중인 연산 출력
    결과의 부호와 타입(정수/소수) 분석
*/

import textio.TextIO;

public class SwitchCalculator {
    public static void main(String[] args) {
        System.out.println("=== Switch 표현식 계산기 ===");

        System.out.print("첫 번째 숫자: ");
        double num1 = TextIO.getlnDouble();

        System.out.print("연산자 (+, -, *, /, %, ^): ");
        String operator = TextIO.getln().trim();

        System.out.print("두 번째 숫자: ");
        double num2 = TextIO.getlnDouble();

        // TODO: switch 표현식으로 계산 수행
        // 힌트: yield 사용, 0으로 나누기 검사
        double result = switch (operator) {
            case "+" -> {
                System.out.println("덧셈을 수행합니다.");
                yield  num1 + num2;
            }
            case  "-" -> {
                System.out.println("뺄셈을 수행합니다.");
                yield  num1 - num2;
            }
            case "*" -> {
                System.out.println("곱셉을 수행합니다.");
                yield  num1 * num2;
            }
            case "/" -> {
                if (num1 == 0 || num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다!");
                    yield Double.NaN;
                } else  {
                    System.out.println("나눗셈을 수행합니다.");
                    yield  num1 / num2;
                }
            }
            case "%" -> {
                if (num1 == 0 || num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다!");
                    yield Double.NaN;
                } else   {
                    System.out.println("나머지 연산을 수행합니다.");
                    yield  num1 % num2;
                }
            }
            case  "^" -> {
                System.out.println("거듭제곱을 수행합니다.");
                yield  Math.pow(num1, num2);
            }

            default -> {
                System.out.println("잘못된 입력입니다!");
                yield Double.NaN;
            }
        };

        // 결과 출력
        if (!Double.isNaN(result)) {
            System.out.printf("결과: %.2f %s %.2f = %.2f%n",
                    num1, operator, num2, result);

            // TODO: switch 표현식으로 결과 분석
            // 힌트: Double.compare() 사용
            String analysis = switch (Double.compare(result, 0)) {
                case 1 -> "양수입니다.";
                case -1 -> "음수입니다.";
                case 0 -> "0 입니다.";
                default -> "분석 불가";
            };
            System.out.println("분석: " + analysis);

            // TODO: 정수 여부 확인
            // 힌트: 조건 평가 후 switch
            String numberType = switch ((result == (int)result) ? 1 : 0) {
                case 1 -> "정수입니다.";
                case 0 -> "실수입니다.";
                default -> "분석 불가";
            };
            System.out.println("타입: " + numberType);
        }
    }
}