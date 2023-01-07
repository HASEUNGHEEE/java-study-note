package lecture.udemy.itgo.abstractAndInterface.example03;

// A 인터페이스를 구현한 클래스
public class Member implements A {
    @Override
    public void method() {
        System.out.println("인터페이스 A를 구현한 Member 클래스의 method() 호출");
    }

    public void method1() {
        System.out.println("Member 클래스의 method1() 호출");
    }
}
