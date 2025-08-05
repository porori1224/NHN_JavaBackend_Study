public class StringFormatting {
    public static void main(String[] args) {
        // TODO: 문자열 서식을 사용하여 테이블 형태로 출력하세요
        // 힌트:
        // 1. 배열 생성: names={"김철수", "이영희", "박민수", "최서연"}, ages={25, 30, 28, 22}, scores={85.5, 92.3, 78.9, 95.7}
        // 2. 헤더 출력: printf로 "이름", "나이", "점수"를 정렬하여 출력
        // 3. 구분선: "-".repeat(28) 출력
        // 4. 반복문으로 각 학생 정보를 printf로 정렬하여 출력
        // 5. 문자열 정렬 예제: "Java Programming"을 다양한 정렬로 출력

        // 여기에 코드를 작성하세요
        String[] names = {"김철수", "이영희", "박민수", "최서연"};
        int[] ages = {25, 30, 28, 22};
        double[] scores = {85.5, 92.3, 78.9, 95.7};

        System.out.println("=== 학생 명단 ===");
        System.out.printf("%-10s %5s %8s\n", "이름", "나이", "점수");
        System.out.println("-".repeat(28));

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s %5d %8.1f\n", names[i], ages[i], scores[i]);
        }

        System.out.println("\n=== 정렬 예제 ===");
        String str = "Java Programming";

        System.out.printf("기본: '%s'\n", str);
        System.out.printf("20자 오른쪽 정렬: '%20s'\n", str);
        System.out.printf("20자 왼쪽 정렬: '%-20s'\n", str);
    }
}