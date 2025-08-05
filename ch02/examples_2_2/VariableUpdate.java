public class VariableUpdate {
    public static void main(String[] args) {
        // TODO: score 변수를 0으로 초기화하고 출력하세요
        // 힌트: "초기 점수: [score]" 형식
        int score = 0;
        System.out.println("초기 점수: " + score);

        // TODO: score를 10으로 변경하고 출력하세요
        // 힌트: "첫 번째 점수: [score]" 형식
        score = 10;
        System.out.println("첫 번째 점수: " + score);

        // TODO: score에 5를 더하고 출력하세요
        // 힌트: score = score + 5
        // 출력: "두 번째 점수: [score]"
        score += 5;
        System.out.println("두 번째 점수: " + score);

        // TODO: score를 2배로 만들고 출력하세요
        // 힌트: score = score * 2
        // 출력: "최종 점수: [score]"
        score *= 2;
        System.out.println("최종 점수: " + score);

        // TODO: 계좌 잔액 시뮬레이션을 구현하세요
        // 힌트:
        // 1. balance = 1000.0 (초기 잔액)
        // 2. interestRate = 0.05 (이자율 5%)
        // 3. "\n계좌 잔액 변화:" 출력
        // 4. 초기 잔액 출력
        // 5. 이자 계산: interest = balance * interestRate
        // 6. 잔액에 이자 추가: balance = balance + interest
        // 7. 이자 후 잔액 출력
        // 8. withdrawal = 200.0 (출금액)
        // 9. 출금 처리: balance = balance - withdrawal
        // 10. 출금 후 잔액 출력

        // 여기에 코드를 작성하세요
        double balance = 1000.0;
        double interestRate = 0.05;
        double withdrawal = 200.0;
        System.out.println("\n계좌 잔액 변화: ");
        System.out.println("초기 잔액: $" + balance);
        interestRate *= balance;
        balance += interestRate;
        System.out.println("이자 후 잔액: $" + balance);
        balance -= withdrawal;
        System.out.println("출금 후 잔액: $" + balance);
    }
}