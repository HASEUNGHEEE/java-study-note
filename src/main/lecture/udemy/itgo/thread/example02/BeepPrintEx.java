package lecture.udemy.itgo.thread.example02;

import java.awt.Toolkit;

public class BeepPrintEx {
    // main()는 JVM 이 실행한다.
    public static void main(String[] args) {
        /*
        멀티 스레드를 직접 생성하는 방법
        방법 1. 구현 객체(Runnable 인터페이스) 대입
        방법 2. 익명 구현 객체
        방법 3. 람다식(함수적 인터페이스; 인터페이스에 오직 하나의 추상 메서드만 있다)
         */

        // 방법 1. 구현 객체(Runnable 인터페이스) 대입
        Runnable runnable = new Beep(); // 구현 객체 대입
        Thread thread = new Thread(runnable);
        thread.start();

        // 방법 2. 익명 구현 객체
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    System.out.println("비프음 실행하는 스레드명 : " + Thread.currentThread().getName());
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread2.start();

        // 방법 3. 람다식(함수적 인터페이스; 인터페이스에 오직 하나의 추상 메서드만 있다)
        Thread thread3 = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                System.out.println("비프음 실행하는 스레드명 : " + Thread.currentThread().getName());
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread3.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("for 문을 실행하는 스레드 이름 : " +
                    Thread.currentThread().getName());
            System.out.println("도로롱~");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        /*
        스레드는 start()를 한번 실행하고 나면, 재실행 불가하다.
        재실행을 하고자 한다면, 아래와 같이 인스턴스를 하나 더 만들어야 한다.
         */
        thread = new Thread(runnable);
        thread.start();
    }
}
