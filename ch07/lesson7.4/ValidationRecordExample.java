public class ValidationRecordExample {
    // TODO: 이메일 주소 레코드를 정의하세요
    // 레코드명: Email, 매개변수: String address
    record Email(String address) {
        // TODO: 정식 생성자에서 유효성 검증을 작성하세요
        // address가 null이거나 빈 값이면 "이메일 주소는 비어있을 수 없습니다" 예외
        // "@"가 포함되지 않으면 "올바른 이메일 형식이 아닙니다" 예외
        public Email {
            if (address == null || address.isBlank()) {
                throw new IllegalArgumentException("이메일 주소는 비어있을 수 없습니다");
            }
            if (!address.contains("@")) {
                throw new IllegalArgumentException("올바른 이메일 형식이 아닙니다");
            }
        }

        // TODO: 도메인 추출 메서드를 작성하세요
        // 메서드명: domain, "@" 이후의 문자열 반환
        public String domain() {
            return address.substring(address.indexOf("@") + 1);
        }
    }

    // TODO: 나이 레코드를 정의하세요
    // 레코드명: Age, 매개변수: int value
    record Age(int value) {
        // TODO: 정식 생성자에서 유효성 검증을 작성하세요
        // value가 0보다 작으면 "나이는 음수일 수 없습니다" 예외
        // value가 150보다 크면 "나이가 너무 큽니다" 예외
        public Age {
            if (value < 0) {
                throw new IllegalArgumentException("나이는 음수일 수 없습니다");
            }
            if (value > 150) {
                throw new IllegalArgumentException("나이가 너무 큽니다");
            }
        }


        // TODO: 연령대 반환 메서드를 작성하세요
        // 메서드명: ageGroup
        // 20미만: "미성년", 30미만: "20대", 40미만: "30대", 50미만: "40대", 60미만: "50대", 그외: "60대 이상"
        public String ageGroup() {
            if (value < 20) return "미성년";
            else if (value < 30) return "20대";
            else if (value < 40) return "30대";
            else if (value < 50) return "40대";
            else if (value < 60) return "50대";
            else return "60대 이상";
        }
    }

    public static void main(String[] args) {
        try {
            // TODO: 올바른 이메일로 Email 객체를 생성하세요
            // "user@example.com"
            Email email1 = new Email("user@example.com");
            System.out.println("이메일: " + email1);
            System.out.println("도메인: " + email1.domain());

            // 잘못된 이메일 - 예외 발생
            // Email email2 = new Email("invalid-email");

            // TODO: 올바른 나이로 Age 객체를 생성하세요
            // 25세
            Age age1 = new Age(25);
            System.out.println("나이: " + age1.value() + " (" + age1.ageGroup() + ")");

            // 잘못된 나이 - 예외 발생
            // Age age2 = new Age(-5);

        } catch (IllegalArgumentException e) {
            System.err.println("오류: " + e.getMessage());
        }
    }
}