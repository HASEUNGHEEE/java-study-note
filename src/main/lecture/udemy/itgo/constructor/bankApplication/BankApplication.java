package lecture.udemy.itgo.constructor.bankApplication;

import java.util.Scanner;

public class BankApplication {
    /*
    배열
    - 100개의 정적 멤버
    - 단점 : 한계를 넘어가면 exception 발생, 메모리 낭비 문제
     */
    private static Account[] accounts = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금하기 | 4.출금하기 | 5.종료하기");
            System.out.println("--------------------------------------------------------");
            System.out.print("선택 > ");

            int choice = sc.nextInt();

            if (choice == 1) {
                createAccount();
            } else if (choice == 2) {
                printAccountList();
            } else if (choice == 3) {
                deposit();
            } else if (choice == 4) {
                withdraw();
            } else if (choice == 5) {
                System.out.println("계좌관리 프로그램을 종료합니다.");
                run = false;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    // 1. 계좌생성
    public static void createAccount() {
        System.out.println("-----------------");
        System.out.println("계좌를 생성합니다.");
        System.out.println("-----------------");

        System.out.print("게좌번호 : ");
        /*
        next() : 공백 앞까지만 리턴 -> 한 단어를 입력받을 때 용이한 메서드
        nextLine() : 한 문장이나 한 줄을 입력받을 때 용이한 메서드
                     엔터키에 해당하는 값도 buffer 에 남아 있다.
         */
        String ano = sc.next();

        System.out.print("게좌주 : ");
        String owner = sc.next();

        System.out.print("초기 입금액 : ");
        int balance = sc.nextInt();

        Account newAccount = new Account(ano, owner, balance);
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = newAccount; // 배열에 attach 하는 작업
                System.out.println("결과 : 계좌 생성이 완료되었습니다.");
//                System.out.println(accounts[i].getAno() + ", " +
//                                    accounts[i].getOwner() + ", " +
//                                    accounts[i].getBalance());
                break;
            }
        }
    }

    // 2. 계좌목록
    public static void printAccountList() {
        System.out.println("-----------------");
        System.out.println("계좌목록을 출력합니다.");
        System.out.println("-----------------");

        for (int i = 0; i < accounts.length; i++) {
            Account account = accounts[i];
            // 계좌에 대한 내용이 존재한다면
            if (account != null) {
                System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
            }
        }
    }

    // 3. 예금하기
    public static void deposit() {
        System.out.println("-----------------");
        System.out.println("예금을 합니다.");
        System.out.println("-----------------");

        System.out.print("계좌번호 입력 : ");
        String ano = sc.next();
        System.out.print("예금액 입력 : ");
        int money = sc.nextInt();

        Account account = findAccount(ano);
        if (account == null) {
            System.out.print("계좌가 존재하지 않습니다.");
            return;
        }
        account.setBalance(account.getBalance() + money);
        System.out.print("결과 : 예금이 성공했습니다. 현재 잔액 : " + account.getBalance());
        System.out.println();
    }

    // 4. 출금하기
    public static void withdraw() {
        System.out.println("-----------------");
        System.out.println("출금을 합니다.");
        System.out.println("-----------------");

        System.out.print("계좌번호 입력 : ");
        String ano = sc.next();
        System.out.print("출금액 입력 : ");
        int money = sc.nextInt();

        Account account = findAccount(ano);
        if (account == null) {
            System.out.print("계좌가 존재하지 않습니다.");
            return;
        }
        account.setBalance(account.getBalance() - money);
        System.out.print("결과 : 출금이 성공했습니다. 현재 잔액 : " + account.getBalance());
        System.out.println();
    }

    // 계좌 찾기
    public static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                // 매개변수로 넘어온 계좌번호와 동일하다면
                if (accounts[i].getAno().equals(ano)) {
                    account = accounts[i];
                    break;
                }
            }
        }
        return account;
    }
}
