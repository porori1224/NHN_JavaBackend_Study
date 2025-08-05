/* 요구사항
    이메일 주소 형식 검증
    @ 기호 포함 여부
    로컬 부분과 도메인 부분 존재
    도메인에 .포함 여부
    유효한 이메일 입력 후 사용자명과 도메인 분석*/

import textio.TextIO;

public class EmailValidationExample {
    public static void main(String[] args) {
        System.out.println("=== 이메일 검증 예제 ===");

        String email = getValidEmail();
        System.out.println("등록된 이메일: " + email);

        // 이메일 정보 분석
        analyzeEmail(email);
    }

    public static String getValidEmail() {
        while (true) {
            System.out.print("이메일 주소를 입력하세요: ");
            String input = TextIO.getln().trim();

            // TODO: 이메일 검증 시도
            // 힌트: validateEmail() 호출
            // 여기에 코드를 작성하세요
            try {
                validateEmail(input);
                System.out.println("✅ 유효한 이메일입니다.");
                return input;
            } catch (IllegalArgumentException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }
    }

    public static void validateEmail(String email) {
        // TODO: 이메일 유효성 검증
        // 힌트: IllegalArgumentException 사용
        // 여기에 코드를 작성하세요
        if (!email.contains("@")) {
            throw new IllegalArgumentException("이메일에는 @ 기호가 포함되어야 합니다.");
        }

        String[] parts = email.split("@");

        if (parts.length != 2) {
            throw new IllegalArgumentException("이메일은 하나의 @ 기호만 포함해야 합니다.");
        }

        String local = parts[0];
        String domain = parts[1];

        if (local.isEmpty()) {
            throw new IllegalArgumentException("이메일의 사용자명(로컬 부분)이 비어 있습니다.");
        }

        if (domain.isEmpty()) {
            throw new IllegalArgumentException("도메인 부분이 비어 있습니다.");
        }

        if (!domain.contains(".")) {
            throw new IllegalArgumentException("도메인에는 적어도 하나의 .이 포함되어야 합니다.");
        }
    }

    public static void analyzeEmail(String email) {
        // TODO: 이메일 분석
        // 힌트: split("@") 사용하여 사용자명과 도메인 분리
        // 여기에 코드를 작성하세요
        String[] parts = email.split("@");
        String user = parts[0];
        String domain = parts[1];

        System.out.println("\n📧 이메일 분석:");
        System.out.println("사용자명: " + user);
        System.out.println("도메인: " + domain);

        String domainType = domain.substring(domain.lastIndexOf('.') + 1).toLowerCase();

        String category = switch (domainType) {
            case "com" -> "상업적 도메인";
            case "org" -> "비영리 단체 도메인";
            case "net" -> "네트워크 관련 도메인";
            case "edu" -> "교육 기관 도메인";
            case "gov" -> "정부 기관 도메인";
            case "kr" -> "대한민국 국가 도메인";
            default -> "기타 도메인";
        };

        System.out.println("종류: " + category);
    }
}