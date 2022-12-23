package lecture.udemy.itgo.array;

import java.util.Arrays;

public class StringArrayEx {
    public static void main(String[] args) {
        // 객체(클래스) 배열 -- 2차원 배열
        String[] str = new String[] {
                "안녕", "손흥민", "김연아"
        };
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        str[0] = "화이팅!";

        // 향상된 for문
        for (String str1 : str) {
            System.out.println(str1);
        }

        System.out.println(Arrays.toString(str));
        System.out.println("String 배열의 주소 : " + str.toString());
        // Object 클래스는 모든 클래스의 최고 조상
        // String 클래스는 Object 클래스의 toString() 오버라이딩(재정의)
    }
}
