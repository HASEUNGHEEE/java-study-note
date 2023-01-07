package lecture.udemy.itgo.abstractAndInterface.example02;

public class SmartPhone extends Phone {

    public SmartPhone(int serialNum, String owner, String company) {
        super(serialNum, owner, company);
    }

    @Override
    public void turnOn() {
        System.out.println("스마트폰이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트폰이 꺼졌습니다.");
    }

    // 자체 메서드드
   public void searchInternet() {
        System.out.println("네이버를 실행합니다.");
    }
}
