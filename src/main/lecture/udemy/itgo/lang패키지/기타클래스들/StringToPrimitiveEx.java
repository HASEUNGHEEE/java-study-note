package lecture.udemy.itgo.lang패키지.기타클래스들;

public class StringToPrimitiveEx {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("100");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}
