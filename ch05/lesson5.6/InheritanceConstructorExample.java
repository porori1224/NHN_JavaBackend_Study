import java.util.Random;

/**
 * 도형 클래스 계층구조에서 생성자 사용
 */
abstract class Shape {
    protected String color;
    protected boolean filled;

    // Shape의 생성자
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        System.out.println("Shape 생성자 호출");
    }

    public Shape(String color) {
        this(color, false);  // 다른 생성자 호출
    }

    public Shape() {
        this("검정");  // 기본값
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    // Rectangle의 완전한 생성자
    public Rectangle(double width, double height, String color, boolean filled) {
        // TODO 37: super()를 사용하여 부모 생성자 호출하기
        // color와 filled를 부모 생성자에 전달
        // width와 height 초기화
        // "Rectangle 생성자 호출" 출력
        super(color, filled);
        this.width = width;
        this.height = height;
        System.out.println("Rectangle 생성자 호출");
    }

    // 크기와 색상만 지정
    public Rectangle(double width, double height, String color) {
        // TODO 38: this()를 사용하여 완전한 생성자 호출하기
        // filled는 false로 설정
        this(width, height, color, false);
    }

    // 크기만 지정
    public Rectangle(double width, double height) {
        // TODO 39: super()를 사용하여 기본 Shape 생성자 호출하기
        // width와 height 초기화
        // "Rectangle 생성자 호출" 출력
        this(width, height, "");
        System.out.println("Ractangle 생성자 호출");
    }

    @Override
    public String toString() {
        // TODO 40: "[color] 사각형 ([width] x [height])[채움 여부]" 형식으로 반환하기
        // filled가 true이면 " [채움]" 추가
        return color + "사각형 (" + width + " x " + height + ")" + (filled ? "[채움]" : "");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        // TODO 41: super()를 사용하여 부모 생성자 호출하기
        // radius 초기화
        // "Circle 생성자 호출" 출력
        super(color, filled);
        this.radius = radius;
        System.out.println("Circle 생성자 호출");
    }

    public Circle(double radius) {
        // TODO 42: this()를 사용하여 완전한 생성자 호출하기
        // 기본값: "빨강", true
        this(radius, "빨강", true);

    }

    @Override
    public String toString() {
        // TODO 43: "[color] 원 (반지름: [radius])[채움 여부]" 형식으로 반환하기
        return color + "원 (반지름: " + radius + ")" + (filled ? "[채움]": "");
    }
}

// 테스트
public class InheritanceConstructorExample {
    public static void main(String[] args) {
        // TODO 44: 다양한 생성자로 도형 객체 생성하기
        // Rectangle: 10, 5, "파랑", true
        // Rectangle: 7, 3 (기본 색상)
        // Circle: 5 (기본 설정)
        Rectangle ractangel1 = new Rectangle(10, 5, "파랑", true);
        Rectangle rectangle2 = new Rectangle(7, 3);
        Circle circle1 = new Circle(5);

        // TODO 45: 생성된 도형 정보 출력하기
        System.out.println("\n=== Rectangle 생성 ===");
        System.out.println(ractangel1);
        System.out.println("\n=== Rectangle 생성 (크기만) ===");
        System.out.println(rectangle2);
        System.out.println("\n=== Circle 생성 === ");
        System.out.println(circle1);
    }
}