import java.time.LocalDate;
import java.util.List;

public class ComplexRecordExample {
    // TODO: 학생 정보 레코드를 정의하세요
    // 레코드명: Student
    // 필드: String name, int id, LocalDate birthDate, List<String> courses, double gpa
    record Student(
            String name,
            int id,
            LocalDate birthDate,
            List<String> courses,
            double gpa
    ) {
        // TODO: 나이 계산 메서드를 작성하세요
        // 메서드명: age, 반환값: 현재 연도 - 생년
        public int age() {
            return 2025-birthDate.getYear();
        }

        // TODO: 수강 과목 수 메서드를 작성하세요
        // 메서드명: courseCount, courses가 null이 아니면 크기 반환, null이면 0 반환
        public int courseCount() {
            return courses != null ? courses.size() : 0;
        }
    }

    public static void main(String[] args) {
        // TODO: 학생 레코드를 생성하세요
        // 이름: "김철수", ID: 20210001, 생년월일: 2000-03-15
        // 과목: ["자바", "데이터베이스", "웹프로그래밍"], GPA: 4.2
        List<String> courseList = List.of("자바", "데이터베이스", "웹프로그래밍");

        // 학생 레코드 생성 (모든 필드 포함)
        Student student = new Student(
                "김철수",
                20210001,
                LocalDate.of(2000, 3, 15),
                courseList,
                4.2
        );


        // 정보 출력
        System.out.println("학생 정보: " + student);
        System.out.println("이름: " + student.name());
        System.out.println("나이: " + student.age() + "세");
        System.out.println("수강 과목 수: " + student.courseCount());

        // TODO: 수강 과목을 출력하세요
        // for-each 루프 사용
        System.out.println("\n수강 과목:");
        for (String course : student.courses()) {
            System.out.println("- "+course);
        }

    }
}