/**
 * 다양한 수학 함수를 생성하는 클래스
 */
public class FunctionFactory {

    // 함수 인터페이스
    public interface MathFunction {
        double apply(double x);
        String getDescription();
    }

    // 다항식 생성
    public static MathFunction createPolynomial(final double... coefficients) {
        // TODO 85: 로컬 클래스 Polynomial 구현하기
        // MathFunction 인터페이스 구현
        // apply: coefficients[0] + coefficients[1]*x + coefficients[2]*x^2 + ...
        // getDescription: "f(x) = a + bx + cx^2 + ..." 형식
        class Polynomial implements MathFunction {
            @Override
            public double apply(double x) {
                double result = 0;
                for (int i = 0; i < coefficients.length; i++) {
                    result += coefficients[i] * Math.pow(x, i);
                }
                return result;
            }

            @Override
            public String getDescription() {
                StringBuilder sb = new StringBuilder("f(x) = ");
                for (int i = 0; i < coefficients.length; i++) {
                    if (i > 0) sb.append(" + ");
                    sb.append(coefficients[i]);
                    if (i > 0) {
                        sb.append("x");
                        if (i > 1) sb.append("^").append(i);
                    }
                }
                return sb.toString();
            }
        }
        return new Polynomial();
    }

    // 삼각함수 조합 생성
    public static MathFunction createTrigFunction(
            final double amplitude, final double frequency, final double phase) {
        // TODO 86: 익명 클래스로 MathFunction 구현하기
        // apply: amplitude * sin(frequency * x + phase)
        // getDescription: "f(x) = A * sin(Fx + P)" 형식
        return new MathFunction() {
            @Override
            public double apply(double x) {
                return amplitude * Math.sin(frequency * x + phase);
            }

            @Override
            public String getDescription() {
                return String.format("f(x) = %.2f * sin(%.2fx + %.2f)", amplitude, frequency, phase);
            }
        };
    }

    // 함수 배열 생성 (람다와 로컬 클래스 혼합)
    public static MathFunction[] createFunctionArray() {
        MathFunction[] functions = new MathFunction[5];

        // TODO 87: 로컬 클래스 SquareFunction 구현하기
        // apply: x * x
        // getDescription: "f(x) = x²"
        class SquareFunction implements MathFunction {
            @Override
            public double apply(double x) {
                return x * x;
            }

            @Override
            public String getDescription() {
                return "f(x) = x²";
            }
        }

        // TODO 88: 익명 클래스로 세제곱 함수 구현하기
        // apply: x * x * x
        // getDescription: "f(x) = x³"
        MathFunction cubeFunction = new MathFunction() {
            @Override
            public double apply(double x) {
                return x * x * x;
            }

            @Override
            public String getDescription() {
                return "f(x) = x³";
            }
        };

        // TODO 89: 함수 배열 완성하기
        // functions[0]: SquareFunction
        // functions[1]: 세제곱 함수 (익명 클래스)
        // functions[2]: createPolynomial(0, 1) - f(x) = x
        // functions[3]: createPolynomial(1, 2, 1) - f(x) = 1 + 2x + x²
        // functions[4]: createTrigFunction(2, 1, 0) - f(x) = 2sin(x)
        functions[0] = new SquareFunction();
        functions[1] = cubeFunction;
        functions[2] = createPolynomial(0, 1);
        functions[3] = createPolynomial(1, 2, 1);
        functions[4] = createTrigFunction(2, 1, 0);

        return functions;
    }

    public static void main(String[] args) {
        // TODO 90: 다항식 함수 테스트하기
        // createPolynomial(1, -2, 1) - x² - 2x + 1
        // getDescription()과 apply(3) 출력
        MathFunction poly = createPolynomial(1, -2, 1);
        System.out.println(poly.getDescription());
        System.out.println("f(3) = " + poly.apply(3));

        // TODO 91: 삼각함수 테스트하기
        // createTrigFunction(1, 2*Math.PI, 0)
        // getDescription()과 apply(0.25) 출력
        MathFunction trig = createTrigFunction(1, 2 * Math.PI, 0);
        System.out.println();
        System.out.println(trig.getDescription());
        System.out.println("f(0.25) = " + trig.apply(0.25));

        // TODO 92: 함수 배열 테스트하기
        // createFunctionArray() 호출
        // x = 2.0에 대한 모든 함수의 결과 출력
        System.out.println();
        System.out.println("=== 함수 배열 ===");
        MathFunction[] funcs = createFunctionArray();
        double x = 2.0;
        for (MathFunction f : funcs) {
            System.out.printf("%s: f(%.1f) = %.2f%n", f.getDescription(), x, f.apply(x));
        }
    }
}
