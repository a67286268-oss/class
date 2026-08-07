package com.oopEx3;

public class FullTimeEmployee extends Employee {
    final int MONTHLY_SALARY = 3_200_000;

    public FullTimeEmployee() {
        super("김정규", 1001);
    }

    @Override
    public void printInfo() {
        System.out.println("[" + getId() + "]" + getName());
        System.out.println("급여 : " + MONTHLY_SALARY + "원");
    }
}
