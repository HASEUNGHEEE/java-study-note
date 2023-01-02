package lecture.udemy.itgo.유용한클래스.Pattern클래스;

import java.util.regex.Pattern;

public class PatternEx01 {
    public static void main(String[] args) {
        // 010 또는 02로 시작하는 휴대폰 번호나 서울 지역 전화번호를 패턴으로 정의
        String numPattern = "(010|02)-\\d{3,4}-\\d{4}";
        String phoneNum = "010-5544-1234";
        String seoulNum = "02-521-1234";

        // boolean result = Pattern.matches(numPattern, phoneNum);
        boolean result = Pattern.matches(numPattern, seoulNum);
        if (result) {
            System.out.println("전화번호 양식이 맞습니다.");
        } else {
            System.out.println("전화번호 양식을 확인 후 다시 입력해 주세요.");
        }

        // 이메일 양식을 검증
        String emailPattern = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        String email1 = "7@naver.com";
        String email2 = "12345@google.co.kr.abc";

        boolean emailResult = Pattern.matches(emailPattern, email2);
        if (emailResult) {
            System.out.println("이메일 양식이 맞습니다.");
        } else {
            System.out.println("이메일 양식을 확인 후 다시 입력해 주세요.");
        }
    }
}
