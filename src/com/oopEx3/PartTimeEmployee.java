package com.oopEx3;

public class PartTimeEmployee extends Employee {
    final int HOURLY_WAGE = 10_030;
    int workHours;
    int totalPay;

    public PartTimeEmployee() {
        super("이알바", 2001);
        workHours = 80;
        totalPay = workHours * HOURLY_WAGE;
    }

    @Override
    public void printInfo() {
        System.out.println("[" + getId() + "]" + getName());
        System.out.println("이번 달 근무시간 : " + workHours);
        System.out.println("급여 : " + totalPay);
    }
}
