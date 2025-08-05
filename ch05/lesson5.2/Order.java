/**
 * 복잡한 생성자 로직을 가진 Order 클래스
 */
public class Order {
    // TODO 76: final 필드 선언하기
    // orderId, customerId, productName (String)
    // quantity (int), unitPrice, totalAmount (double)
    // orderDate, status (String)
    private final String orderId, customerId,  productId, orderDate, status;
    private final int quantity;
    private final double unitPrice, totalAmount;


    // TODO 77: static 변수 선언하기
    private static int orderSequence = 1;

    // TODO 78: 생성자 구현하기
    public Order(String customerId, String productName, int quantity, double unitPrice) {
        // 모든 매개변수 유효성 검사:
        // - customerId, productName이 null이거나 비어있으면 예외
        // - quantity가 0 이하면 "수량은 1 이상이어야 합니다." 예외
        // - unitPrice가 0보다 작으면 "단가는 0 이상이어야 합니다." 예외
        // 
        // orderId = generateOrderId() 호출하여 생성
        // 필드들 초기화
        // 
        // 총액 계산: double baseAmount = quantity * unitPrice
        // quantity >= 10이면 10% 할인 적용 (baseAmount * 0.9)
        // "10개 이상 주문으로 10% 할인이 적용되었습니다." 출력
        // 
        // orderDate = java.time.LocalDate.now().toString()
        // status = "주문완료"
        // 
        // "주문이 생성되었습니다: [주문ID]" 출력
        if (customerId == null || customerId.isEmpty() || productName == null || productName.isEmpty()) {
            throw new  IllegalArgumentException("고객 ID 또는 상품 ID 입력은 필수입니다.");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("수량은 1 이상이어야 합니다.");
        }
        if (unitPrice < 0) {
            throw new IllegalArgumentException("단가는 0 이상이어야 합니다.");
        }

        this.orderId = generateOrderId();
        this.customerId = customerId;
        this.productId = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

        double baseAmount = quantity * unitPrice;
        if (quantity >= 10) {
            baseAmount *= 0.9;
            System.out.println("10개 이상 주문으로 10% 할인이 적용되었습니다.");
        }
        this.totalAmount = baseAmount;

        orderDate = java.time.LocalDate.now().toString();
        status = "주문완료";
        System.out.println("주문이 생성되었습니다: " + orderId);
    }

    // TODO 79: 주문 ID 생성 메서드 구현하기
    private static String generateOrderId() {
        // 오늘 날짜를 YYYYMMDD 형식으로 가져오기:
        // String today = java.time.LocalDate.now().toString().replace("-", "")
        // "ORD" + today + String.format("%04d", orderSequence++) 반환
        String today = java.time.LocalDate.now().toString().replace("-", "");
        return "ORD" + today + String.format("%04d", orderSequence++);
    }

    // TODO 80: getter 메서드들 구현하기
    public String getOrderId() { return orderId; }
    public String getCustomerId() { return customerId; }
    public String getProductName() { return productId; }
    public int getQuantity() { return quantity; }
    public double getUnitPrice() { return unitPrice; }
    public double getTotalAmount() { return totalAmount; }
    public String getOrderDate() { return orderDate; }
    public String getStatus() { return status; }

    // TODO 81: 주문 정보 출력 메서드 구현하기
    public void displayOrderInfo() {
        // "=== 주문 정보 ===" 출력
        // 모든 필드 정보를 보기 좋게 출력
        System.out.println("=== 주문 정보 ===");
        System.out.println("주문 ID: " + orderId +
                "\n고객 ID: " + customerId +
                "\n상품명: " + productId +
                "\n수량: " + quantity + "개" +
                "\n단가: " + unitPrice + "원" +
                "\n총액: " + totalAmount + "원" +
                "\n주문일: " + orderDate +
                "\n상태: " + status);
    }
}

