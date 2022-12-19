package lecture.udemy.itgo.operator;

public class AssignOperatorEx {
    public static void main(String[] args) {
        /*
        복합 대입 연산자
        : 값을 누적시킬 때 많이 사용한다.
         */
        int result = 0;

        result += 10; // result = result + 10;
        System.out.println("result : " + result); // 값: 10

        result -= 5; // result = result - 5;
        System.out.println("result : " + result); // 값: 5

        result *= 5; // result = result * 5;
        System.out.println("result : " + result); // 값: 25

        result /= 5; // result = result / 5;
        System.out.println("result : " + result); // 값: 5

        result %= 5; // result = result % 5;
        System.out.println("result : " + result); // 값: 0
    }
}
