/* 요구사항
sum을 0으로 초기화
for 루프로 temperatures 배열의 모든 값을 sum에 누적
합계 출력 (printf 사용, 형식: "\n주간 온도 합계: %.1f°C%n")
average = sum / temperatures.length로 평균 계산
평균 출력 (printf 사용, 형식: "주간 평균 온도: %.1f°C%n")*/

public class ArrayProcessingExample {
    public static void main(String[] args) {
        double[] temperatures = {23.5, 25.0, 22.8, 26.3, 24.1, 25.5, 23.9};
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};

        System.out.println("=== 주간 온도 데이터 ===");

        // 1. 데이터 출력
        for (int i = 0; i < temperatures.length; i++) {
            System.out.printf("%s요일: %.1f°C%n", days[i], temperatures[i]);
        }

        // TODO: 합계와 평균 계산
        // 힌트: for 루프와 누적
        // 여기에 코드를 작성하세요
        double sum = 0;

        for (double temp : temperatures) {
            sum += temp;
        }

        double average = sum / temperatures.length;

        System.out.printf("\n주간 온도 합계: %.1f°C%n", sum);
        System.out.printf("주간 평균 온도: %.1f°C%n", average);


        // TODO: 최고 온도와 최저 온도 찾기
        // 힌트: 비교와 갱신
        // 여기에 코드를 작성하세요
        double maxTemp = temperatures[0];
        double minTemp = temperatures[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemp) {
                maxTemp = temperatures[i];
                maxIndex = i;
            }
            if (temperatures[i] < minTemp) {
                minTemp = temperatures[i];
                minIndex = i;
            }
        }

        System.out.printf("\n최고 온도: %.1f°C (%s요일)%n", maxTemp, days[maxIndex]);
        System.out.printf("최저 온도: %.1f°C (%s요일)%n", minTemp, days[minIndex]);


        // TODO: 평균보다 높은 날 찾기
        // 힌트: 조건문과 카운터
        System.out.println("\n평균보다 높은 온도의 날:");

        // 여기에 코드를 작성하세요
        int count = 0;

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > average) {
                double diff = temperatures[i] - average;
                System.out.printf("  %s요일: %.1f°C (평균보다 +%.1f°C)%n", days[i], temperatures[i], diff);
                count++;
            }
        }

        System.out.printf("총 %d일%n", count);
    }
}