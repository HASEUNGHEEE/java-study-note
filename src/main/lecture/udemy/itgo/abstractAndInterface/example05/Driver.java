package lecture.udemy.itgo.abstractAndInterface.example05;

// 독립 클래스
public class Driver {
    /*
    [인터페이스 매개변수의 다형성]
    매개변수로 new Taxi()나 new Bus()만 들어올 수 있다.
    이 2개의 클래스가 Vehicle 인터페이스를 구현했기 때문에
     */
    public void drive(Vehicle vehicle) {
        vehicle.run();
        // System.out.println(vehicle); // 주소 출력
    }

    public void stop(Vehicle vehicle) {
        vehicle.stop();
    }

    /*
    리턴타입, 매개변수 타입이 전부 Vehicle 인터페이스인 메서드
    -> 리턴타입도 구현 클래스가 와야 하며, 매개변수 타입도 구현 클래스가 와야 한다.
     */
    public Vehicle getNewCar(Vehicle vehicle) {
        if (vehicle instanceof Taxi) {
            System.out.println("새 택시");
            Taxi taxi = (Taxi) vehicle;
            return taxi;
        } else if (vehicle instanceof Bus) {
            System.out.println("새 버스");
            Bus bus = (Bus) vehicle;
            return bus;
        }
        return null;
    }
}
