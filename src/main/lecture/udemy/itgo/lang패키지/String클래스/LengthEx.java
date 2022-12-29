package lecture.udemy.itgo.lang패키지.String클래스;

public class LengthEx {
    public static void main(String[] args) {
        String phoneNum = "01023456789";
        System.out.println("문자열의 길이 : " + phoneNum.length()); // 11

        int length = phoneNum.length();
        if (length == 11) {
            System.out.println("폰 번호 자리가 맞습니다.");
        } else {
            System.out.println("다시 입력해 주세요.");
        }
    }
}
