package lecture.udemy.itgo.inheritance.example04;

public class CarEx {
    public static void main(String[] args) {
        Car car = new Car(80);
        car.speedUp();
        car.speedDown();
        car.stop();
        System.out.println();

        SportCar sportCar = new SportCar(150);
        sportCar.speedUp(); // 조상 클래스(Car)의 speedUp()을 호출
        sportCar.speedDown();
        sportCar.stop(); // 자손 클래스(SportCar)의 stop()을 호출
    }
}
