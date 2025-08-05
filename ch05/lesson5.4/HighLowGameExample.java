import java.util.Random;

// 게임 실행 예제
public class HighLowGameExample {
    public static void main(String[] args) {
        // TODO 39: High-Low 게임 실행하기
        // HighLowGame 객체 생성
        // 게임 설명 출력
        HighLowGame game = new HighLowGame();
        Random rand = new Random();
        System.out.println("=== High-Low 카드 게임 ===");
        System.out.println("다음 카드가 현재 카드보다 높을지 낮을지 맞춰보세요!\n");

        // TODO 40: 게임 루프 구현하기
        // while문: 게임이 끝나지 않고 점수가 10 미만일 때까지
        //   - 현재 카드 출력
        //   - 랜덤하게 Higher 또는 Lower 선택
        //   - 선택에 따라 guessHigher() 또는 guessLower() 호출
        //   - 결과 출력 (정답/오답)
        while (!game.isGameOver() && game.getScore() < 10) {
            Card current = game.getCurrentCard();
            System.out.println("현재 카드: " + current);

            boolean chooseHigher = rand.nextBoolean();
            System.out.println("추측: 다음 카드가 더 " + (chooseHigher ? "높다" : "낮다"));

            boolean result = chooseHigher ? game.guessHigher() : game.guessLower();
            System.out.println("다음 카드: " + game.getCurrentCard());

            if (result) {
                System.out.println("정답! 현재 점수: " + game.getScore() + "\n");
            } else {
                System.out.println("틀렸습니다! 게임 종료\n");
            }
        }

        // TODO 41: 최종 점수 출력하기
        System.out.println("최종 점수: " + game.getScore());
    }
}
