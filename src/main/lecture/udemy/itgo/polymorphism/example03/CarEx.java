package lecture.udemy.itgo.polymorphism.example03;

public class CarEx {
    public static void main(String[] args) {
        Car car = null;
        SportCar sportCar1 = new SportCar();
        SportCar sportCar2 = null;
        PoliceCar policeCar = new PoliceCar();

        sportCar1.speedUp();
        car = sportCar1; // 업캐스팅(자손 -> 조상), 조작할 수 있는 멤버가 줄어든다.
        // car.speedUp(); // 컴파일 예외 발생!

        // 다운캐스팅을 할 때, 반드시 명시적으로 형변환 코드를 작성해야 한다.
        sportCar2 = (SportCar) car; // 다운캐스팅(조상 -> 자손), 조작할 수 있는 멤버가 늘어난다.
        sportCar2.speedUp();

        // 아래 코드는 서로 상속관계가 아니기 때문에 형변환이 절대 이루어질 수 없다.
        // sportCar1 = (SportCar) policeCar;

    }
}
