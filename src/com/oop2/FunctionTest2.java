package com.oop2;

import java.util.Scanner;

public class FunctionTest2 {

    // 세개의 수를 입력 받아 뺄셈하는 함수를 설계하고 그 값을 반환 하는 함수를 만들어 보자
    static int sub(int a, int b, int c) {
        int result = a - b - c;
        return result;
    }

    // 리턴 키워드가 없는 함수를 만들어 보자.
    // void - 텅빈,값이없는
    static void sayHello(String greeting) {
        System.out.println("[[[ " + greeting + " ]]] 👍👍");
    }

    // 매계변수가 없는 함수를 설계
    static int calcSum() {
        // 지역변수는 가능한 초기값을 먼저 할당
        int sum = 0;
        int i;

        for(i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;

    }

    // 맨 마지막에 메인 함수 설계 예정
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int result1 = sub(num1, num2, 5);
        sayHello("안녕");
        sayHello("반가워");
        int result2 = calcSum();

        System.out.println("--------------------------------");
        System.out.println(result1);
        System.out.println(result2);

    }
}
