package lecture.udemy.itgo.method.example04;

public class ReferenceParamEx {
    public static void main(String[] args) {
        A a = new A();
        a.data = 77;
        System.out.println("메서드 호출 전 main() 내의 값 : " + a.data); // 77
        // Call By Reference(주소에 의한 호출) -> 값을 읽고 수정할 수 있다.
        ReferenceParamEx.dataChange(a);
        System.out.println("dataChange() 호출");
        System.out.println("메서드 호출 후 main() 내의 값 : " + a.data); // 44
    }

    // int[], double[], String 등등 -> 참조변수형태 호출
   public static void dataChange(A a) {
        /*
        a 라는 주소 값이 매개변수로 넘어왔기 때문에 주소를 공유한다.
        호출한 곳(main)에서 영향을 무조건 받는다.
        */
        a.data = 44;
        System.out.println("dataChange() 내의 값 : " + a.data); // 44
        return;
    }
}
