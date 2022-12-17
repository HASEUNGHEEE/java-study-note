package lecture.udemy.itgo.variable;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        // Scanner 클래스는 입력을 받기 위한 클래스이고, 입력 스트림
        // 자원(Resource)는 사용하고 나서 반드시 닫아줘야 한다.
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 한 자리를 입력하세요.");
        int num = sc.nextInt();
        System.out.println("사용자로부터 입력 받은 숫자 : " + num);

        System.out.print("실수를 입력하세요.");
        double dNum = sc.nextDouble();
        System.out.println("사용자로부터 입력 받은 숫자 : " + dNum);

        System.out.print("문자열을 입력하세요.");
        // String str = sc.next();
        // next()는 공백을 기준으로 문자를 입력받는다.
        // nextLine()은 엔터키를 입력할 때까지 문자를 입력받는다.
        String str = sc.nextLine();
        System.out.println("사용자로부터 입력 받은 문자열 : " + str);

        int result = 100;
        String number = sc.nextLine();
        int temp = Integer.parseInt(number);
        int total = result + temp;
        System.out.println("연산 결과 : " + total);

        sc.close();
    }
}
