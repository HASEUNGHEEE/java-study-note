package lecture.udemy.itgo.유용한클래스.Arrays클래스;

import java.util.Arrays;

// 사용자 정의 클래스는 정렬을 하기 위해서 Comparable 인터페이스를 구현해야 한다.
class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        /*
        사전순 오름차순과 내림차순
         */
        return this.name.compareTo(o.name); // 오름차순
        // return o.name.compareTo(this.name); // 내림차순

        /*
        나이순 오름차순과 내림차순
        return this.age - o.age; // 나이순 오름차순
        return o.age - this.age; // 나이순 내림차순
         */
    }
}

public class ArraySortEx {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 18);
        Person person2 = new Person("김길동", 23);
        Person person3 = new Person("서길동", 38);
        Person person4 = new Person("이길동", 39);
        Person person5 = new Person("고길동", 8);

        Person[] people = {person1, person2, person3, person4, person5};

        Arrays.sort(people);

        /*
        반드시 sort 후 배열 검색(binarySearch)를 해야 한다.
        sort 하지 않고 배열 검색을 하면 -1을 리턴한다.
         */
        int index = Arrays.binarySearch(people, person1);
        System.out.println("person1 인스턴스가 있는 인덱스 : " + index + " 이름 : " + person1.name); // 인덱스 : 4 이름 : 홍길동

        for (Person person : people) {
            System.out.println("이름 : " + person.name + ", 나이 : " + person.age);
        }

        /*
        기본형 타입과 String 클래스는 기본적으로 오름차순 정렬이 이루어진다.
        String 클래스: Comparable<String> 인터페이스를 구현했기 때문에
         */
        int[] arr = {55, -10, -9, 0, 100};
        Arrays.sort(arr);
        System.out.println("기본형 타입 정렬 후 : " + Arrays.toString(arr)); // [-10, -9, 0, 55, 100]

        String[] names = new String[] {"손흥민", "김연아", "아리울", "제이팍"}; // [김연아, 손흥민, 아리울, 제이팍]
        Arrays.sort(names);
        System.out.printf("String형 타입 정렬 후 : " + Arrays.toString(names));
    }
}
