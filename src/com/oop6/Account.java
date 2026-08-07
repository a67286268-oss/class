package com.oop6;

public class Account {
    private String name;
    private int balance;

    public void deposit(int money) {
        if (money < 0) {
            System.out.println("0보다 작은 금액은 입금할수없습니다.");
            return;
        }
        balance += money;
        System.out.println("입금 완료");
    }

    public int withdraw(int money) {
        if (balance >= money) {
            balance -= money;
            System.out.println("출금 완료");
            return money;
        } else {
            System.out.println("잔액 부족");
            return 0;
        }
    }

    public void showInfo() {
        System.out.println("헌재 잔액 : " + balance);
    }

}
