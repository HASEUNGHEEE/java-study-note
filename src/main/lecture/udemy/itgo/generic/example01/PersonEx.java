package lecture.udemy.itgo.generic.example01;

public class PersonEx {
    public static void main(String[] args) {
        // 비제네릭 코드
        Person person = new Person();
        person.setObject("홍길동"); // 업캐스팅 (String -> Object)
        String str = (String) person.getObject(); // 다운캐스팅 (Object -> String)
        System.out.println(str);
    }
}
