package lecture.udemy.itgo.loop;

public class ContinueEx {
    public static void main(String[] args) {
        // 1~100 사이에서 홀수만 출력하는 프로그램
        for (int i = 1; i <= 100; i++) {
            // continue 문은 뒷 문장을 실행하지 않고, 바로 증감식으로 이동한다.
            if ((i % 2) == 0) {
                continue;
            }
            System.out.println("홀수만 출력 : " + i);
        }
    }
}
