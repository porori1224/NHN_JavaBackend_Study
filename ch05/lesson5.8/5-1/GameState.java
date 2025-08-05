import java.util.*;
import java.util.function.Predicate;

/**
 * 카드 게임을 위한 프레임워크
 */
public abstract class CardGame {
    protected List<Player> players = new ArrayList<>();
    protected Deck deck;
    protected boolean gameInProgress = false;

    // 플레이어를 나타내는 내부 클래스
    public class Player {
        private String name;
        private Hand hand = new Hand();
        private int score = 0;

        public Player(String name) {
            this.name = name;
        }

        // 카드 받기
        public void receiveCard(Card card) {
            hand.add(card);
            onCardReceived(card);  // 외부 클래스의 추상 메서드 호출
        }

        // 턴 진행
        public void playTurn() {
            if (!gameInProgress) {
                throw new IllegalStateException("게임이 진행 중이 아닙니다.");
            }

            // 플레이어별 전략 실행
            PlayerStrategy strategy = getStrategy();
            Action action = strategy.decideAction(this, getGameState());
            executeAction(this, action);
        }

        public Hand getHand() { return hand; }
        public String getName() { return name; }
        public int getScore() { return score; }
        public void addScore(int points) { score += points; }
    }

    // 플레이어 전략 인터페이스
    public interface PlayerStrategy {
        Action decideAction(Player player, GameState state);
    }

    // 게임 액션
    public static class Action {
        public enum Type { DRAW, PLAY, PASS, FOLD }
        private Type type;
        private Card card;

        public Action(Type type) {
            this.type = type;
        }

        public Action(Type type, Card card) {
            this.type = type;
            this.card = card;
        }

        public Type getType() { return type; }
        public Card getCard() { return card; }
    }

    // 게임 상태를 나타내는 정적 중첩 클래스
    public static class GameState {
        private int round;
        private int currentPlayerIndex;
        private List<Card> tableCards;

        public GameState(int round, int currentPlayerIndex) {
            this.round = round;
            this.currentPlayerIndex = currentPlayerIndex;
            this.tableCards = new ArrayList<>();
        }

        // getters...
    }

    // 추상 메서드들 - 서브클래스에서 구현
    protected abstract void onCardReceived(Card card);
    protected abstract PlayerStrategy getStrategy();
    protected abstract void executeAction(Player player, Action action);
    protected abstract GameState getGameState();

    // 게임 시작
    public void startGame() {
        if (players.size() < 2) {
            throw new IllegalStateException("최소 2명의 플레이어가 필요합니다.");
        }

        deck = new Deck();
        deck.shuffle();
        gameInProgress = true;

        // 초기 카드 분배
        dealInitialCards();
    }

    private void dealInitialCards() {
        // 로컬 클래스로 분배 규칙 정의
        class DealingRule {
            final int cardsPerPlayer;
            final boolean faceDown;

            DealingRule(int cardsPerPlayer, boolean faceDown) {
                this.cardsPerPlayer = cardsPerPlayer;
                this.faceDown = faceDown;
            }

            void deal() {
                for (int i = 0; i < cardsPerPlayer; i++) {
                    for (Player player : players) {
                        Card card = deck.dealCard();
                        if (!faceDown) {
                            System.out.println(player.getName() +
                                    "가 받은 카드: " + card);
                        }
                        player.receiveCard(card);
                    }
                }
            }
        }

        // 기본 규칙: 각 플레이어에게 5장씩 분배
        new DealingRule(5, false).deal();
    }

    public void addPlayer(String name) {
        players.add(new Player(name));
    }
}

// 구체적인 게임 구현 예시
class SimpleCardGame extends CardGame {

    @Override
    protected void onCardReceived(Card card) {
        // 카드를 받았을 때의 처리
        System.out.println("카드 받음: " + card);
    }

    @Override
    protected PlayerStrategy getStrategy() {
        // 익명 클래스로 간단한 전략 구현
        return new PlayerStrategy() {
            @Override
            public Action decideAction(Player player, GameState state) {
                // 간단한 전략: 첫 번째 카드를 낸다
                if (!player.getHand().isEmpty()) {
                    return new Action(Action.Type.PLAY,
                            player.getHand().getCards().get(0));
                }
                return new Action(Action.Type.PASS);
            }
        };
    }

    @Override
    protected void executeAction(Player player, Action action) {
        switch (action.getType()) {
            case PLAY:
                System.out.println(player.getName() + "가 카드를 냅니다: " +
                        action.getCard());
                player.getHand().remove(action.getCard());
                player.addScore(10);
                break;
            case PASS:
                System.out.println(player.getName() + "가 패스합니다.");
                break;
            default:
                break;
        }
    }

    @Override
    protected GameState getGameState() {
        return new GameState(1, 0);
    }

    // 간단한 카드와 관련 클래스들
    static class Card {
        private String suit;
        private String rank;

        Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return rank + " of " + suit;
        }
    }

    static class Hand {
        private List<Card> cards = new ArrayList<>();

        void add(Card card) { cards.add(card); }
        void remove(Card card) { cards.remove(card); }
        boolean isEmpty() { return cards.isEmpty(); }
        List<Card> getCards() { return new ArrayList<>(cards); }
    }

    static class Deck {
        private List<Card> cards = new ArrayList<>();
        private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        private String[] ranks = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "J", "Q", "K", "A"};

        Deck() {
            for (String suit : suits) {
                for (String rank : ranks) {
                    cards.add(new Card(suit, rank));
                }
            }
        }

        void shuffle() {
            Collections.shuffle(cards);
        }

        Card dealCard() {
            if (cards.isEmpty()) {
                throw new IllegalStateException("덱에 카드가 없습니다.");
            }
            return cards.remove(cards.size() - 1);
        }
    }

    public static void main(String[] args) {
        SimpleCardGame game = new SimpleCardGame();
        game.addPlayer("Alice");
        game.addPlayer("Bob");

        game.startGame();

        // 첫 번째 플레이어의 턴
        game.players.get(0).playTurn();
    }
}