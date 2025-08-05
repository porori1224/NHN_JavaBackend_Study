public class CommonErrors {
    public static void main(String[] args) {
        // TODO: 일반적인 오류들을 피하여 올바른 코드를 작성하세요

        // 주의: 아래는 오류 예시들입니다 (주석 처리됨)
        // 오류 1: 초기화하지 않은 변수 사용
        // int count;
        // System.out.println(count);  // 컴파일 오류

        // TODO: 오류 1 수정 - 변수를 초기화하고 출력하세요
        // 힌트: count = 0으로 초기화 후 출력
        int count = 0;
        System.out.println(count);

        // 오류 2: 타입 불일치
        // int number = 3.14;  // 컴파일 오류

        // TODO: 오류 2 수정 - 올바른 타입 사용
        // 힌트:
        // 1. double number = 3.14 (올바른 타입)
        // 2. 또는 int intNumber = (int) 3.14 (캐스팅 사용)
        double number = 3.14;

        // 오류 3: 범위 초과
        // byte bigByte = 200;  // 컴파일 오류 (byte 범위: -128~127)

        // TODO: 오류 3 수정 - 적절한 타입 사용
        // 힌트:
        // 1. short bigShort = 200 (더 큰 타입 사용)
        // 2. 또는 byte smallByte = (byte) 200 (캐스팅, 단 데이터 손실 주의)
        short bigByte = 200;

        // 오류 4: 문자열과 문자 혼동
        // char initial = "A";  // 컴파일 오류

        // TODO: 오류 4 수정 - 문자와 문자열 구분
        // 힌트:
        // 1. char initial = 'A' (단일 문자는 작은따옴표)
        // 2. String initialString = "A" (문자열은 큰따옴표)
        char initial = 'A';

        // 오류 5: 예약어 사용
        // int class = 10;  // 컴파일 오류 (class는 예약어)

        // TODO: 오류 5 수정 - 예약어 피하기
        // 힌트: int classNumber = 10 (예약어가 아닌 이름 사용)
        int classNumber = 10;

        // TODO: "모든 오류가 수정되었습니다!" 출력
        System.out.println("모든 오류가 수정되었습니다!");

        // 여기에 코드를 작성하세요
    }
}