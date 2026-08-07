package com.oop4;

public class CoffeeMachine {

    // 커피머신의 상태(필드) : 물의 양(ml), 커피 원두 양(g)
    int water;
    int coffee;
    int count;

    // 생성자 직접 설계 해서 테스트 코드 작성
    public CoffeeMachine(int w1,int c1) {
        water = w1;
        coffee = c1;
    }

    // 메서드 1. 물 보충
    void refillWater(int amount) {
        if (amount > 0) {
            water += amount;
            System.out.println(amount + "ml의 물을 채웠습니다.");
        } else {
            System.out.println("보충할 물이 없습니다.");
        }
    }

    // 메서드 2. 원두 보충
    void refillCoffee(int amount) {
        if (amount > 0) {
            water += amount;
            System.out.println(amount + "g의 커피를 채웠습니다.");
        } else {
            System.out.println("보충할 커피가 없습니다.");
        }
    }

    // 메서드 3. 커피 제조
    String makeCoffee() {
        // 커피 한 잔에 물100 원두10 사용
        if (water >= 100 && coffee >= 10) {
            water -= 100;
            coffee -= 10;
            count++;
            return "커피가 완성되었습니다.";

        } else {
            return "재료가 부족합니다 물이나 원두를 보충해주세요";
        }
    }

    // 메서드 4. 해당하는 객체의 현재 상태값 보여주는 기능
    // 단 여기서 콘솔창에 출력하는 기능
    void showInfo() {
        System.out.println("현재 물의 양 : " + water + "ml");
        System.out.println("현재 원두의 양 : " + coffee + "g");
    }

    // 문제 : 현재 해당하는 커피 머신이 몇 잔의 커피를 만들었는지 출력
    void cupCount() {
        System.out.println("지금까지의 커피 생성량 : " + count + "잔");
    }

}
