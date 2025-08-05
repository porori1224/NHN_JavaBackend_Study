public class IncrementDecrement {
    public static void main(String[] args) {
        // TODO: 전위/후위 증가/감소 연산자의 차이를 보여주세요
        // 힌트:
        // 1. "=== 증가/감소 연산자 ===" 출력
        // 2. 후위 증가(x++): x=5로 시작하여 사용 후 증가하는 과정 출력
        // 3. 전위 증가(++x): x=5로 시작하여 증가 후 사용하는 과정 출력
        // 4. 후위 감소(x--): x=5로 시작하여 사용 후 감소하는 과정 출력
        // 5. 전위 감소(--x): x=5로 시작하여 감소 후 사용하는 과정 출력

        // 여기에 코드를 작성하세요
        System.out.println("=== 증가/감소 연산자 ===");

        // 후위 증가
        int x = 5;
        System.out.println("\n후위 증가 x++:");
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++));
        System.out.println("x = " + x);

        // 전위 증가
        x = 5;
        System.out.println("\n전위 증가 ++x:");
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x));
        System.out.println("x = " + x);

        // 후위 감소
        x = 5;
        System.out.println("\n후위 감소 x--:");
        System.out.println("x = " + x);
        System.out.println("x-- = " + (x--));
        System.out.println("x = " + x);

        // 전위 감소
        x = 5;
        System.out.println("\n전위 감소 --x:");
        System.out.println("x = " + x);
        System.out.println("--x = " + (--x));
        System.out.println("x = " + x);
    }
}