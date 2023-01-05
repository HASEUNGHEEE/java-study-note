package lecture.udemy.itgo.polymorphism.example02;

// 자손 클래스
public class Defender extends Player {
    private int defend;

    public Defender(String name, int age, int backNumber, int speed, int defend) {
        super(name, age, backNumber, speed); // Player 의 생성자
        this.defend = defend;
    }

    public int getDefend() {
        return this.defend;
    }

    @Override
    public void info() {
        super.info(); // Player 의 info 를 호출
        System.out.println("수비 횟수 : " + this.getDefend());
    }
}
