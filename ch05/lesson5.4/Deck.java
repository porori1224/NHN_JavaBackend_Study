/**
 * 카드 덱을 나타내는 클래스
 */
public class Deck {
    private Card[] deck;     // 카드 배열
    private int cardsUsed;   // 사용된 카드 수

    /**
     * 52장의 표준 카드 덱을 생성
     */
    public Deck() {
        // TODO 10: 52장의 카드로 이루어진 덱 생성하기
        // deck = new Card[52] 생성
        // 이중 for문 사용:
        //   - 바깥쪽: suit (0~3)
        //   - 안쪽: value (1~13)
        // 각 조합으로 Card 객체 생성하여 deck 배열에 저장
        // cardsUsed = 0으로 초기화
        deck = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int value = 1; value <= 13; value++) {
                deck[index++] = new Card(value, suit);
            }
        }
        cardsUsed = 0;
    }

    /**
     * 카드를 섞는다
     */
    public void shuffle() {
        // TODO 11: Fisher-Yates 셔플 알고리즘 구현하기
        // 배열의 끝에서부터 시작하여:
        //   - 현재 위치부터 시작까지의 랜덤 인덱스 선택
        //   - 현재 카드와 랜덤 위치의 카드 교환
        // cardsUsed = 0으로 리셋
        for (int i = deck.length - 1; i > 0; i--) {
            int rand = (int) (Math.random() * (i + 1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }

    /**
     * 남은 카드 수를 반환
     */
    public int cardsLeft() {
        // TODO 12: 남은 카드 수 반환하기
        // 전체 카드 수 - 사용된 카드 수
        return deck.length - cardsUsed;
    }

    /**
     * 카드 한 장을 나누어준다
     */
    public Card dealCard() {
        // TODO 13: 카드 한 장 나누어주기
        // 카드가 없으면 IllegalStateException 발생
        // cardsUsed 증가시키고 해당 위치의 카드 반환
        if (cardsUsed >= deck.length) {
            throw new IllegalStateException("카드가 더 이상 남아있지 않습니다.");
        }
        return deck[cardsUsed++];
    }

    /**
     * 덱에 조커가 있는지 확인
     */
    public boolean hasJoker() {
        // TODO 14: 조커 포함 여부 반환하기 (기본 덱은 조커 없음)
        return false;
    }
}

