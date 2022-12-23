package lecture.udemy.itgo.array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] original = new int[] {10, 77, 33, 50};
        int[] target = new int[10];
        int count = 0;

        System.out.println("복사하기 전");
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(target));

        // for문을 이용해서 직접 복사하는 방법
        for (int i : original) {
            target[count++] = i; // 후위 증감이므로 실행 후 증가됨
        }

        // System.arraycopy 메서드의 복사 속도가 가장 빠르다.
        System.arraycopy(original, 0, target, 5, original.length);

        System.out.println("복사한 후");
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(target));

        // Arrays 의 copyOf 메서드는 완전 동일하게 복사하는 배열 복사 메서드이다.
       target = Arrays.copyOf(original, original.length);

        System.out.println("복사한 후");
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(target));
    }
}
