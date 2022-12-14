package lecture.udemy.itgo.method.example01;

public class CardEx {
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.setColor("노랑");
        card1.setCompany("국민은행");

        System.out.println(card1);
        card1.show();

        // static 변수는 반드시 클래스명.static 변수명으로 접근해야 한다.
        Card.width = 80;
        Card.height = 150;

        Card card2 = new Card();
        card2.setColor("파랑");
        card2.setCompany("농협");

        System.out.println(card2);
    }
}
