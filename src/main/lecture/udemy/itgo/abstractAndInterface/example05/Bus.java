package lecture.udemy.itgo.abstractAndInterface.example05;

public class Bus implements Vehicle{
    private int speed;

    @Override
    public void run() {
        System.out.println("버스가 " + this.speed + "km로 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("버스가 멈춥니다.");
    }

    @Override
    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("속도는 음수일 수 없습니다.");
            return;
        }
        this.speed = speed;
    }
}
