// 동물원 관리 시스템
public class Zoo {
    public static void main(String[] args) {
        // TODO 72: Dog과 Duck 객체 생성하기
        // Dog: "바둑이"
        // Duck: "도널드"
        Dog dog = new Dog("바둑이");
        Duck duck = new Duck("도널드");

        // TODO 73: LandAnimal 배열로 처리하기
        // 두 동물을 LandAnimal 배열에 담고
        // 각각 run(), makeSound(), jump() 호출하기
        System.out.println("=== 육상 동물 행동 ===");
        LandAnimal[] animals = {dog, duck};
        for (LandAnimal animal : animals) {
            animal.run();
            animal.makeSound();
            animal.jump();
            System.out.println();
        }

        // TODO 74: 오리의 특별한 능력 테스트하기
        // swim(), dive(2), fly() 호출
        // 현재 고도 출력
        // land() 호출
        System.out.println("=== 오리의 특별한 능력 ===");
        duck.swim();
        duck.dive(2);
        duck.fly();

        System.out.println("현재 고도: " + duck.getAltitude() + "m");
        duck.land();
    }
}
