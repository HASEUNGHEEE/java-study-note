package lecture.udemy.itgo.abstractAndInterface.example08;

public class SoundEx {
    public static void main(String[] args) {
        // 익명 구현 객체 (이름 없음)
        Soundable soundable = new Soundable() { // 타입(근본)이 인터페이스 -> 익명 구현 객체
            /*
            내부적으로 멤버들을 선언할 수 있지만,
             근본이 인터페이스이므로 외부에서 접근 불가
             */
            int a = 10;
            public void method() {
                System.out.println("익명 구현 객체 메서드");
            }

            @Override
            public void sound() {
                String str = "냄비";
                System.out.println("첫번째 익명 구현 객체 : " + str);
                System.out.println(str + "에 물을 담습니다.");
                System.out.println(str + "를 숟가락으로 칩니다.");
                this.method();
                System.out.println(this.a);
            }
        };
        soundable.sound();
    }
}
