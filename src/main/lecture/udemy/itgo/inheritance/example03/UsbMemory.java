package lecture.udemy.itgo.inheritance.example03;

public class UsbMemory extends HddDisk {
    // 멤버변수
    int capacity;
    int rpm;

    // 생성자
    public UsbMemory() {
    }

    // 매개변수가 있는 생성자
    public UsbMemory(int capacity, int rpm) {
        this.capacity = capacity;
        this.rpm = rpm;
    }

    // 오버로딩
    public String showStatus(int i) {
        String str = "USB 용량 : " + i + "\n" +
                "USB 속도 : " + this.rpm + "(rpm)";
        return str;
    }

    // 조상 클래스의 사용자 정의 메서드를 오버라이딩
    @Override
    public String showStatus() {
        String str = "USB 용량 : " + this.capacity + "\n" +
                "USB 속도 : " + this.rpm + "(rpm)";
        return str;
    }
}
