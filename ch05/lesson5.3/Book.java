/**
 * 책 정보를 나타내는 클래스
 */
public class Book {
    private String title;
    private String author;
    private int pages;
    private double price;
    private boolean isAvailable;

    // TODO 30: 생성자 구현하기
    public Book(String title, String author, int pages, double price) {
        // 모든 필드 초기화
        // isAvailable은 true로 설정
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.isAvailable = true;
    }

    // TODO 31: Getter 메서드들 구현하기
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return isAvailable; }

    // TODO 32: toString() 메서드 재정의하기
    @Override
    public String toString() {
        // "Book{title='제목', author='저자', pages=페이지수, price=가격원, available=O/X}" 형식
        return String.format("Book{title='%s', author='%s', pages=%d, price=%.1f원, available=%s}",
                title, author, pages, price, isAvailable ? "O" : "X");
    }
}

