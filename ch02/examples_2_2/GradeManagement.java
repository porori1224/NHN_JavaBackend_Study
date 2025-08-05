public class GradeManagement {
    public static void main(String[] args) {
        // TODO: 학생 정보를 저장할 변수들을 선언하세요
        // 힌트:
        // 1. studentName = "김철수" (학생 이름)
        // 2. studentId = 20240001 (학번)
        String studentName = "김철수";
        String studentId = "20240001";

        // TODO: 과목별 점수를 저장할 변수들을 선언하세요
        // 힌트:
        // 1. korean = 85.5 (국어 점수)
        // 2. english = 92.0 (영어 점수)
        // 3. math = 78.5 (수학 점수)
        // 4. science = 88.0 (과학 점수)
        // 5. history = 91.5 (역사 점수)
        double korean = 85.5;
        double english = 92.0;
        double math = 78.5;
        double science = 88.0;
        double history = 91.5;

        // TODO: 총점과 평균을 계산하세요
        // 힌트:
        // 1. totalScore = 모든 과목 점수의 합
        // 2. average = totalScore / 5
        double totalScore = korean + english + math + science + history;
        double average = totalScore / 5;

        // TODO: 평균 점수에 따라 학점을 결정하세요
        // 힌트:
        // 1. grade 변수 선언 (char 타입)
        // 2. if-else if 문 사용:
        //    - 90 이상: 'A'
        //    - 80 이상: 'B'
        //    - 70 이상: 'C'
        //    - 60 이상: 'D'
        //    - 60 미만: 'F'
        char grade = 'A';
        if (grade >= 90) {
            grade = 'A';
        } else if (grade >= 80 || grade < 90) {
            grade = 'B';
        } else if (grade >= 70 || grade < 80) {
            grade = 'C';
        } else if (grade >= 60 || grade < 70) {
            grade = 'D';
        } else { grade = 'F'; }

        // TODO: 합격 여부를 다산하세요
        // 힌트: isPassed = average >= 60 (60점 이상이면 합격)
        boolean isPassed = average >= 60;

        // TODO: 성적표를 출력하세요
        // 힌트:
        // 1. "=== 성적표 ===" 출력
        // 2. 학생명, 학번 출력
        // 3. "\n과목별 점수:" 출력 후 모든 과목 점수 출력
        // 4. 총점, 평균, 학점 출력
        // 5. 합격 여부를 삼항 연산자로 출력
        System.out.println("=== 성적표 ===");
        System.out.println("학생명: " + studentName + "\n학번: " + studentId);
        System.out.println("과목별 점수: ");
        System.out.println(
                "국어: " + korean +
                "\n영어: " + english +
                "\n수학: " + math +
                "\n과학: " + science +
                "\n역사: " + history
        );

        System.out.println(
                "총점: " + totalScore +
                "\n평균: " + average +
                "\n학점: " + grade
        );

        System.out.println(isPassed ? "합격" : "불합격");


        // TODO: 장학금 자격을 확인하고 출력하세요
        // 힌트:
        // 1. scholarshipEligible = average >= 90.0
        // 2. if문으로 자격이 있으면 "\n🎉 장학금 수혜 자격이 있습니다!" 출력
        boolean scholarshipEligible = (average >= 90.0);
        if (scholarshipEligible == true) { System.out.println("\n🎉 장학금 수혜 자격이 있습니다!"); }

        // 여기에 코드를 작성하세요
    }
}