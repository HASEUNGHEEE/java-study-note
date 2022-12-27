package lecture.udemy.itgo.lang패키지.Object클래스.example04;

public class ProductEx {
    public static void main(String[] args) {
        Product original = new Product("123", "TV", 300, new int[] {10, 20}, new Laptop(50000));
        Product cloned = original.getProduct(); // 얕은 복제를 한 객체를 리턴

        int[] clonedArr = cloned.getArr();
        Laptop laptop = cloned.getLaptop();

        clonedArr[0] = 777;
        laptop.price = 100000;

        System.out.println(original);
        System.out.println();
        System.out.println(cloned);
    }
}
