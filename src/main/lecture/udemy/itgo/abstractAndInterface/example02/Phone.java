package lecture.udemy.itgo.abstractAndInterface.example02;

// 조상 클래스
public abstract class Phone {
    private int serialNum;
    private String company;
    private String owner;


    public Phone(int serialNum, String owner, String company) {
        this.serialNum = serialNum;
        this.owner = owner;
        this.company = company;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public String getOwner() {
        return owner;
    }

    public String getCompany() {
        return company;
    }

    // 추상 메서드 선언
    public abstract void turnOn();
    public abstract void turnOff();

    public void showInfo() {
        System.out.println("시리얼 넘버 : " + this.getSerialNum());
        System.out.println("제조회사 : " + this.getCompany());
        System.out.println("소유자 : " + this.getOwner());

    }
}
