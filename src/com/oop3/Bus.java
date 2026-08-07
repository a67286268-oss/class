package com.oop3;

import java.awt.desktop.AboutEvent;

public class Bus {

    // ==========================================
    // 1. 속성 (상태 / 멤버 변수)
    // ==========================================
    int busNumber;      // 버스 번호 (예: 100번)
    int passengerCount; // 현재 탑승 중인 승객 수
    int money;          // 버스 수입 (누적 요금)
    int fare;           // 버스 요금 (기본 1,400원)
    boolean isRunning;  // 주행 여부 (true: 주행 중, false: 정지)

    // ==========================================
    // 2. 행위 (기능 / 메서드)
    // ==========================================

    // [행위 1] 승객이 탑승하는 함수
    void takePassenger(int count) {
        passengerCount += count;
        money += (count * fare);
        System.out.println("승객 " + count + "명이 탑승했습니다. (현재 승객: " + passengerCount + "명)");
    }

    // [행위 2] 승객이 하차하는 함수
    void getOffPassenger(int count) {
        if (passengerCount >= count) {
            passengerCount -= count;
            System.out.println("승객 " + count + "명이 하차했습니다. (현재 승객: " + passengerCount + "명)");
        } else {
            System.out.println("오류: 현재 승객 수보다 더 많은 인원이 하차할 수 없습니다.");
        }
    }

    // [행위 3] 버스 주행 시작
    void startBus() {
        isRunning = true;
        System.out.println(busNumber + "번 버스가 주행을 시작합니다. ");
    }

    // [행위 4] 버스 멈춤
    void stopBus() {
        isRunning = false;
        System.out.println(busNumber + "번 버스가 정류장에 멈춥니다. ");
    }

    // [행위 5] 버스 현재 상태 출력
    void showInfo() {
        System.out.println("\n--- [" + busNumber + "번 버스 정보] ---");
        System.out.println("현재 승객 수 : " + passengerCount + "명");
        System.out.println("총 수입 금액 : " + money + "원");
        System.out.println("주행 상태     : " + (isRunning ? "운행 중" : "정지 중"));
        System.out.println("---------------------------\n");
    }

}


