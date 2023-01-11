package lecture.udemy.itgo.generic.example04;

public class Util {

    /*
    <T>는 제네릭 타입 메서드를 지칭하며, 리턴 타입과 매개변수 타입을
    동일하게 <T> 타입으로 가져가야 한다.
     */

    // 외부로부터 T 타입을 받아서, Person<T> 라는 제네릭 클래스의 인스턴스를 생성하고 리턴
    public static<T> Person<T> change(T t) {
        Person<T> person = new Person<>();
        person.setT(t);
        return person;
    }
}
