package lecture.udemy.itgo.thread.example07_async;

// 공유객체
public class Calculator {
    private int memory;

    public int getMemory() {
        return this.memory;
    }

    // 비동기화 메서드
    public void setMemory(int memory) {
        this.memory = memory;
        System.out.println(Thread.currentThread().getName());
        // 2초간 일시 정지
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    /*
    비동기화 문제 상황
    : User-1 스레드 설정 값은 100이고, User-2 설정 값은 50이다.
    하지만 출력 결과를 보면, User-1 스레드도 User-2 스레드가 설정한 값을 출력한다.
    즉, 데이터의 신뢰성이 붕괴되었다.
    이에 따라, 동기화 처리로 객체를 잠가서 데이터의 신뢰성을 확보해야 한다.
    -> package: example08_sync
     */
}
