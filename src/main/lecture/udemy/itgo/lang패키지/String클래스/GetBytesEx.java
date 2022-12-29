package lecture.udemy.itgo.lang패키지.String클래스;

import java.io.UnsupportedEncodingException;

public class GetBytesEx {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "안녕하세요";

        // 인코딩: 기계가 알아보기 편하게 변환하는 과정
        byte[] bytes1 = str.getBytes("UTF-8");
        System.out.println("bytes1(UTF-8)의 길이 : " + bytes1.length); // 15

        byte[] bytes2 = str.getBytes("EUC-KR");
        System.out.println("bytes2(EUC-KR)의 길이 : " + bytes2.length); // 10

        // 디코딩: 인간이 알아보기 쉽게 변환하는 과정
        String st1 = new String(bytes1, "UTF-8");
        System.out.println("UTF-8로 디코딩한 문자열 : " + st1);

        String st2 = new String(bytes2, "EUC-KR");
        System.out.println("EUC-KR로 디코딩한 문자열 : " + st2);
    }
}
