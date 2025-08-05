/**
 * super를 사용하여 숨겨진 부모 클래스 멤버에 접근하는 예제
 */
class Vehicle {
    protected String model = "일반 차량";
    protected int maxSpeed = 100;

    public void displayInfo() {
        System.out.println("차량 모델: " + model);
        System.out.println("최고 속도: " + maxSpeed + "km/h");
    }

    public void honk() {
        System.out.println("빵빵!");
    }
}

class SportsCar extends Vehicle {
    protected String model = "스포츠카";  // 부모의 model을 숨김
    private boolean turboMode = false;

    public SportsCar() {
        // TODO 19: 부모 클래스의 maxSpeed를 250으로 설정하기
        // super를 사용하여 부모의 필드에 접근
        super();
        maxSpeed = 250;
    }

    public void displayAllInfo() {
        System.out.println("=== 전체 정보 ===");
        // TODO 20: this.model과 super.model의 차이 출력하기
        // this.model: 자신의 model 필드
        // super.model: 부모의 model 필드
        // super.maxSpeed와 turboMode도 출력
        System.out.println("this.model: " + this.model);
        System.out.println("super.model: " + super.model);
        System.out.println("최고 속도: " + super.maxSpeed + "km/h");
        System.out.println("터보 모드: " + (turboMode ? "ON" : "OFF"));
    }

    @Override
    public void honk() {
        // TODO 21: 부모의 honk() 호출 후 추가 동작 수행하기
        // super.honk() 호출
        // "부웉!!" 출력
        super.honk();
        System.out.println("부웉!!");
    }
}

// 테스트
public class SuperAccessExample {
    public static void main(String[] args) {
        // TODO 22: SportsCar 객체 생성하고 메서드들 호출하기
        // displayInfo() 호출 (부모의 메서드)
        // displayAllInfo() 호출
        // honk() 호출
        SportsCar car = new SportsCar();
        car.displayInfo();
        System.out.println();
        car.displayAllInfo();
        car.honk();
    }
}