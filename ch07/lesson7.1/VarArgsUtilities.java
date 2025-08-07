public class VarArgsUtilities {
    // TODO: 문자열 연결 메서드를 작성하세요
    // 메서드명: join
    // 매개변수: String delimiter, String... parts
    // 구분자로 문자열들을 연결하여 반환
    public static String join (String delimiter, String... parts) {
        if (parts == null || parts.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            sb.append(parts[i]);
            if (i < parts.length - 1) {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }


    // TODO: 조건을 만족하는 개수 세기 메서드를 작성하세요
    // 메서드명: countPositive
    // 매개변수: int... numbers
    // 양수의 개수를 반환
    public static int countPositive(int... numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    // TODO: 최소값과 최대값 동시에 찾기 메서드를 작성하세요
    // 메서드명: findMinMax
    // 매개변수: int... values
    // 반환값: int[] {최소값, 최대값}, 값이 없으면 null
    public static int[] findMinMax(int... values) {
        if (values == null || values.length == 0) {
            return null;
        }
        int min = values[0];
        int max = values[0];
        for (int v : values) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        return new int[]{min, max};
    }


    // TODO: 가변 인수로 배열 생성 메서드를 작성하세요
    // 메서드명: createArray
    // 매개변수: int... elements
    // 가변 인수의 복사본 배열을 반환
    public static int[] createArray(int... elements) {
        int[] copy = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            copy[i] = elements[i];
        }
        return copy;
    }


    public static void main(String[] args) {
        // join 사용
        System.out.println(join("-", "2024", "11", "15"));  // 2024-11-15
        System.out.println(join(" | ", "Home", "About", "Contact"));

        // countPositive 사용
        System.out.println("\n양수 개수: " +
                countPositive(-5, 3, 0, -2, 7, 1, -8));  // 3

        // findMinMax 사용
        int[] minMax = findMinMax(45, 12, 78, 34, 90, 23);
        if (minMax != null) {
            System.out.println("최소값: " + minMax[0]);  // 12
            System.out.println("최대값: " + minMax[1]);  // 90
        }

        // createArray 사용
        int[] myArray = createArray(10, 20, 30, 40);
        System.out.print("\n생성된 배열: ");
        for (int val : myArray) {
            System.out.print(val + " ");
        }
    }
}