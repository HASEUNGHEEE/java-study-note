package lecture.udemy.itgo.operator;

public class DenyEx {
    public static void main(String[] args) {
        // 논리부정연산자(!) 연습 = NOT 연산자 --> 반대값을 취하게 하는 연산자
        boolean power = false;
        System.out.println("power의 값: " + power); // 값: false

        power = !power;
        System.out.println("power의 값: " + power); // 값: true

        power = !power;
        System.out.println("power의 값: " + power); // 값: false
    }
}
