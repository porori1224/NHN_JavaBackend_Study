import java.util.*;

interface BinaryOperation {
    double calculate(double a, double b);
}

interface UnaryOperation {
    double calculate(double x);
}

class Calculator2 {
    private Map<String, BinaryOperation> binaryOps = new HashMap<>();
    private Map<String, UnaryOperation> unaryOps = new HashMap<>();

    Calculator2() {
        // TODO 59: 이항 연산들 등록하기
        binaryOps.put("+", (a, b) -> a + b);
        binaryOps.put("-", (a, b) -> a - b);
        binaryOps.put("*", (a, b) -> a * b);
        binaryOps.put("/", (a, b) -> b != 0 ? a / b : Double.NaN);

        // TODO 60: 단항 연산들 등록하기
        unaryOps.put("sqrt", x -> Math.sqrt(x));
        unaryOps.put("abs", x -> Math.abs(x));
        unaryOps.put("square", x -> x * x);
    }

    // TODO 61: calculateBinary 메서드 구현하기
    double calculateBinary(double a, String op, double b) {
        BinaryOperation operation = binaryOps.get(op);
        if (operation != null) {
            return operation.calculate(a, b);
        } else {
            throw new IllegalArgumentException("지원하지 않는 연산: " + op);
        }
    }

    // TODO 62: calculateUnary 메서드 구현하기
    double calculateUnary(String op, double x) {
        UnaryOperation operation = unaryOps.get(op);
        if (operation != null) {
            return operation.calculate(x);
        } else {
            throw new IllegalArgumentException("지원하지 않는 단항 연산: " + op);
        }
    }

    // TODO 63: addBinaryOperation 메서드 구현하기
    void addBinaryOperation(String name, BinaryOperation op) {
        binaryOps.put(name, op);
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("=== 계산기 애플리케이션 ===\n");

        Calculator2 calc = new Calculator2();

        // TODO 64: 기본 이항 연산 테스트하기
        System.out.println("10 + 5 = " + calc.calculateBinary(10, "+", 5));
        System.out.println("10 * 5 = " + calc.calculateBinary(10, "*", 5));

        // TODO 65: 단항 연산 테스트하기
        System.out.println("sqrt(16) = " + calc.calculateUnary("sqrt", 16));
        System.out.println("square(5) = " + calc.calculateUnary("square", 5));

        // TODO 66: 사용자 정의 연산 추가하고 테스트하기
        calc.addBinaryOperation("avg", (a, b) -> (a + b) / 2);
        System.out.println("avg(10, 20) = " + calc.calculateBinary(10, "avg", 20));
    }
}
