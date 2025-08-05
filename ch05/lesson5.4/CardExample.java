// 사용 예제
public class CardExample {
    public static void main(String[] args) {
        // TODO 7: 카드 객체 생성하기
        // card1: 에이스 스페이드 (1, Card.SPADES)
        // card2: 킹 하트 (13, Card.HEARTS)
        // card3: 7 다이아몬드 (7, Card.DIAMONDS)
        Card card1 = new Card(1, Card.SPADES);
        Card card2 = new Card(13, Card.HEARTS);
        Card card3 = new Card(7, Card.DIAMONDS);

        // TODO 8: 생성된 카드 출력하기
        // 각 카드를 "카드 N: [카드정보]" 형식으로 출력
        System.out.println("카드 1: " + card1);
        System.out.println("카드 2: " + card2);
        System.out.println("카드 3: " + card3);

        // TODO 9: 카드 1의 세부 정보 출력하기
        // getValue()와 getSuitAsString() 메서드 사용
        System.out.println();
        System.out.println("카드 1의 값: " + card1.getValue());
        System.out.println("카드 1의 무늬: " + card1.getSuitAsString());
    }
}
