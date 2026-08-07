package com.oopEx2;

public abstract class Beverage {

    private String name;
    private int price;

    public Beverage(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void makeAmericano() {
        System.out.println("=== " + getName() + " 제조 시작 ===");
        prepare();
        System.out.println();
    }

    public void makeLatte() {
        System.out.println("=== " + getName() + " 제조 시작 ===");
        prepare();
        System.out.println();
    }

    public abstract void prepare();

    public void serve() {
        System.out.println(getName() + "을(를) 자리로 서빙해드립니다.");
    }

}
