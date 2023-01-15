package lecture.udemy.itgo.thread.example09_sync;

public class UsingThread extends Thread {
    private PublicPhone publicPhone;

    public UsingThread(PublicPhone publicPhone, String name) {
        this.publicPhone = publicPhone;
        this.setName(name);
    }

    @Override
    public void run() {
        try {
            this.publicPhone.knock();
            this.publicPhone.use();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
