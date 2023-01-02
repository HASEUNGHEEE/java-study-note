package lecture.udemy.itgo.method.example02;

public class Calculator {
    /*
    인스턴스 메서드
    -> new 연산자로 인스턴스를 생성해야지만 참조변수명.인스턴스메서드명으로 접근 가능하다.
     */
    public int add(int x, int y) {
        return x + y;
    }

    // 인스턴스 메서드
    public int subtract(int x, int y) {
        return x - y;
    }

    /*
    static(정적) 메서드
    -> 인스턴스 생성 없이 클래스명.정적메서드명으로 바로 접근 가능하다.
     */
    public static long multiply(long x, long y) {
        return x * y;
    }

    // static(정적) 메서드
    public static double divide(double x, double y) {
        return x / y;
    }
}
