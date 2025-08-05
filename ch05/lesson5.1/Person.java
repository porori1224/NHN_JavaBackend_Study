/**
 * 사람을 나타내는 기본 클래스
 */
public class Person {
    // TODO 1: 인스턴스 변수 선언하기
    // name (문자열), age (정수), email (문자열) 변수를 public으로 선언
    public String name;
    public int age;
    public String email;

    // TODO 2: 자기소개 메서드 구현하기
    public void introduce() {
        // "안녕하세요! 저는 [이름]입니다."와 "나이는 [나이]살입니다." 출력
        System.out.println("안녕하세요! 저는 " + name + "입니다. \n나이는 " + age + "살입니다.");
    }

    // TODO 3: 생일 메서드 구현하기
    public void haveBirthday() {
        // age를 1 증가시키고 "[이름]님의 생일을 축하합니다! 이제 [나이]살이 되었습니다." 출력
        age++;
        System.out.println(name + "님의 생일을 축하합니다! 이제 " + age + "살이 되었습니다.");
    }

    // TODO 4: 이메일 유효성 확인 메서드 구현하기
    public boolean hasValidEmail() {
        // email이 null이 아니고 "@"를 포함하면 true, 아니면 false 반환
        if (email.contains("@") || email != null) {
            return true;
        }
        return false;
    }
}
