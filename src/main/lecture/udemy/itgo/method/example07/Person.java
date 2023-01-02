package lecture.udemy.itgo.method.example07;

public class Person {
    /*
    불변의 정적 상수
    - 무조건 선언과 동시에 초기화가 이루어져야 한다.
    - 공용 데이터로 사용된다.
    - 클래스별로 관리된다.
     */
    static final int MAX_NUMBER = 1000;

    /*
    final 초기화 방법
    1. 선언과 동시에 초기화
    2. 생성자에서 단 한 번 초기화
     */
    final String nation = "KOREA"; // 상수 선언
    final int age;

    public Person(int age) {
        this.age = age;
    }
}
