package com.oopEx3;

public class Main {

    public static void main(String[] args) {

        Employee fullTime = new FullTimeEmployee();
        Employee partTime = new PartTimeEmployee();

        partTime.printInfo();
        fullTime.printInfo();

        System.out.println("===============================");
        partTime.calculatePay();
        fullTime.calculatePay();

    }

}
