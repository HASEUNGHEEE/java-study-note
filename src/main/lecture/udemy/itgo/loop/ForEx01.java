package lecture.udemy.itgo.loop;

public class ForEx01 {
    public static void main(String[] args) {
        /*
        [싱글 루프; 1~100까지의 합을 구하는 반복문]
        int i = 1 -> 초기화 코드(최초 1번만 실행)
        i <= 100 -> 조건식(참일 때만 실행 블럭 실행)
        i++ -> 증감식
         */

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~100까지의 합 : " + sum);
    }
}
