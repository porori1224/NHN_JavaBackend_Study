import textio.TextIO;

public class BasicInput {
    public static void main(String[] args) {
        // TODO: TextIO를 사용하여 다양한 타입의 입력을 받고 출력하세요
        // 힌트:
        // 1. "=== 기본 정보 입력 ===" 출력
        // 2. TextIO.getlnInt()로 나이 입력
        // 3. TextIO.getlnDouble()로 키 입력
        // 4. TextIO.getlnChar()로 혈액형 입력
        // 5. TextIO.getlnBoolean()로 학생 여부 입력
        // 6. TextIO.getlnWord()로 이름(성만) 입력
        // 7. TextIO.getln()으로 주소 입력
        // 8. printf로 결과를 서식에 맞게 출력

        // 여기에 코드를 작성하세요
        System.out.println("=== 기본 정보 입력 ===");

        System.out.print("나이를 입력하세요: ");
        int age = TextIO.getlnInt();

        System.out.print("키를 입력하세요(cm): ");
        double height = TextIO.getlnDouble();

        System.out.print("혈액형을 입력하세요(A/B/O/AB 중 첫 글자): ");
        char bloodType = TextIO.getlnChar();

        System.out.print("학생입니까? (yes/no): ");
        boolean isStudent = TextIO.getlnBoolean();

        System.out.print("이름을 입력하세요(성만): ");
        String name = TextIO.getlnWord();

        System.out.print("주소를 입력하세요: ");
        String address = TextIO.getln();

        System.out.println("\n=== 입력된 정보 ===");
        System.out.printf("이름: %s\n", name);
        System.out.printf("나이: %d세\n", age);
        System.out.printf("키: %.1fcm\n", height);
        System.out.printf("혈액형: %c형\n", bloodType);
        System.out.printf("학생 여부: %s\n", isStudent ? "예" : "아니오");
        System.out.printf("주소: %s\n", address);
    }
}