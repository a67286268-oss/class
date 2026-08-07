package com.oopEx3;

public abstract class Employee implements Payable{

    private String name;
    private int id;

    @Override
    public void calculatePay() {
        System.out.println("[" + getId() + "]" + getName() +"의 이번 달 정산");
        printInfo();
        System.out.println();
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract void printInfo();

}
