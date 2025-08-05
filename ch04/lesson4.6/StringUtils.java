// TODO 41: StringUtils 클래스에 상세한 Javadoc 주석 작성하기
/**
 * <p> 문자열 관련 기능 제공 정적 메서드 유틸리티 클래스
 * <h2>주요 기능</h2>
 * <ol>
 *   <li>reverse: 문자열을 거꾸로 뒤집음</li>
 *   <li>isPalindrome: 주어진 문자열이 회문인지 판별</li>
 *   <li>불필요한 공백과 대소문자 구분을 제거하여 회문 여부를 확인</li>
 * </ol>
 *
 * <p><strong>참고: 모든 메서드는 null 입력에 대한 예외 처리를 포함하고 있음.</strong>
 *
 * @since 2025-08-03
 */
public class StringUtils {

    // TODO 42: reverse 메서드에 예제가 포함된 Javadoc 주석 작성하기
    /**
     * <p>예제:
     * <blockquote>
     * <pre> {
     * @code
     * Strig result = StringUtils.revers("Hello");
     * // result : "olleH"
     * }
     * </pre>
     * </blockquote>
     *
     * @param str 뒤집을 문자열
     * @return 뒤집힌 문자열 또는 {@code null}
     */
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // TODO 43: isPalindrome 메서드에 Javadoc 주석 작성하기
    /**
     * <p>
     *     주어진 문자열이 회문인지 여부를 판별
     *     공백은 무시, 대소문자 구분 없음.
     *
     *     입력이 {@code null}일 경우 {@code false}를 반환
     * <br>
     *
     * @param str 검사할 문자열
     * @return 회문이면 {@code true}, 아닐 경우 {@code false} 반환
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = reverse(cleaned);
        return cleaned.equals(reversed);
    }
}