package lecture.udemy.itgo.lang패키지.Object클래스.example03;

public class ProductEx {
    public static void main(String[] args) {
        Product original = new Product("123", "TV", 300, new int[] {10, 20});
        Product cloned = original.getProduct(); // 얕은 복제를 한 객체를 리턴

        int[] clonedArr = cloned.getArr();
        int[] originalArr = original.getArr();
        // 주소를 공유하므로 복제객체와 원본객체의 주소는 같다.
        System.out.println("배열 주소(원본객체) : " + originalArr);
        System.out.println("배열 주소(복제객체) : " + clonedArr);
        clonedArr[0] = 777;

        System.out.println(original);
        System.out.println();
        System.out.println(cloned);
    }
}
