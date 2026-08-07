package com.oop11;

import java.util.Random;

public class ArrayTest5 {

    public static int[] makeNumber() {
        // 1, 15, 17, 28, 39, 40

        Random random = new Random();
//        int g1 = random.nextInt(45) + 1;
//        int g2 = random.nextInt(45) + 1;
//        int g3 = random.nextInt(45) + 1;
//        int g4 = random.nextInt(45) + 1;
//        int g5 = random.nextInt(45) + 1;
//        int g6 = random.nextInt(45) + 1;

        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(45) + 1;
        }
        return numbers;
    }

    public static void main(String[] args) {

        int[] lotto = makeNumber();
        // System.out.println(lotto); // 주소값
//        System.out.println(lotto[0]);
//        System.out.println(lotto[1]);
//        System.out.println(lotto[2]);
//        System.out.println(lotto[3]);
//        System.out.println(lotto[4]);
//        System.out.println(lotto[5]);

        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + "\t");
        }

    }

}
