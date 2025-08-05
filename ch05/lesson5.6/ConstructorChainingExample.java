// 테스트
public class ConstructorChainingExample {
    public static void main(String[] args) {
        // TODO 35: 다양한 생성자를 사용하여 SimpleDate 객체 생성하기
        // date1: 2024년 12월 25일
        // date2: 2024년 3월 1일
        // date3: 2024년 1월 1일
        // date4: 2024년 1월 20일
        SimpleDate date1 = new SimpleDate(2024, 12, 25);
        SimpleDate date2 = new SimpleDate(2024, 3);
        SimpleDate date3 = new SimpleDate(2024);
        SimpleDate date4 = new SimpleDate();

        // TODO 36: 생성된 날짜들 출력하기
        System.out.println("\n생성된 날짜들:");
        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);
        System.out.println("date3: " + date3);
        System.out.println("date4: " + date4);
    }
}