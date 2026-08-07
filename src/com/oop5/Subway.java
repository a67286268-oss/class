package com.oop5;

public class Subway {
    int lineNumber;
    int count;
    int money;

    // 1.생성자
    public Subway(int num) {
        lineNumber = num;
    }

    // 2.승객을 태운다.
    void take(int pay) {
        money += pay;
        count++;
    }

    // 3.정보 보기
    void showInfo() {
        System.out.println("=======정보=======");
        System.out.println("지하철 호선 : " + lineNumber);
        System.out.println("승객의 수 : " + count);
        System.out.println("현재까지의 수익 : " + money);
    }
}
