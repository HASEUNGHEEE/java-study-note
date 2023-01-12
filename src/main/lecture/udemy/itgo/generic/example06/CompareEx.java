package lecture.udemy.itgo.generic.example06;

public class CompareEx {
    public static void main(String[] args) {
        int result1 = Compare.compare(100, 200); // -1
        System.out.println(result1);
        int result2 = Compare.compare(200, 200); // 0
        System.out.println(result2);
        int result3 = Compare.compare(300, 200); // 1
        System.out.println(result3);

        // String 클래스는 Number 클래스하고 아무런 관계가 없다.
        // Compare.compare("홍길동", "김길동");

        // Number 클래스는 Object 클래스의 자손이기 때문에 매개변수 타입으로 적합하지 않다.
        // Compare.compare(new Object(), new Object());

        int result = Compare.compare(new Integer(100), new Double(75.11));
        System.out.println(result);
    }
}
