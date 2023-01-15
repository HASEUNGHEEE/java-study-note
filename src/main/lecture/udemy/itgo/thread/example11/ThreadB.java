package lecture.udemy.itgo.thread.example11;

public class ThreadB extends Thread {
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        while (!stop) {
            if (work) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("ThreadB 작업 내용");
            } else {
                // 무의미한 반복을 막기 위해 다른 스레드에게 양보함
                Thread.yield();
            }
        }
        System.out.println("ThreadB 종료");
    }
}
