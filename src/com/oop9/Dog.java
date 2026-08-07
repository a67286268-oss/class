package com.oop9;

public class Dog {

    private String name;
    private int age;
    private double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // 1. get 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    // 2. set 메서드
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("1살부터 입니다");
        } else {
            this.age = age;
        }
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            System.out.println("잘 못 입력하셨습니다. 1이상 입력해주세요");
            return;
        }
        this.weight = weight;
    }

}
