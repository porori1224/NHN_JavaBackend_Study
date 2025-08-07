import java.util.ArrayList;
import java.util.List;

public class ImmutabilityExample {
    // TODO: 은행 계좌 거래 레코드를 정의하세요 (불변)
    // 레코드명: Transaction
    // 필드: String id, String accountNumber, String type, double amount, double balanceAfter, String timestamp
    record Transaction(String id, String accountNumber, String type, double amount, double balanceAfter, String timestamp) {}

    // TODO: 계좌 상태 레코드를 정의하세요 (불변)
    // 레코드명: AccountState, 매개변수: String accountNumber, double balance
    record AccountState(String accountNumber, double balance) {
        // TODO: 입금 후 새 상태 반환 메서드를 작성하세요
        // 메서드명: deposit, 매개변수: double amount
        // 새로운 AccountState 객체를 반환 (balance + amount)
        public AccountState deposit(double amount) {
            return new AccountState(accountNumber, balance + amount);
        }

        // TODO: 출금 후 새 상태 반환 메서드를 작성하세요
        // 메서드명: withdraw, 매개변수: double amount
        // 잔액이 부족하면 "잔액 부족" 예외, 아니면 새로운 AccountState 반환
        public AccountState withdraw(double amount) {
            if (balance < amount) {
                throw new IllegalArgumentException("잔액 부족");
            }
            return new AccountState(accountNumber, balance - amount);
        }
    }

    // 거래 처리기
    static class TransactionProcessor {
        private List<Transaction> transactions = new ArrayList<>();
        private int transactionId = 1;

        // TODO: 입금 처리 메서드를 작성하세요
        // 메서드명: processDeposit, 매개변수: AccountState account, double amount
        // 새로운 상태를 생성하고 거래 기록을 저장한 후 새 상태 반환
        public AccountState processDeposit(AccountState account, double amount) {
            AccountState newAccount = account.deposit(amount);
            Transaction transaction = new Transaction(
                    "TXN" + transactionId++,
                    account.accountNumber(),
                    "입금",
                    amount,
                    newAccount.balance(),
                    "2024-01-01"
            );
            transactions.add(transaction);
            return newAccount;
        }

        // TODO: 출금 처리 메서드를 작성하세요
        // 메서드명: processWithdrawal, 매개변수: AccountState account, double amount
        // 새로운 상태를 생성하고 거래 기록을 저장한 후 새 상태 반환
        public AccountState processWithdrawal(AccountState account, double amount) {
            AccountState newAccount = account.withdraw(amount);
            Transaction transaction = new Transaction(
                    "TXN" + transactionId++,
                    account.accountNumber(),
                    "출금",
                    amount,
                    newAccount.balance(),
                    "2024-01-01"
            );
            transactions.add(transaction);
            return newAccount;
        }

        // TODO: 거래 내역 조회 메서드를 작성하세요
        // 메서드명: getTransactionHistory, 매개변수: String accountNumber
        // 해당 계좌번호의 모든 거래 내역을 List로 반환
        public List<Transaction> getTransactionHistory(String accountNumber) {
            List<Transaction> history = new ArrayList<>();
            for (Transaction transaction : transactions) {
                if (transaction.accountNumber().equals(accountNumber)) {
                    history.add(transaction);
                }
            }
            return history;
        }
    }

    public static void main(String[] args) {
        TransactionProcessor processor = new TransactionProcessor();

        // TODO: 초기 계좌 상태를 생성하세요
        // 계좌번호: "123-456-789", 잔액: 100000
        AccountState account = new AccountState("123-456-789", 100000);
        System.out.println("초기 상태: " + account);

        // TODO: 거래를 처리하세요 (각 거래마다 새로운 상태 생성)
        // 50000원 입금, 30000원 출금, 20000원 입금
        account = processor.processDeposit(account, 50000);  // 입금
        System.out.println("입금 후: " + account);

        account = processor.processWithdrawal(account, 30000);  // 출금
        System.out.println("출금 후: " + account);

        account = processor.processDeposit(account, 20000);  // 입금
        System.out.println("입금 후: " + account);

        // 거래 내역 출력
        System.out.println("\n=== 거래 내역 ===");
        for (Transaction txn : processor.getTransactionHistory("123-456-789")) {
            System.out.printf("%s | %s | %,.0f원 | 잔액: %,.0f원\n",
                    txn.id(), txn.type(), txn.amount(), txn.balanceAfter());
        }
    }
}