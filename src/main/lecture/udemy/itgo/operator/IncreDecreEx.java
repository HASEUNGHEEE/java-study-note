package lecture.udemy.itgo.operator;

public class IncreDecreEx {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        System.out.println("-----------------");
        // 후위증가연산
        System.out.println("x = " + (x++)); // 값: 10
        System.out.println("x = " + x); // 값: 11
        // 전위증가연산
        System.out.println("y = " + (++y)); // 값: 11
        System.out.println("y = " + y); // 값: 11
        System.out.println("-----------------");

        //System.out.println("(x++) + (++y) : " + (x++) + (++y)); // 값: 1122
        System.out.println("(x++) + (++y) : " + ((x++) + (++y))); // 값: 23
    }
}
