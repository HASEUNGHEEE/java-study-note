package lecture.udemy.itgo.abstractAndInterface.example02;

public class PhoneEx {
    public static void main(String[] args) {
        // 추상 클래스는 인스턴스를 생성할 수 없다.
        // Phone phone = new Phone();

        Phone[] phones = new Phone[10];
        phones[0] = new SmartPhone(20230106, "아리울", "APPLE");
        phones[1] = new FoldablePhone(20230123, "유재석", "SAMSUNG");

        // 근본이 Phone 이기 때문에 SmartPhone 이나 FoldablePhone 에 선언되어 있는 메서드는 사용할 수 없다.
        phones[0].turnOff();
        phones[0].showInfo();

        System.out.println("-----------------------");

        phones[1].turnOff();
        phones[1].showInfo();

        System.out.println("-----------------------");
        SmartPhone smartPhone = new SmartPhone(20230106, "아리울", "APPLE");
        smartPhone.showInfo();
        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.searchInternet();

        System.out.println("-----------------------");
        FoldablePhone foldablePhone = new FoldablePhone(20230123, "유재석", "SAMSUNG");
        foldablePhone.showInfo();
        foldablePhone.turnOff();
        foldablePhone.turnOff();
        foldablePhone.foldOn();
        foldablePhone.foldOff();
    }
}
