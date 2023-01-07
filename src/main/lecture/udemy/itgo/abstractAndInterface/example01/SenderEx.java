package lecture.udemy.itgo.abstractAndInterface.example01;

public class SenderEx {
    public static void main(String[] args) {
        // 추상 클래스이므로 절대 인스턴스를 생성할 수 없다.
        // ContentSender contentSender = new ContentSender();

        // 추상 클래스도 조상이니까 필드의 다형성 적용된다.
        ContentSender contentSender1 = new KakaoSender("카카오톡", "홍길동" ,"안녕~!");
        contentSender1.sendMessage("김연아");

        System.out.println();

        ContentSender contentSender2 = new SmsSender("SMS", "박서준", "반가워!");
        contentSender2.sendMessage("손흥민");

    }
}
