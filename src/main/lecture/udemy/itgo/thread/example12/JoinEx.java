package lecture.udemy.itgo.thread.example12;

public class JoinEx {
    public static void main(String[] args) {
        double avg = 0.0;
        long total = 0L;
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
            /*
            메인 스레드는 sumThread 가 끝날 때까지 기다린다.
            sumThread 가 완료가 된 후 아래 코드를 실행한다.
             */
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        total = sumThread.getSum();
        avg = total / 10000.0;

        System.out.println("1부터 10000까지의 합 : " + total);
        System.out.println("1부터 10000까지의 합의 평균 : " + avg);
    }
}
