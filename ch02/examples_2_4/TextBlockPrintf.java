public class TextBlockPrintf {
    public static void main(String[] args) {
        // TODO: 텍스트 블록과 printf를 조합하여 영수증을 출력하세요
        // 힌트:
        // 1. 변수 생성: name="홍길동", itemCount=3, totalPrice=45000.0
        // 2. 텍스트 블록(""")을 사용하여 영수증 틀 만들기
        // 3. printf로 변수 값들을 서식에 맞게 출력
        // 4. 단가 계산: totalPrice / itemCount
        // 5. 상세 내역도 텍스트 블록으로 출력

        // 여기에 코드를 작성하세요
        String name = "홍길동";
        int itemCount = 3;
        double totalPrice = 45000.0;
        double unitPrice = totalPrice / itemCount;

        String receipt = """
                ┌─────────────────────────┐
                │       영수증            │
                ├─────────────────────────┤
                │ 고객명: %-10s│
                │ 구매 수량: %3d개        │
                │ 총 금액: %,10.0f원  │
                └─────────────────────────┘
                """;

        System.out.printf(receipt, name, itemCount, totalPrice);

        String details = """
                
                === 상세 내역 ===
                단가: %,d원
                수량: %d개
                ─────────────────
                합계: %,d원
                """;

        System.out.printf(details, (int)unitPrice, itemCount, (int)totalPrice);
    }
}