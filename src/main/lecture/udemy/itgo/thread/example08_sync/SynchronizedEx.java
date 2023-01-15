package lecture.udemy.itgo.thread.example08_sync;

public class SynchronizedEx {
    public static void main(String[] args) {
        // 공유객체 생성
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
    }
}
