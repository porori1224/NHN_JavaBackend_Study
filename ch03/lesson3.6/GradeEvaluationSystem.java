import textio.TextIO;

public class GradeEvaluationSystem {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요 (0-100): ");
        int score = TextIO.getlnInt();

        // TODO: switch 표현식으로 등급 결정
        // 힌트: score / 10 사용
        char grade = switch (score/10) {
            case 9, 10 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };

        // TODO: switch 표현식으로 평가 메시지 생성
        // 힌트: yield 사용
        String evaluation = switch (grade) {
            case 'A' -> {
                yield "탁월합니다!";
            }
            case 'B' -> {
                yield "우수합니다!";
            }
            case 'C' -> {
                yield "양호합니다!";
            }
            case 'D' -> {
                yield "노력이 필요합니다!";
            }
            default -> "재수강이 필요합니다!";
        };

        // TODO: switch 표현식으로 학점 계산
        // 힌트: -> 연산자
        double gpa = switch (grade) {
            case 'A' -> 4.5;
            case 'B' -> 3.0;
            case 'C' -> 2.0;
            case 'D' -> 1.0;
            default -> 0;
        };

        // TODO: switch 표현식으로 조언 생성
        // 힌트: -> 연산자
        String advice = switch (grade) {
            case 'A' -> "훌륭합니다. 계속 유지하세요!";
            case 'B' -> "잘했어요. A를 목표로 해보세요.";
            case 'C' -> "노력이 더 필요합니다.";
            case 'D' -> "복습이 필요합니다.";
            case 'F' -> "과목을 재이수하세요.";
            default -> "점수를 확인해주세요.";
        };

        System.out.println("\n=== 성적 결과 ===");
        System.out.printf("점수: %d점%n", score);
        System.out.printf("등급: %c (%s)%n", grade, evaluation);
        System.out.printf("학점: %.1f%n", gpa);
        System.out.println("조언: " + advice);

        // TODO: 장학금 자격 여부 판단
        // 힌트: switch 표현식
        boolean scholarship = switch (grade) {
            case 'A'-> true;
            default -> false;
        };

        if (scholarship) {
            System.out.println("🎉 장학금 대상자입니다!");
        }
    }
}