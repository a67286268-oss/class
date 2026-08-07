package com.oop6;

public class Bank2 {
    // 접근 제어 지시자 활용
    // 멤버 변수에 private 활용
    private String name;
    private int age;
    private String address;
    private int balance;

    public void member(String Name,int Age,String Add) {
        name = Name;
        age = Age;
        address = Add;
        balance = 0;
    }

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
        System.out.println(name + "님의 정보");
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("헌재 잔액 : " + balance);
    }

}
