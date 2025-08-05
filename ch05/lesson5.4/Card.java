/**
 * 카드(트럼프 카드)를 나타내는 클래스
 */
public class Card {

    // 무늬를 나타내는 상수
    public final static int SPADES = 0;   // 스페이드
    public final static int HEARTS = 1;   // 하트
    public final static int DIAMONDS = 2; // 다이아몬드
    public final static int CLUBS = 3;    // 클럽

    // 카드 값을 나타내는 상수
    public final static int ACE = 1;      // 에이스
    public final static int JACK = 11;    // 잭
    public final static int QUEEN = 12;   // 퀸
    public final static int KING = 13;    // 킹

    // 카드의 무늬 (0-3 중 하나)
    private final int suit;

    // 카드의 값 (1-13 중 하나)
    private final int value;

    /**
     * 지정된 값과 무늬로 카드를 생성
     */
    public Card(int theValue, int theSuit) {
        // TODO 1: value와 suit 초기화하기
        this.value = theValue;
        this.suit = theSuit;
    }

    /**
     * 카드의 값을 반환
     */
    public int getValue() {
        // TODO 2: value 반환하기
        return value;
    }

    /**
     * 카드의 무늬를 반환
     */
    public int getSuit() {
        // TODO 3: suit 반환하기
        return suit;
    }

    /**
     * 카드의 무늬를 문자열로 반환
     */
    public String getSuitAsString() {
        // TODO 4: suit 값에 따라 문자열 반환하기
        // switch문 사용
        // SPADES -> "스페이드"
        // HEARTS -> "하트"
        // DIAMONDS -> "다이아몬드"
        // CLUBS -> "클럽"
        // default -> "??"
        switch (suit) {
            case SPADES: return "스페이드";
            case HEARTS: return  "하트";
            case DIAMONDS: return "다이아몬드";
            case CLUBS: return "클럽";
            default: return  "??";
        }
    }

    /**
     * 카드의 값을 문자열로 반환
     */
    public String getValueAsString() {
        // TODO 5: value 값에 따라 문자열 반환하기
        // switch문 사용
        // 1 -> "에이스"
        // 2~10 -> 숫자 그대로
        // 11 -> "잭"
        // 12 -> "퀸"
        // 13 -> "킹"
        // default -> "??"
        switch (value) {
            case ACE: return "에이스";
            case JACK: return "잭";
            case QUEEN: return "퀸";
            case KING: return "킹";
            default:
                if (value >= 2 && value <= 10)
                    return String.valueOf(value);
                else
                    return "??";
        }
    }

    /**
     * 카드를 문자열로 표현
     */
    public String toString() {
        // TODO 6: 카드를 "값 무늬" 형식의 문자열로 반환하기
        // 예: "에이스 스페이드", "킹 하트"
        return getValueAsString() + " " + getSuitAsString();
    }
}

