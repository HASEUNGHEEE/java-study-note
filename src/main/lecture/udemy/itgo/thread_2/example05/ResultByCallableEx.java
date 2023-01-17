package lecture.udemy.itgo.thread_2.example05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableEx {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        // Callable 익명 구현 객체 생성(작업객체) -> 리턴 값 <T>타입으로 존재
        System.out.println("[작업 처리 요청]");
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 1; i <= 100000; i++) {
                    sum += i;
                }
                return sum;
            }
        };

        // 작업 큐에 작업 객체를 넣는다.
        // Future 의 제네릭 값도 T 타입으로 통일해 줘야 한다.
        System.out.println("블로킹 시작 : " + System.currentTimeMillis());
        Future<Integer> future = executorService.submit(callable);

        try {
            int value = future.get(); // 언박싱
            System.out.println("블로킹 종료 : " + System.currentTimeMillis());
            System.out.println("[작업 처리 결과] : " + value);
            System.out.println("[작업 처리 완료]");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
