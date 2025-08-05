import java.util.Scanner;

public class NumberGuessingGame {
    // TODO 10: 게임 관련 변수들 선언하기
    // secretNumber (정수), attempts (정수), MAX_NUMBER (상수, 100)
    static final int MAX_NUMBER = 100;
    static int secreNumber;
    static int attempts;

    public static void main(String[] args) {
        // TODO 11: 게임 실행하기
        playGame();
    }

    // TODO 12: playGame 메서드 구현하기 (전체 게임 흐름)
    /**
     * 게임의 전체 흐름을 제어합니다.
     *
     * 사전 조건: 없음
     * 사후 조건: 게임이 완료됨 (사용자가 숫자를 맞추거나 포기함)
     */
    static void playGame() {
        // 1. 게임 초기화
        // 2. 게임 설명 표시
        // 3. 추측 반복 (정답을 맞출 때까지)
        // 4. 결과 표시
        initializeGame();;
        showInstructions();

        boolean correct = false;
        while (!correct) {
            int guess = getUserInput();
            correct = checkGuess(guess);
        }

        showResults();
    }

    // TODO 13: initializeGame 메서드 구현하기
    /**
     * 게임을 초기화합니다.
     *
     * 사전 조건: 없음
     * 사후 조건: secretNumber가 1~100 사이의 값으로 설정됨, attempts = 0
     */
    static void initializeGame() {
        // Math.random()을 사용해 1~MAX_NUMBER 사이의 랜덤 숫자 생성
        // attempts를 0으로 초기화
        secreNumber = (int)(Math.random() * MAX_NUMBER) + 1;
        attempts = 0;
    }

    // TODO 14: showInstructions 메서드 구현하기
    /**
     * 게임 설명을 표시합니다.
     *
     * 사전 조건: 없음
     * 사후 조건: 게임 방법이 화면에 표시됨
     */
    static void showInstructions() {
        // 게임 제목과 설명 출력
        System.out.println("=== 숫자 맞추기 게임 ===");
        System.out.println("1부터 100 사이의 숫자를 맞춰보세요!\n");
    }

    // TODO 15: getUserInput 메서드 구현하기
    /**
     * 사용자로부터 입력을 받습니다.
     *
     * 사전 조건: 없음
     * 사후 조건: 1~MAX_NUMBER 사이의 유효한 정수가 반환됨
     *
     * @return 사용자가 입력한 숫자
     */
    static int getUserInput() {
        // Scanner를 사용해 유효한 입력을 받을 때까지 반복
        // 예외 처리로 잘못된 입력 처리
        Scanner input = new Scanner(System.in);
        int guess = -1;

        while (true) {
            try {
                System.out.println("추측한 숫자: ");
                guess = Integer.parseInt(input.nextLine());

                if (guess >= 1 && guess <= MAX_NUMBER) {
                    return guess;
                } else {
                    System.out.println("1부터 " + MAX_NUMBER + " 사이의 숫자를 입력하세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 정확히 입력하세요.");
            }
        }
    }

    // TODO 16: checkGuess 메서드 구현하기
    /**
     * 사용자의 추측을 확인합니다.
     *
     * 사전 조건: 1 <= guess <= MAX_NUMBER
     * 사후 조건: 
     *   - attempts가 1 증가
     *   - 적절한 힌트가 표시됨
     *
     * @param guess 사용자의 추측
     * @return 정답을 맞췄으면 true
     */
    static boolean checkGuess(int guess) {
        // attempts 증가
        // 추측과 정답 비교하여 힌트 제공
        // 정답이면 true, 아니면 false 반환
        attempts++;

        if (guess < secreNumber) {
            System.out.println("더 큰 수입니다.");
            return false;
        } else if (guess > secreNumber) {
            System.out.println("더 작은 수입니다.");
            return false;
        } else {
            System.out.println("정답입니다!\n");
            return true;
        }
    }

    // TODO 17: showResults 메서드 구현하기
    /**
     * 게임 결과를 표시합니다.
     *
     * 사전 조건: 게임이 완료됨
     * 사후 조건: 시도 횟수와 축하 메시지가 표시됨
     */
    static void showResults() {
        // 축하 메시지와 시도 횟수 출력
        // 시도 횟수에 따른 평가 메시지
        System.out.println("축하합니다!");
        System.out.println(attempts + "번만에 맞추셨습니다.");

        if (attempts <= 3) { System.out.println("천재적이군요!"); }
        else if (attempts <= 6) { System.out.println("훌륭합니다!"); }
        else { System.out.println("수고하셨습니다. 계속 도전해보세요!"); }
    }
}