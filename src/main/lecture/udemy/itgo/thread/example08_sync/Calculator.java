package lecture.udemy.itgo.thread.example08_sync;

// 공유객체
public class Calculator {
    private int memory;
    int value = 100;

    public int getMemory() {
        return this.memory;
    }

    // 동기화 메서드
    public synchronized void setMemory(int memory) {
        this.memory = memory;
        System.out.println(Thread.currentThread().getName());
        // 2초간 일시 정지
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.getMemory());
    }

    // 비동기화 메서드 -> 어떤 스레드라도 얼마든지 접근 가능하다.
    public void print() {
        System.out.println(Thread.currentThread().getName() + " value 값 : " +
                this.value);
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
