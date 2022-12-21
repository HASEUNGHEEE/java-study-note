package lecture.udemy.itgo.loop;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");
        String str;

        do {
            System.out.print(">");
            // String 클래스의 next() 메서드와 nextLine() 메서드
            // next() : 한 단어 입력받을 때 사용하는 메서드
            // nextLine() : 공백 포함하여 엔터키를 입력할 때까지의 문장을 리턴
            str = sc.nextLine();
            System.out.println("입력받은 메세지 : " + str);
        } while (!str.equals("q"));

        System.out.println("프로그램 종료");
        sc.close();
    }
}
