public class ReturnTypeExamples {
    public static void main(String[] args) {
        System.out.println("=== 다양한 반환 타입 예제 ===\n");

        // TODO 1: int 반환 메서드 테스트하기
        int squareResult = square(5);
        System.out.println("5의 제곱: " + squareResult);

        // TODO 2: double 반환 메서드 테스트하기
        double avgResult = average(10, 20);
        System.out.println("10과 20의 평균: " + avgResult);

        // TODO 3: boolean 반환 메서드 테스트하기
        boolean evenCheck = isEven(7);
        System.out.println("7은 짝수인가? " + evenCheck);

        // TODO 4: char 반환 메서드 테스트하기
        char grade = getGrade(85);
        System.out.println("85점의 학점: " + grade);

        // TODO 5: String 반환 메서드 테스트하기
        String day = getDayName(3);
        System.out.println("3번째 요일: " + day);
    }

    // TODO 6: int를 반환하는 함수 구현하기
    static int square(int n) {
        // n의 제곱 반환
        return n * n;
    }

    // TODO 7: double을 반환하는 함수 구현하기
    static double average(int a, int b) {
        // 두 수의 평균 반환
        return (a + b) / 2;
    }

    // TODO 8: boolean을 반환하는 함수 구현하기
    static boolean isEven(int n) {
        // 짝수 여부 판단
        return n % 2 == 0;
    }

    // TODO 9: char를 반환하는 함수 구현하기
    static char getGrade(int score) {
        // 점수에 따른 학점 반환 (A~F)
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    // TODO 10: String을 반환하는 함수 구현하기
    static String getDayName(int dayNumber) {
        // 1~7을 요일명으로 변환
        switch (dayNumber) {
            case 1: return "월요일";
            case 2: return "화요일";
            case 3: return "수요일";
            case 4: return "목요일";
            case 5: return "금요일";
            case 6: return "토요일";
            case 7: return "일요일";
            default: return "잘못된 입력입니다.";
        }
    }
}