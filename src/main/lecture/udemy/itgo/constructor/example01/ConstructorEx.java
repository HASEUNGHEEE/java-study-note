package lecture.udemy.itgo.constructor.example01;

class A {
    // 컴파일러가 기본 생성자를 추가해 준다.
    int value;
}

class B {
    int value;

    public B(int value) {
        this.value = value;
    }
}

public class ConstructorEx {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(100);
        /*
        컴파일 예외를 잡는 방법
        1. B 클래스에 기본 생성자를 추가
        2. B 클래스 생성자 호출시 매개변수 값으로 int 값을 저장
         */
    }
}
