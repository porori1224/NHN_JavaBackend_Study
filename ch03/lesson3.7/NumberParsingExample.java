/* 요구사항
    문자열 배열의 각 요소를 Integer와 Double로 변환 시도
    변환 성공 시 값 출력, 실패 시 오류 메시지 출력
    NumberFormatException 예외 처리*/

import textio.TextIO;

public class NumberParsingExample {
    public static void main(String[] args) {
        System.out.println("=== 숫자 변환 예제 ===");

        String[] testInputs = {"123", "45.67", "abc", "12x", "", "  ", "-789"};

        for (String input : testInputs) {
            System.out.println("\n입력: '" + input + "'");

            // TODO: Integer 변환 시도
            // 힌트: try-catch 구조 사용
            // 여기에 Integer 변환 코드를 작성하세요
            try {
                int inValue = Integer.parseInt(input.trim());
                System.out.println("✅ Integer 성공: " + inValue);
            } catch (NumberFormatException e) {
                System.out.println("❌ Integer 실패: " + e.getMessage());
            }

            // TODO: Double 변환 시도
            // 힌트: try-catch 구조 사용
            // 여기에 Double 변환 코드를 작성하세요
            try {
                double doubleValue = Double.parseDouble(input.trim());
                System.out.println("✅ Double 성공: " + doubleValue);
            } catch (NumberFormatException e) {
                System.out.println("❌ Double 실패: " + e.getMessage());
            }
        }
    }
}