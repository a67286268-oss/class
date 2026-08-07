package com.oop4;

public class CalculatorMain {

    // 두 숫자를 더하는 함수
    static int sum(int a, int b) {
        return a + b;
    }

    // 두 숫자를 빼는 함수
    static int sub(int a, int b) {
        return a - b;
    }

    // 두 숫자를 곱하는 함수
    static int mul(int a, int b) {
        return a * b;
    }

    // 두 숫자를 나누는 함수
    static double div(int a, int b) {
        if(b == 0) {
            System.out.println("0으로 나눌 수 없다");
            return 0;
        }
        // 정수 / 정수 = 정수 (소숫점 제거)
        // 형변환을하여 실수타입으로 바꿔줘야 한다
        return (double)a / b;
    }

    // 짝수 판별 함수

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // 홀수 판별 함수
    static boolean isOdd(int num) {
        return num % 2 == 1;
    }

    public static void main(String[] args) {

        System.out.println(div(7, 3));
        System.out.println(isEven(7));
        System.out.println(isOdd(7));

    }

}
