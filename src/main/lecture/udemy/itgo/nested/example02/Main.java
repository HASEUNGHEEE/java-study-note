package lecture.udemy.itgo.nested.example02;

import lecture.udemy.itgo.nested.example02.A.C;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        /*
        인스턴스 멤버 클래스인 B는 반드시 외부 클래스 A의 인스턴스가 있어야 생성 가능하다.
         */
        A.B b = a.new B();
        b.method1();

        System.out.println("--------------------------");

        System.out.println(C.c);
        A.C.method2();
        /*
        정적 멤버 클래스인 C는 외부 클래스 A의 인스턴스 유무와 관계없이 접근 가능하다.
         */
        A.C c = new A.C();
        System.out.println(c.a);
        c.method1();

        System.out.println("--------------------------");

        /*
        외부 클래스의 인스턴스를 생성하면 메서드 호출을 통해
        로컬 클래스를 생성하여 사용할 수 있다.
         */
        a.method();
    }
}
