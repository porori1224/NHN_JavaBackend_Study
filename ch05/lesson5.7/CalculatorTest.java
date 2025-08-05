// 테스트
public class CalculatorTest {
    public static void main(String[] args) {
        // TODO 45: BasicCalculator 테스트하기
        // 3 + 5, 10 - 4 계산하고 출력
        // average(2, 4, 6, 8) 계산하고 출력
        // 5! 계산하고 출력
        // √16 계산하고 출력
        System.out.println("=== 기본 계산기 ===");
        Calculator basic = new BasicCalculator();
        System.out.println("3 + 5 = " + basic.add(3, 5));
        System.out.println("10 - 4 = " + basic.subtract(10, 4));
        System.out.println("평균(2,4,6,8) = " + basic.average(2, 4, 6, 8));
        System.out.println("5! = " + basic.factorial(5));
        System.out.println("√16 = " + basic.squareRoot(16));

        // TODO 46: ScientificCalculator 테스트하기
        // √25 계산하고 출력
        // sin(π/2), cos(0) 계산하고 출력
        System.out.println("\n=== 공학용 계산기 ===");
        ScientificCalculator sci = new ScientificCalculator();
        System.out.println("√25 = " + sci.squareRoot(25));
        System.out.println("sin(π/2) = " + sci.sin(Math.PI / 2));
        System.out.println("cos(0) = " + sci.cos(0));
    }
}