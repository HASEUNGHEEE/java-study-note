package lecture.udemy.itgo.inheritance.example04;

public class Car {
    int speed;

    public Car() {
    }

    public Car(int speed) {
        this.speed = speed;
    }

    // 메서드 앞에 final 제어자 있으면 자손 클래스에서 오버라이딩을 할 수 없다.
    public final void speedUp() {
        this.speed += 10;
        System.out.println("차가 " + this.speed + "속도로 달립니다.");
    }

    public void speedDown() {
        this.speed -= 10;
        System.out.println("차가 " + this.speed + "속도로 달립니다.");
    }

    public void stop() {
        System.out.println("차가 멈춥니다.");
    }
}
