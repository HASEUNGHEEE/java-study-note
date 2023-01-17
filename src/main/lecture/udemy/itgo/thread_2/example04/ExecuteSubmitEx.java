package lecture.udemy.itgo.thread_2.example04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteSubmitEx {
    public static void main(String[] args) {
        // 최대 2개의 스레드를 가지는 스레드풀 생성하기
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 20; i++) {
            // 20개의 작업 객체 만들기
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    /*
                    newFixedThreadPool(), newCachedThreadPool()은 내부적으로 ThreadPoolExecutor로
                    만들어졌기 때문에 강제 타입변환이 가능하다.
                     */
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

                    // 현재 스레드 풀에 있는 스레드 개수를 리턴해준다.
                    int poolSize = threadPoolExecutor.getPoolSize();

                    // 작업 실행 스레드명 얻기
                    String threadName = Thread.currentThread().getName();
                    System.out.println("[총 스레드 수 : " + poolSize + "] " + "작업스레드 이름 : " + threadName);

                    // execute()과 submit() 차이 파악하기 위해 일부러 예외 발생시키기 (NumberFormatException)
                    Integer.parseInt("삼");
                }
            };

            /*
            작업 큐에 runnable 객체를 넣는 행위
            execute()는 작업 처리 도중에 예외가 발생하면 해당 스레드를 스레드풀에서 제거하고, 새로운 스레드를 생성한다.
            submit()은 예외가 발생해도 해당 스레드를 스레드풀에서 제거하지 않고, 재사용한다. 따라서 submit()을 사용하는 것이 좋다.
             */
            executorService.submit(runnable);
            // executorService.execute(runnable);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // 스레드 풀 종료(단, 작업큐에 있는 모든 작업을 마무리 한 후에 종료시킨다.)
        executorService.shutdown();
    }
}
