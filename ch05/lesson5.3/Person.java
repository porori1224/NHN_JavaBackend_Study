import java.util.Objects;

/**
 * Object 클래스 메서드를 올바르게 재정의한 예제
 */
public class Person {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    // TODO 20: 생성자 구현하기
    public Person(String name, int age, String email, String phoneNumber) {
        // 모든 필드 초기화
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // TODO 21: Getter 메서드들 구현하기
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    // TODO 22: toString() 메서드 재정의하기
    @Override
    public String toString() {
        // "Person{name='이름', age=나이, email='이메일', phone='전화번호'}" 형식으로 반환
        return "Person{name='" + name + "', age=" + age +
                ", email='" + email + "', phone='" + phoneNumber + "'}";
    }

    // TODO 23: equals() 메서드 재정의하기
    @Override
    public boolean equals(Object obj) {
        // 1. this == obj인 경우 true 반환
        // 2. obj가 null이거나 다른 클래스인 경우 false 반환
        // 3. Person으로 캐스팅 후 모든 필드 비교
        // 4. 모든 필드가 같으면 true, 아니면 false 반환
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return age == other.age &&
                Objects.equals(name, other.name) &&
                Objects.equals(email, other.email) &&
                Objects.equals(phoneNumber, other.phoneNumber);
    }

    // TODO 24: hashCode() 메서드 재정의하기
    @Override
    public int hashCode() {
        // Objects.hash()를 사용하여 모든 필드를 포함한 해시코드 생성
        return Objects.hash(name, age, email, phoneNumber);
    }
}

