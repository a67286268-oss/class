package com.oop7;

public class Rice {
    private String menu;
    private int totalMoney;

    public Rice(String menu, int pay) {
        this.menu = menu;
        this.totalMoney = 0;
    }

    public void take(int pay) {
        totalMoney += pay;
    }

    public void info() {
        System.out.println(menu + " 수익 : " + totalMoney);
    }

}
