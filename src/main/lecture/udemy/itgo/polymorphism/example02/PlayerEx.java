package lecture.udemy.itgo.polymorphism.example02;

public class PlayerEx {
    public static void main(String[] args) {
        // 다형성 미적용 코드
        Player player1 = new Player("이동국", 45, 2, 60);
        player1.info();

        System.out.println();

        /*
        다형성이 적용된 코드(필드의 다형성)
        하지만 근본은 벗어나지 못한다.
        참조변수 player2의 근본은 Player 이므로 Striker 클래스 내의 getShoot()에 접근할 수 없다.
         */
        Player player2 = new Striker("손흥민", 31, 7, 100, 150);
        player2.info(); //  오버라이딩 했기 때문에 가능
        /*
        메서드에서 상속관계에 있을 때 자손 클래스에서 오버라이딩 한다면
        현재 참조하고 있는 인스턴스의 메서드를 호출한다.
        따라서 Striker 클래스의 오바리이딩한 info() 호출
         */

        System.out.println();

        Player player3 = new MidFielder("이강인", 23, 18, 80, 120);
        player3.info();

        System.out.println();

        Player player4 = new Defender("김영권", 37, 8, 60, 60);
        player4.info();
    }
}
