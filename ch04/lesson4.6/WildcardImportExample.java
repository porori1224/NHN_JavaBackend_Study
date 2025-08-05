// TODO 6: 와일드카드를 사용하여 패키지 전체 import하기

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WildcardImportExample {
    public static void main(String[] args) {
        // TODO 7: List, Set, Map 컬렉션 생성하기
        List<Integer> numbers = new ArrayList<>();
        Set<String> words = new HashSet<>();
        Map<String, Integer> scores = new HashMap<>();

        // TODO 8: 데이터 추가하기
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));
        words.add("apple");
        words.add("banana");
        scores.put("김철수", 90);
        scores.put("이영희", 85);

        // TODO 9: 결과 출력하기
        System.out.println("숫자 리스트: " + numbers);
        System.out.println("고유 단어: " + words);
        System.out.println("점수: " + scores);

        // TODO 10: File 객체로 현재 디렉토리 정보 출력하기
        File currentDir = new File(".");
        System.out.println("\n현재 디렉토리: " + currentDir.getAbsolutePath());
    }
}