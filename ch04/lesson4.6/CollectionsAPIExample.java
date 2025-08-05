// TODO 44: 필요한 import문 추가하기
import java.util.*;

public class CollectionsAPIExample {
    public static void main(String[] args) {
        // TODO 45: List API 사용하기
        List<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("포도");

        System.out.println("=== List API ===");
        System.out.println("과일 목록: " + fruits);
        System.out.println("첫 번째 과일: " + fruits.get(0));
        System.out.println("과일 개수: " + fruits.size());
        System.out.println();

        // TODO 46: Set API 사용하기
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);

        System.out.println("=== Set API ===");
        System.out.println("고유 숫자: " + numbers);
        System.out.println("3이 있나요? " + numbers.contains(3));
        System.out.println();

        // TODO 47: Map API 사용하기
        Map<String, Integer> scores = new HashMap<>();
        scores.put("김철수", 90);
        scores.put("이영희", 85);
        scores.put("박민수", 92);

        System.out.println("=== Map API ===");
        System.out.println("점수표: " + scores);
        System.out.println("김철수의 점수: " + scores.get("김철수"));
        System.out.println();

        // TODO 48: Collections 유틸리티 사용하기
        List<Integer> numList = new ArrayList<>(Arrays.asList(5, 1, 3, 1, 4));
        Collections.sort(numList);

        System.out.println("정렬된 리스트: " + numList);
        System.out.println("최대값: " + Collections.max(numList));
        System.out.println("최소값: " + Collections.min(numList));
    }
}