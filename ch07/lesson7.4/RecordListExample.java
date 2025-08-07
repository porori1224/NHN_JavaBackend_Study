import java.util.ArrayList;
import java.util.List;

public class RecordListExample {
    // TODO: 상품 레코드를 정의하세요
    // 레코드명: Product, 매개변수: String id, String name, double price, int stock
    record Product(String id, String name, double price, int stock) {
        // TODO: 재고 가치 계산 메서드를 작성하세요
        // 메서드명: stockValue, 반환값: price * stock
        public double stockValue() {
            return price * stock;
        }

        // TODO: 재고 부족 여부 메서드를 작성하세요
        // 메서드명: isLowStock, 반환값: stock < 10
        public boolean isLowStock() {
            return stock < 10;
        }
    }

    // 상품 관리 클래스
    static class ProductManager {
        private List<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
        }

        // TODO: 재고 부족 상품 찾기 메서드를 작성하세요
        // 메서드명: getLowStockProducts
        // isLowStock()이 true인 상품들을 새 List에 담아 반환
        public List<Product> getLowStockProducts() {
            List<Product> lowStock = new ArrayList<>();
            for (Product p : products) {
                if (p.isLowStock()) {
                    lowStock.add(p);
                }
            }
            return lowStock;
        }

        // TODO: 총 재고 가치 계산 메서드를 작성하세요
        // 메서드명: getTotalStockValue
        // 모든 상품의 stockValue() 합계 반환
        public double getTotalStockValue() {
            double total = 0;
            for (Product p : products) {
                total += p.stockValue();
            }
            return total;
        }

        // TODO: 가격 범위로 상품 검색 메서드를 작성하세요
        // 메서드명: findByPriceRange, 매개변수: double min, double max
        // min <= price <= max 조건을 만족하는 상품들을 새 List에 담아 반환
        public List<Product> findByPriceRange(double min, double max) {
            List<Product> result = new ArrayList<>();
            for (Product p : products) {
                if (p.price() >= min && p.price() <= max) {
                    result.add(p);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        // TODO: 상품들을 추가하세요
        // P001, 노트북, 1200000, 5
        // P002, 마우스, 25000, 50
        // P003, 키보드, 85000, 8
        // P004, 모니터, 450000, 12
        // P005, USB, 15000, 3
        manager.addProduct(new Product("P001", "노트북", 1200000, 5));
        manager.addProduct(new Product("P002", "마우스", 25000, 50));
        manager.addProduct(new Product("P003", "키보드", 85000, 8));
        manager.addProduct(new Product("P004", "모니터", 450000, 12));
        manager.addProduct(new Product("P005", "USB", 15000, 3));

        // 재고 부족 상품
        System.out.println("=== 재고 부족 상품 ===");
        for (Product p : manager.getLowStockProducts()) {
            System.out.printf("%s - %s: %d개\n", p.id(), p.name(), p.stock());
        }

        // 가격 범위 검색
        System.out.println("\n=== 10만원 이하 상품 ===");
        for (Product p : manager.findByPriceRange(0, 100000)) {
            System.out.printf("%s: %,.0f원\n", p.name(), p.price());
        }

        // 총 재고 가치
        System.out.printf("\n총 재고 가치: %,.0f원\n", manager.getTotalStockValue());
    }
}
