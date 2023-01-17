package lecture.udemy.itgo.thread_2.example05;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultEx {
    public static void main(String[] args) {
        // 해당 PC CPU 의 코어 수를 최대 스레드 수로 준다. (Ex. 듀얼코어는 2개, 쿼드코어는 4개)
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
        System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());

        // Runnable 익명 구현 객체 생성(작업 객체) -> 리턴 값 없다.
        System.out.println("[작업 처리 요청]");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 10; i++) {
                    sum += i;
                }
                System.out.println("[작업 처리 결과] : " + sum);
            }
        };

        // 작업 큐에 작업(runnable) 객체를 넣는다.
        Future<?> future = executorService.submit(runnable);

        try {
            // get()는 작업객체가 작업을 완료할 때까지 기다린다. (블로킹)
            Object object = future.get();
            String str = (String) object;
            System.out.println("[작업 처리 완료]");
            System.out.println("Future 의 get()가 리턴한 값 : " + str);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        // 스레드 풀 종료
        executorService.shutdown();
    }
}
