package com.oop3;

public class BusMainTest {

    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.busNumber = 155;
        bus.fare = 1200;

        bus.startBus(); // 버스 출발
        bus.takePassenger(2); // 손님탑승(숫자변경가능)
        bus.takePassenger(1); // 손님추가 탑승

        bus.stopBus(); // 버스 정지
        bus.getOffPassenger(2); // 손님하차
        bus.takePassenger(1); // 그 후 추가탑승

        bus.showInfo(); // 현재 버스상태
    }

}
