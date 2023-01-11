package lecture.udemy.itgo.exception.example03;

public class ThrowsEx {
    // main 메서드 선언부 끝에 throws 를 작성하면 JVM 에게 예외를 던진다.
    public static void main(String[] args) {
        // main()에서 method1()을 호출하고 있으므로 여기서 예외처리를 해야 한다.
        try {
            method1();
        } catch (Exception e) {
            System.out.println("예외 발생 : 0으로 나눌 수 없습니다.");
        }
    }

    /*
    throws 는 메서드 선언부 끝에 작성을 하고,
    호출한 곳으로 에외를 되던지며, 호출한 곳에서 예외를 반드시 처리해야 한다.
     */
    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        System.out.println(10 / 0); // 실행 예외 - ArithmeticException 발생
    }
}
