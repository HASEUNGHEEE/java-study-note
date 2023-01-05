package lecture.udemy.itgo.polymorphism.example04;

public class ReferEx {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();

        // 멤버변수는 근본을 벗어나지 못한다.
        System.out.println(parent.x); // 100
        System.out.println(child.x); // 200

        // 멤버 메서드는 현재 참조하고 있는 인스턴스의 영향을 받는다.
        parent.method(); // 자손 메서드 호출
        child.method(); // 자손 메서드 호출

        parent.type(new Child()); // 조상 클래스의 멤버 x 값 : 100
        parent.type(new Car()); // 상속 관계에 있지 않은 클래스입니다.
    }
}
