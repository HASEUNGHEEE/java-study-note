package lecture.udemy.itgo.generic.example06;

public class Compare {
    /*
    [상위 타입을 제한]
    Number(추상클래스) 타입이거나 Number 클래스를 상속받는 자손 클래스만 매개변수 T 타입으로 들어올 수 있다.
     */
    public static <T extends Number> int compare(T t1, T t2) {
        /*
        Number 클래스의 doubleValue()는 원래 추상메서드이지만,
        자손 클래스 (Integer, Double 등)가 doubleValue()를 오버라이딩 했기 때문에
        문제가 되지 않는다.
         */
        double value1 = t1.doubleValue();
        double value2 = t2.doubleValue();

        return Double.compare(value1, value2);
    }
}
