enum GameState {
    MAIN_MENU, LOADING, PLAYING, PAUSED, GAME_OVER, SETTINGS
}

enum PlayerAction {
    MOVE_UP, MOVE_DOWN, MOVE_LEFT, MOVE_RIGHT, ATTACK, DEFEND, PAUSE
}

public class GameStateManager {
    private GameState currentState = GameState.MAIN_MENU;

    public static void main(String[] args) {
        GameStateManager game = new GameStateManager();

        // 상태 전환 시뮬레이션
        game.handleStateTransition(GameState.LOADING);
        game.handleStateTransition(GameState.PLAYING);
        game.handlePlayerAction(PlayerAction.PAUSE);
        game.handlePlayerAction(PlayerAction.MOVE_UP);
    }

    public void handleStateTransition(GameState newState) {
        System.out.println("\n=== 상태 전환: " + currentState + " → " + newState + " ===");

        // TODO: 이전 상태 정리
        // 힌트: switch문 사용
        // 여기에 코드를 작성하세요
        switch (currentState) {
            case MAIN_MENU -> System.out.println("메인 메뉴 정리");
            case LOADING -> System.out.println("로딩 화면 종료");
            case PLAYING -> System.out.println("게임 실행 중");
            case PAUSED -> System.out.println("게임 일시 정지");
            case GAME_OVER -> System.out.println("게임 종료");
            case SETTINGS -> System.out.println("설정 종료");
        }

        // TODO: 새 상태 초기화
        // 힌트: switch문 사용
        currentState = newState;

        // 여기에 코드를 작성하세요
        switch (newState) {
            case MAIN_MENU -> System.out.println("메인 메뉴 표시");
            case LOADING -> {
                System.out.println("게임 데이터 로딩");
                System.out.println("진행률 표시");
            }
            case PLAYING -> {
                System.out.println("게임 플레이 시작");
                System.out.println("UI 활성화");
            }
            case PAUSED -> {
                System.out.println("게임 일시 정지");
                System.out.println("일시정지 메뉴 표시");
            }
            case GAME_OVER -> System.out.println("게임 종료 화면 표시");
            case SETTINGS -> System.out.println("설정 메뉴 활성화");
        }
    }

    public void handlePlayerAction(PlayerAction action) {
        System.out.println("\n플레이어 액션: " + action);

        // TODO: 상태별 플레이어 액션 처리
        // 힌트: 중첩 switch문
        // 여기에 코듍를 작성하세요
        switch (currentState) {
            case PLAYING -> {
                switch (action) {
                    case MOVE_UP -> System.out.println("🔼 위로 이동");
                    case MOVE_DOWN -> System.out.println("🔽 아래로 이동");
                    case MOVE_LEFT -> System.out.println("◀️ 왼쪽으로 이동");
                    case MOVE_RIGHT -> System.out.println("▶️ 오른쪽으로 이동");
                    case ATTACK -> System.out.println("⚔️ 공격");
                    case DEFEND -> System.out.println("🛡️ 방어");
                    case PAUSE -> handleStateTransition(GameState.PAUSED);
                }
            }
            case PAUSED -> {
                if (action == PlayerAction.PAUSE) {
                    handleStateTransition(GameState.PLAYING);
                } else {
                    System.out.println("게임이 일시정지 상태입니다.");
                }
            }
            default -> System.out.println("현재 상태에서는 입력을 처리할 수 없습니다.");
        }
    }
}