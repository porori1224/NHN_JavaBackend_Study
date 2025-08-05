/* 요구사항
    학생 이름, 국어/수학/영어 점수 입력받기 ('quit'으로 종료)
    각 학생의 총점과 평균 계산하여 성적표 출력
    과목별 총점을 누적하여 과목별 평균 계산
    최고 총점을 받은 학생 찾아 최우수 학생으로 표시
    최대 30명까지 입력 가능*/

import textio.TextIO;

public class StudentGradeSystemExample {
    public static void main(String[] args) {
        final int MAX_STUDENTS = 30;
        String[] studentNames = new String[MAX_STUDENTS];
        int[] koreanScores = new int[MAX_STUDENTS];
        int[] mathScores = new int[MAX_STUDENTS];
        int[] englishScores = new int[MAX_STUDENTS];
        int studentCount = 0;

        System.out.println("=== 학생 성적 관리 시스템 ===");

        // 학생 정보 입력
        while (true) {
            System.out.print("\n학생 이름 (종료: 'quit'): ");
            String name = TextIO.getln();

            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            if (studentCount >= MAX_STUDENTS) {
                System.out.println("더 이상 학생을 추가할 수 없습니다!");
                break;
            }

            studentNames[studentCount] = name;

            System.out.print("국어 점수: ");
            koreanScores[studentCount] = TextIO.getlnInt();

            System.out.print("수학 점수: ");
            mathScores[studentCount] = TextIO.getlnInt();

            System.out.print("영어 점수: ");
            englishScores[studentCount] = TextIO.getlnInt();

            studentCount++;
            System.out.println("✅ " + name + " 학생 정보가 추가되었습니다.");
        }

        // 성적 처리 및 출력
        if (studentCount > 0) {
            System.out.println("\n" + "=".repeat(70));
            System.out.println("📊 성적표");
            System.out.println("=".repeat(70));
            System.out.printf("%-10s %6s %6s %6s %6s %6s%n",
                    "이름", "국어", "수학", "영어", "총점", "평균");
            System.out.println("-".repeat(70));

            int totalKorean = 0, totalMath = 0, totalEnglish = 0;

            // TODO: 학생별 성적 출력
            // 힌트: 총점 계산 및 출력
            // 여기에 코드를 작성하세요
            int[] totalScores = new int[studentCount];
            double[] avgScores = new double[studentCount];

            for (int i = 0; i < studentCount; i++) {
                int total = koreanScores[i] + mathScores[i] + englishScores[i];
                double average = total / 3.0;

                totalScores[i] = total;
                avgScores[i] = average;

                System.out.printf("%-10s %6d %6d %6d %6d %6.1f%n",
                        studentNames[i], koreanScores[i], mathScores[i], englishScores[i], total, average);

                totalKorean += koreanScores[i];
                totalMath += mathScores[i];
                totalEnglish += englishScores[i];
            }

            System.out.println("-".repeat(70));

            // 과목별 평균
            double avgKorean = (double) totalKorean / studentCount;
            double avgMath = (double) totalMath / studentCount;
            double avgEnglish = (double) totalEnglish / studentCount;

            System.out.printf("과목 평균  %6.1f %6.1f %6.1f%n",
                    avgKorean, avgMath, avgEnglish);

            // TODO: 최고 점수 학생 찾기
            // 힌트: 최댓값 알고리즘
            // 여기에 코드를 작성하세요
            int maxTotal = totalScores[0];
            int maxTotalIndex = 0;

            for (int i = 1; i < studentCount; i++) {
                if (totalScores[i] > maxTotal) {
                    maxTotal = totalScores[i];
                    maxTotalIndex = i;
                }
            }



            System.out.println("\n🏆 최우수 학생: " + studentNames[maxTotalIndex] +
                    " (총점: " + maxTotal + "점)");
        } else {
            System.out.println("\n입력된 학생 정보가 없습니다.");
        }
    }
}