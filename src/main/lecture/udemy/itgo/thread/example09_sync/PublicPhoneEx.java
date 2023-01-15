package lecture.udemy.itgo.thread.example09_sync;

public class PublicPhoneEx {
    public static void main(String[] args) {

        PublicPhone publicPhone = new PublicPhone();
        Thread thread1 = new UsingThread(publicPhone, "김연아");
        Thread thread2 = new UsingThread(publicPhone, "손흥민");
        Thread thread3 = new UsingThread(publicPhone, "장미란");
        Thread thread4 = new UsingThread(publicPhone, "이강인");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
