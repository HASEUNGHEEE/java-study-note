package lecture.udemy.itgo.nested.example01;

public class Nested_Ex {
    // 인스턴스 멤버 클래스
    class A {
        int iv = 100;
        // static int cv = 200; // static 멤버 변수는 사용 불가
        /*
        modifier 'static' is only allowed in constant variable declarations
         */
        public A() {
            System.out.println("인스턴스 멤버 클래스 A 생성자 호출");
        }
        public void method1() {
            System.out.println("A 클래스의 method1() 호출");
        }
//        public static void method2() {
//            System.out.println("A 클래스의 method2() 호출");
//        }
    }

    // 정적 멤버 클래스
    static class B {
        int iv = 100;
        static int cv = 500;
        public B() {
            System.out.println("정적 멤버 클래스 B 생성자 호출");
        }
        public void method1() {
            System.out.println("B 클래스의 method1() 호출");
        }
        public static void method2() {
            System.out.println("B 클래스의 method2() 호출");
        }
    }

    // 로컬 클래스
    public void method1() {
        class C {
            int iv = 200;
            // static int cv = 700; // static 멤버 선언 불가
            public C() {
                System.out.println("로컬 클래스 C 생성자 호출");
            }
            public void localMethod1() {
                System.out.println("로컬 클래스 C의 메서드 호출");
            }
        }

        // 로컬 클래스는 해당 메서드 내에서만 사용 가능
        C c = new C();
        System.out.println(c.iv);
        c.localMethod1();
    }

    public void method2() {
        class D {
            int iv = 200;
            // static int cv = 700; // static 멤버 선언 불가
            public D() {
                System.out.println("로컬 클래스 D 생성자 호출");
            }
            public void localMethod2() {
                System.out.println("로컬 클래스 D의 메서드 호출");
            }
        }

        // 로컬 클래스는 해당 메서드 내에서만 사용 가능
        D d = new D();
        System.out.println(d.iv);
        d.localMethod2();
    }



    public static void main(String[] args) {
        Nested_Ex nested_ex = new Nested_Ex();
        // 인스턴스 멤버 클래스는 외부 클래스의 인스턴스가 반드시 있어야 생성 가능하다.
        Nested_Ex.A a = nested_ex.new A();
        System.out.println(a.iv);
        a.method1();

        System.out.println("------------------------------");
        // 정적 클래스는 외부 클래스의 인스턴스가 없어도 접근 가능하다.
        System.out.println(Nested_Ex.B.cv);
        Nested_Ex.B.method2();
        Nested_Ex.B b = new B();
        System.out.println(b.iv);
        b.method1();

        System.out.println("------------------------------");

        nested_ex.method1();
        nested_ex.method2();
    }
}
