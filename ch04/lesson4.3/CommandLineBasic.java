public class CommandLineBasic {
    public static void main(String[] args) {
        System.out.println("=== 명령줄 인수 처리 ===\n");

        // TODO 57: 인수 개수 확인하고 출력하기
        System.out.println("전달받은 인수 개수: " + args.length);

        // TODO 58: 인수가 없는 경우 처리하기
        if (args.length == 0) {
            System.out.println("인수가 없습니다.");
            return;
        }

        // TODO 59: 모든 인수 출력하기
        System.out.println("\n전달받은 인수:");
        for (int i = 0; i < args.length; i++) {
            System.out.print("args[" + i + "] = " + args[i]);
        }

        // TODO 60: 인수 타입 변환하기
        if (args.length >= 2) {
            try {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                System.out.println("\n첫 두 인수의 합: " + a+b);
            } catch (NumberFormatException e) {
                System.out.println("\n첫 두 인수가 숫자가 아닙니다.");
            }
        }
    }
}