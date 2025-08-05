public class CharAndBoolean {
    public static void main(String[] args) {
        // TODO: char 타입 변수들을 선언하고 값을 할당하세요
        // 힌트:
        // 1. grade = 'A' (문자 리터럴)
        // 2. digit = '7' (숫자 문자)
        // 3. space = ' ' (공백 문자)
        // 4. newline = '\n' (줄바꿈 이스케이프)
        // 5. tab = '\t' (탭 이스케이프)
        // 6. backslash = '\\' (역슬래시 이스케이프)
        // 7. quote = '\'' (작은따옴표 이스케이프)
        // 8. unicodeChar = '\u0041' ('A'의 유니코드)
        char grade = 'A';
        char digit = '7';
        char space = ' ';
        char newline = '\n';
        char tab = '\t';
        char backslash = '\\';
        char quote = '\'';
        char unicodeChar = '\u0041';

        // TODO: char 변수들을 사용하여 출력하세요
        // 힌트:
        // 1. "성적: [grade]" 출력
        // 2. "특수문자 예제:" 출력
        // 3. "탭[tab]문자" 출력 (탭 문자 사용)
        // 4. "줄바꿈[newline]문자" 출력 (줄바꿈 문자 사용)
        // 5. "유니코드: [unicodeChar]" 출력
        System.out.println("성적: " + grade);
        System.out.println("특수문자 예제: ");
        System.out.println("탭" + tab + "문자");
        System.out.println("줄바꿈" + newline + "문자");
        System.out.println("유니코드: " + unicodeChar);


        // TODO: boolean 타입 변수를 선언하고 값을 할당하세요
        // 힌트:
        // 1. isStudent = true
        // 2. hasLicense = false
        boolean isStudent = true;
        boolean hasLicense = false;

        // TODO: 나이를 기반으로 성인 여부를 판단하세요
        // 힌트:
        // 1. age = 20
        // 2. isAdult = age >= 18 (비교 연산 결과)
        int age = 20;
        boolean isAdult = age >= 18;

        // TODO: boolean 값들을 출력하세요
        // 힌트:
        // 1. "\n논리값 예제:" 출력
        // 2. "학생입니까? [isStudent]" 출력
        // 3. "성인입니까? [isAdult]" 출력
        System.out.println("\n논리값 예제:");
        System.out.println("학생입니까? " + isStudent);
        System.out.println("성인입니까? " + isAdult);

        // TODO: 논리 연산을 수행하고 결과를 출력하세요
        // 힌트:
        // 1. canDrive = isAdult && hasLicense (논리 AND 연산)
        // 2. "운전 가능? [canDrive]" 출력
        boolean canDrive = isAdult && hasLicense;
        System.out.println("운전 가능? " + canDrive);

        // 여기에 코드를 작성하세요
    }
}