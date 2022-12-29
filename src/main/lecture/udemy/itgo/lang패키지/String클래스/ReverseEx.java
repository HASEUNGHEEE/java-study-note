package lecture.udemy.itgo.lang패키지.String클래스;

public class ReverseEx {
    public static void main(String[] args) {
        String str = "안녕하세요";
        String reverse = "";
        int count = 0;

        // StringBuilder, StringBuffer 사용 버전
        String reversedString = reverseString(str);
        System.out.println("reverseString() 호출 후 : " + reversedString);

        // 하드코딩 버전, 메모리 낭비 심하다
        count = str.length();
        System.out.println("문자열 길이 : " + count);

        for (int i = 0; i < count; i++) {
            reverse += str.charAt(count - (i+1));
            System.out.println(reverse);
            System.out.println(reverse.hashCode());
        }
        System.out.println("역순 출력 : " + reverse);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
