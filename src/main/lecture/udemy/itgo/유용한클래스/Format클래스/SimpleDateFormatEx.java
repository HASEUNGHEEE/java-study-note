package lecture.udemy.itgo.유용한클래스.Format클래스;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString()); // Mon Jan 02 12:33:26 KST 2023

        SimpleDateFormat sFormat = new SimpleDateFormat("yy-MM-dd E a hh:mm:ss");
        System.out.println(sFormat.format(date)); // 23-01-02 월 오후 12:36:01

        // 요일
        sFormat = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sFormat.format(date)); // 오늘은 월요일

        // 연도 기준
        sFormat = new SimpleDateFormat("오늘은 올해의 D번째 날");
        System.out.println(sFormat.format(date)); // 오늘은 올해의 2번째 날

        // 월 기준
        sFormat = new SimpleDateFormat("오늘은 이달의 d번째 날");
        System.out.println(sFormat.format(date)); // 오늘은 이달의 2번째 날
    }
}
