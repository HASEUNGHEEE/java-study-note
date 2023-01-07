package lecture.udemy.itgo.abstractAndInterface.example05;

public class VehicleEx {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        bus.setSpeed(-50);
        bus.setSpeed(80);
        // 직접 만들어서 참조변수(주소)를 넘기는 방법
        driver.drive(bus);
        driver.stop(bus);

        System.out.println();

        taxi.setSpeed(-70);
        taxi.setSpeed(120);
        // 직접 만들어서 참조변수(주소)를 넘기는 방법
        driver.drive(taxi);
        driver.stop(taxi);

        System.out.println();

        // 직접 매개변수를 생성하여 넘기는 방법
        driver.drive(new Taxi());
        driver.drive(new Bus());

        // AICar 는 Vehicle 인터페이스를 구현하지 않았기 때문에 컴파일 예외 발생
        // driver.drive(new AICar());

        System.out.println();

        Vehicle vehicle = driver.getNewCar(new Taxi());
        vehicle.run();
        vehicle.stop();

        System.out.println();

        vehicle = driver.getNewCar(new Bus());
        vehicle.run();
        vehicle.stop();
    }
}
