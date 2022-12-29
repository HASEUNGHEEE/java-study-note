package lecture.udemy.itgo.lang패키지.String클래스;

public class ValueOfEx {
    public static void main(String[] args) {
        String str1 = String.valueOf(true);
        System.out.println(str1);

        // valueOf() : GUI 프로그래밍에서 자주 등장
        String str2 = String.valueOf(777.888);
        System.out.println(str2);
    }
}
