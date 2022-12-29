package lecture.udemy.itgo.lang패키지.기타클래스들;

public class BoxingUnBoxingEx {
    public static void main(String[] args) {
        // 박싱(Boxing) 코드 -> 객체화
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("100");
        Integer obj3 = Integer.valueOf(100);
        // 컴파일 시 new Integer(100)로 바뀐다.
        Integer obj4 = 100;

        System.out.println("박싱 후");
        System.out.println(obj1); // 100
        System.out.println(obj2); // 100
        System.out.println(obj3); // 100
        System.out.println(obj4); // 100

        // 언박싱(Unboxing) 코드 -> 기본값으로 바꾼다.
        int value1 = obj1.intValue();
        int value2 = obj2;
        int value3 = obj3;
        int value4 = obj4.intValue();

        System.out.println("언박싱 후");
        System.out.println(value1); // 100
        System.out.println(value2); // 100
        System.out.println(value3); // 100
        System.out.println(value4); // 100
    }
}
