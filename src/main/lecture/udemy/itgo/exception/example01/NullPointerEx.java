package lecture.udemy.itgo.exception.example01;

public class NullPointerEx {
    public static void main(String[] args) {
        String str = null;
        // 객체(인스턴스)가 없는데 어떻게 인스턴스에 있는 toString()을 호출하니?
        try {
            System.out.println(str.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
