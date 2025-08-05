public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println("=== 인터페이스 구성 요소 예제 ===\n");

        // TODO 26: 구문적 인터페이스 테스트하기
        System.out.println("1. 구문적 인터페이스 (올바른 사용):");
        // add 메서드와 calculateAverage 메서드를 호출해보세요
        System.out.println("add(5, 3) = " + add(5, 3));

        double[] numbers = {10.0, 20.0, 30.0, 40.0};
        System.out.println("평균 = " + calculateAverage(numbers));

        // TODO 27: 의미적 인터페이스 이해하기
        System.out.println("\n2. 의미적 인터페이스 이해:");
        // BankAccount 객체를 생성하고 출금 기능을 테스트해보세요
        BankAccount bankAccount = new BankAccount(1000.0);
        System.out.println("초기 잔액: " + bankAccount.getBalance());

        if (bankAccount.withdraw(300)) {
            System.out.println("300원 출금 성공");
        } else System.out.println("300원 출금 실패");

        System.out.println("현재 잔액: " +  bankAccount.getBalance());

        if (bankAccount.withdraw(800)) {
            System.out.println("800원 출금 성공");
        } else System.out.println("800원 출금 실패(잔액 부족)");

        System.out.println("최종 잔액: " + bankAccount.getBalance());
    }

    // TODO 28: 두 정수를 더하는 메서드 구현하기
    /**
     * 두 정수를 더합니다.
     * 구문: add(int, int) -> int
     * 의미: 첫 번째 매개변수와 두 번째 매개변수의 합을 반환
     */
    public static int add(int a, int b) {
        // 두 수의 합을 반환하세요
        return a + b;
    }

    // TODO 29: 배열의 평균을 계산하는 메서드 구현하기
    /**
     * 배열의 평균을 계산합니다.
     * 전제조건: 배열이 null이 아니고 비어있지 않아야 함
     */
    public static double calculateAverage(double[] numbers) {
        // 배열이 null이거나 비어있으면 예외를 발생시키고
        // 그렇지 않으면 평균을 계산하여 반환하세요
        double total = 0;

        try {
            if (numbers == null && numbers.length != 0) {
                for (int i = 0; i < numbers.length; i++) {
                    total += numbers[i];
                }
            }
        } catch(ArithmeticException e) {
            System.out.println("배열이 null이거나 비어있습니다.");
        }

        return total / numbers.length;
    }
}

// TODO 30: 은행 계좌 클래스 완성하기
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        // 초기 잔액을 설정하세요
        if (initialBalance < 0) {
            throw new IllegalArgumentException("초기 잔액은 음수일 수 없습니다.");
        }

        this.balance = initialBalance;
    }

    /**
     * 계좌에서 돈을 출금합니다.
     *
     * 의미적 계약:
     * - 잔액이 충분하면 출금하고 true 반환
     * - 잔액이 부족하면 출금하지 않고 false 반환
     * - 음수 금액은 허용하지 않음
     */
    public boolean withdraw(double amount) {
        // 출금 로직을 구현하세요
        if (amount < 0) {
            throw new IllegalArgumentException("출금 잔액은 음수일 수 없습니다.");
        }

        if (balance >= amount) {
            balance -= amount;
            return true;
        } else return false;
    }

    public double getBalance() {
        // 현재 잔액을 반환하세요
        return balance;
    }
}