/* 요구사항
- 양수/음수/0 판별:
- number > 0이면 "양수입니다." 출력
- 1000보다 크면 추가로 "매우 큰 양수입니다."
- 1보다 작으면 추가로 "0과 1 사이의 양수입니다."
- number < 0이면 "음수입니다." 출력
- -1000보다 작으면 추가로 "매우 작은 음수입니다."
- 0이면 "0입니다." 출력
- 정수/실수 판별:
- int로 캐스팅한 값과 같으면 "정수입니다."
- 다르면 "실수입니다."
*/

import textio.TextIO;

public class NumberClassification {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요: ");
        double number = TextIO.getlnDouble();

        // 여기에 코드를 작성하세요
        // 양수/음수/0 판별:
        if (number > 0 ) System.out.println("양수입니다. ");

        if (number > 100) System.out.println("매우 큰 양수입니다.");

        if (number < 1 && number > 0) System.out.println("0과 1 사이의 양수입니다.");

        if (number < 0) System.out.println("음수입니다.");

        if (number < -100) System.out.println("매우 작은 음수입니다.");

        if (number == 0) System.out.println("0입니다.");

        //정수/실수 판별:
        if ((int)number == number) {
            System.out.println("정수입니다.");
        } else {
            System.out.println("실수입니다.");
        }
    }
}