package com.oopEx4;

public class FullTimeEmployee extends Employee implements Bonusable {

    final int MONTHLY_SALARY = 4_000_000;
    final int BONUS = MONTHLY_SALARY * 2;
    private int titlePay;


    public FullTimeEmployee() {
        super("박팀장", 1002);
        this.titlePay = 500000;
    }

    public int getTitlePay() {
        return titlePay;
    }

    public int getMONTHLY_SALARY() {
        return MONTHLY_SALARY;
    }

    public int getBONUS() {
        return BONUS;
    }

    @Override
    public void printInfo() {
        System.out.println("직책 수당 : " + getTitlePay() + "원");
        System.out.println("급여 : " + (getMONTHLY_SALARY() + getTitlePay()) + "원");
    }

    @Override
    public void calulateBonus() {
        System.out.println("보너스 : " + getBONUS() + "원");
    }
}
