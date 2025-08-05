// TODO 31: 클래스에 대한 Javadoc 주석 작성하기
/**
 * 계산기 기능 제공 유틸리티 클래스로, 기본 연산을 지원
 * @author
 * @version
 * @since
 */
public class Calculator {

    // TODO 32: add 메서드에 Javadoc 주석 작성하기
    /**
     * a, b를 더함
     * @param a
     * @param b
     * @return
     */
    public static double add(double a, double b) {
        return a + b;
    }

    // TODO 33: subtract 메서드에 Javadoc 주석 작성하기
    /**
     * a, b를 뺌
     * @param a
     * @param b
     * @return
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    // TODO 34: divide 메서드에 Javadoc 주석 작성하기 (예외 포함)
    /**
     * dividend를 divisor로 나눔, divisor가 0인 경우 예외 발생
     * @param dividend
     * @param divisor
     * @return
     * @throws ArithmeticException
     */
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다");
        }
        return dividend / divisor;
    }
}