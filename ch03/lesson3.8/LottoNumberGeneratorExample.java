/* 요구사항
1~45 범위의 중복되지 않는 6개 숫자 선택
선택된 숫자를 오름차순으로 정렬
5세트의 로또 번호 생성
generateLottoNumbers() 메소드에서 랜덤 번호 생성 및 정렬 구현
*/


public class LottoNumberGeneratorExample {
    public static void main(String[] args) {
        System.out.println("=== 로또 번호 생성기 ===");

        // 5세트의 로또 번호 생성
        for (int set = 1; set <= 5; set++) {
            int[] lottoNumbers = generateLottoNumbers();

            System.out.print("세트 " + set + ": ");
            for (int i = 0; i < lottoNumbers.length; i++) {
                System.out.printf("%2d ", lottoNumbers[i]);
            }
            System.out.println();
        }
    }

    public static int[] generateLottoNumbers() {
        boolean[] used = new boolean[46];  // 1~45 번호 사용 여부 (인덱스 0은 미사용)
        int[] numbers = new int[6];       // 선택된 6개 번호

        // TODO: 6개의 서로 다른 번호 선택
        // 힌트: do-while 루프와 중복 검사
        // 여기에 코드를 작성하세요
        int count = 0;

        while (count < 6) {
            int num = (int)(Math.random() * 45) + 1;

            if (!used[num]) {
                used[num] = true;
                numbers[count] = num;
                count++;
            }
        }

        // TODO: 번호 정렬 (버블 정렬)
        // 힌트: 이중 루프와 교환
        // 여기에 코드를 작성하세요
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        return numbers;
    }
}