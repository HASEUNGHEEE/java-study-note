package lecture.udemy.itgo.method.example02;

public class MemberEx {
    public static void main(String[] args) {
        // static 멤버들이므로 인스턴스 생성 없이도 클래스명.정적멤버명으로 접근 가능!
        Member.staticMethod();
        Member.cv = 500;
        Member.staticMethod();

        // 인스턴스 멤버들을 사용하기 위해서는 반드시 new 라는 연산자가
        // 힙에 인스턴스를 만들어야 사용 가능!
        Member m = new Member();
        m.instanceMethod();
        m.iv = 999;
        m.instanceMethod();
    }
}
