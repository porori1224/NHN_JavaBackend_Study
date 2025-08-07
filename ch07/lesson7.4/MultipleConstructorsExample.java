public class MultipleConstructorsExample {
    // TODO: 이름 레코드를 정의하세요
    // 레코드명: FullName, 매개변수: String firstName, String lastName
    record FullName(String firstName, String lastName) {
        // 기본 정식 생성자는 자동 생성됨

        // TODO: 이름 하나만 받는 생성자를 작성하세요
        // 매개변수: String singleName, lastName은 빈 문자열로 설정
        public FullName(String singleName) {
            this(singleName, "");  // firstName = singleName, lastName = ""
        }

        // TODO: 전체 이름 반환 메서드를 작성하세요
        // 메서드명: displayName
        // lastName이 비어있으면 firstName만, 아니면 "firstName lastName" 형태
        public String displayName() {
            if (lastName.isBlank()) {
                return firstName;
            }
            return firstName + " " + lastName;
        }

        // TODO: 커스텀 toString을 작성하세요
        // displayName() 결과를 반환
        @Override
        public String toString() {
            return displayName();
        }
    }

    // TODO: 원 레코드를 정의하세요
    // 레코드명: Circle, 매개변수: double centerX, double centerY, double radius
    record Circle(double centerX, double centerY, double radius) {
        // TODO: 원점 중심의 원을 위한 생성자를 작성하세요
        // 매개변수: double radius, 중심은 (0, 0)으로 설정
        public Circle(double radius) {
            this(0, 0, radius);
        }

        // TODO: 중심점과 반지름을 받는 대체 생성자를 작성하세요
        // 매개변수: Point center, double radius
        public Circle(Point center, double radius) {
            this(center.x(), center.y(), radius);
        }

        // TODO: 면적 계산 메서드를 작성하세요
        // 메서드명: area, 반환값: Math.PI * radius * radius
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    record Point(double x, double y) { }

    public static void main(String[] args) {
        // TODO: 다양한 생성자를 사용하여 이름 객체들을 생성하세요
        FullName name1 = new FullName("홍", "길동");
        FullName name2 = new FullName("Madonna");

        System.out.println("이름 1: " + name1);
        System.out.println("이름 2: " + name2);

        // TODO: 다양한 생성자를 사용하여 원 객체들을 생성하세요
        Circle circle1 = new Circle(5.0);                        // 중심 (0,0), 반지름 5.0
        Circle circle2 = new Circle(10, 10, 3.0);                // 중심 (10,10), 반지름 3.0
        Circle circle3 = new Circle(new Point(20, 20), 4.0);     // 중심 Point(20,20), 반지름 4.0

        System.out.println("\n원 1: " + circle1);
        System.out.println("원 2: " + circle2);
        System.out.println("원 3: " + circle3);
        System.out.printf("원 1 면적: %.2f\n", circle1.area());
    }
}