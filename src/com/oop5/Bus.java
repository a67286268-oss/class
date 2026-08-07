package com.oop5;

public class Bus {

    int busNumber;
    int count; // 0으로 초기화
    int money; // 0으로 초기화
    // 멤버 변수를 생성자를 통해서 초기화 하지 않는다면 자동으로 기본값을 가진다.

    public Bus(int number) {
        busNumber = number;
    }

    // 사람을 태우다.
    void take(int pay) {
        money += pay;
        count++;
    }

    // 현재 버스의 상태
    void showInfo() {
        System.out.println("버스번호 : " + busNumber);
        System.out.println("승객 수 : " + count);
        System.out.println("수익 금액 : " + money);
    }
}
