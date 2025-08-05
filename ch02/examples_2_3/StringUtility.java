public class StringUtility {
    public static void main(String[] args) {
        // TODO: 이메일 검증을 구현하세요
        // 힌트:
        // 1. email = "user@example.com"으로 설정
        // 2. "이메일 검증: " + email 출력
        // 3. "@ 포함: " + (email.indexOf('@') != -1) 출력
        // 4. ". 포함: " + (email.indexOf('.') != -1) 출력
        String email = "user@example.com";
        System.out.println("이메일 검증: " + email);
        System.out.println("@ 포함: " + (email.indexOf('@') != -1));
        System.out.println(". 포함: " + (email.indexOf('.') != -1));

        // TODO: 문장 분석을 구현하세요
        // 힌트:
        // 1. sentence = "Java is a powerful programming language!" 설정
        // 2. "\n문장 분석: \"" + sentence + "\"" 출력
        // 3. "길이: " + sentence.length() 출력
        // 4. "단어 수: " + countWords(sentence) 출력
        // 5. "대문자 수: " + countUpperCase(sentence) 출력
        // 6. "소문자 수: " + countLowerCase(sentence) 출력
        String sentence = "Java is a powerful programming language!";
        System.out.println("\n문장 분석: \"" + sentence + "\"");
        System.out.println("길이: " + sentence.length());
        System.out.println("단어 수: " + countWords(sentence));
        System.out.println("대문자 수: " + countUpperCase(sentence));
        System.out.println("소문자 수: " + countLowerCase(sentence));

        // TODO: 팰린드롬 검사를 구현하세요
        // 힌트:
        // 1. words = {"level", "hello", "radar", "java", "noon"} 배열 생성
        // 2. "\n팰린드롬 검사:" 출력
        // 3. for (String word : words) 반복문 사용
        // 4. word + ": " + isPalindrome(word) 형식으로 출력
        String[] words = {"level", "hello", "radar", "java", "noon"};

        System.out.println("\n팰린드롬 검사:");

        for (String word : words) {
            System.out.println(word + ": " + isPalindrome(word));
        }

        // 여기에 코드를 작성하세요
    }

    // TODO: 단어 수를 세는 메소드를 구현하세요
    // 힌트:
    // 1. count = 0, inWord = false로 초기화
    // 2. for 반복문으로 각 문자 확인
    // 3. 공백, 구두점이면 inWord = false
    // 4. 그 외 문자이고 !inWord면 count++, inWord = true
    // 5. count 반환
    public static int countWords(String text) {
        // 여기에 코드를 작성하세요
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }

    // TODO: 대문자 수를 세는 메소드를 구현하세요
    // 힌트:
    // 1. count = 0으로 초기화
    // 2. for 반복문으로 각 문자 확인
    // 3. if (c >= 'A' && c <= 'Z') 조건으로 대문자 확인
    // 4. 대문자면 count++
    // 5. count 반환
    public static int countUpperCase(String text) {
        // 여기에 코드를 작성하세요
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        return count;
    }

    // TODO: 소문자 수를 세는 메소드를 구현하세요
    // 힌트:
    // 1. count = 0으로 초기화
    // 2. for 반복문으로 각 문자 확인
    // 3. if (c >= 'a' && c <= 'z') 조건으로 소문자 확인
    // 4. 소문자면 count++
    // 5. count 반환
    public static int countLowerCase(String text) {
        // 여기에 코드를 작성하세요
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count++;
            }
        }
        return count;
    }

    // TODO: 팰린드롬 검사 메소드를 구현하세요
    // 힌트:
    // 1. left = 0, right = word.length() - 1로 초기화
    // 2. while (left < right) 반복문
    // 3. word.charAt(left) != word.charAt(right)면 false 반환
    // 4. left++, right-- 이동
    // 5. 반복문 완료시 true 반환
    public static boolean isPalindrome(String word) {
        // 여기에 코드를 작성하세요
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}