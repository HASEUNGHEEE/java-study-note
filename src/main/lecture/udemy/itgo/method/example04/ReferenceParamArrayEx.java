package lecture.udemy.itgo.method.example04;

public class ReferenceParamArrayEx {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        System.out.println("change() 호출 전 값 : " + arr[0]); // 10
        System.out.println("main() arr 의 주소 값 : " + arr); // [I@dfd3711
        change(arr); // 배열명은 곧 주소이다.
        System.out.println("change() 호출 후 값 : " + arr[0]); // 999
    }

    public static void change(int[] arr) {
        System.out.println("change() arr 의 주소 값 : " + arr); // [I@dfd3711
        arr[0] = 999;
        System.out.println("change() 내의 값 : " + arr[0]); // 999
        return;
    }
}
