package lecture.udemy.itgo.collection.example01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx03 {
    public static void main(String[] args) {
        // Arrays.asList()는 배열(정적) 형식으로 된 컬렉션을 리턴한다.
        List<String> list1 = Arrays.asList("홍길동", "김연아", "손흥민");

        /*
        asList()는 배열 형식의 컬렉션을 리턴하기 때문에
        아래와 같이 객체를 추가, 삭제하면 java.lang.UnsupportedOperationException 발생한다.
        list1.add("개그맨");
        list1.remove(0);
         */
        System.out.println(list1);

        List<Integer> list2 = Arrays.asList(100, 200, 300);

        // 리스트 컬렉션을 가지고 배열을 직접 만들고 있다.
        Integer[] arr = list2.toArray(new Integer[0]);
        int[] arr1 = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i]; // 언박싱
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr1[0] == 100) {
                arr1[0] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
