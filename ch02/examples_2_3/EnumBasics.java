public class EnumBasics {
    // TODO: 요일 열거형을 정의하세요
    // 힌트: enum DayOfWeek { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
    enum DayOfWeek { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };

    // TODO: 사이즈 열거형을 정의하세요
    // 힌트: enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE }
    enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE };

    public static void main(String[] args) {
        // TODO: 열거형 변수를 선언하고 값을 할당하세요
        // 힌트:
        // 1. today = DayOfWeek.FRIDAY
        // 2. shirtSize = Size.LARGE
        DayOfWeek today = DayOfWeek.FRIDAY;
        Size shirtSize = Size.LARGE;

        // TODO: 열거형 값을 출력하세요
        // 힌트:
        // 1. "오늘은 " + today + "입니다." 출력
        // 2. "셔츠 사이즈: " + shirtSize 출력
        System.out.println("오늘은 " + today + "입니다.");
        System.out.println("셔츠 사이즈: " + shirtSize);

        // TODO: ordinal() 메소드를 사용하여 순서를 출력하세요
        // 힌트:
        // 1. "\nordinal 값:" 출력
        // 2. today + "의 순서: " + today.ordinal() 출력
        // 3. shirtSize + "의 순서: " + shirtSize.ordinal() 출력
        System.out.println("\nordinal 값:");
        System.out.println(today + "의 순서: " + today.ordinal());
        System.out.println(shirtSize + "의 순서: " + shirtSize.ordinal());

        // TODO: values() 메소드를 사용하여 모든 요일을 출력하세요
        // 힌트:
        // 1. "\n모든 요일:" 출력
        // 2. for (DayOfWeek day : DayOfWeek.values()) 반복문 사용
        // 3. day + " (인덱스: " + day.ordinal() + ")" 형식으로 출력
        System.out.println("\n모든 요일:");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day + " (인덱스: " + day.ordinal() + ")");
        };

        // 여기에 코드를 작성하세요
    }
}