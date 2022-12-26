package lecture.udemy.itgo.object.example01;

public class FieldInit {
    // 기본형 변수
    byte byteField; // 1바이트
    short shortField; // 2바이트
    int intField; // 4바이트(디폴트 타입)
    long longField; // 8바이트

    boolean boolField; // 1바이트
    char charField; // 2바이트

    float floatField; // 4바이트
    double doubleField; // 8바이트

    // 참조형 변수
    int[] arrField; // 4바이트
    String strField; // 4바이트

    // Annotation: 컴파일러에게 강한 컴파일 요구
    @Override
    public String toString() {
        /*
        toString(): 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할 때나.
        원하는 포맷으로 멤버변수들을 출력하고자 할 때 많이 사용함.
         */
        String str = "byteField : " + byteField + " boolField : " + boolField +
                " floatField : " + floatField + " arrField : " + arrField;
        return str;
    }
}
