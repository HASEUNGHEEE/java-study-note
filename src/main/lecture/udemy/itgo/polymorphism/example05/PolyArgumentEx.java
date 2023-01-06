package lecture.udemy.itgo.polymorphism.example05;

public class PolyArgumentEx {
    public static void main(String[] args) {
        // 필드의 다형성
        Product p1 = new TV();
        Product p2 = new Computer();
        Product p3 = new Audio();

        Buyer buyer = new Buyer();

        buyer.buy(new TV());
        buyer.buy(new Computer());
        buyer.buy(new Audio());
        // buyer.buy(new Apple());
        // Apple 클래스는 Product 클래스의 자손이 아닌, 독독 클래스이기 때문에 컴파일 에러 발생
        System.out.println("현재 남은 돈 : " + buyer.money + "만원입니다.");
        System.out.println("현재 보너스 포인트 : " + buyer.bonusPoint + "점입니다.");
    }

}
