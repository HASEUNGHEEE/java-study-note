package lecture.udemy.itgo.lang패키지.String클래스;

public class TrimEx {
    public static void main(String[] args) {
        // trim() : 좌우 공백만 제거함
        // 중간에 있는 공백은 프로그래머가 제거하는 코드를 직접 작성해야 함
        String tel1 = "      02";
        String tel2 = "-051     ";
        String tel3 = "      -2345";

        System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
    }
}
