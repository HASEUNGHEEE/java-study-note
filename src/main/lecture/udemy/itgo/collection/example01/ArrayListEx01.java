package lecture.udemy.itgo.collection.example01;

import java.util.ArrayList;

public class ArrayListEx01 {
    public static void main(String[] args) {
        /*
        ArrayList 는 제네릭 타입이다. 그래서 Warning 이 뜬다.
        */
        ArrayList list = new ArrayList<>(); // 기본적으로 10개의 방을 생성함.
        System.out.println("총 크기 : " + list.size()); // 저장된 객체가 하나도 없기 때문에 0을 리턴함.

        // 객체 추가하기
        list.add("111"); // boolean add(Object o) -> 순차적 추가
        list.add("222");
        list.add("333");
        list.add("222");

        list.add(333); // list.add(new Integer(333)); 과 동일

        System.out.println("총 크기 : " + list.size());
        System.out.println("ArrayList의 주소 : " + list.hashCode());
        System.out.println("ArrayList에 있는 값 : " + list);

        // 0번째 인덱스에 "333" 객체 추가하기
        list.add(0, "333");
        System.out.println("ArrayList에 있는 값 : " + list);

        /*
        객체 삭제하기
        앞에서 부터 검색하여 "333"을 삭제한다.(가까운 것 한 개만 삭제)
         */
        list.remove("333");
        System.out.println("ArrayList에 있는 값 : " + list);

        System.out.println(list.remove("333"));
        System.out.println("ArrayList에 있는 값 : " + list);

        // 저장된 객체의 index 찾아오기(없으면 -1 리턴)
        System.out.println("index = " + list.indexOf("333")); // "333"은 존재하지 않기 때문에 -1 리턴
        System.out.println("index = " + list.indexOf(333)); // 3 리턴

        // 객체 전부 삭제하기
        //list.clear();

        /*
        아래와 같이 삭제하면 객체가 남는다. 이유가 뭘까?
        인덱스 0을 삭제할 때는, i가 0이므로 0 인덱스에 있는 객체는 삭제된다.
        하지만, 그 이후에는 i 값이 증가되면서 삭제하고자 하는 인덱스를 제대로 삭제하지 못한다.
        따라서 전체 삭제를 하려면 뒤에서부터 삭제를 해야 한다.
        
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
            System.out.println("ArrayList에 있는 값 : " + list);
        }
        System.out.println("ArrayList에 있는 값 : " + list);
        */

        for (int i = list.size()-1; i >= 0; i--) {
            list.remove(i);
        }
        System.out.println("ArrayList에 있는 값 : " + list);
    }
}
