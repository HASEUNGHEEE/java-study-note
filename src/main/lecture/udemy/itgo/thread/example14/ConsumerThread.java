package lecture.udemy.itgo.thread.example14;

public class ConsumerThread extends Thread {
    // 공유객체 선언
    private DataBox dataBox;

    public ConsumerThread(DataBox dataBox) {
        this.setName("ConsumerThread");
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            String data = this.dataBox.getData(); // 데이터를 소비
        }
    }
}
