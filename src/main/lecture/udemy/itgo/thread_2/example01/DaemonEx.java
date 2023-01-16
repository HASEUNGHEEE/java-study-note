package lecture.udemy.itgo.thread_2.example01;

public class DaemonEx {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();

        // Daemon 설정 (반드시 start() 호출 전에 설정해야 한다.)
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        /*
        메인 스레드가 5초 동안 정지하면, Daemon 스레드인 autoSaveThread 가 실행되고,
        메인 스레드가 종료되면 더 이상 autoSaveThread 는 실행되지 않는다. (종속적 관계)
         */
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("메인 스레드가 종료되었습니다.");
    }
}
