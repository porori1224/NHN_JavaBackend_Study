public class TextBlockExamples {
    public static void main(String[] args) {
        // TODO: HTML 템플릿을 텍스트 블록으로 작성하세요
        // 힌트:
        // String html = """ 사용하여 HTML 구조 작성
        // <!DOCTYPE html>, html, head, title, body, h1, p 태그 포함
        // "Hello, World!" 제목과 "This is a text block example." 문단 포함
        String html = """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Welcome</title>
                </head>
                <body>
                    <h1>Hello, World!</h1>
                    <p>This is a text block example.</p>
                </body>
                </html>
                """;

        // TODO: HTML 템플릿을 출력하세요
        // 힌트:
        // 1. "HTML 템플릿:" 출력
        // 2. html 변수 출력
        System.out.println("HTML 템플릿:\n" + html);

        // TODO: SQL 쿼리를 텍스트 블록으로 작성하세요
        // 힌트:
        // String sql = """ 사용하여 복잡한 SQL 쿼리 작성
        // SELECT, FROM, JOIN, WHERE, ORDER BY 포함
        // users와 orders 테이블 조인
        // 완료된 주문만 조회하고 날짜순 정렬
        String sql = """
                SELECT u.name, u.email, o.order_date, o.total
                FROM users u
                JOIN orders o ON u.id = o.user_id
                WHERE o.status = 'completed'
                    AND o.order_date >= '2024-01-01'
                ORDER BY o.order_date DESC
                """;

        // TODO: SQL 쿼리를 출력하세요
        // 힌트:
        // 1. "\nSQL 쿼리:" 출력
        // 2. sql 변수 출력
        System.out.println("\nSQL 쿼리:\n" + sql);

        // TODO: 프로그램 도움말을 텍스트 블록으로 작성하세요
        // 힌트:
        // String help = """ 사용하여 계산기 프로그램 도움말 작성
        // 사용법, 옵션, 연산자, 예시 포함
        // -h, --help, -v, --verbose 옵션
        // +, -, *, / 연산자
        // 사용 예시 2개
        String help = """
                사용법: java Calculator [옵션] <숫자1> <연산자> <숫자2>
                
                옵션:
                    -h, --help     도움말 표시
                    -v, --verbose  자세한 정보 표시
                
                연산자:
                    +  덧셈
                    -  뺄셈
                    *  곱셈
                    /  나눗셈
                
                예시:
                    java Calculator 10 + 20
                    java Calculator -v 100 / 3
                """;

        // TODO: 프로그램 도움말을 출력하세요
        // 힌트:
        // 1. "\n프로그램 도움말:" 출력
        // 2. help 변수 출력
        System.out.println("\n프로그램 도움말:\n" + help);

        // 여기에 코드를 작성하세요
    }
}