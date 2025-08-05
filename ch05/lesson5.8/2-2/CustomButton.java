/**
 * 간단한 GUI 버튼 클래스
 */
import java.util.ArrayList;
import java.util.List;

public class CustomButton {
    private String text;
    private boolean enabled = true;
    private List<ClickListener> listeners;

    public CustomButton(String text) {
        this.text = text;
        this.listeners = new ArrayList<>();
    }

    // 클릭 이벤트를 처리하는 내부 클래스
    public class ClickEvent {
        private long timestamp;
        private int x, y;  // 클릭 좌표

        public ClickEvent(int x, int y) {
            this.timestamp = System.currentTimeMillis();
            this.x = x;
            this.y = y;
        }

        public String getButtonText() {
            return CustomButton.this.text;
        }

        public boolean isButtonEnabled() {
            return CustomButton.this.enabled;
        }

        @Override
        public String toString() {
            return String.format("ClickEvent[button=%s, pos=(%d,%d), time=%d]",
        getButtonText(), x, y, timestamp);
        }
    }

    // 클릭 리스너 인터페이스
    public interface ClickListener {
        void onClick(ClickEvent event);
    }

    public void addClickListener(ClickListener listener) {
        listeners.add(listener);
    }

    // 버튼 클릭 시뮬레이션
    public void click(int x, int y) {
        if (!enabled) {
            System.out.println("버튼이 비활성화되어 있습니다.");
            return;
        }
        ClickEvent event = new ClickEvent(x, y);
        for (ClickListener listener : listeners) {
            listener.onClick(event);
        }
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getText() {
        return text;
    }
}

// 테스트
class ButtonTest {
    public static void main(String[] args) {
        CustomButton button = new CustomButton("확인");

        button.addClickListener(new CustomButton.ClickListener() {
            @Override
            public void onClick(CustomButton.ClickEvent event) {
                System.out.println("버튼 클릭됨: " + event);
            }
        });

        button.addClickListener(event ->
            System.out.println("람다 리스너: " + event.getButtonText() + " 클릭!")
        );

        button.click(100, 50);

        button.setEnabled(false);
        button.click(100, 50);
    }
}