// TODO 69: Main 클래스 만들기
// TODO 70: 필요한 import문 추가하기
import model.Student;
import service.StudentService;

import java.time.LocalDate;
import java.util.List;

// TODO 71: Main 클래스에 Javadoc 주석 작성하기
/**
 * 학생 관리 시스템의 진입점 클래스
 * 학생 등록, 조회, 검색 기능을 테스트
 */
public class Main {
    public static void main(String[] args) {
        // TODO 72: StudentService 객체 생성하기
        StudentService service = new StudentService();

        // TODO 73: 학생들 추가하기
        service.addStudent(new Student("S001", "김철수", 20, LocalDate.of(2023, 3, 1)));
        service.addStudent(new Student("S002", "이영희", 19, LocalDate.of(2023, 3, 1)));
        service.addStudent(new Student("S003", "박민수", 21, LocalDate.of(2022, 9, 1)));

        // TODO 74: 모든 학생 출력하기
        System.out.println("=== 전체 학생 목록 ===");
        List<Student> all = service.getAllStudents();
        all.forEach(System.out::println);

        // TODO 75: 특정 학생 검색하기
        System.out.println("\n=== 학생 검색 ===");
        Student found = service.findStudent("S002");
        if (found != null) {
            System.out.println("찾은 학생: " + found);
        }

        // TODO 76: 이름으로 검색하기
        System.out.println("\n=== 이름으로 검색 ===");
        List<Student> matched = service.searchByName("김철수");
        matched.forEach(System.out::println);
    }
}