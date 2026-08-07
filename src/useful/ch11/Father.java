package useful.ch11;

public class Father extends Thread{

    BankAccount bankAccount;

    public Father(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        // 아버지가 10000원 입금
        bankAccount.saveMoney(10000);
    }
}
