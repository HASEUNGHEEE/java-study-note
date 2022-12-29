package lecture.udemy.itgo.lang패키지.기타클래스들;

public class StringBuilderEx {
    public static void main(String[] args) {
        /*
        StringBuilder, StringBuffer 클래스는 버퍼(임시저장메모리)를 이용하기 때문에
        새로운 인스턴스가 생성되는 것이 아니라, 하나의 인스턴스를 가지고 문자열을 조작할 수 있다.
         */
        StringBuilder sBuilder = new StringBuilder("JAVA");
        // System.out.println(sBuilder.hashCode()); // 1854778591

        sBuilder.append(" Programming");
        System.out.println(sBuilder);
        // System.out.println(sBuilder.hashCode()); // 1854778591

        sBuilder.insert(4, "와");
        System.out.println(sBuilder);

        sBuilder.setCharAt(0, 'j');
        System.out.println(sBuilder);

        sBuilder.reverse();
        System.out.println(sBuilder);

        sBuilder.delete(0, 5);
        System.out.println(sBuilder);

        int length = sBuilder.length();
        System.out.println("총 문자수 : " + length);
    }
}
