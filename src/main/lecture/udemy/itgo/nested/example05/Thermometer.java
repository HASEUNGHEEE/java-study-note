package lecture.udemy.itgo.nested.example05;

public class Thermometer {
    // 중첩 인터페이스 선언
    interface TemperatureChangeable {
        void onChange();
    }

    TemperatureChangeable changeable;

    /*
    인터페이스 타입의 매개변수?
    -> 인터페이스 매개변수의 다형성
    -> TemperatureChangeable 인터페이스를 구현한 클래스만 들어올 수 있다.
     */
    public void setChangeable(TemperatureChangeable changeable) {
        this.changeable = changeable;
    }

    public void viewTemperature() {
        this.changeable.onChange();
    }
}
