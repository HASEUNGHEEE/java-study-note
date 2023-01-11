package lecture.udemy.itgo.generic.example02;

public class PersonEx {
    public static void main(String[] args) {
        // Person 제네릭 클래스의 T에 String 만 들어오게 만들었다.
        // 데이터의 통일화, 타입 변환 제거, 컴파일 시 예외 발생시킴으로써 강한 타입 체크
        Person<String> person1 = new Person<>();
        person1.setT("홍길동");
        String str = person1.getT();
        System.out.println(str);

        // Person 제네릭 클래스의 T에 Integer 만 들어오게 만들었다.
        Person<Integer> person2 = new Person<>();
        // person2.setT(new Integer(100));
        person2.setT(100); // 자동 박싱 코드
        int value = person2.getT(); // 자동 언박싱 코드
        System.out.println(value);

        Person<Apple> person3 = new Person<>();
        person3.setT(new Apple());
        Apple apple = person3.getT();
        System.out.println(apple);

    }
}
