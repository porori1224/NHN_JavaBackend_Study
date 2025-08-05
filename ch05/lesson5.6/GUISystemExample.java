/**
 * GUI 컴포넌트 시스템 구현
 */
// 기본 컴포넌트 클래스
abstract class Component {
    protected int x, y;
    protected int width, height;
    protected boolean visible;
    protected Component parent;

    public Component(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.visible = true;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

    public void show() {
        this.visible = true;
        redraw();
    }

    public void hide() {
        this.visible = false;
        if (parent != null) {
            parent.redraw();  // 부모에게 다시 그리기 요청
        }
    }

    public abstract void draw();

    public void redraw() {
        if (visible) {
            draw();
        }
    }
}

// 컨테이너 클래스
class Container extends Component {
    protected Component[] children;
    protected int childCount;

    public Container(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.children = new Component[10];
        this.childCount = 0;
    }

    public void add(Component child) {
        // TODO 46: 자식 컴포넌트 추가하기
        // childCount가 배열 크기보다 작으면:
        //   - children 배열에 child 추가
        //   - childCount 증가
        //   - child.setParent(this) 호출
        if (childCount < children.length) {
            children[childCount++] = child;
            child.setParent(this);
        }
    }

    @Override
    public void draw() {
        System.out.println("Container 그리기 at (" + x + ", " + y + ")");
        // TODO 47: 모든 자식 컴포넌트 그리기
        // childCount만큼 반복하면서 children[i].redraw() 호출
        for (int i = 0; i < childCount; i++) {
            children[i].draw();
        }
    }

    @Override
    public void redraw() {
        // TODO 48: super.redraw() 호출 후 부모에게 알리기
        // super.redraw() 호출
        // parent가 null이 아니면 parent.redraw() 호출
        super.redraw();
        if (parent != null) {
            parent.redraw();
        }
    }
}

// 버튼 클래스
class SimpleButton extends Component {
    private String text;

    public SimpleButton(int x, int y, int width, int height, String text) {
        super(x, y, width, height);
        this.text = text;
    }

    public SimpleButton(int x, int y, String text) {
        // TODO 49: this()를 사용하여 기본 크기(100, 30) 설정하기
        this(x, y, 100, 30, text);
    }

    @Override
    public void draw() {
        // TODO 50: "Button [[text]] at ([x], [y])" 형식으로 출력하기
        System.out.println("Button [" + text + "] at (" + x + ", " + y + ")");
    }

    public void click() {
        System.out.println(text + " 버튼 클릭!");
        highlight();
    }

    private void highlight() {
        // TODO 51: "[text] 버튼 하이라이트" 출력 후 redraw() 호출하기
        System.out.println(text + "버튼 하이라이트");
        redraw();
    }
}

// 텍스트 필드 클래스
class TextField extends Component {
    private String value;
    private String placeholder;

    public TextField(int x, int y, int width, String placeholder) {
        super(x, y, width, 25);  // 높이는 고정
        this.placeholder = placeholder;
        this.value = "";
    }

    public void setText(String value) {
        // TODO 52: value 설정하고 redraw() 호출하기
        this.value = value;
        redraw();
    }

    @Override
    public void draw() {
        // TODO 53: value가 비어있으면 placeholder, 아니면 value 표시하기
        // "TextField [[display]] at ([x], [y])" 형식으로 출력
        String display = value.isEmpty() ? placeholder : value;
        System.out.println("TextField [" + display + "] at (" + x + ", " + y + ")");
    }
}

// 테스트
public class GUISystemExample {
    public static void main(String[] args) {
        // TODO 54: GUI 컴포넌트 계층 구조 만들기
        // mainPanel: 0, 0, 800, 600
        // loginForm: 100, 100, 300, 200
        // idField: 10, 10, 200, "아이디 입력"
        // pwField: 10, 50, 200, "비밀번호 입력"
        // loginBtn: 10, 100, "로그인"
        // cancelBtn: 120, 100, "취소"
        Container mainPanel = new Container(0, 0, 800, 600);
        Container loginForm = new Container(100, 100, 300, 200);

        TextField idField = new TextField(10, 10, 200, "아이디 입력");
        TextField pwField = new TextField(10, 50, 200, "비밀로 입력");

        SimpleButton loginBtn = new SimpleButton(10, 100, "로그인");
        SimpleButton cancelBtn = new SimpleButton(120, 100, "취소");


        // TODO 55: 계층 구조 구성하기
        // loginForm에 모든 필드와 버튼 추가
        // mainPanel에 loginForm 추가
        System.out.println("=== 초기 화면 ===");
        loginForm.add(idField);
        loginForm.add(pwField);
        loginForm.add(loginBtn);
        loginForm.add(cancelBtn);

        mainPanel.add(loginForm);
        mainPanel.redraw();

        // TODO 56: 전체 화면 그리기
        System.out.println("\n=== 아이디 입력 ===");

        // TODO 57: 사용자 입력 시뮬레이션하기
        // idField에 "user123" 설정
        // loginBtn 클릭
        idField.setText("user123");

        System.out.println("\n=== 로그인 버튼 클릭 ===");
        loginBtn.click();
    }
}