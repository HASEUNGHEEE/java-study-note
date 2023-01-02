package lecture.udemy.itgo.유용한클래스.StringTokenizer클래스;

import java.util.StringTokenizer;

public class SplitStringTokenizerEx {
    public static void main(String[] args) {
        String data = "baby     cat dog a b c d e f g h i j k l m n o p q r s";

        /*
        split()
        공백을 구분자로 주고 데이터가 공백을 다수 포함하고 있다면,
        공백도 하나의 토큰으로 인식한다.
         */
        long start = System.nanoTime();
        String[] result = data.split(" ");
        for (String str : result) {
            System.out.println(str);
        }
        long end = System.nanoTime();

        System.out.println("걸린 시간 : " + (end - start) + "ns");
        System.out.println("토큰 개수 : " + result.length); // 7 = 1(baby) + 4(공백) + 1(cat) + 1(dog)
        System.out.println("---------------------------");

        /*
        split()
        공백을 구분자로 주고 데이터가 공백을 다수 포함하고 있어도,
        공백을 토큰으로 인식하지 않는다.
         */
        StringTokenizer stringTokenizer = new StringTokenizer(data, " ");

        start = System.nanoTime();
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println("남은 토큰 수 : " + stringTokenizer.countTokens());
            String str = stringTokenizer.nextToken();
            System.out.println(str);
        }
        end = System.nanoTime();

        System.out.println("걸린 시간 : " + (end - start) + "ns");
    }
}
