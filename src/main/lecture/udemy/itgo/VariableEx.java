package lecture.udemy.itgo;

public class VariableEx {
    public static void main(String[] args) {
        /*
        오버플로우, 캐스팅
         */
        byte b1 = 127;
        // byte b2 = b1 + 2; // 오버플로우
        byte b2 = (byte)(b1 + 2); // 강제캐스팅 -> 값: -127
        System.out.println(b1);
        System.out.println("강제캐스팅 후 :" + b2);

        int i1 = b1; // 자동캐스팅(형변환 코드 생략 가능) -> 값: 127
        System.out.println("자동캐스팅 후 :" + i1);

        byte b3 = 127;
        int i2 = 400;
        b3 = (byte)i2; // 큰 바이트 -> 작은 바이트 (데이터 손실 일어난다) -> 값: -112
        System.out.println(b3);

        /*
        정수와 실수간의 캐스팅
        : 저장하는 방식이 다르기 때문에 반드시 데이터 손실이 있고, 명시적 캐스팅 코드 작성해야 함
         */
        int i3 = 100;
        float f1 = i3;
        System.out.println("정수 -> 실수 :" + f1); // 값: 100.0

        float f2 = 10.55f;
        int i4 = (int)f2;
        System.out.println("실수 -> 정수 :" + i4); // 값: 10

        char ch = 'a';
        int i5 = ch;
        System.out.println("문자 -> 정수 :" + i5); // 값: 97(아스키코드 값 출력)

        // anytype + 문자열 타입 -> 문자열 타입
        int i6 = 100;
        String str = "java" + i6;
        System.out.println(str);
    }
}
