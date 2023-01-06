package lecture.udemy.itgo.polymorphism.example06;

// 조상 클래스
public class Product {
    private int productID;
    private String description;
    private String maker;
    private int price;

    // 생성자
    public Product(int productID, String description, String maker, int price) {
        this.productID = productID;
        this.description = description;
        this.maker = maker;
        this.price = price;
    }

    // getter() 제공
    public int getProductID() {
        return productID;
    }

    public String getDescription() {
        return description;
    }

    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }

    // 정보 출력
    public void showInfo() {
        System.out.println("상품 ID >> " + (this.getProductID() + 1));
        System.out.println("상품 설명 >> " + this.getDescription());
        System.out.println("생산자 >> " + this.getMaker());
        System.out.println("상품 가격 >> " + this.getPrice());
    }
}
