package lecture.udemy.itgo.exception.example04;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(50000);
        System.out.println("현재 잔액 : " + account.getBalance());

        try {
            // withdraw()가 예외를 던지고 있으므로, 예외 처리 코드가 반드시 있어야 한다.
            account.withdraw(10000);
            System.out.println("현재 잔액 : " + account.getBalance());
            account.withdraw(50000);
            System.out.println("현재 잔액 : " + account.getBalance());

        } catch (BalanceException e) {
            System.out.println("예외 원인 : " + e.getMessage());
        } finally {
            System.out.println("정상 종료됩니다.");
        }
    }
}
