// TODO 35: import문 추가하기
import java.util.ArrayList;

// TODO 36: 클래스에 상세한 Javadoc 주석 작성하기
/**
 *
 * <p> 학생들 점수 관리 및 평균, 학점 계산을 위한 유틸리티 클래스
 * <ul>
 *   <li>점수 추가 기능 (0 ~ 100 범위 검사)</li>
 *   <li>점수들의 평균 계산</li>
 *   <li>평균에 따른 학점(A~F) 계산</li>
 * </ul>
 *
 * <p>사용 예제:
 * <pre> {
 * @code
 * GradeManager gm = new GradeManager();
 * gm.addScore(85);
 * gm.addScore(95);
 * System.out.println("평균: " + gm.getAverage()); // 90
 * System.out.println("학점: " + gm.getLetterGrade()); // A
 * }
 * </pre>
 *
 * @author  김민서
 * @version 1.0
 * @see java.util.ArrayList
 */
public class GradeManager {
    private ArrayList<Integer> scores;

    // TODO 37: 생성자에 Javadoc 주석 작성하기
    /**
     * GradeManager 객체 생성. 내부 점수 리스트를 초기화
     */
    public GradeManager() {
        scores = new ArrayList<>();
    }

    // TODO 38: addScore 메서드에 Javadoc 주석 작성하기
    /**
     * @param score 추가할 점수
     * @throws IllegalArgumentException 점수가 0 미만이거나 100 초과인 경우
     */
    public void addScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException(
                    "점수는 0과 100 사이여야 합니다: " + score);
        }
        scores.add(score);
    }

    // TODO 39: getAverage 메서드에 Javadoc 주석 작성하기
    /**
     * @return 점수들의 평균 (실수형태), 점수가 없을 경우 0.0 반환
     */
    public double getAverage() {
        if (scores.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }

    // TODO 40: getLetterGrade 메서드에 상세한 Javadoc 주석 작성하기
    /**
     * <p>학점 기준:
     * <ul>
     *   <li>90 이상: A</li>
     *   <li>80 이상, 90 미만: B</li>
     *   <li>70 이상, 80 미만: C</li>
     *   <li>60 이상, 70 미만: D</li>
     *   <li>60 미만: F</li>
     * </ul>
     *
     * @return 학점 (A, B, C, D, F) 중 하나 반환
     * @see #getAverage()
     */
    public char getLetterGrade() {
        double avg = getAverage();
        if (avg >= 90) return 'A';
        if (avg >= 80) return 'B';
        if (avg >= 70) return 'C';
        if (avg >= 60) return 'D';
        return 'F';
    }
}