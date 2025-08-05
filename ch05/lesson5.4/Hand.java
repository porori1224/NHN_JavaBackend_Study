import java.util.ArrayList;

/**
 * 손에 든 카드들을 관리하는 클래스
 */
public class Hand {
    private ArrayList<Card> hand;  // 손에 든 카드들

    /**
     * 빈 손패를 생성
     */
    public Hand() {
        // TODO 19: ArrayList<Card> 생성하여 hand 초기화하기
        hand = new ArrayList<>();
    }

    /**
     * 손패를 비운다
     */
    public void clear() {
        // TODO 20: 손에 있는 모든 카드 제거하기
        // hand.clear() 호출
        hand.clear();
    }

    /**
     * 카드를 손패에 추가
     */
    public void addCard(Card c) {
        // TODO 21: 카드를 손에 추가하기
        // null 체크: null이면 NullPointerException 발생
        // hand에 카드 추가
        if (c == null) {
            throw new NullPointerException("카드가 null입니다.");
        }
        hand.add(c);
    }

    /**
     * 특정 카드를 손패에서 제거
     */
    public void removeCard(Card c) {
        // TODO 22: 특정 카드를 손에서 제거하기
        // hand.remove(c) 호출
        hand.remove(c);
    }

    /**
     * 특정 위치의 카드를 제거
     */
    public void removeCard(int position) {
        // TODO 23: 특정 위치의 카드를 손에서 제거하기
        // 위치 유효성 검사: 범위를 벗어나면 IllegalArgumentException
        // hand.remove(position) 호출
        if (position < 0 || position >= hand.size()) {
            throw new IllegalArgumentException("카드 위치가 잘못되었습니다.");
        }
        hand.remove(position);
    }

    /**
     * 손패의 카드 수 반환
     */
    public int getCardCount() {
        // TODO 24: 손에 있는 카드 수 반환하기
        // hand.size() 반환
        return hand.size();
    }

    /**
     * 특정 위치의 카드 반환
     */
    public Card getCard(int position) {
        // TODO 25: 특정 위치의 카드 반환하기
        // 위치 유효성 검사
        // hand.get(position) 반환
        if (position < 0 || position >= hand.size()) {
            throw new IllegalArgumentException("카드 위치가 잘못되었습니다.");
        }
        return hand.get(position);
    }

    /**
     * 손패를 무늬별로 정렬
     */
    public void sortBySuit() {
        // TODO 26: 무늬별로 카드 정렬하기
        // 선택 정렬 알고리즘 사용:
        // - 새로운 ArrayList 생성
        // - 원래 hand가 빌 때까지:
        //   - 가장 작은 무늬/값의 카드 찾기
        //   - 해당 카드를 제거하고 새 리스트에 추가
        // - hand를 새 리스트로 교체
        ArrayList<Card> newHand = new ArrayList<>();
        while (!hand.isEmpty()) {
            int minIndex = 0;
            Card minCard = hand.get(0);
            for (int i = 1; i < hand.size(); i++) {
                Card c = hand.get(i);
                if (c.getSuit() < minCard.getSuit() ||
                        (c.getSuit() == minCard.getSuit() && c.getValue() < minCard.getValue())) {
                    minIndex = i;
                    minCard = c;
                }
            }
            newHand.add(hand.remove(minIndex));
        }
        hand = newHand;
    }

    /**
     * 손패를 값별로 정렬
     */
    public void sortByValue() {
        // TODO 27: 값별로 카드 정렬하기
        // 선택 정렬 알고리즘 사용:
        // - 값이 작은 순서로 정렬
        // - 같은 값이면 무늬 순서로 정렬
        ArrayList<Card> newHand = new ArrayList<>();
        while (!hand.isEmpty()) {
            int minIndex = 0;
            Card minCard = hand.get(0);
            for (int i = 1; i < hand.size(); i++) {
                Card c = hand.get(i);
                if (c.getValue() < minCard.getValue() ||
                        (c.getValue() == minCard.getValue() && c.getSuit() < minCard.getSuit())) {
                    minIndex = i;
                    minCard = c;
                }
            }
            newHand.add(hand.remove(minIndex));
        }
        hand = newHand;
    }

    public void printHand() {
        for (int i = 0; i < hand.size(); i++) {
            System.out.println("카드 " + (i + 1) + ": " + hand.get(i));
        }
    }
}

