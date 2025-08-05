public class AutomaticTypeConversion {
    public static void main(String[] args) {
        // TODO: 작은 타입에서 큰 타입으로 자동 변환을 시연하세요
        // 힌트:
        // 1. byteValue = 100 (byte 타입)
        // 2. shortValue = byteValue (byte → short 자동 변환)
        // 3. intValue = shortValue (short → int 자동 변환)
        // 4. longValue = intValue (int → long 자동 변환)
        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;

        // TODO: 각 타입의 값을 출력하세요
        // 힌트: byte, short, int, long 값을 각각 출력
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);

        // TODO: 정수에서 실수로 자동 변환을 시연하세요
        // 힌트:
        // 1. count = 10 (int 타입)
        // 2. doubleCount = count (int → double 자동 변환)
        // 3. "\n정수 → 실수 변환:" 출력
        // 4. 두 값을 버각 출력
        int count = 10;
        double doubleValue = count;
        System.out.println("\n정수 → 실수 변환: ");
        System.out.println(count);
        System.out.println(doubleValue);

        // TODO: 계산에서의 자동 변환을 시연하세요
        // 힌트:
        // 1. a = 10 (int 타입)
        // 2. b = 3.14 (double 타입)
        // 3. result = a + b (a가 double로 자동 변환되어 계산)
        // 4. "\n계산 시 자동 변환:" 출력
        // 5. 계산 과정과 결과 출력
        int a = 10;
        double b = 3.14;
        double result = a + b;
        System.out.println("\n계산 시 자동 변환: ");
        System.out.println(a + " + " + b + " = " + result);

        // 여기에 코드를 작성하세요
    }
}