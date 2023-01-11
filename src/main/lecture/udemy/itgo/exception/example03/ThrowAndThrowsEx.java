package lecture.udemy.itgo.exception.example03;

public class ThrowAndThrowsEx {
    public static void main(String[] args) {
        boolean result;
        try {
            result = findClass();
            if (result) {
                System.out.println("클래스가 존재합니다.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
            e.printStackTrace();
        } catch (Exception e) {
            // 개발자용 - 배포 시에는 제거 혹은 주석처리
            e.printStackTrace();
        } finally {
            System.out.println("정상 종료합니다.");
        }

    }

    public static boolean findClass() throws ClassNotFoundException {
        Class class1 = Class.forName("java.lang.String");
        // 클래스가 있다면
        if (class1 != null) {
            return true;
        } else {
            return false;
        }

    }
}
