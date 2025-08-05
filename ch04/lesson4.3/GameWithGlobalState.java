import java.util.Random;

public class GameWithGlobalState {
    // TODO 85: 게임 상태 전역 변수들 선언하기
    static int playerWins = 0;
    static int computerWins = 0;
    static int roundCount = 0;
    static final int TOTAL_RONDS = 5;

    public static void main(String[] args) {
        System.out.println("=== 주사위 게임 (전역 변수 사용) ===\n");

        // TODO 86: 게임 진행하기
        for (int i = 1; i <= TOTAL_RONDS; i++) {
            roundCount = i;
            playRound();
        }

        // TODO 87: 최종 결과 출력하기
        showFinalResult();
    }

    // TODO 88: 한 라운드 플레이 메서드 구현하기
    static void playRound() {
        System.out.println("=== 라운드 " + roundCount + " ===");
        int playerRoll = rollDice();
        int computerRoll = rollDice();

        System.out.println("플레이어: " + playerRoll);
        System.out.println("컴퓨터: " + computerRoll);

        if (playerRoll > computerRoll) {
            System.out.println("플레이어 승리!");
            playerWins++;
        } else if (computerRoll > playerRoll) {
            System.out.println("컴퓨터 승리!");
            computerWins++;
        } else {
            System.out.println("무승부!");
        }

        showCurrentScore();
        System.out.println();
    }

    // TODO 89: 주사위 굴리기 메서드 구현하기
    static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    // TODO 90: 현재 점수 출력 메서드 구현하기
    static void showCurrentScore() {
        System.out.println("현재 점수 - 플레이어: " + playerWins + ", 컴퓨터: " + computerWins);
    }

    // TODO 91: 최종 결과 출력 메서드 구현하기
    static void showFinalResult() {
        System.out.println("=== 최종 결과 ===");
        System.out.println("플레이어: " + playerWins + "승");
        System.out.println("컴퓨터: " + computerWins + "승");

        if (playerWins > computerWins) {
            System.out.println("축하합니다! 당신이 이겼습니다!");
        } else if (computerWins > playerWins) {
            System.out.println("아쉽네요. 컴퓨터가 이겼습니다.");
        } else {
            System.out.println("무승부입니다!");
        }
    }
}