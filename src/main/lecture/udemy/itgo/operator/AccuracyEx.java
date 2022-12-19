package lecture.udemy.itgo.operator;

public class AccuracyEx {
    public static void main(String[] args) {
        // CPU의 연산의 오차 설명

        int apple = 1;
        double unit = 0.1;
        int number = 7;

        double result = apple - (number * unit);
        double result2 = number * unit;

        System.out.println(result2); // 예상값: 0.7 -> 실제값: 0.7000000000000001

        System.out.println("사과 한 개에서 0.7 조각을 빼면, ");
        System.out.println(result + "조각이 남는다."); // 예상값: 0.3 -> 실제값: 0.29999999999999993
    }
}
