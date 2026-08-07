package com.oop1;

public class OrderMainTest {

    public static void main(String[] args) {

        Order o1 = new Order();

        o1.itemName = "아메리카노";
        o1.quantity = 3;
        o1.price = 4500;
        o1.isTakeout = true;
        o1.totalAmount();
        o1.printOrder();

    }
}
