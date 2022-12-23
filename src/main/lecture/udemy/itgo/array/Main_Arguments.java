package lecture.udemy.itgo.array;

public class Main_Arguments {
    public static void main(String[] args) {
        // main()의 매개변수를 활용하는 방법
        // Run - Edit Configurations
        if (args.length != 2) {
            System.out.println("프로그램의 사용법");
            System.out.println("아이디 입력 패스워드 입력");
        }

        String str1 = args[0];
        String str2 = args[1];

        System.out.println("아이디 : " + str1); // 출력: abcd
        System.out.println("패스워드 : " + str2); // 출력 : abc100
    }
}
