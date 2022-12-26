package lecture.udemy.itgo.object.example03;

public class Monitor {
    // 멤버변수(필드)
    String color; // 모니터의 색상
    int channel; // 채널
    int volume; // 볼륨
    boolean power; // 전원 on/off 기능, default 값: false

    // 멤버 메서드
    public void power() {
        if (!this.power) {
            System.out.println("모니터가 켜졌습니다!");
        } else {
            System.out.println("모니터가 꺼졌습니다!");
        }
        this.power = !power;
    }

    public void channelUp() {
        this.channel++;
        System.out.println("현재 채널 : " + this.channel);
    }

    public void channelDown() {
        System.out.println("현재 채널 : " + (--this.channel));
    }

    public void volumeUp() {
        System.out.println("현재 볼륨 : " + (++this.volume));
    }

    public void volumeDown() {
        System.out.println("현재 볼륨 : " + (--this.volume));
    }

    @Override
    public String toString() {
        return "현재 채널 : " + this.channel + ", " + "현재 볼륨 : " + this.volume;
    }
}
