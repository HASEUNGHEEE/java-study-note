package lecture.udemy.itgo.method.example02;

public class Member {
    int iv = 100; // 인스턴스 멤버 변수
    static int cv = 200; // static 멤버 변수

    // 인스턴스 메서드
    public void instanceMethod() {
        System.out.println("iv : " + this.iv);
        // System.out.println("cv : " + Member.cv); // 클래스명.정적변수명
    }

    public static void staticMethod() {
        // 오류 -> 언제 인스턴스가 만들어질지는 아무도 모르기 때문에
        // System.out.println("iv : " + this.iv);

        /*
        cv는 static 변수이기 때문에 인스턴스 생성없이도 접근 가능해야 한다.
        static 메서드 내에서 얼마든지 접근 가능하다.
        */
        System.out.println("cv : " + Member.cv);

    }
}
