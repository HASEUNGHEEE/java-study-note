package lecture.udemy.itgo.constructor.example03;

import java.util.Arrays;

public class ProductEx {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        System.out.println("Product.number : " + Product.number +
                ", countNum : " + product1.countNum);
        // Product.number : 3, Product.countNum : 1
        System.out.println(Arrays.toString(product1.arr));

        System.out.println("Product.number : " + Product.number +
                ", countNum : " + product2.countNum);
        // Product.number : 3, Product.countNum : 2
        System.out.println(Arrays.toString(product2.arr));

        System.out.println("Product.number : " + Product.number +
                ", countNum : " + product3.countNum);
        // Product.number : 3, Product.countNum : 3
        System.out.println(Arrays.toString(product3.arr));
    }
}
