import java.util.Arrays;

public class ArrayParameters {
    public static void main(String[] args) {
        System.out.println("=== 배열 매개변수 예제 ===\n");

        int[] numbers = {15, 7, 23, 4, 18, 12, 9};

        // TODO 41: 배열 정보 출력하기
        System.out.print("원본 배열: ");
        printArray(numbers);

        // TODO 42: 통계 정보 출력하기
        System.out.println("\n=== 배열 통계 ===");
        System.out.println("합계: " + sum(numbers));
        System.out.println("평균: " + average(numbers));
        System.out.println("최대값: " + max(numbers));
        System.out.println("최소값: " + min(numbers));
        System.out.println("범위: " + range(numbers));

        System.out.println();


        // TODO 43: 배열 조작하기
        System.out.println("\n=== 배열 조작 ===");

        System.out.print("2배 값: ");
        printArray(doubleValues(numbers));

        System.out.print("10보다 큰 값: ");
        printArray(filterGreaterThan(numbers, 10));

        // 원본 배열 정렬
        System.out.print("정렬된 배열: ");
        int[] sorted = copyArray(numbers);
        sortArray(sorted);
        printArray(sorted);

        // 원본은 변경되지 않음
        System.out.print("원본 배열: ");
        printArray(numbers);
    }

    // TODO 44: 배열 출력 메서드 구현하기
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // TODO 45: 통계 메서드들 구현하기
    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    static double average(int[] arr) {
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }

        return avg / arr.length;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    static int range(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }

    // TODO 46: 배열 조작 메서드들 구현하기
    static int[] doubleValues(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * 2;
        }
        return result;
    }

    static int[] filterGreaterThan(int[] arr, int threshold) {
        return Arrays.stream(arr).filter(n -> n > threshold).toArray();
    }

    static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
}