/* 요구사항
    학생 수 입력받기 (1-50명 범위 검증)
    각 학생의 이름과 점수 입력받기
        이름: 빈 문자열 불가, 20자 이내, 숫자만으로 구성 불가
        점수: 0-100 범위 검증
    점수에 따른 등급 계산 (A+: 95+, A: 90+, B+: 85+, B: 80+, C+: 75+, C: 70+, D: 60+, F: 60 미만)
    전체 학생 성적 결과표 출력
    통계 정보 계산 및 출력 (평균, 최고점, 최저점, 등급별 분포)
*/


import textio.TextIO;

public class GradeManagementExample {
    public static void main(String[] args) {
        System.out.println("=== 성적 관리 시스템 ===");

        try {
            int studentCount = getStudentCount();
            processStudentGrades(studentCount);

        } catch (Exception e) {
            System.out.println("❌ 시스템 오류: " + e.getMessage());
        }
    }

    public static int getStudentCount() {
        while (true) {
            try {
                System.out.print("학생 수를 입력하세요 (1-50): ");
                String input = TextIO.getln();
                int count = Integer.parseInt(input);

                // TODO: 학생 수 검증
                // 힌트: 범위 검사
                // 여기에 코드를 작성하세요
                if (count < 1 || count > 50) {
                    throw new IllegalArgumentException("학생 수는 1~50명 사이여야 합니다.");
                }

                return count;

            } catch (NumberFormatException e) {
                System.out.println("❌ 올바른 숫자를 입력하세요.");
            } catch (IllegalArgumentException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }
    }

    public static void processStudentGrades(int studentCount) {
        String[] studentNames = new String[studentCount];
        double[] scores = new double[studentCount];
        String[] grades = new String[studentCount];

        // 학생 정보 입력
        for (int i = 0; i < studentCount; i++) {
            System.out.println("\n--- 학생 " + (i + 1) + " ---");

            studentNames[i] = getStudentName(i + 1);
            scores[i] = getValidScore(studentNames[i]);
            grades[i] = calculateGrade(scores[i]);
        }

        // 결과 출력
        displayResults(studentNames, scores, grades);

        // 통계 계산
        calculateStatistics(scores);
    }

    public static String getStudentName(int studentNumber) {
        while (true) {
            try {
                System.out.print("학생 이름: ");
                String name = TextIO.getln().trim();

                // TODO: 이름 유효성 검증
                // 힌트: 비어있는지, 길이, 숫자만 있는지 검사
                // 여기에 코드를 작성하세요
                if (name.isEmpty()) {
                    throw new IllegalArgumentException("이름은 비워둘 수 없습니다.");
                }

                if (name.length() > 20) {
                    throw new IllegalArgumentException("이름은 20자 이내여야 합니다.");
                }

                if (name.matches("\\d+")) {
                    throw new IllegalArgumentException("이름은 숫자만으로 구성될 수 없습니다.");
                }

                return name;

            } catch (IllegalArgumentException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }
    }

    public static double getValidScore(String studentName) {
        while (true) {
            try {
                System.out.print(studentName + " 학생의 점수 (0-100): ");
                String input = TextIO.getln();
                double score = Double.parseDouble(input);

                // TODO: 점수 유효성 검증
                // 힌트: 범위 검사
                // 여기에 코드를 작성하세요
                if (score < 0 || score > 100) {
                    throw new IllegalArgumentException("점수는 0에서 100 사이여야 합니다.");
                }

                return score;

            } catch (NumberFormatException e) {
                System.out.println("❌ 올바른 숫자를 입력하세요.");
            } catch (IllegalArgumentException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }
    }

    public static String calculateGrade(double score) {
        // TODO: 세분화된 등급 계산
        // 힌트: if-else if 체인
        // 여기에 코드를 작성하세요
        if (score >= 95) return "A+";
        else if (score >= 90) return "A";
        else if (score >= 85) return "B+";
        else if (score >= 80) return "B";
        else if (score >= 75) return "C+";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    public static void displayResults(String[] names, double[] scores, String[] grades) {
        // TODO: 성적 결과 출력
        // 힌트: printf로 테이블 형태 출력
        // 여기에 코드를 작성하세요
        System.out.println("\n==================================================");
        System.out.println("📊 성적 결과");
        System.out.println("==================================================");
        System.out.printf("%-15s %-7s %-5s%n", "이름", "점수", "등급");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-15s %-7.1f %-5s%n", names[i], scores[i], grades[i]);
        }
        System.out.println("--------------------------------------------------");
    }

    public static void calculateStatistics(double[] scores) {
        try {
            double sum = 0;
            double max = scores[0];
            double min = scores[0];

            for (double score : scores) {
                sum += score;
                if (score > max) max = score;
                if (score < min) min = score;
            }

            double average = sum / scores.length;

            // TODO: 등급별 통계 계산
            // 힌트: 점수 범위로 등급 구분
            int[] gradeCount = new int[5];

            // 여기에 코드를 작성하세요
            for (double score : scores) {
                sum += score;
                if (score > max) max = score;
                if (score < min) min = score;

                if (score >= 90) gradeCount[0]++;
                else if (score >= 80) gradeCount[1]++;
                else if (score >= 70) gradeCount[2]++;
                else if (score >= 60) gradeCount[3]++;
                else gradeCount[4]++;
            }

            System.out.println("\n📈 통계 정보:");
            System.out.printf("• 평균: %.2f점%n", average);
            System.out.printf("• 최고점: %.1f점%n", max);
            System.out.printf("• 최저점: %.1f점%n", min);
            System.out.printf("• 점수 범위: %.1f점%n", max - min);

            System.out.println("\n📊 등급별 분포:");
            String[] gradeNames = {"A (90-100)", "B (80-89)", "C (70-79)", "D (60-69)", "F (0-59)"};
            for (int i = 0; i < gradeNames.length; i++) {
                double percentage = (gradeCount[i] * 100.0) / scores.length;
                System.out.printf("• %s: %d명 (%.1f%%)%n", gradeNames[i], gradeCount[i], percentage);
            }

        } catch (Exception e) {
            System.out.println("❌ 통계 계산 중 오류: " + e.getMessage());
        }
    }
}