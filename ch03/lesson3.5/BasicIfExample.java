/* 요구사항
- age가 18 이상이면 "성인입니다." 출력
-temperature가 37.5보다 크면 "발열이 있습니다.", 그렇지 않으면 "정상 체온입니다." 출력
- isRaining이 false일 때 "우산이 필요 없습니다." 출력
- age가 18 이상이고 65 미만일 때 "일반 성인 요금이 적용됩니다." 출력
 */

public class BasicIfExample {
    public static void main(String[] args) {
        int age = 20;
        double temperature = 36.5;
        boolean isRaining = false;

        // 여기에 코드를 작성하세요
        if (age > 18) {
            System.out.println("성인입니다.");
        }

        if (temperature > 37.5) {
            System.out.println("발열이 있습니다.");
        } else {
            System.out.println("정상 체온입니다.");
        }

        if (!isRaining) {
            System.out.println("우산이 필요 없습니다.");
        }

        if (age >= 18 && age < 65) {
            System.out.println("일반 성인 요금이 적용됩니다.");
        }
    }
}