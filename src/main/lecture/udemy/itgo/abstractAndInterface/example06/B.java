package lecture.udemy.itgo.abstractAndInterface.example06;

public class B implements I{
    public void method() {
        System.out.println("B 클래스 메서드 호출");
    }

    // I 인터페이스를 구현함으로써 A 클래스와 간접적인 관계가 된다.
    // 제공하는 측(구현 클래스)
    @Override
    public void methodB() {
        System.out.println("인터페이스 I를 구현한 B 클래스의 메서드 호출");

    }
}
