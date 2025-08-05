// 테스트
public class GameTest {
    public static void main(String[] args) {
        // TODO 28: GameManager 생성하기
        GameManager gm = new GameManager();

        // TODO 29: Player 생성하고 추가하기
        // "용사"와 "마법사" 플레이어 생성
        // GameManager에 추가
        Player hero = new Player("용사");
        Player mage = new Player("마법사");
        gm.addPlayer(hero);
        gm.addPlayer(mage);

        // TODO 30: 게임 시작 시도하기
        gm.startGame();

        // TODO 31: 플레이어들 이동시키기
        // 용사는 UP, RIGHT로 이동
        // 마법사는 DOWN, LEFT로 이동
        hero.move(GameConstants.DIRECTION_UP);
        hero.move(GameConstants.DIRECTION_RIGHT);

        mage.move(GameConstants.DIRECTION_DOWN);
        mage.move(GameConstants.DIRECTION_LEFT);

        // TODO 32: 서로 공격하기
        // 용사가 마법사를 공격
        // 마법사가 용사를 공격
        hero.attack(mage);
        mage.attack(hero);
    }
}