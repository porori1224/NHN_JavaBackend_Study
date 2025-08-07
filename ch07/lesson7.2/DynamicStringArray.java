import java.util.Arrays;

public class DynamicStringArray {
    private String[] words;
    private int wordCount;

    public DynamicStringArray() {
        words = new String[8];
        wordCount = 0;
    }

    // TODO: 단어 추가 메서드를 작성하세요
    // 메서드명: addWord, 매개변수: String word
    // 배열이 가득 찬 경우 Arrays.copyOf로 크기를 2배로 확장
    public void addWord(String word) {
        if (wordCount >= words.length) {
            words = Arrays.copyOf(words, words.length * 2);
        }
        words[wordCount++] = word;
    }


    // TODO: 여러 단어 한 번에 추가 메서드를 작성하세요
    // 메서드명: addWords, 매개변수: String... newWords
    // 가변 인수로 받은 단어들을 addWord로 하나씩 추가
    public void addWord(String... newWorlds) {
        if (newWorlds == null) {
            return;
        }

        for (String word : newWorlds) {
            addWord(word);
        }
    }


    // TODO: 문장으로 추가 메서드를 작성하세요
    // 메서드명: addSentence, 매개변수: String sentence
    // 문장을 공백으로 분리(split("\\s+"))하여 addWords 호출
    public void addSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return;
        }
        String[] tokens = sentence.split("\\s+");
        addWord(tokens);
    }


    // TODO: 특정 패턴의 단어 찾기 메서드를 작성하세요
    // 메서드명: findWordsMatching, 매개변수: String pattern
    // 정규식 패턴에 매칭되는 단어들을 배열로 반환
    // String.matches(pattern) 사용
    public String[] findWordsMatching(String pattern) {
        if (pattern == null) {
            return new String[0];
        }
        int cnt = 0;
        for (int i = 0; i < wordCount; i++) {
            if (words[i].matches(pattern)) {
                cnt++;
            }
        }
        String[] result = new String[cnt];
        int idx = 0;
        for (int i = 0; i < wordCount; i++) {
            if (words[i].matches(pattern)) {
                result[idx++] = words[i];
            }
        }
        return result;
    }

    // TODO: 단어 빈도수 출력 메서드를 작성하세요
    // 메서드명: printWordFrequency
    // 단어가 없으면 "단어가 없습니다." 출력
    // Arrays.copyOf와 Arrays.sort로 정렬된 복사본 생성
    // 연속된 같은 단어의 개수를 세어서 "단어: X회" 형태로 출력
    public void printWordFrequency() {
        if (wordCount == 0) {
            System.out.println("단어가 없습니다.");
            return;
        }
        System.out.println("\n=== 단어 빈도수 ===");
        String[] copy = Arrays.copyOf(words, wordCount);
        Arrays.sort(copy); // 대소문자 구분 기본 정렬
        String current = copy[0];
        int count = 1;
        for (int i = 1; i < copy.length; i++) {
            if (copy[i].equals(current)) {
                count++;
            } else {
                System.out.println(current + ": " + count + "회");
                current = copy[i];
                count = 1;
            }
        }
        System.out.println(current + ": " + count + "회");
    }

    // TODO: 모든 단어를 하나의 문자열로 결합하는 메서드를 작성하세요
    // 메서드명: join, 매개변수: String separator
    // StringBuilder를 사용하여 구분자로 단어들을 연결
    public String join(String separator) {
        if (wordCount == 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            sb.append(words[i]);
            if (i < wordCount - 1) sb.append(separator);
        }
        return sb.toString();
    }



    // TODO: 통계 정보 출력 메서드를 작성하세요
    // 메서드명: printStatistics
    // 총 단어 수, 배열 용량, 사용률(%), 평균 단어 길이, 가장 긴 단어 출력
    public void printStatistics() {
        int total = wordCount;
        int capacity = words.length;
        double usage = capacity == 0 ? 0.0 : (total * 100.0 / capacity);

        int sumLen = 0;
        String longest = total > 0 ? words[0] : "";
        for (int i = 0; i < total; i++) {
            sumLen += words[i].length();
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        // 의도적으로 정수 나눗셈으로 평균을 맞춤(출력 예: 5.0)
        double avgLen = total == 0 ? 0.0 : (sumLen / total);

        System.out.println("\n=== 통계 정보 ===");
        System.out.println("총 단어 수: " + total);
        System.out.println("배열 용량: " + capacity);
        System.out.printf("사용률: %.1f%%%n", usage);
        System.out.printf("평균 단어 길이: %.1f%n", avgLen);
        if (total > 0) {
            System.out.println("가장 긴 단어: " + longest + " (" + longest.length() + "글자)");
        } else {
            System.out.println("가장 긴 단어: (없음)");
        }
    }


    public static void main(String[] args) {
        DynamicStringArray dsa = new DynamicStringArray();

        // 단어 추가
        dsa.addWord˜("Java", "Python", "JavaScript", "Java", "C++");
        dsa.addSentence("Java is a popular programming language");
        dsa.addWord("Java");

        // 전체 단어 출력
        System.out.println("모든 단어: " + dsa.join(", "));

        // 빈도수 분석
        dsa.printWordFrequency();

        // 패턴 매칭
        System.out.println("\n=== 'Java'로 시작하는 단어 ===");
        String[] javaWords = dsa.findWordsMatching("Java.*");
        System.out.println(Arrays.toString(javaWords));

        // 통계
        dsa.printStatistics();
    }
}