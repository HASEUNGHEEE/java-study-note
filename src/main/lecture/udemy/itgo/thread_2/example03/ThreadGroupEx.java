package lecture.udemy.itgo.thread_2.example03;

public class ThreadGroupEx {
    public static void main(String[] args) {
        // 현재 실행되고 있는 스레드 그룹을 얻어옴
        ThreadGroup mainGroup1 = Thread.currentThread().getThreadGroup();
        String threadGroup1 = mainGroup1.getName();

        System.out.println(threadGroup1);

        // myGroup 은 main 그룹의 하위 그룹으로 만들어진다.
        ThreadGroup myGroup = new ThreadGroup("myGroup");

        WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println("[메인 스레드 그룹의 list() 메서드 호출 후 출력 내용]");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        // 메인 그룹 포함 하위 그룹까지 모든 정보가 출력됨
        mainGroup.list();
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /*
        myGroup 에 포함된 workThreadA, workThreadB 스레드에 인터럽트 요청
        -> 스레드 그룹을 사용하는 궁극적인 이유
        */
        myGroup.interrupt();
    }
}
