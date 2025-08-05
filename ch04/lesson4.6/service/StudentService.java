// TODO 60: StudentService 클래스 만들기 (service 패키지)
package service;

// TODO 61: 필요한 import문 추가하기
import model.Student;
import java.util.*;
import java.util.stream.Collectors;

// TODO 62: StudentService 클래스에 Javadoc 주석 작성하기
/**
 * <p> 학생 정보 관리 서비스 클래스
 * <ul>
 *   <li>학생 추가</li>
 *   <li>학생 검색</li>
 *   <li>학생 전체 목록 조회</li>
 * </ul>
 */
public class StudentService {
    // TODO 63: 학생 저장용 Map 선언하기
    private Map<String, Student> studentMap;

    // TODO 64: 생성자 구현하기
    public StudentService() {
        studentMap = new HashMap<>();
    }

    // TODO 65: addStudent 메서드 구현하기
    /**
     * 학생 저장
     * @param student   저장할 학생
     * @throws IllegalArgumentException 이미 존재하는 학번일 경우
     */
    public void addStudent(Student student) {
        if (studentMap.containsKey(student.getStudentId())) {
            throw new IllegalArgumentException("이미 존재하는 학번입니다: " + student.getStudentId());
        }
        studentMap.put(student.getStudentId(), student);
    }

    // TODO 66: findStudent 메서드 구현하기
    /**
     * 학번으로 학생 검색
     * @param studentId 학번
     * @return  해당 학번의 학생 또는 null 반환
     */
    public Student findStudent(String studentId) {
        return studentMap.get(studentId);
    }

    // TODO 67: getAllStudents 메서드 구현하기
    /**
     * 전체 학생 목록 반환
     * @return  학생 리스트 반환
     */
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentMap.values());
    }

    // TODO 68: searchByName 메서드 구현하기
    /**
     * 이름으로 학생 검색
     * @param name  검색할 이름
     * @return  일치하는 학생 리스트 반환
     */
    public List<Student> searchByName(String name) {
        return studentMap.values().stream()
                .filter(s -> s.getName().contains(name))
                .collect(Collectors.toList());
    }
}