package lecture.udemy.itgo.유용한클래스.Arrays클래스;

import java.util.Arrays;

public class ArrayCopyEx {
    public static void main(String[] args) {
        int[] arr1 = new int[]{10, 20, 30, 40};

        // 첫 번째 배열 복사 방법(copyOf)
        int[] cloned = Arrays.copyOf(arr1, arr1.length);
        System.out.println("arr1 : " + Arrays.toString(arr1)); // [10, 20, 30, 40]
        System.out.println("cloned : " + Arrays.toString(cloned)); // [10, 20, 30, 40]
        System.out.println("---------------------------");

        // 두 번째 배열 복사 방법(copyOfRange)
        cloned = Arrays.copyOfRange(arr1, 1, 3);
        System.out.println("arr1 : " + Arrays.toString(arr1)); // [10, 20, 30, 40]
        System.out.println("cloned : " + Arrays.toString(cloned)); // [20, 30]
        System.out.println("---------------------------");

        // 세 번째 배열 복사 방법(System.arraycopy)
        System.arraycopy(arr1, 0, cloned, 0, 2);
        System.out.println("arr1 : " + Arrays.toString(arr1)); // [10, 20, 30, 40]
        System.out.println("cloned : " + Arrays.toString(cloned)); // [10, 20]
    }
}