public class ThreeNPlusOneStats {
    public static void main(String[] args) {
        System.out.println("=== 3N+1 통계 분석 ===\n");

        // 범위 분석하기
        analyzeRange(1, 10);

        // 가장 긴 시퀀스 찾기
        findLongestSequence(1, 20);
    }

    // TODO 25: 범위 내 모든 수의 시퀀스 분석 메서드 구현하기
    static void analyzeRange(int start, int end) {
        System.out.println(start + "부터 " + end + "까지의 시퀀스 길이:");
        System.out.println("시작값\t길이\t\t최대값");

        for (int i = start; i <= end; i++) {
            int length = getSequenceLength(i);
            int max = getMaxValue(i);

            System.out.println(i + "\t\t" + length + "\t\t" + max);
        }

        System.out.println();
    }

    // TODO 26: 가장 긴 시퀀스 찾기 메서드 구현하기
    static void findLongestSequence(int start, int end) {
        int longestLength = 0;
        int longestStart = start;

        for (int i = start; i <= end; i++) {
            int length = getSequenceLength(i);
            if (length > longestLength) {
                longestLength = length;
                longestStart = i;
            }
        }

        System.out.println("=== 가장 긴 시퀀스 ===");
        System.out.println("범위: " + start + " ~ " + end);
        System.out.println("시작값: " + longestStart);
        System.out.println("길이: " + longestLength);
    }

    // TODO 27: 시퀀스 길이 계산 메서드 재구현하기
    static int getSequenceLength(int startingValue) {
        int count = 1;
        int n = startingValue;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }

        return count;
    }

    // TODO 28: 최대값 계산 메서드 재구현하기
    static int getMaxValue(int startingValue) {
        int max = startingValue;
        int n = startingValue;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}