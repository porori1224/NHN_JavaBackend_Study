// 사용 예제
public class DeckExample {
    public static void main(String[] args) {
        // TODO 15: 덱 생성하고 셔플하기
        // Deck 객체 생성
        // shuffle() 메서드 호출
        Deck deck = new Deck();
        deck.shuffle();

        // TODO 16: 카드 5장 뽑기
        // for문으로 5번 반복:
        //   - dealCard()로 카드 뽑기
        //   - "카드 N: [카드정보]" 형식으로 출력
        System.out.println("=== 5장의 카드 뽑기 ===");
        for (int i = 1; i <= 5; i++) {
            Card card = deck.dealCard();
            System.out.println("카드 " + i + ": " + card);
        }

        // TODO 17: 남은 카드 수 출력하기
        // cardsLeft() 메서드 사용
        System.out.println("\n남은 카드 수: " + deck.cardsLeft());

        // TODO 18: 덱 다시 셔플하기
        // shuffle() 호출하고 결과 확인
        deck.shuffle();
        System.out.println("\n덱을 다시 섞었습니다.");
        System.out.println("다시 뽑은 카드: " + deck.dealCard());
    }
}
