public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: 상품 정보를 저장할 변수들을 선언하세요
        // 힌트:
        // 상품 1: 노트북, 가격 1299.99, 수량 1
        // 상품 2: 마우스, 가격 29.99, 수량 2
        // 상품 3: 키보드, 가격 89.99, 수량 1
        // 각 상품마다 Name, Price, Quantity 변수 사용
        String item1Name = "노트북";
        double item1Price = 1299.99;
        int item1Quantity = 1;

        String item2Name = "마우스";
        double item2Price = 29.99;
        int item2Quantity = 2;

        String item3Name = "키보드";
        double item3Price = 89.99;
        int item3Quantity = 1;

        // TODO: 각 상품의 소계를 계산하세요
        // 힌트:
        // 1. subtotal1 = item1Price * item1Quantity
        // 2. subtotal2 = item2Price * item2Quantity
        // 3. subtotal3 = item3Price * item3Quantity
        // 4. subtotal = 모든 소계의 합
        double subtotal1 = item1Price * item1Quantity;
        double subtotal2 = item2Price * item2Quantity;
        double subtotal3 = item3Price * item3Quantity;
        double subtotal = subtotal1 + subtotal2 + subtotal3;

        // TODO: 할인과 세금을 계산하세요
        // 힌트:
        // 1. discountRate = 0.10 (10% 할인)
        // 2. taxRate = 0.08 (8% 세금)
        // 3. discount = subtotal * discountRate
        // 4. afterDiscount = subtotal - discount
        // 5. tax = afterDiscount * taxRate
        // 6. total = afterDiscount + tax
        double discountRate = 0.10;
        double taxRate = 0.08;
        double discount = subtotal * discountRate;
        double afterDiscount = subtotal - discount;
        double tax = afterDiscount * taxRate;
        double total = afterDiscount + tax;

        // TODO: 영수증을 출력하세요
        // 힌트:
        // 1. "=== 쇼핑 카트 ===" 출력
        // 2. 헤더: "상품명\t\t단가\t수량\t소계" (탭 사용)
        // 3. 구분선: "----------------------------------------"
        // 4. 각 상품 정보를 탭으로 정렬하여 출력
        // 5. 구분선 출력
        // 6. 소계, 할인, 세금 출력
        // 7. "========================================" 출력
        // 8. 총액 출력
        System.out.println("=== 쇼핑 카트 ===");
        System.out.println("상품명\t\t단가\t\t\t수량\t\t소계");
        System.out.println("----------------------------------------");
        System.out.println(item1Name + "\t\t" + item1Price + "\t\t" + item1Quantity + "\t\t" + subtotal1);
        System.out.println(item2Name + "\t\t" + item2Price + "\t\t" + item2Quantity + "\t\t" + subtotal2);
        System.out.println(item3Name + "\t\t" + item3Price + "\t\t" + item3Quantity + "\t\t" + subtotal3);
        System.out.println("----------------------------------------");
        System.out.println(
                "소계: " + subtotal
                + "\n할인: " + discount
                + "\n세금: " + tax
        );
        System.out.println("----------------------------------------");
        System.out.println("총액: " + total);

        // TODO: 결제 방법을 출력하세요
        // 힌트:
        // 1. useCredit = true (신용카드 사용 여부)
        // 2. 삼항 연산자로 "\n결제 방법: " + (useCredit ? "신용카드" : "현금") 출력
        boolean useCredit = true;
        System.out.println("\n결제 방법: " + (useCredit ? "신용카드" : "현금"));

        // 여기에 코드를 작성하세요
    }
}