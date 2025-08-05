// TODO 36: 클래스들 테스트하기
public class ToStringExamples {
    public static void main(String[] args) {
        System.out.println("=== 다양한 toString() 구현 예제 ===\n");

        // TODO 37: Book 클래스 테스트하기
        // book1: "자바의 정석", "남궁성", 1200, 35000
        // book2: "클린 코드", "로버트 마틴", 584, 29000
        // 책 정보 출력
        System.out.println("=== 도서 정보 ===");
        Book book1 = new Book("자바의 정석", "남궁성", 1200, 35000);
        Book book2 = new Book("클린 코드", "로버트 마틴", 584, 29000);
        System.out.println(book1);
        System.out.println(book2);

        // TODO 38: Point 클래스 테스트하기
        // p1: (3.5, 4.2)
        // p2: (-2.1, 1.8)
        // 좌표 출력 및 거리 계산
        System.out.println("\n=== 좌표 정보 ===");
        Point p1 = new Point(3.5, 4.2);
        Point p2 = new Point(-2.1, 1.8);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.printf("p1에서 p2까지: %.2f\n", p1.distanceTo(p2));
    }
}
