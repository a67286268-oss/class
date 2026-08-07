package com.oop4;

public class CoffeeMachineTest {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine(50,200);

        String result1 = coffeeMachine.makeCoffee();
        System.out.println(result1);
        coffeeMachine.showInfo();
        System.out.println("========================================");
        coffeeMachine.refillCoffee(100);
        coffeeMachine.refillWater(200);
        coffeeMachine.showInfo();
        System.out.println("====================================");
        String result2 = coffeeMachine.makeCoffee();
        System.out.println(result2);
        coffeeMachine.showInfo();
        System.out.println();
        coffeeMachine.cupCount();


    }

}
