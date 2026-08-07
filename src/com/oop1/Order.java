package com.oop1;

public class Order {

    String itemName;
    int price;
    int quantity;
    int totalAmount;
    boolean isTakeout;

    public void totalAmount() {
        this.totalAmount = this.quantity * this.price;
    }

    public void printOrder() {
        System.out.println("메뉴선택 : " + itemName);
        System.out.println("가격 : " + price);
        System.out.println("수량 : " + quantity);
        System.out.println("총 가격 : " + totalAmount);
        System.out.println(isTakeout ? "매장" : "포장");
    }


}