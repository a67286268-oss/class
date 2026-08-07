package com.oop11;

public class ArrayTest3 {

    public static void main(String[] args) {

        char[] alpahbets = new char[26];
        char ch1 = 'A';
        alpahbets[0] = ch1;

        char ch2 ='b';
        alpahbets[1] = ch2;

        char ch3 ='c';
        alpahbets[2] = ch3;

        char ch26 ='z';
        alpahbets[25] = ch26;

//        System.out.println(alpahbets[0]);
//        System.out.println(alpahbets[1]);
//        System.out.println(alpahbets[2]);
//        System.out.println(alpahbets[25]);

        // 배열은 반복문과 함께 많이 사용된다
        for (int i = 0; i < alpahbets.length; i++) {
            System.out.println(alpahbets[i]);
        }

    }
}
