package lecture.udemy.itgo.thread_2.example06;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByExternalObjectEx {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        System.out.println("[작업 처리 요청]");

        // 내부 클래스
        class Task implements Runnable {
            // 외부 객체의 참조를 얻기 위해서 선언
            Result result;

            // 외부 객체 참조를 얻기 위한 생성자
            public Task(Result result) {
                this.result = result;
            }

           @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 10; i++) {
                    sum += i;
                }

                // 스레드에 의해서 계산되어진 값을 공유객체인 Result 에 저장하기 위해서 addValue() 호출
               result.addValue(sum);
               System.out.println("현재 실행 스레드 이름 : " + Thread.currentThread().getName());
               System.out.println("작업한 결과 : " + result.getValue());
            }
        }

        // 공유객체 생성
        Result result = new Result();

        // 작업객체 생성
        Runnable task1 = new Task(result);
        Runnable task2 = new Task(result);

        // 작업 요청하기
        Future<Result> future1 = executorService.submit(task1, result);
        try {
            result = future1.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        Future<Result> future2 = executorService.submit(task2, result);
        try {
            result = future2.get();
            System.out.println("[작업 처리 결과] : " + result.getValue());
            System.out.println("[작업 처리 완료]");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("현재 실행 스레드 이름 : " + Thread.currentThread().getName());
        System.out.println("작업한 결과 : " + result.getValue());

        executorService.submit(task1, result);
   }
}
