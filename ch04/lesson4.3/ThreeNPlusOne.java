public class ThreeNPlusOne {
    public static void main(String[] args) {
        System.out.println("=== 3N+1 시퀀스 프로그램 ===\n");

        // TODO 18: 예제 시퀀스 실행하기
        System.out.println("예제 시퀀스:");

        print3NSequence(3);
        System.out.println();

        print3NSequence(7);
        System.out.println();

        // TODO 19: 추가 정보 출력하기
        int start = 3;

        System.out.println("추가 정보:");
        System.out.println("시작값 " + start + "의 시퀀스 길이: " + getSequenceLength(start));
        System.out.println("시작값 " + start + "의 최댓값: " + getMaxValue(start));
    }

    // TODO 20: 3N+1 시퀀스 출력 메서드 구현하기
    static void print3NSequence(int startingValue) {
        System.out.println("시작값 " + startingValue + "의 3N+1 시퀀스:");

        int n = startingValue;
        System.out.print(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }

            System.out.print(" → " + n);
        }

        System.out.println();
    }

    // TODO 21: 시퀀스 길이 계산 메서드 구현하기
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

    // TODO 22: 시퀀스의 최대값 찾기 메서드 구현하기
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