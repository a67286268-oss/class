package com.oop20;

public class RemoteControlMain {

    public static void main(String[] args) {

        // 인터페이스 타입으로 객체를 받을수있다
        RemoteControl rc = new TV(); // 업캐스팅상태
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();

        System.out.println("===================");

        rc = new Audio();
        rc.turnOff();
        rc.setVolume(20);
        rc.turnOn();

    }

}
