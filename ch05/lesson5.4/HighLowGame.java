/**
 * High-Low 카드 게임
 */
public class HighLowGame {
    private Deck deck;
    private Card currentCard;
    private int correctGuesses;
    private boolean gameOver;

    /**
     * 새 게임을 시작
     */
    public HighLowGame() {
        // TODO 33: 게임 초기화하기
        // deck 생성하고 셔플
        // 첫 번째 카드 뽑기
        // correctGuesses = 0
        // gameOver = false
        deck = new Deck();
        deck.shuffle();
        currentCard = deck.dealCard();
        correctGuesses = 0;
        gameOver = false;
    }

    /**
     * 현재 카드 반환
     */
    public Card getCurrentCard() {
        // TODO 34: 현재 카드 반환하기
        return currentCard;
    }

    /**
     * 게임 종료 여부 확인
     */
    public boolean isGameOver() {
        // TODO 35: 게임 종료 여부 반환하기
        return gameOver;
    }

    /**
     * 현재 점수 반환
     */
    public int getScore() {
        // TODO 36: 현재 점수(맞춘 횟수) 반환하기
        return correctGuesses;
    }

    /**
     * "다음 카드가 더 높다"고 추측
     */
    public boolean guessHigher() {
        // TODO 37: "다음 카드가 더 높다"고 추측하기
        // 게임이 끝났으면 false 반환
        // 다음 카드 뽑기
        // 다음 카드 값이 현재 카드보다 큰지 확인
        // 맞으면 correctGuesses 증가
        // 틀리면 gameOver = true
        // currentCard 업데이트
        // 결과 반환
        if (gameOver || deck.cardsLeft() == 0) {
            gameOver = true;
            return false;
        }

        Card nextCard = deck.dealCard();
        boolean correct = nextCard.getValue() > currentCard.getValue();

        if (correct) {
            correctGuesses++;
        } else {
            gameOver = true;
        }

        currentCard = nextCard;
        return correct;
    }

    /**
     * "다음 카드가 더 낮다"고 추측
     */
    public boolean guessLower() {
        // TODO 38: "다음 카드가 더 낮다"고 추측하기
        // guessHigher()와 유사하지만 반대 조건
        if (gameOver || deck.cardsLeft() == 0) {
            gameOver = true;
            return false;
        }

        Card nextCard = deck.dealCard();
        boolean correct = nextCard.getValue() < currentCard.getValue();

        if (correct) {
            correctGuesses++;
        } else {
            gameOver = true;
        }

        currentCard = nextCard;
        return correct;
    }
}

