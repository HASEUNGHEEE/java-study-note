package lecture.udemy.itgo.lang패키지.String클래스;

public class IndexOfEx {
    public static void main(String[] args) {
        // indexOf() : 찾기 기능을 할 때 자주 쓰인다.(문서 등)
        String str = "자바 좋아 공부 재밌어";
        int index = str.indexOf("공부");
        System.out.println("공부의 시작 인덱스 : " + index); // 6

        // 공부라는 문자열이 포함되어 있으면...
        if (str.indexOf("공부") != -1) {
            System.out.println("공부와 관련된 내용이군요.");
        } else {
            System.out.println("공부와 관련 없는 내용이군요.");
        }
    }
}
