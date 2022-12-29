package lecture.udemy.itgo.lang패키지.String클래스;

public class SplitEx {
    public static void main(String[] args) {
        String str1 = "60계치킨,교촌치킨/쌀통닭&BHC,BBQ";

        /*
        split()
        - 매개변수로 정규표현식(regex)이 온다.
        - 정규표현식으로 구분되어진 String[]을 리턴한다.
         */
        String[] strArr = str1.split(",|/|&");
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
