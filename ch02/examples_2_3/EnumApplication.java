public class EnumApplication {
    // TODO: 신호등 열거형을 정의하세요
    // 힌트: enum TrafficLight { RED, YELLOW, GREEN }
    enum TrafficLight { RED, YELLOW, GREEN };

    // TODO: 커피 사이즈 열거형을 정의하세요
    // 힌트: enum CoffeeSize { SMALL, MEDIUM, LARGE }
    enum CoffeeSize { SMALL, MEDIUM, LARGE };

    public static void main(String[] args) {
        // TODO: 신호등 시뮬레이션을 구현하세요
        // 힌트:
        // 1. light = TrafficLight.RED로 설정
        // 2. "현재 신호: " + light 출력
        // 3. switch문으로 신호에 따른 메시지 출력:
        //    - RED: "정지하세요!"
        //    - YELLOW: "주의하세요!"
        //    - GREEN: "진행하세요!"
        TrafficLight light = TrafficLight.RED;
        System.out.println("현재 신호: " + light);
        switch (light) {
            case RED: System.out.println("정지하세요!"); break;
            case YELLOW: System.out.println("주의하세요!"); break;
            case GREEN: System.out.println("진행하세요!"); break;
        }

        // TODO: 커피 주문 시스템을 구현하세요
        // 힌트:
        // 1. myOrder = CoffeeSize.MEDIUM으로 설정
        // 2. price = 0으로 초기화
        // 3. switch문으로 사이즈에 따른 가격 설정:
        //    - SMALL: 3000원
        //    - MEDIUM: 4000원
        //    - LARGE: 5000원
        // 4. "\n커피 주문: " + myOrder 출력
        // 5. "가격: " + price + "원" 출력
        CoffeeSize myOrder = CoffeeSize.MEDIUM;
        int price = 0;

        switch (myOrder) {
            case SMALL: price = 3000; break;
            case MEDIUM: price = 4000; break;
            case LARGE: price = 5000; break;
        }

        System.out.println("\n커피 주문: " + myOrder);
        System.out.println("가격: " + price + "원");

        // TODO: 열거형 비교를 구현하세요
        // 힌트:
        // 1. yourOrder = CoffeeSize.MEDIUM으로 설정
        // 2. if (myOrder == yourOrder) 조건으로 비교
        // 3. 같으면 "같은 사이즈를 주문했습니다!" 출력
        CoffeeSize yourOrder = CoffeeSize.MEDIUM;
        if (myOrder == yourOrder) {
            System.out.println("같은 사이즈를 주문했습니다!");
        }

        // 여기에 코드를 작성하세요
    }
}