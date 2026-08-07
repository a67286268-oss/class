package com.oop10;

public class NumberPrinter {

    int waitNumber; // 대기 번호

    public NumberPrinter() {
        waitNumber = 1;
    }

    // 번호표 출력기능
    public void printWaitNumber() {
        System.out.println("대기 순번 : " + waitNumber);
        waitNumber++;
    }

}
