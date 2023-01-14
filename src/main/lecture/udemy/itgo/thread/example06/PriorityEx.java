package lecture.udemy.itgo.thread.example06;

public class PriorityEx {
    public static void main(String[] args) {
        // 메인 스레드
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + "의 우선순위 : " + mainThread.getPriority()); // 5
        for (int i = 1; i <= 5; i++) {
            Thread thread = new CalcThread("Thread : " + i);
            // Thread 1, 2, 3, 4는 우선순위가 가장 낮다.
            if (i != 5) {
                thread.setPriority(Thread.MIN_PRIORITY); // 1
            } else {
                // Thread 5는 10으로 우선순위가 가장 높다.
                thread.setPriority(Thread.MAX_PRIORITY); // 10
            }
            thread.start();

            /*
            아무리 우선순위를 10으로 설정했어도,
            작업을 빨리 마치는 빈도가 높을 뿐이지 무조건 100% 먼저 끝내는 건 아니다.
            자바는 순환할당(Round-Robin) 방식을 사용하고 있기 때문에 CPU 스케줄러의 상태에 따라 결과가 달라진다.
             */
        }
    }
}
