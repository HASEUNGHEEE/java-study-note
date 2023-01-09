package lecture.udemy.itgo.nested.example03;

public class A {
    // 인스턴스 멤버 클래스
    class B {
        public B() {
            System.out.println("인스턴스 멤버 클래스 B 생성자");
        }
    }

    // 정적 멤버 클래스
    static class C {
        public C() {
            System.out.println("정적 멤버 클래스 C 생성자");
        }
    }

    // 인스턴스 멤버(필드)
    B b = new B();
    C c = new C();

    /*
    인스턴스 멤버 메서드 method1()을 사용할 때에는
    이미 외부 클래스 A의 인스턴스가 생성되었을 때이다.
     */
    public void method1() {
        System.out.println("method1() 내");
        B b = new B();
        C c = new C();
    }

    // 정적 멤버 선언
    // static B b1 = new B(); // B 클래스는 인스턴스 멤버 클래스이기 때문에 static 붙이면 오류
    static C c1 = new C();

    public static void method2() {
        System.out.println("method2() 내");
        // B b = new B(); // 인스턴스 멤버 클래스이므로 안 된다.
        C c2 = new C(); // 정적 메서드이므로 정적 로컬 변수로 선언해도 무방하다.
    }

    /*
    결론 : 중첩 클래스에서의 인스턴스 필드나 메서드는 언제든지 생성 가능하지만,
    정적 필드나 정적 메서드는 정적 클래스에서만 생성 가능하다.
    */
}
