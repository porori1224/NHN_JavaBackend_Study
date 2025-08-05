/*요구사항
    메뉴 선택에 따라 다양한 예외 상황 테스트
    배열 접근 테스트: 사용자가 입력한 인덱스로 배열 접근 시도
    숫자 변환 테스트: 문자열을 Integer, Double, Boolean으로 변환 시도
    나눗셈 테스트: 두 수를 입력받아 나눗셈 수행, 0으로 나누기 처리
    복합 계산 테스트: 배열 크기를 입력받아 배열 생성 후 통계 계산
    각 테스트에서 발생 가능한 예외를 적절히 처리*/

import textio.TextIO;

public class MultipleExceptionHandlingExample {
    public static void main(String[] args) {
        System.out.println("=== 다중 예외 처리 예제 ===");

        while (true) {
            System.out.println("\n메뉴를 선택하세요:");
            System.out.println("1. 배열 접근 테스트");
            System.out.println("2. 숫자 변환 테스트");
            System.out.println("3. 나눗셈 테스트");
            System.out.println("4. 복합 계산 테스트");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            try {
                int choice = Integer.parseInt(TextIO.getln());

                switch (choice) {
                    case 1 -> testArrayAccess();
                    case 2 -> testNumberParsing();
                    case 3 -> testDivision();
                    case 4 -> testComplexCalculation();
                    case 0 -> {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    default -> System.out.println("❌ 올바른 메뉴를 선택하세요.");
                }

            } catch (NumberFormatException e) {
                System.out.println("❌ 숫자를 입력해주세요.");
            } catch (Exception e) {
                System.out.println("❌ 예상치 못한 오류: " + e.getMessage());
            }
        }
    }

    public static void testArrayAccess() {
        System.out.println("\n🔍 배열 접근 테스트");

        // TODO: 배열 접근 예외 처리
        // 힌트: 다중 catch 블록 사용
        // 여기에 코드를 작성하세요
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("인덱스를 입력하세요 (0-4): ");
            int index = Integer.parseInt(TextIO.getln());
            System.out.println("✅ numbers[" + index + "] = " + numbers[index]);

        } catch (NumberFormatException e) {
            System.out.println("❌ 숫자를 입력해주세요.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ 범위를 벗어난 인덱스입니다: " + e.getMessage());
        }
    }

    public static void testNumberParsing() {
        System.out.println("\n🔢 숫자 변환 테스트");

        System.out.print("변환할 문자열을 입력하세요: ");
        String input = TextIO.getln();

        // TODO: 여러 형태로 변환 시도
        // 힌트: 각각 독립된 try-catch 블록
        // 여기에 코드를 작성하세요
        try {
            int num = Integer.parseInt(input);
            System.out.println("✅ 정수 변환 성공: " + num);
        } catch (NumberFormatException e) {
            System.out.println("❌ 정수 변환 실패: " + e.getMessage());
        }

        try {
            double d = Double.parseDouble(input);
            System.out.println("✅ 실수 변환 성공: " + d);
        } catch (NumberFormatException e) {
            System.out.println("❌ 실수 변환 실패: " + e.getMessage());
        }

        try {
            boolean b = Boolean.parseBoolean(input);
            System.out.println("✅ 불리언 변환 결과: " + b);
        } catch (Exception e) {
            System.out.println("❌ 불리언 변환 실패");
        }
    }

    public static void testDivision() {
        System.out.println("\n➗ 나눗셈 테스트");

        try {
            System.out.print("피제수 (나눠지는 수): ");
            double dividend = Double.parseDouble(TextIO.getln());

            System.out.print("제수 (나누는 수): ");
            double divisor = Double.parseDouble(TextIO.getln());

            // TODO: 나눗셈 수행 및 결과 분석
            // 힌트: 0으로 나누기 검사
            // 여기에 코드를 작성하세요
            if (divisor == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            double result = dividend / divisor;
            System.out.printf("✅ 결과: %.2f ÷ %.2f = %.2f%n", dividend, divisor, result);

            if (result > 1) {
                System.out.println("ℹ️ 결과가 1보다 큽니다.");
            } else if (result == 1) {
                System.out.println("ℹ️ 결과가 정확히 1입니다.");
            } else {
                System.out.println("ℹ️ 결과가 1보다 작습니다.");
            }

        } catch (NumberFormatException e) {
            System.out.println("❌ 숫자 형식 오류: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("❌ 산술 오류: " + e.getMessage());
        }
    }

    public static void testComplexCalculation() {
        System.out.println("\n🧮 복합 계산 테스트");

        try {
            System.out.print("배열 크기를 입력하세요: ");
            int size = Integer.parseInt(TextIO.getln());

            // TODO: 배열 생성 및 통계 계산
            // 힌트: 크기 검증, 표준편차 계산
            // 여기에 코드를 작성하세요
            if (size <= 0) {
                throw new IllegalArgumentException("배열 크기는 양수여야 합니다.");
            }

            double[] numbers = new double[size];
            double sum = 0;

            for (int i = 0; i < size; i++) {
                numbers[i] = Math.random() * 100;
                sum += numbers[i];
            }

            double average = sum / size;

            double variance = 0;
            for (double n : numbers) {
                variance += Math.pow(n - average, 2);
            }
            double stddev = Math.sqrt(variance / size);

            System.out.printf("✅ 평균: %.2f, 표준편차: %.2f%n", average, stddev);

        } catch (NumberFormatException e) {
            System.out.println("❌ 숫자 형식 오류: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("❌ 잘못된 인수: " + e.getMessage());
        } catch (NegativeArraySizeException e) {
            System.out.println("❌ 배열 크기 오류: " + e.getMessage());
        } catch (OutOfMemoryError e) {
            System.out.println("❌ 메모리 부족: 배열 크기를 줄이세요");
        } catch (Exception e) {
            System.out.println("❌ 예상치 못한 오류: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}