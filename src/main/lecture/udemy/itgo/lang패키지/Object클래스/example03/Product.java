package lecture.udemy.itgo.lang패키지.Object클래스.example03;

import java.awt.Point;
import java.util.Arrays;

// 클래스의 복제가 가능하게 하려면, java.lang.Cloneable 인터페이스를 구현해야 한다.
public class Product implements Cloneable{
    private String id;
    private String name;
    private int price;
    private int[] arr;

    public Product(String id, String name, int price, int[] arr) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.arr = arr;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int[] getArr() {
        return this.arr;
    }

    @Override
    public String toString() {
        return "상품 id : " + this.getId() + "\n" +
               "상품 이름 : " + this.getName() + "\n" +
                "상품 가격 : " + this.getPrice() + "\n" +
                "배열값 : " + Arrays.toString(this.arr);
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public Product getProduct() {
        Product cloned = null;
        try {
            // 얕은 복제 발생. 참조변수의 값들은 번지 공유
            cloned = (Product) this.clone(); // Object 클래스의 clone()
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
