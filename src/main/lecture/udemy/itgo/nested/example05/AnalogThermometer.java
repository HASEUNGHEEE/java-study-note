package lecture.udemy.itgo.nested.example05;

public class AnalogThermometer implements Thermometer.TemperatureChangeable{
    int temperature = 100;

    @Override
    public void onChange() {
        System.out.println("아날로그 온도계입니다.");
        System.out.println(this.temperature + "도 입니다.");
    }
}
