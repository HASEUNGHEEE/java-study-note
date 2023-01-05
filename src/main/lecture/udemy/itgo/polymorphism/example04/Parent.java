package lecture.udemy.itgo.polymorphism.example04;

public class Parent {
    int x = 100;

    // 매개변수의 타입이 Object 라는 것은 어떠한 클래스라도 다 받아주겠다는 것이다.
    public void type(Object object) {
        if (object instanceof Parent) {
            Parent parent = (Parent) object; // 강제 타입캐스팅
            System.out.println("조상 클래스의 멤버 x 값 : " + parent.x);
        } else {
            System.out.println("상속 관계에 있지 않은 클래스입니다.");
        }
    }

    public void method() {
        System.out.println("조상 메서드 호출");
    }
}
