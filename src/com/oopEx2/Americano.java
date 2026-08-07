package com.oopEx2;

public class Americano extends Beverage{

    public Americano() {
        super("아메리카노",3000);
    }

    @Override
    public void prepare() {
        System.out.println("에스프레소에 물을 붓습니다.");
        System.out.println(getName() + " 나왔습니다. 가격은 " + getPrice() + "원 입니다.");
    }
}
