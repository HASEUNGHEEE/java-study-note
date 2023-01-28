package lecture.udemy.itgo.collection.example05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "김연아"));
        messageQueue.offer(new Message("sendKakaoTalk", "아리울"));
        messageQueue.offer(new Message("sendFaceBook", "손흥민"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            System.out.println(messageQueue.size());

            switch (message.getCommand()) {
                case "sendMail" :
                    System.out.println(message.getTo() + "에게 메일을 보냅니다.");
                    break;
                case "sendSMS" :
                    System.out.println(message.getTo() + "에게 문자를 보냅니다.");
                    break;
                case "sendKakaoTalk" :
                    System.out.println(message.getTo() + "에게 카카오톡을 보냅니다.");
                    break;
                case "sendFaceBook" :
                    System.out.println(message.getTo() + "에게 페이스북 메시지를 보냅니다.");
                    break;
            }
        }

    }
}
