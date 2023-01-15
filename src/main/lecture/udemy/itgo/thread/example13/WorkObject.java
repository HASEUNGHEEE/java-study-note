package lecture.udemy.itgo.thread.example13;

// 공유객체
public class WorkObject {
    public synchronized void methodA() {
        System.out.println("ThreadA의 methodA() 실행");
        notify(); // wait()에 의해 BLOCKED 된 스레드를 실행대기 상태로 깨운다.

        try {
            wait(); // 영원히 잔다. 다른 스레드에서 notify() 또는 notifyAll()을 호출하면 깨어난다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void methodB() {
        System.out.println("ThreadB의 methodA() 실행");
        notify(); // wait()에 의해 BLOCKED 된 스레드를 실행대기 상태로 깨운다.

        try {
            wait(); // 영원히 잔다. 다른 스레드에서 notify() 또는 notifyAll()을 호출하면 깨어난다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
