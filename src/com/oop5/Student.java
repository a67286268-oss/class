package com.oop5;

public class Student {

    String name;
    int money;

    public Student(String n, int m) {
        name = n;
        money = m;
    }

    void takeBus(Bus bus) {
        if (money < 1000) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        bus.take(1000);
        money -= 1000;
    }

    void takeSubway(Subway sub) {
        if (money < 1200) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        sub.take(1200);
        money -= 1200;
    }

    void eat(Rice rice) {
        if (money < 5000) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        rice.eat(5000);
        money -= 5000;


    }

    void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("잔액 : " + money);
    }
}

