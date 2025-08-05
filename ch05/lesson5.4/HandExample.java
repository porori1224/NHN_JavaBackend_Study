// 사용 예제
public class HandExample {
    public static void main(String[] args) {
        // TODO 28: 덱과 손 객체 생성하기
        // Deck 생성하고 셔플
        // Hand 객체 생성
        Deck deck = new Deck();
        deck.shuffle();
        Hand hand = new Hand();

        // TODO 29: 카드 5장 받기
        // for문으로 5번 반복:
        //   - dealCard()로 카드 받기
        //   - addCard()로 손에 추가
        //   - 받은 카드 출력
        System.out.println("=== 카드 5장 받기 ===");
        for (int i = 0; i < 5; i++) {
            Card card = deck.dealCard();
            hand.addCard(card);
            System.out.println("받은 카드: " + card);
        }

        // TODO 30: 손에 있는 카드 수 출력하기
        System.out.println("\n손에 있는 카드 수: " + hand.getCardCount());

        // TODO 31: 무늬별로 정렬하고 출력하기
        // sortBySuit() 호출
        // 모든 카드 출력
        System.out.println("\n=== 무늬별로 정렬 ===");
        hand.sortBySuit();
        hand.printHand();

        // TODO 32: 값별로 정렬하고 출력하기
        // sortByValue() 호출
        // 모든 카드 출력
        System.out.println("\n=== 값별로 정렬 ===");
        hand.sortByValue();
        hand.printHand();
    }
}
