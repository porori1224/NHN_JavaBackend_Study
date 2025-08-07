import java.awt.Cursor;
import java.util.ArrayList;

public class StudentManagement {
    static class Course {
        String name;
        int credits;

        // TODO: Course 생성자를 작성하세요
        public Course(String name, int credits) {
            this.name = name;
            this.credits = credits;
        }
    }

    static class Student {
        String name;
        int id;
        ArrayList<Course> courses;
        ArrayList<Double> grades;

        // TODO: Student 생성자를 작성하세요
        // courses와 grades는 새 ArrayList로 초기화
        public Student(String name, int id) {
            this.name = name;
            this.id = id;
            this.courses = new ArrayList<>();
            this.grades = new ArrayList<>();
        }

        // TODO: 과목 등록 메서드를 작성하세요
        // 메서드명: enrollCourse, 매개변수: Course course, double grade
        public void enrollCourse(Course course, double grade) {
            courses.add(course);
            grades.add(grade);
        }

        // TODO: GPA 계산 메서드를 작성하세요
        // 메서드명: calculateGPA
        // 가중평균: (성적 × 학점)의 합 / 전체 학점의 합
        public double calculateGPA() {
            double totalPoints = 0;
            int totalCredits = 0;
            for (int i = 0; i < courses.size(); i++) {
                totalPoints += grades.get(i) * courses.get(i).credits;
                totalCredits += courses.get(i).credits;
            }
            return totalCredits == 0 ? 0.0 : totalPoints / totalCredits;
        }

        // TODO: 성적표 출력 메서드를 작성하세요
        // 메서드명: printTranscript
        // 학생 정보, 각 과목의 성적, 평균 학점을 출력
        public void printTranscript() {
            System.out.printf("=== 성적표: %s (ID: %d) ===%n", name, id);
            for (int i = 0; i < courses.size(); i++) {
                Course c = courses.get(i);
                System.out.printf("%s (%d학점): %.1f%n", c.name, c.credits, grades.get(i));
            }
            System.out.printf("평균 학점: %.2f%n%n", calculateGPA());
        }

    }

    public static void main(String[] args) {
        // TODO: 학생 목록을 저장할 ArrayList를 생성하세요
        ArrayList<Student> students = new ArrayList<>();

        // TODO: 학생들을 생성하세요
        Student student1 = new Student("김철수", 20210001);
        Student student2 = new Student("이영희", 20210002);

        // TODO: 학생1에게 다음 과목들을 등록하세요
        // "자바 프로그래밍", 3학점, 4.0
        // "자료구조", 3학점, 3.5
        // "데이터베이스", 3학점, 4.5
        student1.enrollCourse(new Course("자바 프로그래밍", 3), 4.0);
        student1.enrollCourse(new Course("자료구조", 3), 3.5);
        student1.enrollCourse(new Course("데이터베이스", 3), 4.5);


        // TODO: 학생2에게 다음 과목들을 등록하세요
        // "자바 프로그래밍", 3학점, 4.5
        // "웹 프로그래밍", 3학점, 4.0
        // "알고리즘", 3학점, 3.0
        student2.enrollCourse(new Course("자바 프로그래밍", 3), 4.5);
        student2.enrollCourse(new Course("웹 프로그래밍", 3), 4.0);
        student2.enrollCourse(new Course("알고리즘", 3), 3.0);

        // TODO: 학생들을 목록에 추가하세요
        students.add(student1);
        students.add(student2);

        // TODO: 모든 학생의 성적표를 출력하세요
        for (Student student : students) {
            student.printTranscript();
        }

        // TODO: 평균 GPA가 3.5 이상인 학생을 찾아서 출력하세요
        System.out.println("\n=== 우수 학생 (GPA 3.5 이상) ===");
        for (Student student : students) {
            double gpa = student.calculateGPA();
            if (gpa >= 3.5) {
                System.out.printf("%s: %.2f\n", student.name, gpa);
            }
        }
    }
}