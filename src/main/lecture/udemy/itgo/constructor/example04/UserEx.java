package lecture.udemy.itgo.constructor.example04;

import java.util.Calendar;
import java.util.Date;

public class UserEx {
    public static void main(String[] args) {
        User user1 = User.getInstance();
        User user2 = User.getInstance();

        System.out.println("user1의 주소 : " + user1);
        System.out.println("user2의 주소 : " + user2);
        user1.add();

        // Object 클래스의 equals()는 주소 비교
        // 객체의 == 연산은 주소값 비교
        // if (user1 == user2) {
        if (user1.equals(user2)) {
            System.out.println("같은 객체입니다.");
        } else {
            System.out.println("다른 객체입니다.");
        }

        // 싱글톤 패턴을 사용하는 실제적인 예
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);

        /*
        싱글톤 패턴을 사용하는 이유
        단 하나의 인스턴스를 생성해서 서로 공유하기를 원할 때
        메모리 절약이 가능하다
        ex) 커넥션풀, 사용자 환경설정, 스레드풀, OS의 시간이나 날짜 등
         */
    }
}
