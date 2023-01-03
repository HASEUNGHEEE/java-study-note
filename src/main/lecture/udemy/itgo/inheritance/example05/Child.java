package lecture.udemy.itgo.inheritance.example05;

public class Child extends Parent {
    int x = 20;

    public Child() {
        // super(); // 조상 클래스의 기본 생성자 호출, 생략해도 컴파일러가 자동으로 추가해 준다.
        super(80); // 조상 클래스의 매개변수가 있는 생성자 호출, 절대 생략 불가
        System.out.println("자손 클래스의 생성자 호출");
    }

    @Override
    public void show() {
        System.out.println("현재 인스턴스의 x = " + x);
        System.out.println("자손 클래스의 this.x = " + this.x);
        System.out.println("조상 클래스의 super.x = " + super.x);
    }
}
