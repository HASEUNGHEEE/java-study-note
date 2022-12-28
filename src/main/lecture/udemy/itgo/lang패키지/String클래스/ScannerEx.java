package lecture.udemy.itgo.lang패키지.String클래스;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.nextLine();

        byte[] b1 = str.getBytes(); // 아스키코드 저장
        System.out.println(Arrays.toString(b1));

        char[] ch = str.toCharArray(); // 유니코드 저장
        System.out.println(ch.length);
        System.out.println(Arrays.toString(ch));

        sc.close();
    }
}
