import textio.TextIO;

public class LanguageGreeting {
    public static void main(String[] args) {
        System.out.print("언어를 입력하세요 (한국어/영어/일본어/중국어): ");
        String language = TextIO.getln().toLowerCase();

        // TODO: switch 표현식으로 인사말 설정
        // 힌트: 여러 case 값 묶기
        String greeting = switch(language) /*여기에 switch 표현식을 작성하세요*/ {
            case "한국어", "korean"     -> "안녕하세요!";
            case "영어",   "english"    -> "Hello!";
            case "일본어", "japanese"   -> "こんにちは!";
            case "중국어", "chinese"    -> "你好!";
            default                    -> "지원하지 않는 언어입니다.";
        };

        System.out.println("인사말: " + greeting);

        // TODO: 언어별 추가 정보 출력
        // 힌트: switch문 사용
        // 여기에 코드를 작성하세요
        switch (language) {
            case "한국어", "korean"     -> System.out.println("한국은 동아시아의 반도 국가입니다.\n한글은 세종대왕이 창제했습니다.");
            case "영어",   "english"    -> System.out.println("영어는 전 세계에서 가장 널리 사용되는 언어입니다.\n국제 공용어 역할을 합니다.");
            case "일본어", "japanese"   -> System.out.println(" ");
            case "중국어", "chinese"    -> System.out.println(" ");
            default                    -> System.out.println("지원하지 않는 언어입니다.");
        }
    }
}