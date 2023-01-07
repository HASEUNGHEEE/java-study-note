package lecture.udemy.itgo.abstractAndInterface.example07;

public class Default_StaticEx {
    public static void main(String[] args) {
        MyInterface myInterface = new Person();
        myInterface.dMethod(); // 디폴트 메서드
        myInterface.method(); // 추상 메서드 오버라이당

        // '인터페이스명.정적메서드명'으로 호출
        MyInterface.sMethod(); // 정적 메서드
    }
}
