// TODO 15: 도서관 시스템 완성하기
public class LibrarySystem {
    public static void main(String[] args) {
        // TODO 16: 첫 번째 도서 객체 생성하고 정보 설정하기
        // Book 객체를 생성하고 다음 정보로 설정:
        // title = "Java의 정석", author = "남궁성", isbn = "978-89-968088-0-1"
        // pages = 1022, isAvailable = true
        Book book1 = new Book();
        book1.title = "Java의 정석";
        book1.author = "남궁성";
        book1.isbn = "978-89-968088-0-1";
        book1.pages = 1022;
        book1.isAvailable = true;

        // TODO 17: 두 번째 도서 객체 생성하고 정보 설정하기
        // Book 객체를 생성하고 다음 정보로 설정:
        // title = "Clean Code", author = "Robert C. Martin", isbn = "978-89-966260-2-3"
        // pages = 464, isAvailable = true
        Book book2 = new Book();
        book2.title = "Clean Code";
        book2.author = "Robert C. Martin";
        book2.isbn = "978-89-966260-2-3";
        book2.pages = 464;
        book2.isAvailable = true;

        // TODO 18: 도서 정보 표시하기
        // book1의 displayInfo() 메서드 호출하고 빈 줄 출력
        book1.displayInfo();
        System.out.println();

        // TODO 19: 대출 시뮬레이션하기
        // book1.borrowBook() 두 번 호출 (두 번째는 실패해야 함)
        book1.borrowBook();
        book1.borrowBook();

        // TODO 20: 반납하고 정보 다시 표시하기
        // book1을 반납하고 displayInfo() 다시 호출
        book1.returnBook();
        book1.displayInfo();
    }
}