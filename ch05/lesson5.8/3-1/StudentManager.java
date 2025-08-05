import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * 학생 관리 시스템
 */
public class StudentManager {
    private List<Student> students = new ArrayList<>();

    static class Student {
        String name;
        int age;
        double gpa;

        Student(String name, int age, double gpa) {
            // TODO 64: name, age, gpa 초기화하기
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            // TODO 65: "name (나이: age, 학점: gpa)" 형식으로 반환하기
            return String.format("%s (나이: %d, 학점: %.2f)", name, age, gpa);
        }
    }

    public void addStudent(String name, int age, double gpa) {
        // TODO 66: 새 Student 객체 생성하여 students에 추가하기
        students.add(new Student(name, age, gpa));
    }

    // 다양한 정렬 방법
    public void sortByName() {
        // TODO 67: 익명 클래스로 Comparator 구현하여 이름순 정렬하기
        // s1.name.compareTo(s2.name) 사용
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
    }

    public void sortByAge() {
        // TODO 68: 익명 클래스로 Comparator 구현하여 나이순 정렬하기
        // Integer.compare(s1.age, s2.age) 사용
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        });
    }

    public void sortByGPA() {
        // TODO 69: 익명 클래스로 Comparator 구현하여 학점 내림차순 정렬하기
        // Double.compare(s2.gpa, s1.gpa) 사용 (내림차순)
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.gpa, s1.gpa);
            }
        });
    }

    // 필터링
    public List<Student> filterStudents(Predicate<Student> condition) {
        // TODO 70: 조건에 맞는 학생만 필터링하기
        // 새 리스트 생성
        // condition.test()로 각 학생 검사
        // 조건에 맞으면 리스트에 추가
        List<Student> filtered = new ArrayList<>();
        for (Student s : students) {
            if (condition.test(s)) {
                filtered.add(s);
            }
        }
        return filtered;
    }

    public void printStudents(String title) {
        // TODO 71: 학생 리스트 출력하기
        // "=== title ===" 출력
        // 모든 학생 출력
        System.out.println("=== " + title + " ===");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void printStudents(String title, List<Student> list) {
        System.out.println("=== " + title + " ===");
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println();
    }
}

// 테스트
class StudentTest {
    public static void main(String[] args) {
        // TODO 72: StudentManager 생성하고 학생 4명 추가하기
        // 김철수(22, 3.8), 이영희(21, 4.2)
        // 박민수(23, 3.5), 최지우(20, 4.0)
        StudentManager manager = new StudentManager();
        manager.addStudent("김철수", 22, 3.8);
        manager.addStudent("이영희", 21, 4.2);
        manager.addStudent("박민수", 23, 3.5);
        manager.addStudent("최지우", 20, 4.0);

        // TODO 73: 원본 학생 리스트 출력하기
        manager.printStudents("원본");

        // TODO 74: 이름순으로 정렬하고 출력하기
        manager.sortByName();
        manager.printStudents("이름순 정렬");

        // TODO 75: 학점순으로 정렬하고 출력하기
        manager.sortByGPA();
        manager.printStudents("학점순 정렬");

        // TODO 76: 익명 클래스로 GPA 4.0 이상 학생 필터링하기
        // Predicate<StudentManager.Student> 구현
        List<StudentManager.Student> highGpaStudents = manager.filterStudents(new Predicate<StudentManager.Student>() {
            @Override
            public boolean test(StudentManager.Student s) {
                return s.gpa >= 4.0;
            }
        });

        // TODO 77: 필터링 결과 출력하기
        manager.printStudents("학점 4.0 이상", highGpaStudents);

        // TODO 78: 람다 표현식으로 21세 이하 학생 필터링하기
        // s -> s.age <= 21
        List<StudentManager.Student> youngStudents = manager.filterStudents(s -> s.age <= 21);
        // TODO 79: 필터링 결과 출력하기
        manager.printStudents("21세 이하", youngStudents);
    }
}
