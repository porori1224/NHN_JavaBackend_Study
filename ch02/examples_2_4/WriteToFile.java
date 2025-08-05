import textio.TextIO;

public class WriteToFile {
    public static void main(String[] args) {
        // TODO: TextIO를 사용하여 일기를 파일에 저장하는 프로그램을 만드세요
        // 힌트:
        // 1. "=== 일기장 프로그램 ===" 출력
        // 2. 날짜와 날씨를 getln()으로 입력받기
        // 3. while문으로 일기 내용을 여러 줄 입력받기 (빈 줄까지)
        // 4. TextIO.writeFile()로 파일 출력 모드로 전환
        // 5. TextIO.putln()으로 일기 내용을 파일에 출력
        // 6. TextIO.writeStandardOutput()으로 표준 출력으로 복귀

        // 여기에 코드를 작성하세요
        System.out.println("=== 일기장 프로그램 ===");

        // 2. 날짜와 날씨를 getln()으로 입력받기
        System.out.print("날짜 (예: 2024-01-15): ");
        String date = TextIO.getln();

        System.out.print("날씨: ");
        String weather = TextIO.getln();

        // 3. while문으로 일기 내용을 여러 줄 입력받기 (빈 줄까지)
        System.out.println("일기 내용을 입력하세요 (종료: 빈 줄 입력):");

        StringBuilder diaryContent = new StringBuilder();
        diaryContent.append("날짜: ").append(date).append("\n");
        diaryContent.append("날씨: ").append(weather).append("\n");
        diaryContent.append("내용:\n");

        while (true) {
            String line = TextIO.getln();
            if (line.isEmpty()) {
                break;
            }
            diaryContent.append(line).append("\n");
        }

        // 4. TextIO.writeFile()로 파일 출력 모드로 전환
        String fileName = "diary_" + date + ".txt";
        TextIO.writeFile(fileName);
        // 5. TextIO.putln()으로 일기 내용을 파일에 출력
        TextIO.putln(diaryContent.toString());

        // 6. TextIO.writeStandardOutput()으로 표준 출력으로 복귀
        TextIO.writeStandardOutput();
        System.out.println("일기가 " + fileName + " 파일에 저장되었습니다.");
    }
}