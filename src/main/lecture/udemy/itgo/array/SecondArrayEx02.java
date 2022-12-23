package lecture.udemy.itgo.array;

public class SecondArrayEx02 {
    public static void main(String[] args) {
        int[][] score = new int [][] {
                {100, 70, 50},
                {70, 50, 30},
                {50, 80, 70},
                {55, 85, 77},
                {100, 80, 75}
        };

        // 과목별 총점
        int korTotal = 0; // 국어
        int engTotal = 0; // 영어
        int mathTotal = 0; // 수학

        int totalSum = 0; // 합계
        double totalAvg = 0.0; // 평균

        System.out.println("번호\t국어\t영어\t수학\t총점\t\t평균");
        System.out.println("=============================");

        for (int i = 0; i < score.length; i++) {
            int sum = 0; // 개인별 총점
            double avg = 0.0; // 개인별 평균

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            System.out.printf("%2d", i+1);
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("\t" + score[i][j]);
            }
            totalSum += sum; // 총 합계
            avg = (double) sum / score[i].length; // 개인별 평균
            totalAvg += avg;

            // printf() %d : 형식 지정자의 개수만큼 그에 대입되는 변수가 ,로 구분되어 제시
            // %n은 개행(줄바꿈)
            System.out.printf("\t%d \t%.2f%n", sum, avg);
        }
        totalAvg /= score.length;
        System.out.printf("총점\t%d\t%d\t%d\t%d\t%.2f", korTotal, engTotal, mathTotal, totalSum, totalAvg);
    }
}
