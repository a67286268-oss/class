package com.oopEx4;

public abstract class Employee implements Payable{

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void printInfo();

    @Override
    public void calulatePay() {
        System.out.println("[" + getId() + "]" + getName());
        printInfo();
        if (this instanceof Bonusable) {
            ((Bonusable) this).calulateBonus();
        }
    }
}
