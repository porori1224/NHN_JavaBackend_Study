// TODO 71: 사용 예제 완성하기
public class AutoIdExample {
    public static void main(String[] args) {
        System.out.println("=== 자동 ID 생성 시스템 ===");

        // TODO 72: 여러 상품 생성하기
        // product1: "노트북", 1500000, "전자제품"
        // product2: "마우스", 25000, "전자제품"
        // product3: "의자", 150000, "가구"
        // product4: "책", 15000, "도서"
        Product product1 = new Product("노트북", 1500000, "전자제품");
        Product product2 = new Product("마우스", 25000, "전자제품");
        Product product3 = new Product("의자", 150000, "가구");
        Product product4 = new Product("책", 15000, "도서");

        // TODO 73: 상품 정보 출력하기
        System.out.println("\n=== 상품 정보 ===");
        // 모든 상품의 displayInfo() 호출
        product1.displayInfo();
        product2.displayInfo();
        product3.displayInfo();
        product4.displayInfo();

        // TODO 74: 통계 정보 출력하기
        System.out.println("\n=== 통계 정보 ===");
        // "총 생성된 상품 수: [개수]", "다음 상품 ID: [ID]" 출력
        System.out.println("총 생성된 상품 수: " + Product.getTotalProducts());
        System.out.println("다음 상품 ID: " + Product.getNextProductId());

        // TODO 75: ID 카운터 재설정 테스트하기
        System.out.println("\n=== ID 카운터 재설정 ===");
        // resetIdCounter(5000) 호출
        // product5: "키보드", 80000, "전자제품" 생성
        // product5 정보 출력
        // 총 상품 수 출력
        Product.resetIdCounter(5000);
        Product product5 = new Product("키보드", 80000, "전자제품");
        product5.displayInfo();
        System.out.println("총 상품 수: " +  Product.getTotalProducts());
    }
}
