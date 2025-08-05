import textio.TextIO;

public class WordFrequency {
    public static void main(String[] args) {
        // TODO: 텍스트 분석 프로그램을 만드세요
        // 힌트:
        // 1. "=== 단어 빈도 분석 ===" 출력
        // 2. while문으로 여러 줄 텍스트 입력받기 (빈 줄까지)
        // 3. for문으로 문자별 분석: 문자 수, 모음 수, 문장 수 계산
        // 4. 단어 수 계산 (공백, 문장부호로 구분)
        // 5. 평균 단어 길이와 문장당 평균 단어 수 계산
        // 6. printf로 분석 결과를 서식에 맞게 출력

        // 여기에 코드를 작성하세요
        System.out.println("=== 단어 빈도 분석 ===");
        System.out.println("텍스트를 입력하세요 (종료: 빈 줄):");

        StringBuilder inputText = new StringBuilder();

        // 1. 입력 받기 (빈 줄 전까지)
        while (true) {
            String line = TextIO.getln();
            if (line.trim().isEmpty()) {
                break;
            }
            inputText.append(line).append(" ");
        }

        String text = inputText.toString().trim();

        // 2. 문자 수
        int charCount = text.length();

        // 3. 모음 수
        int vowelCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if ("aeiou".indexOf(c) >= 0) {
                vowelCount++;
            }
        }

        // 4. 문장 수 (. ! ? 로 구분)
        int sentenceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '.' || c == '!' || c == '?') {
                sentenceCount++;
            }
        }

        // 5. 단어 수 및 총 단어 길이
        String[] words = text.split("[\\s,.!?]+");
        int wordCount = 0;
        int totalWordLength = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
                totalWordLength += word.length();
            }
        }

        // 6. 평균 계산
        double avgWordLength = wordCount > 0 ? (double) totalWordLength / wordCount : 0.0;
        double avgWordsPerSentence = sentenceCount > 0 ? (double) wordCount / sentenceCount : 0.0;

        // 7. 결과 출력
        System.out.println("\n=== 분석 결과 ===");
        System.out.printf("총 문자 수: %d\n", charCount);
        System.out.printf("총 단어 수: %d\n", wordCount);
        System.out.printf("모음 개수: %d\n", vowelCount);
        System.out.printf("문장 수: %d\n", sentenceCount);
        System.out.printf("평균 단어 길이: %.1f\n", avgWordLength);
        System.out.printf("문장당 평균 단어 수: %.1f\n", avgWordsPerSentence);
    }
}