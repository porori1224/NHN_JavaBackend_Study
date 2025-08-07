public class ComplexNumberExample {
    // TODO: 복소수 레코드를 정의하세요
    // 레코드명: Complex, 매개변수: double real, double imaginary
    record Complex(double real, double imaginary) {
        // 상수 정의
        public static final Complex ZERO = new Complex(0, 0);
        public static final Complex ONE = new Complex(1, 0);
        public static final Complex I = new Complex(0, 1);

        // TODO: 실수로부터 복소수 생성하는 생성자를 작성하세요
        // 매개변수: double real, imaginary는 0으로 설정
        public Complex(double real) {
            this(real, 0);
        }

        // TODO: 덧셈 메서드를 작성하세요
        // 메서드명: add, 매개변수: Complex other
        // 새로운 Complex 객체 반환 (실부끼리, 허부끼리 더함)
        public Complex add(Complex other) {
            return new Complex(real + other.real, imaginary + other.imaginary);
        }

        // TODO: 뺄셈 메서드를 작성하세요
        // 메서드명: subtract, 매개변수: Complex other
        // 새로운 Complex 객체 반환
        public Complex subtract(Complex other) {
            return new Complex(real - other.real, imaginary - other.imaginary);
        }

        // TODO: 곱셈 메서드를 작성하세요
        // 메서드명: multiply, 매개변수: Complex other
        // 복소수 곱셈 공식: (a+bi)(c+di) = (ac-bd) + (ad+bc)i
        public Complex multiply(Complex other) {
            double newReal = real * other.real - imaginary * other.imaginary;
            double newImaginary = real * other.imaginary + imaginary * other.real;
            return new Complex(newReal, newImaginary);
        }

        // TODO: 절댓값 메서드를 작성하세요
        // 메서드명: magnitude
        // sqrt(real² + imaginary²) 반환
        public double magnitude() {
            return Math.sqrt(real * real + imaginary * imaginary);
        }

        // TODO: 켤레 복소수 메서드를 작성하세요
        // 메서드명: conjugate
        // 허부의 부호를 바꾼 새 Complex 반환
        public Complex conjugate() {
            return new Complex(real, -imaginary);
        }

        // TODO: 보기 좋은 문자열 표현 메서드를 작성하세요
        // toString 재정의
        // imaginary가 0이면 실부만, real이 0이면 허부만,
        // imaginary가 음수면 "a - bi", 양수면 "a + bi" 형태
        @Override
        public String toString() {
            if (imaginary == 0) {
                return String.format("%.2f", real);
            } else if (real == 0) {
                return String.format("%.2fi", imaginary);
            } else if (imaginary < 0) {
                return String.format("%.2f - %.2fi", real, -imaginary);
            } else {
                return String.format("%.2f + %.2fi", real, imaginary);
            }
        }
    }

    public static void main(String[] args) {
        // TODO: 복소수 객체들을 생성하세요
        Complex z1 = new Complex(3, 4);  // 3 + 4i
        Complex z2 = new Complex(1, -2);  // 1 - 2i

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);

        // TODO: 연산을 수행하세요 (새로운 객체 생성)
        Complex sum = z1.add(z2);    // z1 + z2
        Complex diff = z1.subtract(z2);   // z1 - z2
        Complex prod = z1.multiply(z2);   // z1 * z2

        System.out.println("\nz1 + z2 = " + sum);
        System.out.println("z1 - z2 = " + diff);
        System.out.println("z1 * z2 = " + prod);

        System.out.println("\n|z1| = " + z1.magnitude());
        System.out.println("z1의 켤레 = " + z1.conjugate());

        // TODO: 복잡한 계산을 수행하세요: (z1 + z2) * I
        Complex result = z1.add(z2).multiply(Complex.I);
        System.out.println("\n(z1 + z2) * i = " + result);

        // TODO: 체인 연산을 수행하세요: (1 + i) * 2 - 1
        Complex chain = new Complex(1, 1).multiply(new Complex(2)).subtract(Complex.ONE);
        System.out.println("(1 + i) * 2 - 1 = " + chain);
    }
}