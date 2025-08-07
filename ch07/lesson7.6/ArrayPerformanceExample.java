public class ArrayPerformanceExample {
    public static void main(String[] args) {
        int size = 1000;

        // 이차원 배열
        int[][] array2D = new int[size][size];

        // 일차원 배열 (같은 크기)
        int[] array1D = new int[size * size];

        System.out.println("=== 배열 성능 비교 ===");
        System.out.println("배열 크기: " + size + "x" + size);

        // TODO: 이차원 배열 초기화 시간을 측정하세요
        // System.nanoTime()을 사용하여 시작과 끝 시간 기록
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array2D[i][j] = i * size + j;
            }
        }
        long time2D = System.nanoTime() - start;

        // TODO: 일차원 배열 초기화 시간을 측정하세요
        start = System.nanoTime();
        for (int i = 0; i < size * size; i++) {
            array1D[i] = i;
        }
        long time1D = System.nanoTime() - start;

        System.out.println("초기화 시간:");
        System.out.printf("이차원 배열: %.2f ms\n", time2D / 1_000_000.0);
        System.out.printf("일차원 배열: %.2f ms\n", time1D / 1_000_000.0);
        System.out.printf("성능 비율: %.2fx\n", (double)time2D / time1D);

        // 순회 성능 비교
        compareTraversalMethods(array2D);

        // 메모리 사용량 정보
        printMemoryInfo(size);
    }

    // TODO: 순회 방법별 성능 비교 메서드를 작성하세요
    // 행 우선, 열 우선, enhanced for 순회의 성능 측정
    public static void compareTraversalMethods(int[][] array) {
        int size = array.length;
        long start;
        long sum = 0;

        System.out.println("\n=== 순회 방법별 성능 비교 ===");

        // 행 우선 순회
        start = System.nanoTime();
        sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += array[i][j];
            }
        }
        long timeRowMajor = System.nanoTime() - start;
        System.out.printf("행 우선 순회: %.2f ms (합계: %d)\n", timeRowMajor / 1_000_000.0, sum);

        // 열 우선 순회
        start = System.nanoTime();
        sum = 0;
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                sum += array[i][j];
            }
        }
        long timeColMajor = System.nanoTime() - start;
        System.out.printf("열 우선 순회: %.2f ms (합계: %d)\n", timeColMajor / 1_000_000.0, sum);

        // enhanced for
        start = System.nanoTime();
        sum = 0;
        for (int[] row : array) {
            for (int val : row) {
                sum += val;
            }
        }
        long timeEnhanced = System.nanoTime() - start;
        System.out.printf("Enhanced for: %.2f ms (합계: %d)\n", timeEnhanced / 1_000_000.0, sum);

        System.out.printf("행 우선이 열 우선보다 %.2f배 빠름\n", (double)timeColMajor / timeRowMajor);
    }

    // TODO: 메모리 사용량 정보 출력 메서드를 작성하세요
    // 이차원 배열의 메모리 사용량과 오버헤드 계산
    public static void printMemoryInfo(int size) {
        System.out.println("\n=== 메모리 사용 정보 ===");
        int elementSize = 4; // int = 4바이트
        int refSize = 8;     // 참조 = 8바이트 (64bit JVM 기준)

        long dataSize = (long) size * size * elementSize; // 실제 데이터 크기
        long overhead = (long) size * refSize; // 참조 배열 오버헤드

        long total = dataSize + overhead;

        System.out.printf("데이터 크기: %.2f MB\n", dataSize / 1024.0 / 1024.0);
        System.out.printf("참조 오버헤드: %.2f KB\n", overhead / 1024.0);
        System.out.printf("총 메모리 사용량: %.2f MB\n", total / 1024.0 / 1024.0);
    }
}
