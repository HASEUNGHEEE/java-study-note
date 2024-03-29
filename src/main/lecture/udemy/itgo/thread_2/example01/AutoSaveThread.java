package lecture.udemy.itgo.thread_2.example01;

public class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장합니다.");
    }

    @Override
    public void run() {
        // 1초 단위로 save() 메서드 호출함
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.save();
        }
    }
}
