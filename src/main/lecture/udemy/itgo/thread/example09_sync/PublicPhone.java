package lecture.udemy.itgo.thread.example09_sync;

// 공유객체
public class PublicPhone {

    // 동기화 메서드
    public synchronized void use() throws Exception {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + "이/가 공중전화 부스에 입장하였습니다.");

        Thread.sleep(1000); // 1초 멈춤
        System.out.println(threadName + " : 통화 완료!");

        System.out.println(threadName + "이/가 공중전화 사용을 마쳤습니다.");
        System.out.println();
    }

    // 비동기화 메서드
    public void knock() {
        System.out.println(Thread.currentThread().getName() + " : 똑똑!");
    }
}
