package lecture.udemy.itgo.operator;

public class StringEqualsEx {
    public static void main(String[] args) {
        /*
        참조형 타입의 ==, !=
        리터럴의 경우 먼저 메모리 공간(heap)에 같은 값이 있는지 확인하고,
        있다면 같은 주소 번지를 공유하고, 없다면 새로운 곳에 인스턴스를 생성한다.
        new 연산자는 값이 같든 다르든 heap 메모리 영역에 새로운 인스턴스를 생성한다. 따라서 주소가 다르다.
         */

        String str1 = "아이티고";
        String str2 = "자바";
        String str3 = "아이티고";
        String str4 = new String("아이티고");

        // 참조형 타입에서 서로 ==은 주소 비교를 한다.
        boolean result = (str1 == str2);
        System.out.println("str1 == str2 : " + result); // 값: false

        result = (str1 == str3);
        System.out.println("str1 == str3 : " + result); // 값: true

        result = (str1 == str4);
        System.out.println("str1 == str4 : " + result); // 값: false

        // String 클래스의 equals()는 주소와 상관없이 값이 같다면,
        // 무조건 true 를 리턴한다.
        result = str1.equals(str3);
        System.out.println("str1.equals(str3) : " + result); // 값: true

        result = str1.equals(str4);
        System.out.println("str1.equals(str4) : " + result); // 값: true
    }
}
