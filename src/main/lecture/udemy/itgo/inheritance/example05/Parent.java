package lecture.udemy.itgo.inheritance.example05;

// 조상 클래스
public class Parent {
    int x = 100;

    public Parent(int x) {
        System.out.println("조상 클래스의 매개변수가 있는 생성자 호출");
        this.x = x;
    }

    public void show() {
        System.out.println("조상 클래스의 show() 호출출");
    }
}
