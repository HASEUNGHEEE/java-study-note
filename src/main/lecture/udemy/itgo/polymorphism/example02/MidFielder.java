package lecture.udemy.itgo.polymorphism.example02;

// 자손 클래스
public class MidFielder extends Player {
    private int pass;

    public MidFielder(String name, int age, int backNumber, int speed, int pass) {
        super(name, age, backNumber, speed); // Player 의 생성자
        this.pass = pass;
    }

    public int getPass() {
        return this.pass;
    }

    @Override
    public void info() {
        super.info(); // Player 의 info 를 호출
        System.out.println("패스 횟수 : " + this.getPass());
    }
}
