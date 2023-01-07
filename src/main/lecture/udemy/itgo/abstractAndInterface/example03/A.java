package lecture.udemy.itgo.abstractAndInterface.example03;

// 인터페이스의 본질은 추상 메서드, static final은 부수적인 개념
public interface A {
    int MAX = 10;
    void method();
    /*
     static final, public abstract 생략 가능하다.
     컴파일 시, 컴파일러가 자동적으로 추가해 준다.
     */
}
