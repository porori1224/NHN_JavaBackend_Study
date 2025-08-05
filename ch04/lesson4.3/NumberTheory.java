public class NumberTheory {
    public static void main(String[] args) {
        System.out.println("=== 수론 함수 ===\n");

        // TODO 70: 약수 관련 테스트하기
        int n = 24;
        System.out.println(n + "의 약수 개수: " + countDivisors(n));
        System.out.println(n + "의 약수 합: " + sumDivisors(n));
        System.out.print(n + "의 모든 약수: ");
        printDivisors(n);
        System.out.println("\n");

        // TODO 71: 완전수 판별 테스트하기
        System.out.println("1~30 사이의 완전수:");
        for (int i = 1; i <= 30; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i + " (약수: " + getDivisorList(i) + ")");
            }
        }

        // TODO 72: 친화수 찾기 테스트하기
        System.out.println("\n1000 이하의 친화수:");
        findAmicableNumbers(1000);
    }

    // TODO 73: 약수 개수 함수 구현하기
    static int countDivisors(int n) {
        // 약수 개수 세기
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count;
    }

    // TODO 74: 약수 합 함수 구현하기
    static int sumDivisors(int n) {
        // 약수의 합 계산
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    // TODO 75: 약수 출력 함수 구현하기
    static void printDivisors(int n) {
        // 약수 출력
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
    }

    // TODO 76: 완전수 판별 함수 구현하기
    static boolean isPerfectNumber(int n) {
        // 완전수 여부 판단
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    //getDivisorList 구현
    static String getDivisorList(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                if (sb.length() > 0) sb.append("+");
                sb.append(i);
            }
        }
        return sb.toString();
    }

    //findAmicableNumbers 구현
    static void findAmicableNumbers(int limit) {
        for (int a = 2; a <= limit; a++) {
            int b = sumProperDivisors(a);
            if (b > a && b <= limit && sumProperDivisors(b) == a) {
                System.out.println(a + "와 " + b);
            }
        }
    }

    //sumProperDivisors 구현
    static int sumProperDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }
}