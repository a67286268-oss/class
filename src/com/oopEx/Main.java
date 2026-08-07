package com.oopEx;

public class Main {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(c3.num + ", " + Counter.count); // 1,3

    }
}
