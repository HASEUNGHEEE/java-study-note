package lecture.udemy.itgo.polymorphism.example02;

// 자손 클래스
public class Striker extends Player {
    private int shoot;

    public Striker(String name, int age, int backNumber, int speed, int shoot) {
        super(name, age, backNumber, speed); // Player 의 생성자
        this.shoot = shoot;
    }

    public int getShoot() {
        return this.shoot;
    }

    @Override
    public void info() {
        super.info(); // Player 의 info 를 호출
        System.out.println("유효 슈팅 : " + this.getShoot());
    }
}
