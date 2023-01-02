package lecture.udemy.itgo.유용한클래스.Pattern클래스;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx02 {
    public static void main(String[] args) {
        String[] data = {
                "bat", "baby", "bonus", "ca", "cb",
                "zoo", "c.", "car", "com", "disc"
        };

        // 소문자 c로 시작하는 영어 단어나 문장을 패턴으로 정의
        Pattern pattern = Pattern.compile("c[a-z]*");

        Vector<String> stringVector = new Vector<String>();

        for (String str : data) {
            Matcher matcher = pattern.matcher(str);
            // 정의한 패턴과 일치하는가?
            if (matcher.matches()) {
                System.out.println(str); // 출력
                stringVector.add(str); // 벡터에 저장
            }
        }
        System.out.println();
        System.out.println("c로 시작하는 소문자 영단어 : " + stringVector.toString());
    }
}
