package lecture.udemy.itgo.lang패키지.String클래스;

import javax.sound.midi.Soundbank;

public class ToLowerUpperEx {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "JAVA Programming";

        System.out.println("대문자 : " + str1.toUpperCase());
        System.out.println("소문자 : " + str1.toLowerCase());

        System.out.println(str1.equals(str2)); // false
        // equalsIgnoreCase() : 대소문자를 구별하지 않고 비교할 때 사용
        System.out.println(str1.equalsIgnoreCase(str2)); // true
    }
}
