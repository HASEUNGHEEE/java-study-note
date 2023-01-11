package lecture.udemy.itgo.generic.example01;

public class Person {
    private Object object;

    public Person() {

    }

    // 리턴 타입이 Object -> [다형성] 모든 클래스를 다 리턴 타입으로 하겠다.
    public Object getObject() {
        return object;
    }

    // 매개변수가 Object -> [다형성] 모든 클래스를 다 매개변수로 하겠다.
    public void setObject(Object object) {
        this.object = object;
    }
}
