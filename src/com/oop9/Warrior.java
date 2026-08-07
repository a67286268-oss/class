package com.oop9;

public class Warrior {

    private String name;
    private int level;
    private int health;

    public Warrior(String name) {
        this.name = name;
        level = 1;
        health = 100;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    // setter 메서드 생성
    // setter << 리턴타입이 void(없다)
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        if (health < 0) {
            System.out.println("체력은 -가 될 수 없습니다.");
            return; // 실행 제어권 반납
        }
        this.health = health;
    }

    public void setLevel(int level) {
        if (level <= 0) {
            System.out.println("0보다 작은값을 입력할 수 없습니다.");
        } else {
            this.level = level;
        }
    }

    public void levelUp() {
        level++;
        health += 50;
        System.out.println(name + "의 현재 레벨 : " + level);
    }

}
