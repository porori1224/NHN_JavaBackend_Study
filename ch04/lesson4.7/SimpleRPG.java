import java.util.Random;
import java.util.Scanner;

public class SimpleRPG {
    // TODO 41: 게임 상태 변수들 선언하기
    // playerName (문자열), playerHealth (정수, 100), 
    // playerLevel (정수, 1), playerExp (정수, 0), playerGold (정수, 50)
    static String playerName;
    static int playerHealth = 100;
    static int playerLevel = 1;
    static int playerExp = 0;
    static int playerGold = 50;


    // TODO 42: 게임 설정 상수들 선언하기
    // MAX_HEALTH (100), EXP_PER_LEVEL (100)
    static final int MAX_HEALTH = 100;
    static final int EXP_PER_LEVEL = 100;

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        // TODO 43: 게임 실행
        runGame();
    }

    // TODO 44: runGame 메서드 구현하기 (메인 게임 루프)
    /**
     * 게임의 메인 루프를 실행합니다.
     *
     * 사전 조건: 없음
     * 사후 조건: 게임이 정상적으로 종료됨
     */
    static void runGame() {
        // 1. 게임 소개
        // 2. 캐릭터 생성
        // 3. 게임 루프 (체력이 0이 되거나 종료할 때까지)
        //    - 상태 표시
        //    - 메뉴 선택
        //    - 선택에 따른 행동 실행
        // 4. 게임 오버 처리
        showIntro();
        createCharacter();

        while (playerHealth > 0) {
            showStatus();
            int choice = showMainMenu();
            switch (choice) {
                case 1 -> exploreDungeon();
                case 2 -> visitShop();
                case 3 -> rest();
                case 4 -> {
                    showGameOver();
                    return;
                }
            }
        }
        showGameOver();
    }

    // TODO 45: 게임 초기화 메서드들 구현하기
    static void showIntro() {
        // 게임 제목과 간단한 설명 출력
        System.out.println("=================================");
        System.out.println("    간단한 텍스트 RPG 게임");
        System.out.println("=================================");
        System.out.println("어둠의 던전에서 살아남으세요!\n");
    }

    static void createCharacter() {
        // 플레이어 이름 입력받기
        System.out.print("캐릭터 이름을 입력하세요: ");
        playerName = scanner.nextLine();
        System.out.println("\n환영합니다, " + playerName + "님!\n모험을 시작합니다...\n");
    }

    // TODO 46: 게임 인터페이스 메서드들 구현하기
    static void showStatus() {
        // 현재 레벨, 체력, 경험치, 골드 표시
        System.out.println("--- " + playerName + "의 상태 ---");
        System.out.println("레벨: " + playerLevel);
        System.out.println("체력: " + playerHealth + "/" + MAX_HEALTH);
        System.out.println("경험치: " + playerExp + "/" + EXP_PER_LEVEL);
        System.out.println("골드: " + playerGold);
        System.out.println("----------------------------\n");
    }

    /**
     * 메인 메뉴를 표시하고 선택을 받습니다.
     *
     * 사전 조건: 없음
     * 사후 조건: 1-4 사이의 유효한 선택이 반환됨
     *
     * @return 사용자의 선택
     */
    static int showMainMenu() {
        // 1. 던전 탐험, 2. 상점 방문, 3. 휴식, 4. 게임 종료
        // 유효한 입력이 올 때까지 반복
        int choice;

        do {
            System.out.println("무엇을 하시겠습니까?");
            System.out.println("1. 던전 탐험");
            System.out.println("2. 상점 방문");
            System.out.println("3. 휴식");
            System.out.println("4. 게임 종료");
            System.out.print("선택: ");
            while (!scanner.hasNextInt()) scanner.next();
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 4);

        return choice;
    }

    // TODO 47: 게임 액션 메서드들 구현하기
    static void exploreDungeon() {
        // 랜덤 이벤트 (0: 몬스터, 1: 보물, 2: 빈 방)
        System.out.println("\n던전에 들어갑니다...");
        int event = random.nextInt(3);
        switch (event) {
            case 0 -> encounterMonster();
            case 1 -> findTreasure();
            case 2 -> findNothing();
        }
    }

    static void encounterMonster() {
        // 몬스터와의 전투 시스템
        // 플레이어 공격과 몬스터 반격
        // 승리 시 경험치와 골드 획득
        int monsterHealth = 40 + random.nextInt(21);
        System.out.println("몬스터를 만났습니다! 몬스터 체력: " + monsterHealth);

        while (monsterHealth > 0 && playerHealth > 0) {
            System.out.println("1. 공격  2. 도망");
            int action = scanner.nextInt();

            if (action == 2) {
                System.out.println("도망쳤습니다!\n");
                return;
            }

            int damageToMonster = 10 + random.nextInt(11);
            int damageToPlayer = 5 + random.nextInt(8);

            monsterHealth -= damageToMonster;
            playerHealth -= damageToPlayer;

            System.out.println(damageToMonster + "의 피해를 입혔습니다!");
            System.out.println("몬스터가 " + damageToPlayer + "의 피해를 입혔습니다!\n");
        }

        if (playerHealth > 0) {
            int exp = 30 + random.nextInt(11);
            int gold = 20 + random.nextInt(11);

            playerExp += exp;
            playerGold += gold;

            System.out.println("몬스터를 물리쳤습니다! 경험치 +" + exp + ", 골드 +" + gold + "\n");
            checkLevelUp();
        }
    }

    static void findTreasure() {
        // 랜덤한 골드 획득
        int gold = 20 + random.nextInt(31);
        playerGold += gold;
        System.out.println("보물을 찾았습니다! 골드 +" + gold + "\n");
    }

    static void findNothing() {
        // 아무것도 없는 방 메시지
        System.out.println("빈 방입니다...\n");
    }

    // TODO 48: 캐릭터 관리 메서드들 구현하기
    static void checkLevelUp() {
        // 경험치가 충분하면 레벨업 처리
        while (playerExp >= EXP_PER_LEVEL) {
            playerExp -= EXP_PER_LEVEL;
            playerLevel++;

            System.out.println("레벨 업! 현재 레벨: " + playerLevel + "\n");
        }
    }

    static void visitShop() {
        // 체력 포션 구매 시스템
        System.out.println("\n상점에 들어왔습니다. 체력 포션(20골드)을 구매하시겠습니까? (1: 예, 2: 아니오)");
        int choice = scanner.nextInt();

        if (choice == 1 && playerGold >= 20) {
            playerGold -= 20;
            playerHealth = Math.min(playerHealth + 30, MAX_HEALTH);
            System.out.println("포션을 사용했습니다! 체력 회복 +30\n");
        } else if (choice == 1) {
            System.out.println("골드가 부족합니다.\n");
        } else {
            System.out.println("구매하지 않았습니다.\n");
        }
    }

    static void rest() {
        // 체력 회복
        playerHealth = MAX_HEALTH;
        System.out.println("휴식을 취해 체력이 회복되었습니다!\n");
    }

    static void showGameOver() {
        // 최종 결과 표시
        System.out.println("\n=== 게임 종료 ===");
        System.out.println("감사합니다, " + playerName + "님!");
        System.out.println("최종 레벨: " + playerLevel);
        System.out.println("최종 골드: " + playerGold);
    }
}