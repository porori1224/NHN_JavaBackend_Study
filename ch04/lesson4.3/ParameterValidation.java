import javax.sound.midi.SysexMessage;

public class ParameterValidation {
    public static void main(String[] args) {
        System.out.println("=== 매개변수 검증 예제 ===\n");

        // TODO 65: 정상적인 호출 테스트하기
        try {
            int age = validateAge(25);
            int score = validateScore(85);
            String name = validateName("홍길동");

            System.out.println("나이: " + age);
            System.out.println("점수: " + score);
            System.out.println("이름: " + name);

        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }

        System.out.println("\n=== 잘못된 매개변수 ===");

        // TODO 66: 잘못된 호출들 테스트하기
        testInvalidAge(-5);
        testInvalidAge(150);
        testInvalidScore(-10);
        testInvalidScore(105);
        testInvalidName("");
        testInvalidName(null);
    }

    // TODO 67: 나이 검증 메서드 구현하기
    static int validateAge(int age) {
        if  (age < 0) {
            throw new  IllegalArgumentException("나이는 음수일 수 없습니다: " + age);
        }

        if (age > 130) {
            throw new IllegalArgumentException("나이가 비현실적입니다: " + age);
        }

        return age;
    }

    // TODO 68: 점수 검증 메서드 구현하기
    static int validateScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("점수는 0~100 사이어야 합니다: " + score);
        }

        return score;
    }

    // TODO 69: 이름 검증 메서드 구현하기
    static String validateName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름이 null입니다");
        }

        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("이름이 비어있습니다");
        }

        return name;
    }

    // TODO 70: 잘못된 값 테스트 헬퍼 메서드들 구현하기
    static void testInvalidAge(int age) {
        try {
            validateAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("나이 " + age + ": " + e.getMessage());
        }
    }

    static void testInvalidScore(int score) {
        try {
            validateScore(score);
        } catch (IllegalArgumentException e) {
            System.out.println("점수 " + score + ": " + e.getMessage());
        }
    }

    static void testInvalidName(String name) {
       try {
            validateName(name);
        } catch (IllegalArgumentException e) {
            System.out.println("이름 " + name + ": " + e.getMessage());
        }
    }
}