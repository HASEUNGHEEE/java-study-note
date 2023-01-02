package lecture.udemy.itgo.method.example04;

class Data {
    int data;
}
public class ReferenceReturnClass {
    public static void main(String[] args) {
        Data original = new Data();
        original.data = 100;
        System.out.println(original);
        Data cloned = copy(original);
        System.out.println(cloned);
        System.out.println(cloned.data); // 100
    }

    public static Data copy(Data d) {
        System.out.println(d);

        Data cloned = new Data();
        cloned.data = d.data;
        System.out.println(cloned);

        return cloned; // Data 클래스의 주소를 리턴 값으로 넘기고 있다.
    }
}
