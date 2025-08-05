public class NumberFormatting {
    public static void main(String[] args) {
        // TODO: 다양한 숫자 서식을 사용하여 출력하세요
        // 힌트:
        // 1. 정수 서식 (number=42): 기본, 5자리 정렬, 0으로 채우기
        // 2. 천단위 구분 (bigNumber=1234567890): %,d 사용
        // 3. 실수 서식 (pi=3.141592653589793, money=12345.678): 소수점 자릿수 조정
        // 4. 지수 표기법 (bigDouble=6.022e23): %e 사용
        // 5. g 서식으로 0.000123, 123.456, 1234567890.0 출력

        // 여기에 코드를 작성하세요
        int number = 42;
        int bigNumber = 1234567890;
        double pi = 3.141592653589793;
        double money = 12345.678;
        double bigDouble = 6.022e23;

        System.out.println("=== 정수 서식 ===");
        System.out.printf("기본: %d\n", number);
        System.out.printf("5자리 오른쪽 정렬: '%5d'\n", number);
        System.out.printf("5자리 왼쪽 정렬: '%-5d'\n", number);
        System.out.printf("빈자리 0으로 채우기: %05d\n", number);
        System.out.printf("천단위 구분: %,d\n", bigNumber);

        System.out.println("\n=== 실수 서식 ===");
        System.out.printf("기본: %f\n", pi);
        System.out.printf("소수점 2자리: %.2f\n", pi);
        System.out.printf("소수점 4자리: %.4f\n", pi);
        System.out.printf("전체 10자리, 소수점 2자리: %10.2f\n", pi);
        System.out.printf("금액 표시: %,.2f원\n", money);
        System.out.printf("지수 표기법: %e\n", bigDouble);
        System.out.printf("지수 표기법 (2자리): %.2e\n", bigDouble);

        System.out.println("\n=== g 서식 (자동 선택) ===");
        System.out.printf("%g\n", 0.000123);
        System.out.printf("%g\n", 123.456);
        System.out.printf("%.5g\n", 1234567890.0);
    }
}