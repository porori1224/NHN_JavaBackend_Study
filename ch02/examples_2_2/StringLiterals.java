public class StringLiterals {
    public static void main(String[] args) {
        // TODO: 기본 문자열 리터럴을 선언하세요
        // 힌트:
        // 1. greeting = "Hello, World!"
        // 2. name = "Java Programming"
        // 3. empty = "" (빈 문자열)
        String greeting = "Hello, World!";
        String name = "Java Programming";
        String empty = "";

        // TODO: 이스케이프 문자를 사용한 문자열을 선언하세요
        // 힌트:
        // 1. quoted = "그가 말했다: \"안녕하세요!\"" (큰따옴표 이스케이프)
        // 2. path = "C:\\Users\\Documents\\file.txt" (역슬래시 이스케이프)
        // 3. multiline = "첫 번째 줄\n두 번째 줄\n세 번째 줄" (줄바꿈 이스케이프)
        // 4. tabbed = "이름\t나이\t성적\n홍길동\t20\tA" (탭과 줄바꿈 조합)
        String quoted = "그가 말했다: \"안녕하세요!\"";
        String path = "C:\\Users\\Documents\\file.txt";
        String multiline = "첫 번째 줄\n두 번째 줄\n세 번째 줄";
        String tabbed = "이름\t나이\t성적\n홍길동\t20\tA";

        // TODO: 문자열들을 출력하세요
        // 힌트:
        // 1. greeting 출력
        // 2. quoted 출력
        // 3. "파일 경로: " + path 출력
        // 4. "\n여러 줄 텍스트:" 출력 후 multiline 출력
        // 5. "\n탭으로 정렬:" 출력 후 tabbed 출력
        System.out.println(greeting);
        System.out.println(quoted);
        System.out.println("파일 경로: " + path);
        System.out.println("\n여러 줄 텍스트: ");
        System.out.println(multiline);
        System.out.println("\n탭으로 정렬: ");
        System.out.println(tabbed);

        // TODO: 문자열 연결을 수행하고 출력하세요
        // 힌트:
        // 1. firstName = "홍"
        // 2. lastName = "길동"
        // 3. fullName = firstName + lastName
        // 4. "\n전체 이름: " + fullName 출력
        String firstName = "홍";
        String lastName = "길동";
        String fullName = firstName + lastName;
        System.out.println("\n전체 이름: " + fullName);

        // 여기에 코드를 작성하세요
    }
}