package lecture.udemy.itgo.constructor.example03;

public class Product {
    static int number = 0; // 정적(static) 변수
    int countNum; // 인스턴스 변수
    int[] arr = new int[10];

    // 정적 초기화 블럭 호출은 단 한 번 실행된다.
    static {
        System.out.println("정적 초기화 블럭 호출");
    }

    // 인스턴스 초기화 블럭(정적 멤버 사용할 수 있다)
    {
        System.out.println("인스턴스 초기화 블럭 호출");
        ++number;
        this.countNum = Product.number;
        for (int i = 0 ; i < arr.length; i++) {
            this.arr[i] = (int) ((Math.random() * 10) + 1);
        }
    }

    public Product() {
        System.out.println("기본 생성자 호출");
    }
}
