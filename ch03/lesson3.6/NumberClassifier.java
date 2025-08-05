/* 요구사항
    number가 1일 때: "첫 번째 숫자입니다."
    number가 2, 4, 6, 8 중 하나일 때:
        "짝수입니다."
        "2의 배수입니다."
    number가 3, 5, 7, 9 중 하나일 때:
        "홀수입니다."
        "소수일 가능성이 있습니다."
    number가 0일 때: "영(零)입니다."
    그 외: "범위를 벗어난 숫자입니다."
*/

public class NumberClassifier {
    public static void main(String[] args) {
        int number = 3;

        System.out.println("숫자 " + number + " 분석:");

        // TODO: 숫자 분류 switch문
        // 힌트: -> 연산자 사용
        // 여기에 코드를 작성하세요
        switch (number) {
            case 2, 4, 6, 8 -> System.out.println("짝수입니다. \n2의 배수입니다.");
            case 3, 5, 7, 9 -> System.out.println("홀수입니다. \n소수일 가능성이 있습니다.");
        }

    }
}