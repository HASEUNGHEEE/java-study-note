package lecture.udemy.itgo.유용한클래스.Arrays클래스;

import java.util.Arrays;
import java.util.Objects;

class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return this.model;
    }
}
public class ArrayEqualsDeepEqualsEx {
    public static void main(String[] args) {
        int[] ori = new int[] {1, 2};
        int[] cloned = Arrays.copyOf(ori, ori.length);

        // 얕은 비교(1차원 배열은 값까지 비교)
        System.out.println(Arrays.equals(ori, cloned)); // true
        System.out.println(Objects.equals(ori, cloned)); // false (주소가 다르기 때문)
        System.out.println(ori); // [I@7a79be86
        System.out.println(cloned); // [I@34ce8af7

        System.out.println("---------------------------");

        Car[] c1 = new Car[2];
        c1[0] = new Car("그랜저");
        c1[1] = new Car("제네시스");

        Car[] c2 = Arrays.copyOf(c1, c1.length);
        // 얕은 비교(1차원 배열은 값까지 비교)
        System.out.println(Arrays.equals(c1, c2)); // true
        System.out.println(Objects.equals(c1, c2)); // false (주소가 다르기 때문)
        System.out.println(c1); // [Llecture.udemy.itgo.유용한클래스.Arrays클래스.Car;@880ec60
        System.out.println(c2); // [Llecture.udemy.itgo.유용한클래스.Arrays클래스.Car;@3f3afe78

        System.out.println("---------------------------");

        // 2차원 배열 생성
        int[][] original = new int[][] { {1, 2}, {3, 4} };

        // 얕은 복사
        int[][] cloned1 = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.equals(original, cloned1)); // true (주소값을 공유하기 때문)
        System.out.println("original[0] : " + original[0]); // [I@6b2fad11
        System.out.println("cloned1[0] : " + cloned1[0]); // [I@6b2fad11
        System.out.println(Arrays.deepEquals(original, cloned1)); // true
        System.out.println(original); // [[I@7f63425a
        System.out.println(cloned1); // [[I@36d64342

        /*
        System.out.println(Objects.equals(original, cloned1)); // false (주소가 다르기 때문)
         */

        System.out.println("---------------------------");

        cloned1[0][0] = 10;
        System.out.println(original[0][0]); // 1에서 10으로 변경됨
        System.out.println(cloned1[0][0]); // 1에서 10으로 변경됨
        System.out.println(Arrays.deepEquals(original, cloned1)); // true

        System.out.println("---------------------------");

        // 깊은 복사
        int[][] cloned2 = Arrays.copyOf(original, original.length);
        cloned2[0] = Arrays.copyOf(original[0], original[0].length);
        cloned2[1] = Arrays.copyOf(original[1], original[1].length);
        System.out.println(Arrays.equals(original, cloned2)); // false
        System.out.println("original[0] : " + original[0]); // [I@6b2fad11
        System.out.println("cloned2[0] : " + cloned2[0]); // [I@2ed94a8b
        System.out.println(Arrays.deepEquals(original, cloned2)); // true (값을 그대로 복사했기 때문)
        System.out.println(original); // [[I@79698539
        System.out.println(cloned2); // [[I@38082d64

        System.out.println("---------------------------");

        cloned2[0][0] = 50;
        System.out.println(Arrays.equals(original, cloned2)); // false
        System.out.println(Arrays.deepEquals(original, cloned2)); // false
        System.out.println("original[0][0] : " + original[0][0]); // 10
        System.out.println("cloned2[0][0] : " + cloned2[0][0]); // 50
    }
}
