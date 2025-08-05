public class PrintfBasics {
    public static void main(String[] args) {
        // TODO: printf를 사용하여 다양한 타입을 서식에 맞게 출력하세요
        // 힌트:
        // 1. 변수 생성: intValue=42, doubleValue=3.14159, stringValue="Java", charValue='A', boolValue=true
        // 2. printf로 각 타입 출력: %d(정수), %f(실수), %s(문자열), %c(문자), %b(불린)
        // 3. 여러 값을 한 번에 출력: "Java 언어의 버전 42는 원주율 3.14를 지원합니다."
        // 4. 특수 문자: 백분율(%), 탭 문자, 따옴표 출력

        // 여기에 코드를 작성하세요
        int intValue = 42;
        double doubleValue = 3.14159;
        String stringValue = "Java";
        char charValue = 'A';
        boolean boolValue = true;

        System.out.printf("정수: %d\n", intValue);
        System.out.printf("실수: %f\n", doubleValue);
        System.out.printf("문자열: %s\n", stringValue);
        System.out.printf("문자: %c\n", charValue);
        System.out.printf("불린: %b\n", boolValue);

        System.out.printf("\n%s 언어의 버전 %d는 원주율 %.2f를 지원합니다.\n", stringValue, intValue, doubleValue);

        System.out.printf("백분율: 50%%\n");
        System.out.printf("탭 문자:\tHello\tWorld\n");
        System.out.printf("따옴표: \"%s\"\n", stringValue);
    }
}