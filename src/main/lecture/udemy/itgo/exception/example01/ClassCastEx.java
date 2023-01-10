package lecture.udemy.itgo.exception.example01;

class A {}
class B extends A {}
class C extends A {}

interface I {}
class D implements I {}
class E implements I {}

public class ClassCastEx {
    public static void main(String[] args) {
        // 조상 클래스(A)의 참조 변수(a)가 참조하고 있는 인스턴스의 타입은? -> B
        A a = new B();
        B b = (B) a; // 조상 -> 자손 : 다운 캐스팅
        System.out.println("실행 완료");

        A a1 = new B();
        C c = (C) a1; // ClassCastException 발생
        System.out.println("실행 완료");

        // 인터페이스(I)의 참조 변수(i)가 참조하고 있는 인스턴스의 타입은? -> D
        I i = new D();
        D D = (D) i;
        System.out.println("실행 완료");

        I i2 = new D();
        E e = (E) i2; // ClassCastException 발생, 맞는 타입에 캐스팅을 해야 한다.
        System.out.println("실행 완료");
    }
}
