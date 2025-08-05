public class StringSearch {
    public static void main(String[] args) {
        // TODO: 검색을 위한 텍스트를 선언하고 출력하세요
        // 힌트:
        // 1. text = "Java is a programming language. Java is popular." 선언
        // 2. 텍스트 내용 출력
        String text = "Java is a programming language. Java is popular.";
        System.out.println(text);

        // TODO: indexOf 메소드를 사용하여 문자열 검색을 수행하세요
        // 힌트:
        // 1. "\nindexOf 예제:" 출력
        // 2. 'Java'의 첫 번째 위치 찾기
        // 3. 'is'의 첫 번째 위치 찾기
        // 4. 'Python'의 위치 찾기 (없으면 -1 반환)
        System.out.println("\nindexOf 예제:");
        System.out.println("'Java'의 첫 번째 위치: " + text.indexOf("Java"));
        System.out.println("'is'의 첫 번째 위치: " + text.indexOf("is"));
        System.out.println("'Python'의 위치 찾기 (없으면 -1 반환)" + text.indexOf("Python"));

        // TODO: 특정 위치부터 검색하여 두 번째 'Java'를 찾으세요
        // 힌트:
        // 1. firstJava = text.indexOf("Java")
        // 2. secondJava = text.indexOf("Java", firstJava + 1)
        // 3. 두 번째 'Java'의 위치 출력
        int firstJava = text.indexOf("Java");
        int secondJava = text.indexOf("Java", firstJava + 1);

        System.out.println("\n두 번째 'Java'의 위치: " + secondJava);

        // TODO: 문자 검색을 수행하세요
        // 힌트:
        // 1. "\n문자 검색:" 출력
        // 2. 'a'의 첫 번째 위치 (indexOf)
        // 3. 'a'의 마지막 위치 (lastIndexOf)
        System.out.println("\n문자 검색:");
        System.out.println("'a'의 첫 번째 위치: " + text.indexOf("a"));
        System.out.println("'a'의 마지막 위치: " + text.lastIndexOf("a"));

        // TODO: while 루프를 사용하여 모든 'a'의 위치를 찾으세요
        // 힌트:
        // 1. "모든 'a'의 위치: " 출력 (print 사용)
        // 2. pos = -1 초기화
        // 3. while ((pos = text.indexOf('a', pos + 1)) != -1) 루프
        // 4. 각 위치를 공백과 함께 출력
        // 5. 마지막에 줄바꿈 출력
        System.out.println("모든 'a'의 위치: ");
        int pos = -1;

        while ((pos = text.indexOf('a', pos + 1)) != -1) {
            System.out.print(pos + " ");
        }

        System.out.println();

        // 여기에 코드를 작성하세요
    }
}