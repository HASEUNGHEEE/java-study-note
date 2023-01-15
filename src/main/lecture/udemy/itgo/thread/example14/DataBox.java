package lecture.udemy.itgo.thread.example14;

// 공유객체
public class DataBox {
    private String data;

    public synchronized String getData() {
        // 읽어올 데이터가 없다면...
        if (this.data == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String returnValue = this.data;
        System.out.println("ConsumerThread 가 읽은 데이터 : " + this.data);
        this.data = null;
        notify();
        return returnValue;
    }

    public synchronized void setData(String data) {
        // Consumer 스레드가 아직 데이터를 소비하지 않았다면...
        if (this.data != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.data = data;
        System.out.println("ProducerThread 가 생성한 데이터 : " + this.data);
        notify();
    }
}
