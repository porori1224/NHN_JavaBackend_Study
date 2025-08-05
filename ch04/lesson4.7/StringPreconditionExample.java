public class StringPreconditionExample {
    public static void main(String[] args) {
        System.out.println("=== 문자열 사전/사후 조건 예제 ===\n");

        // TODO 7: 문자열 메서드들 테스트하기
        String test1 = "level";
        String test2 = "hello";
        String test3 = "a man a plan a canal panama";

        System.out.println("'" + test1 + "' 회문인가? " + isPalindrome(test1));
        System.out.println("'" + test2 + "' 회문인가? " + isPalindrome(test2));

        String result = removeSpaces(test3);
        System.out.println("공백 제거: '" + result + "'");
    }

    // TODO 8: isPalindrome 메서드 구현하기
    /**
     * 문자열이 회문(palindrome)인지 검사합니다.
     *
     * 사전 조건: str != null
     * 사후 조건:
     *   - true 반환: str을 뒤집어도 같음
     *   - false 반환: str을 뒤집으면 다름
     *
     * @param str 검사할 문자열
     * @return 회문이면 true
     */
    public static boolean isPalindrome(String str) {
        // 사전 조건 검사
        if (str == null) {
            throw new IllegalArgumentException("문자열이 null입니다.");
        }

        // 두 포인터로 양쪽에서 비교
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    // TODO 9: removeSpaces 메서드 구현하기
    /**
     * 문자열에서 모든 공백을 제거합니다.
     *
     * 사전 조건: str != null
     * 사후 조건: 반환된 문자열에는 공백 문자가 없음
     *
     * @param str 처리할 문자열
     * @return 공백이 제거된 문자열
     */
    public static String removeSpaces(String str) {
        // 사전 조건 검사
        if (str == null) {
            throw new IllegalArgumentException("문자열이 null입니다.");
        }

        // StringBuilder를 사용하여 공백이 아닌 문자만 추가
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}