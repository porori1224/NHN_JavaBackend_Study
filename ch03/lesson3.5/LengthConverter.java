/* 요구사항
    지원 단위: inch(in), feet(ft), yard(yd), mile(mi)
    모든 입력을 인치로 변환한 후 모든 단위로 출력
    변환 규칙:
    inch/inches/in: 그대로
    foot/feet/ft: × 12
    yard/yards/yd: × 36
    mile/miles/mi: × 12 × 5280
    크기에 따른 팁 제공
    0 입력 시 프로그램 종료
*/

import textio.TextIO;
import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        System.out.println("=== 길이 단위 변환기 ===");
        System.out.println("사용법: 숫자와 단위를 입력 (예: 5.5 feet)");
        System.out.println("지원 단위: inch(in), feet(ft), yard(yd), mile(mi)");
        System.out.println("종료: 0 입력\n");
        //TextIO 명시 문제로 스캐너로 대체 사용
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("측정값 입력: ");
            //double measurement = TextIO.getDouble();
            double measurement = sc.nextDouble();

            if (measurement == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            //String unit = TextIO.getlnWord().toLowerCase();
            String unit = sc.next().toLowerCase();

            // TODO: 인치로 변환
            double inches;
            // 힌트: equals() 메서드 사용

            // 여기에 코드를 작성하세요
            if (unit.equals("inch") || unit.equals("inches") || unit.equals("in")) {
                inches = measurement;
            } else if (unit.equals("foot") || unit.equals("feet") || unit.equals("ft")) {
                inches = measurement * 12;
            } else if (unit.equals("yard") || unit.equals("yards") || unit.equals("yd")) {
                inches = measurement * 36;
            } else if (unit.equals("mile") || unit.equals("miles") || unit.equals("mi")) {
                inches = measurement * 12 * 5280;
            } else {
                System.out.println("지원하지 않는 단위입니다. 다시 시도하세요.\n");
                continue;
            }

            // 모든 단위로 변환
            double feet = inches / 12.0;
            double yards = inches / 36.0;
            double miles = inches / (12.0 * 5280.0);

            // 결과 출력
            System.out.println("\n변환 결과:");
            System.out.printf("  %,.2f inches%n", inches);
            System.out.printf("  %,.2f feet%n", feet);
            System.out.printf("  %,.2f yards%n", yards);
            System.out.printf("  %,.6f miles%n", miles);

            // TODO: 추가 정보
            // 힌트: if-else if 사용
            // 여기에 코드를 작성하세요
            if (inches < 36) {
                System.out.println("팁: 1야드보다 작습니다.");
            } else if (inches < 12 * 5280) {
                System.out.println("팁: 1야드보다 큽니다.");
            } else {
                System.out.println("팁: 1마일 이상입니다!");
            }

            System.out.println();
        }
    }
}