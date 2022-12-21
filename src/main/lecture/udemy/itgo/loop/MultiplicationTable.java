package lecture.udemy.itgo.loop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        구구단을 찍는 프로그램
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (i*j));
            }
        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 출력합니다.");
        System.out.print("몇 단부터 출력할까요? : ");
        int start = sc.nextInt();
        System.out.print("끝 단은 얼마인가요? : ");
        int end = sc.nextInt();

        for (; start <= end; start++) {
            System.out.println("*****" + start + "단 *****");
            for (int j = 1; j < 10; j++) {
                System.out.println(start + "*" + j + "=" + (start * j));
            }
        }
        sc.close();
    }
}
