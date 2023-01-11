package lecture.udemy.itgo.exception.example02;

public class TryCatchFinallyEx {
    public static void main(String[] args) {
        // Class 클래스는 문자열을 클래스로 만들어서 반환을 해준다. (동적 객체)
        // 인스턴스의 정보만 알 수 있고 멤버를 사용할 수는 없다.
        try {
            // Class class1 = Class.forName("java.lang.String");
            Class class1 = Class.forName("java.lang.String2"); // ClassNotFoundException 발생
            System.out.println("클래스를 찾았습니다.");
            System.out.println(class1.getName()); // 패키지 + 클래스명 출력
            System.out.println(class1.getSimpleName()); // 클래스명만출력
        } catch (ClassNotFoundException e) {
            System.out.println("해당 클래스가 없습니다.");
        } finally { // option(항상 실행)
            System.out.println("프로그램을 안전하게 종료합니다.");
        }
    }
}
