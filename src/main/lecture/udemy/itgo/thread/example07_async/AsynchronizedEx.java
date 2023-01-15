package lecture.udemy.itgo.thread.example07_async;

public class AsynchronizedEx {
    public static void main(String[] args) {
        // 공유객체 생성
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();

        // 동기화 메서드 처리를 하지 않았기 때문에 데이터 신뢰성을 보장할 수 없다.
        /*
        System.out.println(calculator.getMemory());
        System.out.println(calculator.getMemory());
        System.out.println(calculator.getMemory());
        System.out.println(calculator.getMemory());
         */
    }
}
