/**
 * this를 다른 객체에 전달하는 예제
 */
// 이벤트 리스너 인터페이스
interface ClickListener {
    void onClick(Button source);
}

// 버튼 클래스
class Button {
    private String label;
    private ClickListener listener;

    public Button(String label) {
        this.label = label;
    }

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        System.out.println(label + " 버튼이 클릭되었습니다.");
        // TODO 14: listener가 null이 아니면 onClick 호출하기
        // this를 매개변수로 전달
        if (listener != null) {
            listener.onClick(this);
        }
    }

    public String getLabel() {
        return label;
    }
}

// 애플리케이션 클래스
class Application implements ClickListener {
    private Button saveButton;
    private Button cancelButton;

    public Application() {
        // TODO 15: 버튼들 생성하기
        // saveButton: "저장"
        // cancelButton: "취소"
        saveButton = new Button("저장");
        cancelButton = new Button("취소");

        // TODO 16: 리스너 등록하기
        // this를 리스너로 등록
        this.saveButton.setClickListener(this);
        this.cancelButton.setClickListener(this);
    }

    @Override
    public void onClick(Button source) {
        // TODO 17: source가 어떤 버튼인지 확인하고 처리하기
        // saveButton: "저장 작업을 수행합니다." 출력
        // cancelButton: "작업을 취소합니다." 출력
        if (source == this.saveButton) {
            System.out.println("저장 작업을 수행합니다.");
        } else if (source == this.cancelButton) {
            System.out.println("작업을 취소합니다.");
        }
    }

    public void run() {
        // TODO 65-1: 버튼들 클릭하기
        // saveButton.click()
        // cancelButton.click()
        saveButton.click();
        cancelButton.click();
    }
}

// 테스트
public class ThisAsParameterExample {
    public static void main(String[] args) {
        // TODO 18: Application 객체 생성하고 run() 호출하기
        Application app = new Application();
        app.run();
    }
}