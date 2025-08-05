public class CalculatorOverloading {
    public static void main(String[] args) {
        System.out.println("=== 계산기 오버로딩 ===\n");

        // TODO 35: 두 수의 합 테스트하기
        System.out.println("add(5, 3) = " + add(5, 3));
        System.out.println("add(5.5, 3.3) = " + add(5.5, 3.3));

        // TODO 36: 세 수의 합 테스트하기
        System.out.println("add(1, 2, 3) = " + add(1, 2, 3));
        System.out.println("add(1.1, 2.2, 3.3) = " + add(1.1, 2.2, 3.3));

        // TODO 37: 배열의 합 테스트하기
        int[] intArray = {10, 20, 30, 40};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println("add(intArray) =  " + add(intArray));
        System.out.println("add(doubleArray) = " +  add(doubleArray));

        // TODO 38: 평균 계산 테스트하기
        System.out.println("\n평균 계산:");
        System.out.println("average(80, 90) = " + average(80, 90));
        System.out.println("average(80, 90, 100) = " + average(80, 90, 100));
        System.out.println("average(intArray) =  " + average(intArray));
    }

    // TODO 39: add 메서드들 구현하기
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static int add(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    static double add(double[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    // TODO 40: average 메서드들 구현하기
    static double average(int a, int b) {
        return (a + b) / 2;
    }

    static double average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    static double average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }
}