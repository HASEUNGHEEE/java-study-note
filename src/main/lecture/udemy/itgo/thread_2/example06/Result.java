package lecture.udemy.itgo.thread_2.example06;

// 공유객체
public class Result {
    private int accumValue;

    // 공유객체이기 때문에 여러 스레드가 접근할 수 있다. 데이터의 신뢰성을 위해서 반드시 동기화를 해야 한다.
    public synchronized void addValue(int value) {
        this.accumValue += value;
    }

    public synchronized int getValue() {
        return this.accumValue;
    }
}
