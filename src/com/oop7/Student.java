package com.oop7;

public class Student {
    private String name;
    private int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void eat(Rice kimchi) {
        if (this.money < 3000) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        System.out.println("밥을 먹었습니다");
        kimchi.take(3000);
        money -= 3000;
        System.out.println("현재 잔액 : " + money);
        kimchi.info();
    }

    public void eat2(Rice vegetable) {
        if (this.money < 2500) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        System.out.println("밥을 먹었습니다");
        vegetable.take(2500);
        money -= 2500;
        System.out.println("현재 잔액 : " + money);
        vegetable.info();
    }

    public void takeSubway(Subway subway) {
        if (money < 1200) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        System.out.println("지하철을 탓습니다");
        subway.take(1200);
        money -= 1200;
        System.out.println("현재 잔액 : " + money);
        subway.info();
    }

    public void takeBus(Bus bus) {
        if (money < 1000) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        System.out.println("버스를 탓습니다");
        bus.take(1000);
        money -= 1000;
        System.out.println("현재 잔액 : " + money);
        System.out.println();
        bus.info();
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("잔액 : " + money);
    }

}
