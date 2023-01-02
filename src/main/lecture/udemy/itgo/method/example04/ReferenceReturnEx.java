package lecture.udemy.itgo.method.example04;

import java.util.Arrays;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        int[] original = new int[] {10, 20, 30, 40, 50}; // 원본 배열
        int[] cloned; // 타겟 배열

        cloned = copy(original);
        System.out.println("original[] 값 : " + Arrays.toString(original));
        System.out.println("cloned[] 값 : " + Arrays.toString(cloned));

    }

    // 리턴타입이 참조타입으로 온 경우
    public static int[] copy(int[] arr) {
        int[] temp = new int[5];
        // System.arraycopy(arr, 0, temp, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
}
