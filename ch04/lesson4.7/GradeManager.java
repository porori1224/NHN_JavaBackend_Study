import java.util.Scanner;

public class GradeManager {
    // TODO 18: 프로그램 변수들 선언하기
    // MAX_STUDENTS (상수, 100), names (문자열 배열), 
    // averages (실수 배열), studentCount (정수)
    static final int MAX_STUDENTS = 100;
    static String[] names = new String[MAX_STUDENTS];
    static double[] averages = new double[MAX_STUDENTS];
    static int studentCount = 0;

    public static void main(String[] args) {
        // TODO 19: 메인 프로그램 실행하기
        runGradeManager();
    }

    // TODO 20: runGradeManager 메서드 구현하기
    /**
     * 프로그램의 메인 루프
     *
     * 사전 조건: 없음
     * 사후 조건: 프로그램이 정상 종료됨
     */
    static void runGradeManager() {
        // 메뉴 반복 표시하고 사용자 선택 처리
        // 1: 학생 추가, 2: 전체 보기, 3: 통계, 4: 종료
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    displayStatistics();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }

    // TODO 21: displayMenu 메서드 구현하기
    /**
     * 메뉴를 표시합니다.
     */
    static void displayMenu() {
        // 메뉴 옵션들 출력
        System.out.println("=== 성적 관리 시스템 ===");
        System.out.println("1. 학생 추가");
        System.out.println("2. 전체 학생 보기");
        System.out.println("3. 통계 보기");
        System.out.println("4. 종료");
    }

    // TODO 22: addStudent 메서드 구현하기
    /**
     * 새 학생을 추가합니다.
     *
     * 사전 조건: studentCount < MAX_STUDENTS
     * 사후 조건: 새 학생이 배열에 추가되고 studentCount가 증가함
     */
    static void addStudent() {
        // 배열 공간 확인
        // 이름 입력받기
        // 점수 입력받고 평균 계산하기
        // 배열에 저장하고 카운트 증가
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 이름: ");
        String name = scanner.nextLine();

        double avg = inputAndCalculateAverage();
        names[studentCount] = name;
        averages[studentCount] = avg;
        studentCount++;

        System.out.println("학생이 추가되었습니다.\n");
    }

    // TODO 23: inputAndCalculateAverage 메서드 구현하기
    /**
     * 점수를 입력받고 평균을 계산합니다.
     *
     * 사전 조건: 없음
     * 사후 조건: 0 <= 반환값 <= 100
     *
     * @return 계산된 평균 점수
     */
    static double inputAndCalculateAverage() {
        // 3과목의 점수를 입력받아 평균 계산
        // 각 점수는 0-100 범위 검증
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        System.out.println("3과목의 점수를 입력하세요:");

        for (int i = 1; i <= 3; i++) {
            double score;
            while (true) {
                System.out.print("과목 " + i + ": ");
                score = scanner.nextDouble();
                if (score >= 0 && score <= 100) break;
                System.out.println("점수는 0에서 100 사이여야 합니다.");
            }
            total += score;
        }
        return total / 3;
    }

    // TODO 24: displayAllStudents 메서드 구현하기
    /**
     * 모든 학생을 표시합니다.
     *
     * 사전 조건: 없음
     * 사후 조건: 모든 학생 정보가 화면에 표시됨
     */
    static void displayAllStudents() {
        // 학생 수 확인
        // 표 형태로 학생 정보와 학점 출력
        if (studentCount == 0) {
            System.out.println("등록된 학생이 없습니다.\n");
            return;
        }

        System.out.println("\n=== 전체 학생 목록 ===");
        System.out.printf("%-15s %-7s %-5s\n", "이름", "평균", "학점");
        System.out.println("------------------------------");

        for (int i = 0; i < studentCount; i++) {
            System.out.printf("%-15s %-7.2f %-5c\n", names[i], averages[i], calculateGrade(averages[i]));
        }
        System.out.println();
    }

    // TODO 25: calculateGrade 메서드 구현하기
    /**
     * 평균 점수로 학점을 계산합니다.
     *
     * 사전 조건: 0 <= average <= 100
     * 사후 조건: 반환값은 'A', 'B', 'C', 'D', 'F' 중 하나
     *
     * @param average 평균 점수
     * @return 학점
     */
    static char calculateGrade(double average) {
        // 90이상: A, 80이상: B, 70이상: C, 60이상: D, 60미만: F
        if (average >= 90) return 'A';
        if (average >= 80) return 'B';
        if (average >= 70) return 'C';
        if (average >= 60) return 'D';
        return 'F';
    }

    // TODO 26: displayStatistics 메서드 구현하기
    /**
     * 통계 정보를 표시합니다.
     *
     * 사전 조건: studentCount > 0
     * 사후 조건: 평균, 최고점, 최저점이 표시됨
     */
    static void displayStatistics() {
        // 학생 수 확인
        // 전체 평균, 최고점, 최저점 계산하여 출력
        if (studentCount == 0) {
            System.out.println("학생 데이터가 없습니다.\n");
            return;
        }
        System.out.println("\n=== 통계 ===");
        System.out.printf("전체 평균: %.2f\n", calculateTotalAverage());
        System.out.printf("최고 점수: %.2f\n", findHighest());
        System.out.printf("최저 점수: %.2f\n\n", findLowest());
    }

    // TODO 27: 통계 계산 보조 메서드들 구현하기
    static double calculateTotalAverage() {
        double total = 0;
        for (int i = 0; i < studentCount; i++) {
            total += averages[i];
        }
        return total / studentCount;
    }
    static double findHighest() {
        double max = averages[0];
        for (int i = 1; i < studentCount; i++) {
            if (averages[i] > max) {
                max = averages[i];
            }
        }
        return max;
    }
    static double findLowest() {
        double min = averages[0];
        for (int i = 1; i < studentCount; i++) {
            if (averages[i] < min) {
                min = averages[i];
            }
        }
        return min;
    }
}