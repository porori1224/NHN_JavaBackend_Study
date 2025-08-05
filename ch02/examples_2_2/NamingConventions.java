public class NamingConventions {
    // TODO: 상수를 선언하세요 (모두 대문자, 밑줄로 구분)
    // 힌트:
    // 1. PI = 3.14159 (public static final double)
    // 2. MAX_STUDENTS = 100 (public static final int)
    // 3. DEFAULT_COUNTRY = "Korea" (public static final String)
    double PI = 3.14159;
    int MAX_STUDENTS = 100;
    String  DEFAULT_COUNTRY = "Korea";

    public static void main(String[] args) {
        // TODO: camelCase를 사용하여 변수를 선언하세요
        // 힌트:
        // 1. studentAge = 20 (학생 나이)
        // 2. averageScore = 85.5 (평균 점수)
        // 3. courseName = "Introduction to Java" (과목명)
        // 4. isPassed = true (합격 여부)
        int studentAge = 20;
        double averageScore = 85.5;
        String courseName = "Introduction to Java";
        boolean isPassed = true;

        // TODO: 여러 단어로 된 변수명을 작성하세요
        // 힌트:
        // 1. monthlyInterestRate = 0.01 (월 이자율)
        // 2. numberOfDaysInYear = 365 (연간 일수)
        // 3. currentUserName = "admin" (현재 사용자명)
        double monthlyInterestRate = 0.01;
        int numberOfDaysInYear = 365;
        String currentUserName = "admin";

        // TODO: 메소드를 호출하세요
        // 힌트:
        // 1. printStudentInfo 메소드 호출 (studentAge, averageScore 전달)
        // 2. calculateFinalScore 메소드 호출하여 결과를 finalScore에 저장
        printStudentInfo(studentAge, averageScore);
        calculateFinalScore(studentAge, averageScore);
    }

    // TODO: 학생 정보를 출력하는 메소드를 구현하세요
    // 힌트: "나이: [age], 점수: [score]" 형식으로 출력
    public static void printStudentInfo(int age, double score) {
        // 여기에 코드를 작성하세요
        System.out.println("나이: " + age + ", 점수: " + score);
    }

    // TODO: 최종 점수를 계산하는 메소드를 구현하세요
    // 힌트: base + bonus를 반환
    public static double calculateFinalScore(double base, double bonus) {
        // 여기에 코드를 작성하세요
        return base + bonus; // 임시 반환값
    }
}