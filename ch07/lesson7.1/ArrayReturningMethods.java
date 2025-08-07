public class ArrayReturningMethods {
    // TODO: 범위 내의 정수 배열 생성 메서드를 작성하세요
    // 메서드명: range, 매개변수: int start, int end
    // start부터 end까지의 숫자 배열 반환, start > end면 빈 배열
    static int[] range(int start, int end) {
        if (start > end) {
            return new int[0];
        }
        int size = end - start + 1;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = start + i;
        }
        return result;
    }


    // TODO: 배열 필터링 메서드를 작성하세요
    // 메서드명: filterPositive, 매개변수: int[] input
    // 양수만 포함하는 새 배열 반환
    static int[] filterPositive(int[] input) {
        int count = 0;
        for (int val : input) {
            if (val > 0) count++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int val : input) {
            if (val > 0) {
                result[index++] = val;
            }
        }
        return result;
    }


    // TODO: 두 배열 병합 메서드를 작성하세요
    // 메서드명: merge, 매개변수: int[] arr1, int[] arr2
    // 두 배열을 연결한 새 배열 반환
    static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }


    // TODO: 배열 뒤집기 메서드를 작성하세요
    // 메서드명: reverse, 매개변수: int[] input
    // 역순으로 된 새 배열 반환
    static int[] reverse(int[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[input.length - 1 - i];
        }
        return result;
    }


    public static void main(String[] args) {
        // range 테스트
        int[] numbers = range(5, 10);
        System.out.print("range(5, 10): ");
        printArray(numbers);

        // filterPositive 테스트
        int[] mixed = {-3, 5, 0, -7, 12, -1, 8};
        int[] positive = filterPositive(mixed);
        System.out.print("\n양수만: ");
        printArray(positive);

        // merge 테스트
        int[] first = {1, 3, 5};
        int[] second = {2, 4, 6};
        int[] merged = merge(first, second);
        System.out.print("\n병합: ");
        printArray(merged);

        // reverse 테스트
        int[] original = {1, 2, 3, 4, 5};
        int[] reversed = reverse(original);
        System.out.print("\n뒤집기: ");
        printArray(reversed);
    }

    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}