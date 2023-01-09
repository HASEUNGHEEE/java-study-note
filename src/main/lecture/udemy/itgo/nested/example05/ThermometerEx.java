package lecture.udemy.itgo.nested.example05;

public class ThermometerEx {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
        thermometer.setChangeable(new AnalogThermometer());
        thermometer.viewTemperature();

        thermometer = new Thermometer();
        thermometer.setChangeable(new DigitalThermometer());
        thermometer.viewTemperature();
    }
}
