package lecture.udemy.itgo.collection.example04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListEx_Access {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        add(arrayList);
        add(linkedList);

        System.out.println("=== 접근 시간 테스트 ===");
        System.out.println("ArrayList : " + access(arrayList));
        System.out.println("LinkedList : " + access(linkedList));
    }

    public static void add(List<String> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i + "");
        }
    }

    public static long access(List<String> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }
}

/*
[결론]
지금까지 살펴본 예제들을 보면, 순차적 삽입/삭제/접근은 ArrayList 가 성능이 우수하다.
반면, 중간(비순차적)에 삽입/삭제는 LinkedList 가 확연히 빠르다는 것을 알 수 있다.
 */
