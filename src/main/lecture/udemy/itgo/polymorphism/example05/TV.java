package lecture.udemy.itgo.polymorphism.example05;

public class TV extends Product {
    // 조상 클래스의 매개변수가 있는 생성자 Product(int price) {}를 호출
    public TV() {
        super(300);
    }

    @Override
    public String toString() {
        return "TV";
    }
}
