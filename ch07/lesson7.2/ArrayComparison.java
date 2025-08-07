public class ArrayComparison {
    // TODO: 배열에서 가장 큰 차이를 가진 인접 요소 찾기 메서드를 작성하세요
    // 메서드명: findMaxDifference, 매개변수: int[] numbers
    // 배열 길이가 2 미만이면 "비교할 요소가 부족합니다." 출력
    // 인접한 요소들의 절댓값 차이를 계산하여 최대 차이와 인덱스 출력
    public static void findMaxDifference(int[] numbers) {
        if (numbers.length < 2) {
            System.out.println("비교할 요소가 부족합니다.");
            return;
        }

        int maxDiff = 0;
        int index = -1;
        for (int i = 0; i < numbers.length - 1; i++) {
            int diff = Math.abs(numbers[i] - numbers[i + 1]);

            if (diff > maxDiff) {
                maxDiff = diff;
                index = i;
            }
        }

        System.out.printf("최대 차이: %d (인덱스 %d와 %d 사이)\n", maxDiff, index, index+1);
        System.out.printf("값: %d와 %d\n", numbers[index], numbers[index+1]);
    }


    // TODO: 배열에서 패턴을 찾는 메서드를 작성하세요
    // 메서드명: findPattern, 매개변수: int[] array, int[] pattern
    // pattern이 array보다 길면 "패턴이 배열보다 깁니다." 출력
    // 패턴이 발견되면 위치를 출력, 없으면 "패턴을 찾을 수 없습니다." 출력
    public static void findPattern (int[] array, int[] pattern) {
        if (pattern.length > array.length) {
            System.out.println("패턴이 배열보다 깁니다.");
            return;
        }

        boolean found = false;
        for (int i = 0; i <= array.length - pattern.length; i++) {
            boolean match = true;
            for (int j = 0; j < pattern.length; j++) {
                if (array[i + j] != pattern[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                System.out.printf("패턴 발견 위치: %d%n", i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("패턴을 찾을 수 없습니다.");
        }
    }


    public static void main(String[] args) {
        int[] values = {10, 15, 8, 23, 19, 30, 12};
        findMaxDifference(values);

        System.out.println("\n=== 패턴 검색 ===");
        int[] data = {1, 2, 3, 4, 2, 3, 4, 5, 2, 3};
        int[] pattern = {2, 3, 4};
        findPattern(data, pattern);
    }
}