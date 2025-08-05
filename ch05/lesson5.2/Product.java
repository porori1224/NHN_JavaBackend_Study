/**
 * 자동 ID 생성 기능이 있는 Product 클래스
 */
public class Product {
    // TODO 64: static 변수 선언하기
    private static int nextProductId = 1000;
    private static int totalProducts = 0;

    // TODO 65: 인스턴스 변수 선언하기
    private final int productId; // (변경 불가능)
    private String name, category;
    private double price;
    private boolean inStock;

    // TODO 66: 생성자 구현하기
    public Product(String name, double price, String category) {
        // name이 null이거나 비어있으면 "상품명은 필수입니다." 예외
        // price가 0보다 작으면 "가격은 0 이상이어야 합니다." 예외
        // productId = nextProductId++ (자동 ID 할당)
        // this.name = name, this.price = price
        // category가 null이면 "기타"로 설정
        // inStock = true
        // totalProducts 증가
        // "상품 생성: ID=[ID], 이름=[이름]" 출력
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("상품명은 필수입니다.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("가격은 0 이상이어ㅑ 합니다.");
        }

        productId = nextProductId++;
        this.name = name;
        this.price = price;

        if (category == null) {
            category = "기타";
        }

        inStock = true;
        totalProducts++;

        System.out.println("상품 생성: ID=" + productId + ", 이름=" + name);
    }

    // TODO 67: static 메서드들 구현하기
    public static int getTotalProducts() { return totalProducts; }
    public static int getNextProductId() { return nextProductId; }
    public static void resetIdCounter(int startId) {
        // nextProductId = startId
        nextProductId = startId;
    }

    // TODO 68: getter 메서드들 구현하기
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public boolean isInStock() { return inStock; }

    // TODO 69: setter 메서드들 구현하기 (ID는 final이므로 setter 없음)
    public void setName(String name) {
        // name이 null이 아니고 비어있지 않으면 설정
        if (name == null || name.isEmpty()) {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        // price가 0 이상이면 설정
        if (price > 0) {
            this.price = price;
        }
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    // TODO 70: 정보 출력 메서드 구현하기
    public void displayInfo() {
        // "ID: [ID], 상품명: [이름], 가격: [가격]원, 카테고리: [카테고리], 재고: [있음/없음]" 출력
        System.out.println("ID: " + productId + ", 상품명: " + name + ", 가격: " + price + "원, 카테고리: " + category + ", 재고; " + (inStock ? "있음" : "없음"));
    }
}

