package lecture.udemy.itgo.lang패키지.String클래스;

public class SubstringEx {
    public static void main(String[] args) {
        String phoneNum = "01023456789";

        // substring() : 문자열을 잘라내어 String 으로 반환
        String str1 = phoneNum.substring(3);
        System.out.println(str1); // 23456789

        // 마지막 인덱스(3)는 미포함 -> 인덱스 0부터 2까지 잘림
        String str2 = phoneNum.substring(0, 3);
        System.out.println(str2); // 010

        System.out.println(phoneNum.hashCode()); // -1453470637
        System.out.println(str1.hashCode()); // 798544132
        System.out.println(str2.hashCode()); // 47695
    }
}
