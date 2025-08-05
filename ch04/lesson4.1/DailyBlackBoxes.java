import javax.sound.midi.SysexMessage;

public class DailyBlackBoxes {
    public static void main(String[] args) {
        System.out.println("=== 일상생활의 블랙박스 예제 ===");

        // TODO 1: TV 블랙박스 사용하기
        System.out.println("1. TV 사용하기:");
        // TV 객체를 생성하고 켜기, 채널 변경, 볼륨 조절, 끄기를 해보세요
        TV tv = new TV();
        tv.turnOn();
        tv.changeChannel(7);
        tv.adjustVolume(15);
        tv.turnOff();

        // TODO 2: 전자레인지 블랙박스 사용하기
        System.out.println("\n2. 전자레인지 사용하기:");
        // 전자레인지 객체를 생성하고 시간 설정, 출력 설정, 시작을 해보세요
        Microwave m = new Microwave();
        m.setTime(2, 30);
        m.setPower(70);
        m.start();

        // TODO 3: 계산기 블랙박스 사용하기
        System.out.println("\n3. 계산기 사용하기:");
        // 계산기의 add, multiply, squareRoot 메서드를 사용해보세요
        System.out.println("10 + 20 = " + Calculator.add(10, 20));
        System.out.println("5 × 8 = " +  Calculator.multiply(5, 8));
        System.out.println("√64 = " + Calculator.squareRoot(64));

    }
}

// TODO 4: TV 블랙박스 클래스 완성하기
class TV {
    private boolean isOn = false;
    private int channel = 1;
    private int volume = 10;

    public void turnOn() {
        // TODO: TV를 켜는 기능을 구현하세요
        // isOn을 true로 설정하고 "TV가 켜졌습니다." 출력
        try {
            if (!isOn) {
                isOn = true;
                System.out.println("TV가 켜졌습니다.");
            }
        } catch (Exception e) {
            System.out.println("TV가 이미 켜져있거나 켤 수 없습니다." + e.getMessage());
        }
    }

    public void turnOff() {
        // TODO: TV를 끄는 기능을 구현하세요
        try {
            if (isOn) {
                isOn = false;
                System.out.println("TV가 꺼졌습니다.");
            }
        } catch (Exception ex) {
            System.out.println("TV가 이미 꺼져 있거나 끌 수 없습니다." + ex.getMessage());
        }
    }

    public void changeChannel(int newChannel) {
        // TODO: 채널을 변경하는 기능을 구현하세요
        // TV가 켜져있을 때만 작동해야 함
        try {
            if (isOn) {
                channel = newChannel;
                System.out.println("채널 " + channel + "번으로 변경했습니다.");
            }
        } catch (Exception e) {
            System.out.println("TV의 채널을 변경할 수 없습니다. " + e.getMessage());
        }
    }

    public void adjustVolume(int newVolume) {
        // TODO: 볼륨을 조절하는 기능을 구현하세요
        try {
            if (isOn) {
                volume = newVolume;
                System.out.println("볼륨을 " + volume + "으로 조정했습니다.");
            }
        } catch (Exception e) {
            System.out.println("TV의 볼륨을 조정할 수 없습니다. " + e.getMessage());
        }
    }
}

// TODO 5: 전자레인지 블랙박스 클래스 완성하기
class Microwave {
    private int minutes = 0;
    private int seconds = 0;
    private int powerLevel = 100;

    public void setTime(int min, int sec) {
        // TODO: 시간을 설정하는 기능을 구현하세요
        minutes = min;
        seconds = sec;
        System.out.println("시간 설정: " + minutes + "분 " + seconds + "초");
    }

    public void setPower(int power) {
        // TODO: 출력을 설정하는 기능을 구현하세요
        powerLevel = power;
        System.out.println("출력 설정: " + powerLevel + "%");
    }

    public void start() {
        // TODO: 조리를 시작하는 기능을 구현하세요
        System.out.println("조리를 시작합니다... (복잡한 내부 작동은 숨겨짐)");
    }
}

// TODO 6: 계산기 블랙박스 클래스 완성하기
class Calculator {
    public static double add(double a, double b) {
        // TODO: 두 수를 더하는 기능을 구현하세요
        return a + b;
    }

    public static double multiply(double a, double b) {
        // TODO: 두 수를 곱하는 기능을 구현하세요
        return a * b;
    }

    public static double squareRoot(double number) {
        // TODO: 제곱근을 계산하는 기능을 구현하세요 (Math.sqrt 사용)
        return Math.sqrt(number);
    }

    // TODO 7: 추가 기능 구현하기
    // subtract (빼기), divide (나누기) 메서드를 추가로 구현해보세요
    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        if (a == 0 || b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return a / b;
    }
}