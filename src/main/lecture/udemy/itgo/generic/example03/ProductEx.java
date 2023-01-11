package lecture.udemy.itgo.generic.example03;

public class ProductEx {
    public static void main(String[] args) {
        // 멀티 타입 파라미터
        Product<Tv, String> product1 = new Product<>();
        product1.setT(new Tv(2023, 01));
        product1.setM("LG OLED 스마트 TV");

        System.out.println("나의 TV는 " + product1.getT().getYear() + "년 " +
                product1.getT().getMonth() + "월 식이며, " + product1.getM() + "이다.");

        System.out.println("--------------------------------------------------");

        Product<Car, String> product2 = new Product<>();
        product2.setT(new Car("현대", 2022, 12));
        product2.setM("제네시스");
        Car car = product2.getT();
        String str = product2.getM();

        System.out.println("나의 차는 " + car.getYear() + "년 " +
                car.getMonth() + "월에 출시된 " + car.getBrand() + "의 " + str + "이다.");
    }
}
