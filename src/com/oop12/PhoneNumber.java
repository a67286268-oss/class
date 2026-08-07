package com.oop12;

public class PhoneNumber {

    private String name;
    private String phoneNumber;

    public PhoneNumber(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void showInfo() {
        System.out.println("이    름 : " + name);
        System.out.println("전화번호 : " + phoneNumber);
    }
}
