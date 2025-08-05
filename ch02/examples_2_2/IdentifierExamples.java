public class IdentifierExamples {
    public static void main(String[] args) {
        // TODO: 유효한 식별자 예제를 작성하세요
        // 힌트:
        // 1. age = 25 (정수형 변수)
        // 2. _temperature = 36.5 (밑줄로 시작하는 변수)
        // 3. firstName = "John" (camelCase 변수)
        // 4. isStudent = true (boolean 변수)
        // 5. $currency = '$' (달러 기호로 시작, 권장하지 않음)
        int age = 25;
        double _temperature = 36.5;
        String firstName = "John";
        boolean isStudent = true;
        char $currency = '$';

        // TODO: 대소문자 구분 예제를 작성하세요
        // 힌트:
        // 1. count = 10
        // 2. Count = 20 (count와 다른 변수)
        // 3. COUNT = 30 (count, Count와 다른 변수)
        // 4. 세 변수를 모두 출력하여 차이를 보여주세요
        int count = 10;
        int Count = 20;
        int COUNT = 30;
        System.out.println("count = " + count);
        System.out.println("count = " + Count);
        System.out.println("count = " + COUNT);

        // 주의: 아래는 무효한 식별자 예제입니다 (주석 처리됨)
        // int 3rdPlace = 3;        // 오류: 숫자로 시작
        // double my-score = 95.5;  // 오류: 하이픈 사용
        // String first name = "";  // 오류: 공백 포함
        // boolean class = true;    // 오류: 예약어 사용

        // 여기에 코드를 작성하세요
    }
}