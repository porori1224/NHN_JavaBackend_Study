public class PreconditionPostconditionExample {
    public static void main(String[] args) {
        System.out.println("=== 사전/사후 조건 예제 ===\n");

        // TODO 1: factorial 메서드 테스트하기
        System.out.println("5! = " + factorial(5));  // 120
        System.out.println("0! = " + factorial(0));  // 1

        // TODO 2: 예외 상황 테스트하기
        try {
            System.out.println("(-3)! = " + factorial(-3));  // 예외 발생
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    // TODO 3: factorial 메서드 구현하기
    /**
     * 숫자의 팩토리얼을 계산합니다.
     *
     * 사전 조건: n >= 0 (음수가 아니어야 함)
     * 사후 조건: 반환값 = n! = n × (n-1) × ... × 2 × 1
     *
     * @param n 팩토리얼을 계산할 숫자
     * @return n의 팩토리얼
     * @throws IllegalArgumentException n이 음수일 때
     */
    public static long factorial(int n) {
        // 사전 조건 검사: n이 음수이면 예외 발생
        if (n < 0) {
            throw new IllegalArgumentException("음수의 팩토리얼은 정의되지 않습니다: " + n);
        }

        // 반복문으로 팩토리얼 계산
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}