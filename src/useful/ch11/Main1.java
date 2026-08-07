package useful.ch11;

public class Main1 {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        // 입금 일 위임 + 10000
        Father father = new Father(bankAccount);
        father.start();
        // 출급 일 위임 - 5000;
        Mother mother = new Mother(bankAccount);
        mother.start();
        // 기대값 : 10만 5000원 ... 정상동작
        // 11000원 -- > 의도하지 않은 동작



    }

}
