package com.oop7;

public class Subway {
    private int line;
    private int totalMoney;

    public Subway(int line, int pay) {
        this.totalMoney = 0;
        this.line = line;
    }

    public void take(int pay){
        totalMoney += pay;
    }

    public void info() {
        System.out.println(line + "호선 지하철 수익 : " + totalMoney);
    }
}
