// 테스트
public class BankAccountTest {
    public static void main(String[] args) {
        // TODO 23: 일반 계좌와 프리미엄 계좌 생성하기
        // 일반 계좌: "1234", 100000원
        // 프리미엄 계좌: "5678", 100000원, 신용한도 50000, 이자율 2.5%
        BankAccount basic = new BankAccount("1234", 100000);
        PremiumAccount premium = new PremiumAccount("5678", 100000, 50000, 2.5);

        // TODO 24: 일반 계좌 테스트하기
        // 50000원 입금, 30000원 출금, 200000원 출금 시도
        // 잔액 출력
        basic.deposit(50000);
        basic.withdraw(20000);
        basic.withdraw(200000);
        System.out.println("=== 일반 계좌 테스트 ===");
        System.out.println("잔액: " + basic.getBalance());

        // TODO 25: 프리미엄 계좌 테스트하기
        // 50000원 입금, 170000원 출금(신용한도 사용)
        // 이자 지급, VIP 혜택 적용
        // 잔액 출력
        premium.deposit(50000);
        premium.withdraw(170000);
        premium.applyInterest();
        premium.applyVIPBenefit();
        System.out.println("\n=== 프리미엄 계좌 테스트 ===");
        System.out.println("잔액: " + premium.getBalance());
        System.out.println();

        // TODO 26: 프리미엄 계좌 거래 내역 출력하기
        premium.printTransactionHistory();
    }
}
