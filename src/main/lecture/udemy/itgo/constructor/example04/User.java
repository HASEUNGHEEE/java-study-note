package lecture.udemy.itgo.constructor.example04;

public class User {
    // 클래스 자신의 타입으로 정적 멤버 선언과 동시에 생성
    private static User singleton = new User();

    // 외부에서 new 연산자로 인스턴스를 생성하지 못하게 private 선언
    private User() {
    }

    public static void add() {
        System.out.println("add 메서드 호출");
    }

    /*
    해당 클래스의 멤버의 주소를 넘겨주기(공유하기) 위해서
    외부에서 호출할 수 있는 getter 메서드 제공
     */
    public static User getInstance() {
        return User.singleton;
    }
}
