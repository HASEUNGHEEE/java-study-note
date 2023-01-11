package lecture.udemy.itgo.exception.example02;

import java.util.Arrays;

public class MultiCatchEx {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(Arrays.toString(arr));
            arr[3] = 100; // ArrayIndexOutOfBoundsException 발생
            int result = 10 / 0; // ArithmeticException 발생
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스를 초과하였습니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램 종료");
        }

        /*
        Catch 구문에서 Exception 클래스는 항상 맨 마지막에 와야 한다.
        */
    }
}
