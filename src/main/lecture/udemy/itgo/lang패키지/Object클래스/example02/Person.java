package lecture.udemy.itgo.lang패키지.Object클래스.example02;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // hash 시리즈들을 동등객체를 판단하기 위해서 1차적으로 hashCode() 호출
    @Override
    public int hashCode() {
        System.out.println("hashCode()");
        // return this.name.hashCode() + this.age;
        return Objects.hash(this.name, this.age);
    }

    // 1차적으로 확인한 hashCode 같다면, 2차적으로 equals() 호출하여 값이 같은지 확인
    @Override
    public boolean equals(Object obj) {
        System.out.println("equals()");
        if (obj instanceof Person) {
            Person person = (Person) obj;
            if ((this.name.equals(person.name)) && (this.age == person.age)) {
                return true;
            }
        }
        return false;
    }

    // 객체의 주소보다 좀 더 의미있는 데이터를 출력하게끔 toString() 오버라이딩
    @Override
    public String toString() {
        return "이름 : " + this.getName() + "\n" + "나이 : " + this.getAge();
    }
}
