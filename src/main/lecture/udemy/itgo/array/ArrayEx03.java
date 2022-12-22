package lecture.udemy.itgo.array;

import java.util.Arrays;

public class ArrayEx03 {
    public static void main(String[] args) {
        // 40바이트(4 * 10)가 힙(heap)에 생성되었다.
        // arr1은 주소를 지니는 참조변수이다.
        int[] arr1 = new int[10];

        // 6바이트(2 * 3)가 힙(heap)에 생성되었다.
        char[] chArr = new char[] {'a', 'b', 'c'};

        // arr1 배열에 1~10까지의 난수 10개를 대입하고 있다.
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10) + 1;
        }

        // 배열의 값들을 출력한다.
        for (int i = 0; i < arr1.length; i++) {
            if (i == 9) {
                System.out.print(arr1[i]);
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.println();

        // Arrays 클래스는 배열을 조작하기 쉽게 만들어 놓은 유틸리티 클래스
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(chArr)); // 출력: [a, b, c]

        /*
        주소값 출력
        출력 스트림에다가 참조변수를 넣으면, 자동으로 참조변수명.toString()이 호출된다.
        형태: 타입@16진수
         */
        System.out.println(arr1); // 출력: [I@21bcffb5
        System.out.println(arr1.toString()); // 출력: [I@21bcffb5

        // char 타입은 주소를 출력하려면 toString()을 호출해야 한다.
        System.out.println(chArr); // 출력: abc
        System.out.println(chArr.toString()); // 출력: [C@380fb434
    }
}
