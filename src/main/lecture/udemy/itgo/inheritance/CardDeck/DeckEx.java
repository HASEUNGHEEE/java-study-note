package lecture.udemy.itgo.inheritance.CardDeck;

public class DeckEx {
    public static void main(String[] args) {
        // Deck 의 생성자를 호출하면, 항상 포함된 클래스부터 먼저 생성한다.
        Deck deck = new Deck();
        Card card = deck.pick(51);

        System.out.println("카드 섞기 전에 제일 밑에 있는 카드 : ");
        System.out.println(card.toString());

        deck.shuffle();

        card = deck.pick(51);

        System.out.println("카드 섞은 후에 제일 밑에 있는 카드 : ");
        System.out.println(card.toString());

        card = deck.pick();
        System.out.println(card.toString());
    }
}
