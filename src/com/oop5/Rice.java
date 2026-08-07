package com.oop5;

public class Rice {
    String menu;
    int amount; // 남은 양

    // 먹은 만큼 줄어든다. 성공하면 true 실패하면 false값 반환
    public Rice(String m,int a) {
        menu = m;
        amount = a;
    }

    void eat(int pay) {
        if(amount <= 0) {
            System.out.println("남은" + menu+ "이(가) 없습니다.");
            return;
        }

        amount--;
    }

    void showInfo() {
        System.out.println("=======재고 현황=======");
        System.out.println(menu + " : " + amount);
    }
}
