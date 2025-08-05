/* 요구사항
    username이 "admin"과 같으면:
    "비밀번호: " 프롬프트 출력 후 password 입력받기
    password가 "1234"와 같으면:
    "로그인 성공! 환영합니다, [username]님!" 출력
    admin이면 "관리자 권한이 있습니다.", 아니면 "일반 사용자 권한입니다." 추가 출력

    password가 틀리면:
    "비밀번호가 틀렸습니다." 출력
    loginAttempts 증가, 3회 이상이면 "3회 실패로 계정이 잠겼습니다." 출력
    username이 틀리면 "존재하지 않는 사용자명입니다." 출력
*/

import textio.TextIO;

public class LoginSystem {
    public static void main(String[] args) {
        // 미리 설정된 사용자 정보
        String validUsername = "admin";
        String validPassword = "1234";
        boolean isAccountLocked = false;
        int loginAttempts = 0;

        System.out.println("=== 로그인 시스템 ===");

        if (isAccountLocked) {
            System.out.println("계정이 잠겨 있습니다. 관리자에게 문의하세요.");
        } else {
            System.out.print("사용자명: ");
            String username = TextIO.getln();

            // TODO: 로그인 처리
            // 힌트: 중첩된 if-else

            // 여기에 코드를 작성하세요
            if (username.equals(validUsername)) {
                System.out.print("비밀번호: ");
                String password = TextIO.getln();

                if (password.equals(validPassword)) {
                    System.out.println("로그인 성공! 환영합니다, " + username + "님!");
                    if (validUsername == "admin") {
                        System.out.println("관리자 권한이 있습니다.");
                    } else {
                        System.out.println("일반 사용자 권한입니다.");
                    }
                } else {
                    System.out.println("비밀번호가 틀렸습니다.");
                    loginAttempts++;

                    if (loginAttempts >= 3) {
                        isAccountLocked = true;
                        System.out.println("3회 실패로 계정이 잠겼습니다.");
                    }
                }
            }  else {
                System.out.println("존재하지 않는 사용자명입니다.");
            }
        }
    }
}