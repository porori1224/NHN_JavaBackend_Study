import textio.TextIO;

public class ShoppingCalculator {
    public static void main(String[] args) {
        // TODO: 쇼핑 계산기 프로그램을 만드세요
        // 힌트:
        // 1. "=== 쇼핑 계산기 ===" 출력
        // 2. while문으로 상품명 입력 (quit 입력시 종료)
        // 3. 가격과 수량 입력받기
        // 4. 소계 계산하여 총액에 누적
        // 5. 영수증 출력 (총액 10만원 이상시 10% 할인)
        // 6. 파일 저장 여부 확인 후 저장

        // 여기에 코드를 작성하세요
        System.out.println("=== 쇼핑 계산기 ===\n");

        int totalItems = 0;
        int totalPrice = 0;
        StringBuilder receipt = new StringBuilder();
        receipt.append("==============================\n");
        receipt.append("영수증\n");
        receipt.append("==============================\n");

        // 2. while문으로 상품명 입력 (quit 입력시 종료)
        while (true) {
            System.out.print("상품명 (종료: 'quit'): ");
            String item = TextIO.getln().trim();

            if (item.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.print("가격: ");
            int price = TextIO.getlnInt();

            System.out.print("수량: ");
            int quantity = TextIO.getlnInt();

            int subtotal = price * quantity;
            totalItems += 1;
            totalPrice += subtotal;

            System.out.printf("%s %d개 = %,d원\n\n", item, quantity, subtotal);
            receipt.append(String.format("%s %d개 = %,d원\n", item, quantity, subtotal));
        }

        // 할인 및 결제 금액 계산
        int discount = (totalPrice >= 100_0000) ? (int)(totalPrice * 0.10) : 0;
        int finalPrice = totalPrice - discount;

        // 영수증 요약
        receipt.append("==============================\n");
        receipt.append(String.format("구매 품목: %d개\n", totalItems));
        receipt.append(String.format("총액: %,d원\n", totalPrice));
        receipt.append(String.format("할인(10%%): -%,d원\n", discount));
        receipt.append(String.format("결제금액: %,d원\n", finalPrice));
        receipt.append("==============================\n");

        // 영수증 출력
        System.out.println(receipt);

        // 파일 저장 여부 확인
        System.out.print("영수증을 파일로 저장하시겠습니까? (yes/no): ");
        String save = TextIO.getln().trim();

        if (save.equalsIgnoreCase("yes")) {
            TextIO.writeFile("receipt.txt");
            TextIO.put(receipt.toString());
            TextIO.writeStandardOutput();
            System.out.println("영수증이 receipt.txt에 저장되었습니다.");
    }
}