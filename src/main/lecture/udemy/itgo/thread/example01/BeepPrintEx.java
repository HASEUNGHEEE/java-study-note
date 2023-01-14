package lecture.udemy.itgo.thread.example01;

import java.awt.Toolkit;

public class BeepPrintEx {
    // main()는 JVM 이 실행한다.
    public static void main(String[] args) {
        // 현재 실행 중인 thread 명을 출력
        System.out.println(Thread.currentThread().getName()); // main

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            System.out.println("for 문을 실행하는 스레드 이름 : " +
                    Thread.currentThread().getName());
            toolkit.beep(); // 비프음 출력

            // 스레드가 너무 빨리 실행되니까 0.5초 동안 멈춘다.
            try {
                Thread.sleep(500); // 메인 스레드를 0.5초 동안 멈춘다.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("도로롱~");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        /*
        싱글 스레드이기 때문에 순차적으로 코드가 실행되어
        비프음 출력과 "도로롱" 출력이 동시 다발적으로 이루어지지 않는다.
         */
    }
}
