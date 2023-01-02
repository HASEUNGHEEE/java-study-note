package lecture.udemy.itgo.method.example03;

public class CallStackEx {
    public static void main(String[] args) {
        /*
        CallStack : 후입선출(LIFO)
        Queue : 선입선출(FIFO)
         */
        System.out.println("main() 실행된다.");
        // static 은 static 만 호출할 수 있다.
        CallStackEx.first();
        System.out.println("main() 종료된다.");
    }

    public static void first() {
        System.out.println("first() 실행된다.");
        CallStackEx.second();
        System.out.println("first() 종료된다.");
    }

    public static void second() {
        System.out.println("second() 실행된다.");
        CallStackEx.third();
        System.out.println("second() 종료된다.");
    }

    public static void third() {
        System.out.println("third() 실행된다.");
        System.out.println("third() 종료된다.");
    }
}
