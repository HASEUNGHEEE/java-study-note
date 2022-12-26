package lecture.udemy.itgo.object.example02;

public class Student {
    // 멤버변수(필드)
    String name;
    int age;

    // Object 클래스의 toString() 오버라이딩(재정의)
    @Override
    public String toString() {
        /*
        this: 객체 자기자신의 주소(new 라는 연산자가 인스턴스를 생성하면 비로소 활성화)
        this 는 static 메서드나 클래스 안에 사용할 수 없다.
         */
        return "이름 : " + this.name + ", " + "나이 : " + this.age;
    }
}
