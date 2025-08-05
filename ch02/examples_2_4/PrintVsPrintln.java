public class PrintVsPrintln {
    public static void main(String[] args) {
        // TODO: print와 println의 차이를 보여주는 코드를 작성하세요
        // 힌트:
        // 1. print로 "첫 번째 ", "두 번째 ", "세 번째" 출력 후 println()으로 줄바꿈
        // 2. println으로 "첫 번째", "두 번째", "세 번째" 각각 출력
        // 3. print와 println 혼합: "이름: "(print) + "홍길동"(println), "나이: "(print) + 25(println)

        // 여기에 코드를 작성하세요
        System.out.print("첫 번째 ");
        System.out.print("두 번째 ");
        System.out.print("세 번째");
        System.out.println();

        System.out.println("첫 번째");
        System.out.println("두 번째");
        System.out.println("세 번째");

        System.out.print("이름: ");
        System.out.println("홍길동");

        System.out.print("나이: ");
        System.out.println(25);
    }
}