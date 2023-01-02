package lecture.udemy.itgo.method.example01;

public class Card {
    /*
    인스턴스 변수
    -> 반드시 인스턴스를 생성해야 접근 가능
    */
    private String color; // 카드의 색상
    private String company; // 카드 회사명

    /*
    static(정적, 클래스, 공유) 변수
    -> 인스턴스 생성 없이도 클래스명.static 변수명으로 접근 가능
    */
    static int width = 100; // 카드의 폭
    static int height = 50; // 카드의 높이

    /*
    getter, setter 인스턴스 메서드
    */
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
    public void show() {
        // 지역변수는 반드시 초기화를 해야 한다.
        // 메서드 안에 static 변수를 사용할 수 없다.
        String color = this.color;
        String company = this.company;
        System.out.println(color + ", " + company);
    }

    @Override
    public String toString() {
        return "card1의 색상 : " + this.getColor() + ", card1의 회사 : " + this.getCompany() +
                ", 크기 : (" + Card.height + ", " + Card.width + ")";
    }
}
