public class TextBlockBasics {
    public static void main(String[] args) {
        // TODO: 기존 방식으로 여러 줄 문자열을 만드세요
        // 힌트:
        // oldWay = "첫 번째 줄\n" + "두 번째 줄\n" + "세 번째 줄"
        String oldWay = "첫 번째 줄\n" + "두 번째 줄\n" + "세 번째 줄";

        // TODO: 텍스트 블록 방식으로 여러 줄 문자열을 만드세요
        // 힌트:
        // newWay = """ 사용하여 세 줄 텍스트 작성
        String newWay = """
                첫 번째 줄
                두 번째 줄
                세 번째 줄
                """;

        // TODO: 두 방식의 결과를 비교하여 출력하세요
        // 힌트:
        // 1. "기존 방식:" 출력 후 oldWay 출력
        // 2. "\n텍스트 블록:" 출력 후 newWay 출력
        System.out.println("기존 방식: \n" + oldWay);
        System.out.println("\n텍스트 블록: \n" + newWay);

        // TODO: JSON 형식의 텍스트 블록을 만드세요
        // 힌트:
        // """ 사용하여 JSON 구조 작성 (name, age, address 포함)
        // JSON 데이터 출력
        String JSON = """
                {
                    "name": "홍길동",
                    "age": 30,
                    "address": "서울시 강남구"
                }
                """;
        System.out.println(JSON);

        // 여기에 코드를 작성하세요
    }
}