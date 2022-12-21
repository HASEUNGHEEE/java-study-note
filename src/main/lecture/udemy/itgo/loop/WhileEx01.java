package lecture.udemy.itgo.loop;

public class WhileEx01 {
    public static void main(String[] args) {
        /*
        while 문 옆에는 조건식만 들어가기 때문에
        for 문에 비해 일반적 루핑에서는 가독성이 떨어진다.
         */
        int sum = 0;
        int i = 1; // while 문은 초기화 하는 부분이 따로 존재하지 않음

        while (i <= 100) {
            sum += 1;
            i++;
        }
        System.out.println("1~100까지의 합 : " + sum);
    }
}
