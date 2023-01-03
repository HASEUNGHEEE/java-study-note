package lecture.udemy.itgo.constructor.example02;

public class Car {
    String color; // 색상
    String gearType; // 변속기 종류
    int door;

    // 기본 생성자
    public Car() {
        /*
        직접적으로 인스턴스 멤버변수를 초기화

        this.color = "노랑";
        this.gearType = "수동";
        this.door = 4;
         */

        // 같은 클래스 내에 있는 다른 생성자 호출
        this("검정", "수동", 4);
    }

    // this : 참조변수와 같은 역할, 매개변수와 멤버변수를 구분하는데 사용
    public Car(String color, String gearType, int door) {
        this.color = color;
        // color = color;
        // this 가 없다면 변수의 모호성으로 인해 초기화가 이루어지지 않고, null 이 출력된다.
        this.gearType = gearType;
        this.door = door;
    }

    // 인스턴스 복제를 위한 생성자
    public Car(Car car) {
        this.color = car.color;
        this.gearType = car.gearType;
        this.door = car.door;
    }

    @Override
    public String toString() {
        return this.color + ", " + this.gearType + ", " + this.door;
    }
}
