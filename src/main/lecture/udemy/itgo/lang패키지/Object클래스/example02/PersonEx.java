package lecture.udemy.itgo.lang패키지.Object클래스.example02;

import java.util.HashSet;

public class PersonEx {
    public static void main(String[] args) {
        /*
        사용자 정의 클래스에서는
        hash 시리즈들의 hashcode()와 equals()를 반드시 오버라이딩 해야
        중복저장이 되지 않는다.
         */
        HashSet hashSet = new HashSet();
        String str1 = new String("가");
        String str2 = new String("가");
        Person person1 = new Person("홍길동", 50);
        Person person2 = new Person("홍길동", 50);

        hashSet.add(str1);
        hashSet.add(str2);
        hashSet.add(person1);
        hashSet.add(person2);
        System.out.println("저장된 객체 수 : " + hashSet.size()); // 출력값: 1

        /*
        String 클래스에서는 hashCode() 오버라이딩 O
        -> 논리적 동등성으로 인해 동일한 hashCode 리턴함
        만약 Person 클래스에서 hashCode() 오버라이딩 X
        -> 다른 hashCode 리턴
         */
        System.out.println(str1.hashCode()); // 출력값: 44032
        System.out.println(str2.hashCode()); // 출력값: 44032
        System.out.println(person1.hashCode()); // 출력값: 2054798982
        System.out.println(person2.hashCode()); // 출력값: 885951223

        // 자동적으로 toString() 호출
        System.out.println(person1);
        System.out.println(person2);
    }
}
