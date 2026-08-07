package com.oop9;

public class WarriorMain {

    public static void main(String[] args) {

        Warrior w1 = new Warrior("광전사");
        Warrior w2 = new Warrior("방패전사");

        //get,set 메서드 확인
        //필요에 의해서 멤버 변수 상태값을 변경, 객체의 상태 변경은 행위(메서드)를 통해 변경


        w1.setHealth(-80);
        w1.setLevel(-1);
        w1.setName("광폭전사");
        System.out.println("=================================");
        System.out.println(w1.getName());
        System.out.println(w1.getHealth());
        System.out.println(w1.getLevel());

    }
}
