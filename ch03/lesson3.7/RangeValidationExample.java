/* 요구사항
    나이(1-150)와 점수(0-100)를 입력받아 검증
    범위를 벗어나면 재입력 요구
    숫자 형식이 아니면 NumberFormatException 처리
    유효한 입력 후 등급 계산*/

import textio.TextIO;

public class RangeValidationExample {
    public static void main(String[] args) {
        System.out.println("=== 범위 검증 입력 예제 ===");

        int age = getValidAge();
        int score = getValidScore();

        System.out.println("입력 완료!");
        System.out.println("나이: " + age + "세");
        System.out.println("점수: " + score + "점");

        // 등급 계산
        String grade = calculateGrade(score);
        System.out.println("등급: " + grade);
    }

    public static int getValidAge() {
        while (true) {
            System.out.print("나이를 입력하세요 (1-150): ");
            String input = TextIO.getln();

            // TODO: 나이 검증 로직
            // 힌트: 범위 검사 후 continue로 재시도
            // 여기에 코드를 작성하세요
            try {
                int age = Integer.parseInt(input.trim());
                if (age >= 1 && age <= 150) {
                    System.out.println("✅ 유효한 나이입니다.");
                    return age;
                } else {
                    System.out.println("❌ 나이는 1~150 사이여야 합니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ 올바른 숫자를 입력해주세요.");
            }
        }
    }

    public static int getValidScore() {
        while (true) {
            System.out.print("점수를 입력하세요 (0-100): ");
            String input = TextIO.getln();

            // TODO: 점수 검증 로직
            // 힌트: 범위 검사 후 continue로 재시도
            // 여기에 코드를 작성하세요
            try {
                int score = Integer.parseInt(input.trim());
                if (score >= 0 && score <= 100) {
                    System.out.println("✅ 유효한 점수입니다.");
                    return score;
                } else {
                    System.out.println("❌ 점수는 0~100 사이여야 합니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ 올바른 숫자를 입력해주세요.");
            }
        }
    }

    public static String calculateGrade(int score) {
        // TODO: 점수에 따른 등급 계산
        // 힌트: if-else if 체인
        // 여기에 코드를 작성하세요
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else return "F";
    }
}