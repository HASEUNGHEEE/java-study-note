package lecture.udemy.itgo.operator;

public class BitOperatorEx {
    public static void main(String[] args) {
        // 비트 연산자: &, |, ^
        int x = 8;
        int y = 5;

        System.out.println("x를 2진수로 변환한 결과 : " + Integer.toBinaryString(x));
        System.out.println("y를 2진수로 변환한 결과 : " + Integer.toBinaryString(y));

        /*
        AND 연산은 둘 다 1일 때 1
        OR 연산은 하나라도 1이면 1
        XOR(배타적 논리합) 연산은 서로 같으면 0, 서로 다르면 1
        */
        System.out.println("x와 y를 비트 &(AND) 연산한 결과 : " + (x & y)); // 값: 0
        System.out.println("x와 y를 비트 |(OR) 연산한 결과 : " + (x | y)); // 값: 13
        System.out.println("x와 y를 배타적 논리합 ^(XOR) 연산한 결과 : " + (x ^ y)); // 값: 13
    }
}
