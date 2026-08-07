package com.oop1;

public class WarriorMainTest {

    public static void main(String[] args) {
        // new - 키워드 , Warrior() << 생성자 호출
        Warrior w1 = new Warrior();
        // Warrior w1; : Warrior 변수 선언
        w1.name = "워로드";
        w1.height = 185.5;
        w1.health = 500;
        w1.attackPower = 80.0;
        w1.defencePower = 50.0;

        // w1 참조 변수에 접근해서 값을 할당
        // 객체의 접근은 연산자로 할 수 있다

        System.out.println("w1 주소값 : " + w1);
        System.out.println("w1 이름 : " + w1.name);
        System.out.println("w1 키 : " + w1.height);
        System.out.println("w1 체력 : " + w1.health);
        System.out.println("w1 공격력 : " + w1.attackPower);
        System.out.println("w1 방어력 : " + w1.defencePower);

        System.out.println("---------------------------------------");

        Warrior w2 = new Warrior();

        w2.name = "버서커";
        w2.height = 189.4;
        w2.health = 450;
        w2.attackPower = 85.0;
        w2.defencePower = 35.0;

        System.out.println("w2 이름 : " + w2.name);
        System.out.println("w2 키 : " + w2.height);
        System.out.println("w2 체력 : " + w2.health);
        System.out.println("w2 공격력 : " + w2.attackPower);
        System.out.println("w2 방어력 : " + w2.defencePower);

    }

}
