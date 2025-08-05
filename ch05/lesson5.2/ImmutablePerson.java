/**
 * final 필드를 가진 불변 Person 클래스
 */
public class ImmutablePerson {
    // TODO 54: final 필드 선언하기
    // private final String name, socialId (String), birthYear (int)
    // private int age (변경 가능)
    private final String name;
    private final String socialId;
    private final int birthYear;
    private int age;

    // TODO 55: 생성자 구현하기
    public ImmutablePerson(String name, String socialId, int birthYear) {
        // name이 null이거나 비어있으면 "이름은 필수입니다." 예외
        // socialId가 null이거나 13자리가 아니면 "주민번호는 13자리여야 합니다." 예외
        // birthYear가 1900보다 작거나 2023보다 크면 "출생연도가 유효하지 않습니다." 예외
        // final 필드들 초기화
        // age = 2023 - birthYear로 계산
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("이름은 필수입니다.");
        }
        if (socialId == null || socialId.length() != 13) {
            throw new IllegalArgumentException("주민번호는 13자리여야 합니다.");
        }
        if (birthYear < 1900 || birthYear > 2023) {
            throw new IllegalArgumentException("출생년도가 유효하지 않습니다.");
        }

        this.name = name;
        this.socialId = socialId;
        this.birthYear = birthYear;

        age = 2023 -  birthYear;
    }

    // TODO 56: getter 메서드들 구현하기 (setter는 없음)
    public String getName() { return name; }
    public String getSocialId() { return socialId; }
    public int getBirthYear() { return birthYear; }
    public int getAge() { return age; }

    // TODO 57: age 업데이트 메서드 구현하기
    public void updateAge(int currentYear) {
        // this.age = currentYear - birthYear
        this.age = currentYear - birthYear;
    }

    // TODO 58: 새로운 객체를 반환하는 방식으로 "변경" 구현하기
    public ImmutablePerson withNewAge(int currentYear) {
        // 같은 name, socialId, birthYear로 새 객체 생성
        // 새 객체의 age를 currentYear - birthYear로 설정
        // 새 객체 반환
        ImmutablePerson newPerson = new ImmutablePerson(this.name, this.socialId, this.birthYear);
        newPerson.age = currentYear - this.birthYear;
        return newPerson;
    }

    // TODO 59: 정보 출력 메서드 구현하기
    public void displayInfo() {
        // "이름: [이름], 주민번호: [앞6자리]-*******, 출생연도: [년도], 나이: [나이]" 출력
        System.out.println("이름: " + name + ", 주민번호: " + socialId.substring(0, 6) + "-*******, 출생연도: " + birthYear + ", 나이: " + age);
    }
}