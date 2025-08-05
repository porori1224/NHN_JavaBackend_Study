/* 요구사항
    세 개의 정수 x, y, z를 입력받아 오름차순으로 정렬하여 출력
    추가로 최솟값, 최댓값, 범위(max-min) 계산하여 출력
*/

import textio.TextIO;

public class SortThreeNumbers {
    public static void main(String[] args) {
        System.out.println("세 개의 숫자를 입력하면 오름차순으로 정렬합니다.");

        System.out.print("첫 번째 숫자: ");
        int x = TextIO.getlnInt();
        System.out.print("두 번째 숫자: ");
        int y = TextIO.getlnInt();
        System.out.print("세 번째 숫자: ");
        int z = TextIO.getlnInt();

        System.out.print("\n정렬 결과: ");

        // TODO: 세 수 정렬 로직
        // 힌트: x가 가장 작은/큰/중간인 경우로 나누어 처리

        // 여기에 코드를 작성하세요
        int min = x, mid = y, max = z;

        if (x <= y) {
            if (y <= z) {
                min = x;
                mid = y;
                max = z;
            } else {
                if (x <= z) {
                    min = x;
                    mid = z;
                    max = y;
                } else {
                    min = z;
                    mid = x;
                    max = y;
                }
            }
        } else {
            if (x <= z) {
                min = y;
                mid = x;
                max = z;
            } else {
                if (y <= z) {
                    min = y;
                    mid = z;
                    max = x;
                } else {
                    min = z;
                    mid = y;
                    max = x;
                }
            }
        }

        System.out.printf("%d %d %d\n", min, mid, max);

        // TODO: 추가 정보 계산
        // 힌트: min과 max 변수 사용

        // 여기에 코드를 작성하세요
        System.out.println("\n최솟값: " + min);
        System.out.println("최댓값: " + max);
        System.out.print("범위: " + (max - min) );
    }
}