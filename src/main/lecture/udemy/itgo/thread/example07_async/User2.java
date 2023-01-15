package lecture.udemy.itgo.thread.example07_async;

public class User2 extends Thread {
    // 공유객체 선언
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        this.setName("User-2"); // 스레드 이름 지정
    }

    @Override
    public void run() {
        // 공유객체의 필드인 memory 값을 50으로 변경
        this.calculator.setMemory(50);
        System.out.println("User2 스레드가 출력한 값 : " + this.calculator.getMemory());
    }
}
