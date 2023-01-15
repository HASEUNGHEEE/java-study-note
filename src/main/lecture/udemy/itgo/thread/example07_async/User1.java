package lecture.udemy.itgo.thread.example07_async;

public class User1 extends Thread {
    // 공유객체 선언
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        this.setName("User-1"); // 스레드 이름 지정
    }

    @Override
    public void run() {
        // 공유객체의 필드인 memory 값을 100으로 변경
        this.calculator.setMemory(100);
        System.out.println("User1 스레드가 출력한 값 : " + this.calculator.getMemory());
    }
}
