// 간단한 전투 테스트
public class BattleTest {
    public static void main(String[] args) {
        // TODO 66: 전사와 마법사 생성하기
        // Warrior: "아서"
        // Mage: "멀린"
        GameCharacter Warrior = new Warrior("아서");
        GameCharacter Mage = new Mage("멀린");

        // TODO 67: 캐릭터 정보 출력하기
        // 두 캐릭터의 toString() 결과 출력
        System.out.println("=== 초기 상태 ===");
        System.out.println(Warrior);
        System.out.println(Mage);

        // TODO 68: 전투 시뮬레이션하기
        // 전사가 마법사를 공격
        // 마법사가 전사를 공격
        // 전사가 특수 스킬 사용
        // 마법사가 특수 스킬 사용
        System.out.println("\n=== 전투 시작 ===");
        Warrior.attack(Mage);
        System.out.println();

        Mage.attack(Warrior);
        System.out.println();

        Warrior.useSpecialSkill(Mage);
        System.out.println();

        Mage.useSpecialSkill(Warrior);
        System.out.println();

        // TODO 69: 최종 상태 출력하기
        // 두 캐릭터의 생존 여부와 현재 정보 출력
        System.out.println("=== 최종 상태 ===");
        System.out.println(Warrior);
        System.out.println(Mage);
    }
}
