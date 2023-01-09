package lecture.udemy.itgo.nested.example04;

public class Outside {
    // 필드 선언
    String str = "Outside-field";

    // 멤버 메서드
    public void method() {
        System.out.println("Outside-method() 호출");
    }

    class Inner {
        // 필드 선언
        String str = "Inner-field";

        // 멤버 메서드
        public void method() {
            System.out.println("Outside-method() 호출");
        }

        // 멤버 메서드
        public void showInfo() {
            // Inner 클래스의 this
            System.out.println(this.str);
            this.method();

            // 외부 클래스에 접근하는 방법
            // 외부클래스명.this.외부클래스멤버이름
            System.out.println(Outside.this.str);
            Outside.this.method();
        }
    }

    public void show() {
        System.out.println("----------------------");
        // 외부 클래스 영역에서의 this 는 Outside 클래스를 말한다.
        System.out.println(this.str);
        this.method();

        System.out.println();

        /*
        외부 클래스에서 내부 클래스로 접근을 하려면 보이지 않는다.
        아래와 같이 인스턴스를 생성해서 중첩 클래스의 멤버들에게 접근하면 된다.
         */
        Inner in = new Inner();
        in.showInfo();
    }
}
