public class IntegerLiterals {
    public static void main(String[] args) {
        // TODO: 다양한 진법의 정수 리터럴을 선언하고 255라는 같은 값을 표현하세요
        // 힌트:
        // 1. decimal = 255 (10진수)
        // 2. binary = 0b11111111 (2진수, 0b 접두사)
        // 3. octal = 0377 (8진수, 0 접두사)
        // 4. hexadecimal = 0xFF (16진수, 0x 접두사)
        int decimal = 255;
        int binary  =  0b11111111;
        int octal = 0377;
        int hexadecimal = 0xFF;

        // TODO: 각 진법의 값을 출력하고 모두 같은 값인지 확인하세요
        // 힌트:
        // 1. 각 진법별로 출력
        System.out.println(decimal);
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hexadecimal);

        // 2. 모든 값이 같은지 비교 (decimal == binary && binary == octal && octal == hexadecimal)
        boolean result = (decimal == binary && binary == octal && octal == hexadecimal);
        System.out.println(result);


        // TODO: 밑줄(_)을 사용하여 가독성을 향상시킨 리터럴을 작성하세요
        // 힌트:
        // 1. creditCardNumber = 1234_5678_9012_3456L (신용카드 번호 형식)
        // 2. rgbColor = 0xFF_FF_FF (RGB 흰색, 16진수)
        // 3. worldPopulation = 7_900_000_000L (세계 인구)
        long creditCardNumber = 1234_5678_9012_3456L;
        long rgbColor = 0xFF_FF_FF;
        long worldPopulation = 7_900_000_000L;

        // TODO: 가독성 향상 예제들을 출력하세요
        // 힌트:
        // 1. "\n가독성 향상 예제:" 출력
        // 2. 신용카드 번호와 RGB 색상 출력
        System.out.println("\n가독성 향상 예제:");
        System.out.println(creditCardNumber);
        System.out.println(rgbColor);

        // 여기에 코드를 작성하세요
    }
}