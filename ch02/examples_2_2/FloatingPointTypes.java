public class FloatingPointTypes {
    public static void main(String[] args) {
        // TODO: float 타입 변수를 선언하고 값을 할당하세요
        // 힌트:
        // 1. pi = 3.14159f (F 접미사 필수)
        // 2. price = 19.99F (대문자 F도 가능)
        // 3. scientificNotation = 6.02e23f (과학적 표기법, 아보가드로 수)
        float pi = 3.14159f;
        float price = 19.99F;
        float scientificNotation = 6.02e23f;

        // TODO: double 타입 변수를 선언하고 값을 할당하세요
        // 힌트:
        // 1. e = 2.718281828459045 (자연상수, 더 정밀함)
        // 2. atomRadius = 1.2e-10 (원자 반지름, 미터 단위)
        // 3. lightSpeed = 299_792_458.0 (빛의 속도, m/s)
        double e = 2.718281828459045;
        double atomRadius = 1.2e-10;
        double lightSpeed = 299_792_458.0;

        // TODO: float와 double의 정밀도 차이를 비교하세요
        // 힌트:
        // 1. floatValue = 1.12345678901234567890f
        // 2. doubleValue = 1.12345678901234567890
        // 3. 두 값을 출력하여 정밀도 차이 확인
        float floatValue = 1.12345678901234567890f;
        double doubleValue = 1.12345678901234567890;
        System.out.println("float 정밀도: " + floatValue);
        System.out.println("double 정밀도: " + doubleValue);

        // TODO: 원의 넓이를 계산하고 출력하세요
        // 힌트:
        // 1. radius = 5.0
        // 2. area = Math.PI * radius * radius
        // 3. "반지름 [radius]인 원의 넓이: [area]" 형식으로 출력
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("반지름 " + radius + "인 원의 넓이: " + area);

        // 여기에 코드를 작성하세요
    }
}