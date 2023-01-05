package lecture.udemy.itgo.polymorphism.example01;

public class Phone {
    // 필드(멤버변수), 외부로부터의 접근을 막는다.
    protected String model;
    private String color;
    private String company;

    // 매개변수가 있는 생성자
    public Phone(String model, String color, String company) {
        this.model = model;
        this.color = color;
        this.company = company;
    }

    // getter() 제공
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        String str = "모델 : " + this.getModel() +
                ", 색상 : " + this.getColor() +
                ", 제조사 : " + this.getCompany();
        return str;
    }
}
