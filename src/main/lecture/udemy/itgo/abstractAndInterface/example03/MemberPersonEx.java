package lecture.udemy.itgo.abstractAndInterface.example03;

public class MemberPersonEx {
    public static void main(String[] args) {
        Member member = new Member();
        member.method();
        member.method1();

        // 인터페이스도 일종의 조상이다. 하여 다형성 개념이 적용된다.
        A a = new Member(); // 인터페이스 필드의 다형성
        a.method();
        // a.method1(); // 근본(A)을 벗어나지 못하므로 Member 클래스의 멤버 메서드(method1)는 호출할 수 없다.

        System.out.println();

        Person person = new Person();
        person.method();
        person.method1();

        a = new Person();
        a.method();
    }
}
