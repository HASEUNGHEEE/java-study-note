package lecture.udemy.itgo.lang패키지.String클래스;

public class ReplaceEx {
    public static void main(String[] args) {
        // replace() : 문자열 대체하는 메서드
        String oldStr = "자바는 객체지향언어입니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(newStr);
        System.out.println(oldStr.hashCode()); // -1316178731
        System.out.println(newStr.hashCode()); // -692849805
    }
}
