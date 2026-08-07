package com.oopEx2;

public class Latte extends Beverage{

    public Latte() {
        super("라떼",4500);
    }

    @Override
    public void prepare() {
        System.out.println("에스프레소에 우유를 붓습니다.");
        System.out.println(getName() + " 나왔습니다. 가격은 " + getPrice() + "원 입니다.");
    }
}
