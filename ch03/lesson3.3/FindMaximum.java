import textio.TextIO;

public class FindMaximum {
    public static void main(String[] args) {
        System.out.println("=== 최댓값 찾기 ===");
        System.out.println("숫자를 입력하세요 (-999 입력시 종료):");

        // 루프 준비
        System.out.print("숫자: ");
        double number = TextIO.getlnDouble();

        if (number == -999) {
            System.out.println("입력된 숫자가 없습니다!");
            return;
        }

        // 첫 번째 숫자를 최댓값으로 설정
        double max = number;

        // TODO: 나머지 숫자 처리
        // 힌트:
        // 1. number가 -999가 아닌 동안 반복
        // 2. number가 max보다 크면 max 업데이트
        // 3. 다음 숫자 입력받기

        // 여기에 코드를 작성하세요
        while (number != -999) {
            if (number > max) {
                max = number;
            }

            System.out.print("숫자: ");
            number = TextIO.getlnDouble();
        }

        System.out.println("\n최댓값: " + max);
    }
}