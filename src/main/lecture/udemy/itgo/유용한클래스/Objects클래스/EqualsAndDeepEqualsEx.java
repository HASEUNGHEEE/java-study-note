package lecture.udemy.itgo.유용한클래스.Objects클래스;

import java.util.Objects;

public class EqualsAndDeepEqualsEx {
    public static void main(String[] args) {
        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);

        /*
        integer1.equals()는 Integer.java 의 equals()이다.
        -> 모든 포장클래스에는 Object 클래스의 equals()가 오버라이딩 되어 있다.
        -> 기준이 되는 객체(integer1)와 비교가 되어지는 객체(integer2)가 따로 분리 되어있는 형태.
         */
        System.out.println(integer1.equals(integer2)); // true

        /*
        Objects 의 equals()는 비교하는 두 대상만 매개변수로 주면 된다.
        -> 유지보수 혹은 개발에 용이하다.
         */
        System.out.println(Objects.equals(integer1, integer2)); // true

        Integer[] arr1 = new Integer[]{new Integer(10), new Integer(50)};
        Integer[] arr2 = new Integer[]{new Integer(10), new Integer(50)};

        // [얕은 비교] Objects.equals()는 매개변수로 참조타입이 들어오면 주소 비교
        System.out.println(Objects.equals(arr1, arr2)); // false
        // [깊은 비교] Objects.deepEquals()는 매개변수로 배열이 들어오면 항목 값까지 비교
        System.out.println(Objects.deepEquals(arr1, arr2)); // true
    }
}
