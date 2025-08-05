/* 요구사항
    삼각형 성립 조건 확인 (두 변의 합 > 나머지 한 변)
    삼각형 종류 판별:
    세 변이 모두 같으면 "정삼각형"
    두 변만 같으면 "이등변삼각형" (어느 두 변이 같은지 명시)
    모두 다르면 "일반 삼각형"
    직각삼각형 여부 확인 (피타고라스 정리)
    부동소수점 오차 고려: Math.abs(차이) < 0.0001
*/

import textio.TextIO;

public class TriangleClassifier {
    public static void main(String[] args) {
        System.out.println("=== 삼각형 판별기 ===");
        System.out.println("세 변의 길이를 입력하세요.");

        System.out.print("변 a: ");
        double a = TextIO.getlnDouble();
        System.out.print("변 b: ");
        double b = TextIO.getlnDouble();
        System.out.print("변 c: ");
        double c = TextIO.getlnDouble();

        // 삼각형 성립 조건 확인
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("변의 길이는 양수여야 합니다!");
        } else if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("삼각형을 만들 수 없습니다!");
            System.out.println("(두 변의 합이 나머지 한 변보다 커야 합니다)");
        } else {
            System.out.println("삼각형을 만들 수 있습니다!");

            // TODO: 삼각형 종류 판별
            // 힌트: == 와 || 연산자
            // 여기에 코드를 작성하세요
            if (a == b && b == c) {
                System.out.println("종류: 정삼각형");
            } else if (a == b || b == c || a == c) {
                System.out.print("종류: 이등변삼각형 (");

                if (a == b) {
                    System.out.println("a와 b가 같습니다)");
                } else if (b == c) {
                    System.out.println("b와 c가 같습니다)");
                } else {
                    System.out.println("a와 c가 같습니다)");
                }
            } else {
                System.out.println("종류: 일반 삼각형");
            }

            // TODO: 직각삼각형 확인
            // 힌트: a² + b² = c² 등 세 가지 경우
            // 여기에 코드를 작성하세요
            double a2 = a * a, b2 = b * b, c2 = c * c;
            if (Math.abs(a2 + b2 - c2) < 0.0001 ||
                    Math.abs(b2 + c2 - a2) < 0.0001 ||
                    Math.abs(a2 + c2 - b2) < 0.0001) {
                System.out.println("추가: 직각삼각형입니다!");
            }
        }
    }
}