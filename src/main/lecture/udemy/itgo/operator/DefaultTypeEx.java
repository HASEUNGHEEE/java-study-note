package lecture.udemy.itgo.operator;

public class DefaultTypeEx {
    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = 1;
        char ch = 'A'; // A는 아스키 코드 값으로 65
        float f1 = 15.5f;
        double d1 = 10.5;

        // 1번째 방법 : int 형으로 받아주면 된다. -> 자동 캐스팅
        int i1 = b1 + b2; // byte + byte = int + int = int
        // 2번째 방법: 강제 캐스팅
        byte b3 = (byte) (b1 + b2);

        int i2 = ch + b2; // 65 + 1

        // 정수형 + 실수형 -> 표현 범위가 넓은 쪽으로 형변환 되어 연산이 이루어짐
        float f2 = b1 + f1; // float + float = float
        double d2 = f1 + d1; // double + double = double

        System.out.println(i1); // 값: 128
        System.out.println(b3); // 값: -128
        System.out.println(i2); // 값: 66
        System.out.println(f2); // 값: 142.5
        System.out.println(d2); // 값: 26.0


    }
}
