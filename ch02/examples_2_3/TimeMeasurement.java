public class TimeMeasurement {
    public static void main(String[] args) {
        // TODO: 프로그램 시작 시간을 기록하세요
        // 힌트:
        // 1. startTime = System.nanoTime() (나노초 정밀도)
        // 2. startMillis = System.currentTimeMillis() (밀리초 정밀도)
        long startTime = System.nanoTime();
        long startMillis = System.currentTimeMillis();

        // TODO: 프로그램 시작 메시지를 출력하세요
        // 힌트:
        // 1. "=== 시간 측정 프로그램 ===" 출력
        // 2. "시작 시간: " + new java.util.Date() 출력
        System.out.println("=== 시간 측정 프로그램 ===");
        System.out.println("시작 시간: " + new java.util.Date());

        // TODO: 제곱근 합계 계산을 수행하세요
        // 힌트:
        // 1. sum = 0.0으로 초기화
        // 2. for (int i = 1; i <= 1000000; i++) 반복문
        // 3. sum += Math.sqrt(i) 누적
        // 4. "1부터 1,000,000까지 제곱근의 합: " + sum 출력
        double sum = 0.0;

        for (int i = 1; i <= 1000000; i++) {
            sum += Math.sqrt(i);
        }

        System.out.println("1부터 1,000,000까지 제곱근의 합: " + sum);

        // TODO: 파이 값을 라이프니츠 공식으로 계산하세요
        // 힌트:
        // 1. pi = 0.0으로 초기화
        // 2. for (int i = 0; i < 1000000; i++) 반복문
        // 3. pi += Math.pow(-1, i) / (2 * i + 1) 누적
        // 4. pi *= 4 (라이프니츠 공식 완성)
        // 5. "계산된 파이 값: " + pi 출력
        // 6. "실제 파이 값: " + Math.PI 출력
        // 7. "오차: " + Math.abs(pi - Math.PI) 출력
        double pi = 0.0;

        for (int i = 0; i < 1000000; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        pi *= 4;

        System.out.println("계산된 파이 값: " + pi);
        System.out.println("실제 파이 값: " + Math.PI);
        System.out.println("오차: " + Math.abs(pi - Math.PI));

        // TODO: 실행 시간을 계산하고 출력하세요
        // 힌트:
        // 1. endTime = System.nanoTime()
        // 2. endMillis = System.currentTimeMillis()
        // 3. nanoSeconds = endTime - startTime
        // 4. milliSeconds = endMillis - startMillis
        // 5. "\n실행 시간:" 출력
        // 6. "나노초: " + nanoSeconds 출력
        // 7. "밀리초: " + milliSeconds 출력
        // 8. "초: " + (nanoSeconds / 1_000_000_000.0) 출력
        long endTime = System.nanoTime();
        long endMillis = System.currentTimeMillis();
        long nanoSeconds = endTime - startTime;
        long milliSeconds = endMillis - startMillis;

        System.out.println("\n실행 시간:");
        System.out.println("나노초: " + nanoSeconds);
        System.out.println("밀리초: " + milliSeconds);
        System.out.println("초: " + (nanoSeconds / 1_000_000_000.0));

        // 여기에 코드를 작성하세요
    }
}