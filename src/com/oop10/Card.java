package com.oop10;

public class Card {

    long cardNumber;
    private String name;
    private int age;

    public Card(String name, int age) {
        this.name = name;
        this.age = age;
        cardNumber = CardCompany.cardNumber;
        CardCompany.cardNumber++;
    }
    public void showInfo() {
        System.out.println("회원정보");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("카드번호 : " + cardNumber);
    }
}
