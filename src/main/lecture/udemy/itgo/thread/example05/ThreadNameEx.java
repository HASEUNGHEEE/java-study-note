package lecture.udemy.itgo.thread.example05;

public class ThreadNameEx {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("[프로그램 시작 스레드명] : " + thread.getName());

        Thread threadA = new ThreadA();
        System.out.println("[ThreadA를 생성한 스레드명] : " + Thread.currentThread().getName());
        System.out.println("[main 스레드가 가져온 threadA의 이름] : " + threadA.getName());
        threadA.start();

        Thread threadB = new ThreadB();
        System.out.println("[ThreadB를 생성한 스레드명] : " + Thread.currentThread().getName());
        System.out.println("[main 스레드가 가져온 threadB의 이름] : " + threadB.getName());
        threadB.start();

        // 위의 코드들은 메인 스레드가 2개의 스레드를 생성해서 start() 시켜주는 것
        // 비로소 threadA와 threadB의 실행이 독립적으로 이루어진다.
    }
}
