package lecture.udemy.itgo.lang패키지.기타클래스들;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemEx03 {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        System.out.println("현재 운영체제 : " + osName);

        String userName = System.getProperty("user.name");
        System.out.println("사용자 계정 : " + userName);

        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);

        /*
        Properties 클래스는 Map 계열의 컬렉션이다.
        키(key)도 String, 값(value)도 String 이다.
         */
        Properties properties = System.getProperties();
        // keySet(): Map 컬렉션에서 키값만 Set 계열로 가져오는 메서드
        Set set = properties.keySet();
        System.out.println("Key                                Value");
        System.out.println("-----------------------------------------");
        for (Object objKey : set) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.println(key + "                     " + value);
        }
    }
}
