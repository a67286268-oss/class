package com.oop10;

import java.util.Random;

public class Calculator {

    // 일반 인스턴스 메소드 (객체를 생성해야 사용가능) - 사실 static메소드로 만드는것을 권장
    public int multiply(int n1,int n2) {
        return n1 * n2;
    }

    // 객체마다 결과가 달라질 이유가 없으므로 static함수가 적합
    // static 메소드 (객체 생성없이 클래스이름.메소드이름()으로 사용가능)
    public static int add(int n1,int n2) {
        return n1 + n2;
    }

    // 사실 우리는 이미 static을 사용하고 있었다
    // public static void main(String[] args) {
    // 누구나  바로  리턴없이 프로그램을시작(데이터타입[] 변수)
    // }

    public static void main(String[] args) {
        Calculator.add(10,10);

        // 자바 표준 API
        double ran = Math.random();
        System.out.println(ran);

        // 자바 표준 API - Random
        Random random = new Random();
        // int ranInt = random.nextInt(2); // ~까지 난수값생성 0 <= ? < 2
        int ranInt = random.nextInt(45) + 1; // 1~45까지
        System.out.println(ranInt);

    }

}
