package lecture.udemy.itgo.nested.example02;

public class A {

    public A() {
        System.out.println("--------------------------");
        System.out.println("외부 클래스 A의 생성자 호출");
        B b = new B(); // 이게 왜 가능할까? 인스턴스 멤버 클래스는 외부 클래스 A의 멤버이기 때문에 선언 가능!

        System.out.println(b.a);
        b.method1();

        C c = new C();
        System.out.println(c.a);
        System.out.println(C.c);
        c.method1();
        C.method2();

        // D d = new D(); // 메서드 내부에 선언되어 있기 때문에 접근할 수 없다.
        this.method(); // 여기서 this 는 class A를 의미한다.
        System.out.println("--------------------------");
    }

    // 인스턴스 멤버 클래스 B
    class B {
        int a = 10;
        public B() {
            System.out.println("중첩 클래스 B의 생성자 호출");
        }
        public void method1() {
            System.out.println("중첩 클래스 B의 멤버 베서드 호출");
        }
    }

    // 정적 멤버 클래스 C
    static class C {
        int a = 10;
        static int c = 20;
        public C() {
            System.out.println("정적 멤버 클래스 C의 생성자 호출");
        }
        public void method1() {
            System.out.println("정적 멤버 클래스 C의 메서드1 호출");
        }
        static void method2() {
            System.out.println("정적 멤버 클래스 C의 정적 메서드2 호출");
        }
    }

    public void method() {
        // 로컬 클래스 안에는 절대로 static 멤버가 올 수 없다.
        class D {
            int a = 1000;
            public D() {
                System.out.println("로컬 클래스 D의 생성자 호출");
            }
            public void localMethod() {
                System.out.println(this.a); // 여기서 this 는 class D를 의미한다.
                System.out.println("로컬 클래스 D의 멤버 메서드 호출");
            }
        }
        // 로컬 클래스는 메서드 내부에서만 생성 및 사용이 가능하다.
        D d = new D();
        d.localMethod();
    }
}
