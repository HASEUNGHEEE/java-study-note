package lecture.udemy.itgo.abstractAndInterface.example06;

public class A {
    // B 클래스가 만들어져야 컴파일 예외가 사라진다.
    // B 클래스는 A 클래스에게 직접적인 영향을 끼친다.
    public void method(B b) {
        b.method();
    }

    // 사용하는 측
    public void method(I i) {
        i.methodB();
    }
}
