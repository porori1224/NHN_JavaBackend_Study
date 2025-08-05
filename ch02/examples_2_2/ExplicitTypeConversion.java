public class ExplicitTypeConversion {
    public static void main(String[] args) {
        // TODO: 큰 타입에서 작은 타입으로 명시적 변환(캐스팅)을 시연하세요
        // 힌트:
        // 1. pi = 3.14159 (double 타입)
        // 2. intPi = (int) pi (소수점 이하 버림)
        // 3. 두 값을 출력하여 차이 확인
        double pi = 3.14159;
        int intPi = (int) pi;
        System.out.println("pi: " + pi + "\nintPi: " + intPi);

        // TODO: 데이터 손실이 발생하는 캐스팅 예제를 시연하세요
        // 힌트:
        // 1. bigNumber = 300 (int 타입)
        // 2. smallByte = (byte) bigNumber (오버플로우 발생)
        // 3. "\n데이터 손실 예제:" 출력
        // 4. 원본과 변환된 값 출력 (예상과 다른 값 확인)
        int bigNumber = 300;
        byte smallByte = (byte) bigNumber;
        System.out.println("\n데이터 손실 예제:");
        System.out.println("원본: " + bigNumber + "\n변환된 값: " + smallByte);

        // TODO: 실수 나눗셈을 위한 캐스팅을 시연하세요
        // 힌트:
        // 1. x = 7, y = 2 (int 타입)
        // 2. result1 = x / y (정수 나눗셈, 3.0)
        // 3. result2 = (double) x / y (실수 나눗셈, 3.5)
        // 4. "\n나눗셈 캐스팅:" 출력
        // 5. 두 결과를 비교하여 출력
        int x = 7, y = 2;
        double result1 = x / y;
        double result2 = (double) x / y;
        System.out.println("\n나눗셈 캐스팅:");
        System.out.println("result1 =  " + result1 + "\nresult2 =  " + result2);

        // 여기에 코드를 작성하세요
    }
}