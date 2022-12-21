package lecture.udemy.itgo.conditional;

public class MethodEx {
    /*
    메서드 = 선언부 + 구현부(정의부)
    메서드 선언부 구성
    1. 리턴타입(반환값) : int
    2. 메서드명
    3. () : 매개변수, 인자값, Arguments
     */
    public static int add(int x, int y, int z) {
        System.out.println("add 메서드 호출됨");
        return x + y + z;
    }

    public static int minus(int x, int y) {
        System.out.println("minus 메서드 호출됨");
        return x - y;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        // 값에 의한 복사(Call by Value)
        int result = add(num1, num2, 100);
        System.out.println("num1 + num2 + 100 : " + result);

        // 값에 의한 복사(Call by Value)
        result = minus(num1, num2);
        System.out.println("num1 - num2 : " + result);
    }
}
