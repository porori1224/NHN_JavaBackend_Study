public class IntegerDivisionPitfall {
    public static void main(String[] args) {
        // TODO: 정수 나눗셈의 문제점과 해결 방법을 보여주세요
        // 힌트:
        // 1. total=17, count=5로 선언
        // 2. 잘못된 평균: total / count를 double에 저장
        // 3. 올바른 평균: (double)total / count, total / (double)count, 1.0 * total / count
        // 4. 백분율 계산: score=85, totalScore=100일 때 잘못된 방법과 올바른 방법 비교

        // 여기에 코드를 작성하세요
        int total = 17;
        int count = 5;

        // 잘못된 평균
        double wrongAverage = total / count;

        // 올바른 평균 계산 방법
        double correctAverage1 = (double) total / count;
        double correctAverage2 = total / (double) count;
        double correctAverage3 = 1.0 * total / count;

        System.out.println("잘못된 평균: " + wrongAverage);
        System.out.println("올바른 평균1: " + correctAverage1);
        System.out.println("올바른 평균2: " + correctAverage2);
        System.out.println("올바른 평균3: " + correctAverage3);

        // 백분율 계산
        int score = 85;
        int totalScore = 100;

        double wrongPercentage = (score / totalScore) * 100; // 정수 나눗셈 먼저 수행됨
        double correctPercentage = (score / (double) totalScore) * 100;

        System.out.printf("\n잘못된 백분율: %.1f%%\n", wrongPercentage);
        System.out.printf("올바른 백분율: %.1f%%\n", correctPercentage);
    }
}