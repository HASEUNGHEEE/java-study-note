package lecture.udemy.itgo.abstractAndInterface.example01;

/*
추상 클래스란?
1개 이상의 추상 메서드를 포함하는 클래스이다.
추상 메서드는 선언부만 존재하고 구현부가 없다.
따라서, 추상 클래스는 인스턴스를 절대로 생성할 수 없다.
 */
public abstract class ContentSender {
    private String title;
    private String name;

    // 생성자
    public ContentSender(String title, String name) {
        this.title = title;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    /*
    추상 메서드
    상속을 통해서 반드시 재정의(오버라이딩)가 되어야
    비로소 인스턴스를 생성할 수 있다.
     */
    public abstract void sendMessage(String content);
}
