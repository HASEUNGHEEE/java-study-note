package lecture.udemy.itgo.method.example04;

class A {
    int data;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        A a = new A();
        a.data = 77;
        System.out.println("메서드 호출 전 main() 내의 값 : " + a.data); // 77
        // Call By Value(값에 의한 복사) -> 값만 읽을 수 있다.
        PrimitiveParamEx.dataChange(a.data);
        System.out.println("dataChange() 호출");
        System.out.println("메서드 호출 후 main() 내의 값 : " + a.data); // 77
    }

    public static void dataChange(int data) {
        /*
        지역변수 data 라는 값은 값 복사가 이루어졌기 때문에
        호출한 곳(main)에서는 아무런 영향을 받지 않는다.
        */
        data = 44;
        System.out.println("dataChange() 내의 값 : " + data); // 44
        return;
    }

}
