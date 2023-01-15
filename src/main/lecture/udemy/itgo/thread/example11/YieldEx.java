package lecture.udemy.itgo.thread.example11;

public class YieldEx {
    public static void main(String[] args) throws InterruptedException {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();

        // 2초 동안은 ThreadA, ThreadB 번갈아 가면서 작업을 한다.
        Thread.sleep(3000);

        threadA.work = false;

        Thread.sleep(3000);

        threadA.work = true;
        threadB.work = false;

        Thread.sleep(3000);

        threadA.stop = true;
        threadB.stop = true;
    }

}
