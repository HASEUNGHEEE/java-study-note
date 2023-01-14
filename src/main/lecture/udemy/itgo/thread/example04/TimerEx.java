package lecture.udemy.itgo.thread.example04;

import javax.swing.JOptionPane;

public class TimerEx {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new TimerThread();
        thread.start();

        String input = JOptionPane.showInputDialog("10초 안에 값을 입력하세요.");
        if (input != null) {
            System.out.println("입력 값 : " + input);
            System.exit(0);
        } else {
            Thread.sleep(10000); // 10초를 대기한다.
            System.out.println("입력하지 못했습니다.");
            System.exit(0);
        }
    }
}
