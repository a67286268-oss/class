package com.oop7;

public class Bus {
    private int number;
    private int totalMoney;

    public Bus (int busNum, int m) {
        number = busNum;
        totalMoney = 0;
    }

    public void take(int pay){
        totalMoney += pay;
    }

    public void info() {
        System.out.println(number + "번 버스 수익 : " + totalMoney);
    }

}
