public class ModuloOperator {
    public static void main(String[] args) {
        System.out.println("=== 나머지 연산자 활용 ===");

        // 1. 짝수/홀수 판별
        System.out.println("\n1. 짝수/홀수 판별:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "는 짝수");
            } else {
                System.out.println(i + "는 홀수");
            }
        }

        // 2. 자릿수 추출
        System.out.println("\n2. 자릿수 추출:");
        int number = 12345;
        System.out.println("숫자: " + number);
        System.out.println("1의 자리: " + (number % 10));
        System.out.println("10의 자리: " + (number / 10 % 10));
        System.out.println("100의 자리: " + (number / 100 % 10));

        // 3. 시간 변환
        System.out.println("\n3. 시간 변환:");
        int totalSeconds = 7265;  // 2시간 1분 5초
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("%d초 = %d시간 %d분 %d초%n",
                totalSeconds, hours, minutes, seconds);

        // 4. 요일 계산
        System.out.println("\n4. 요일 계산:");
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};
        int today = 3;  // 목요일
        int daysLater = 10;
        int futureDay = (today + daysLater) % 7;
        System.out.println("오늘이 " + days[today] + "요일이면");
        System.out.println(daysLater + "일 후는 " + days[futureDay] + "요일");
    }
}