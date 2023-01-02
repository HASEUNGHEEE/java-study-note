package lecture.udemy.itgo.유용한클래스.Calendar클래스;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneEx {
    public static void main(String[] args) {
        String[] timeZones = TimeZone.getAvailableIDs();
        for (String zoneId : timeZones) {
            System.out.println("Zone 영역 : " + zoneId);
        }

        TimeZone timeZone = TimeZone.getTimeZone("America/Santiago");
        Calendar today = Calendar.getInstance(timeZone);
        System.out.println(toString(today));
    }

    public static String toString(Calendar date) {
        int i = date.get(Calendar.AM_PM);
        String str = "";
        if (i == 0) {
            str = "AM";
        } else {
            str = "PM";
        }
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " +
                date.get(Calendar.DATE) + "일" + " " + str + " " + date.get(Calendar.HOUR) + "시 " +
                date.get(Calendar.MINUTE) + "분 " + date.get(Calendar.SECOND) + "초";
    }
}
