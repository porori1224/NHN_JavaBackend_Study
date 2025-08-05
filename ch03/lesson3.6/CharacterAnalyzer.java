/* 요구사항
    소문자 모음(a, e, i, o, u)인 경우: "[문자]는 소문자 모음입니다."
    대문자 모음(A, E, I, O, U)인 경우: "[문자]는 대문자 모음입니다."
    그 외의 경우:
        - 문자인 경우: "[문자]는 자음입니다."
        - 숫자인 경우: "[문자]는 숫자입니다."
        - 특수문자인 경우: "[문자]는 특수문자입니다."
*/

import textio.TextIO;

public class CharacterAnalyzer {
    public static void main(String[] args) {
        System.out.print("문자를 입력하세요: ");
        char ch = TextIO.getlnChar();

        // TODO: 문자 종류 판별 switch문
        // 힌트: 여러 case 묶기, Character.isLetter(), Character.isDigit()
        // 여기에 코드를 작성하세요
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                System.out.println(ch + "는 소문자 모음입니다.");
            }
            case 'A', 'E', 'I', 'O', 'U' -> {
                System.out.println(ch + "는 대문자 모음입니다.");
            }

            default -> {
                if (Character.isLetter(ch)) System.out.println(ch + "는 자음입니다.");
                else if (Character.isDigit(ch)) System.out.println(ch + "는 숫자입니다.");
                else System.out.println(ch + "는 특수문자입니다.");
            }
        }


    }
}