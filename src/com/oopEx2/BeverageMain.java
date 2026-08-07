package com.oopEx2;

import com.oop6.Bank;

import java.util.Scanner;

public class BeverageMain {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Beverage americano = new Americano();
        Beverage latte = new Latte();

        final String AMERICANO = "1";
        final String LATTE = "2";
        final String TOTAL_ORDER = "3";
        final String PAYMENT = "4";
        final String END = "0";

        int americanoCount = 0;
        int latteCount = 0;


        while(true) {
            System.out.println("메뉴");
            System.out.println("1. 아메리카노");
            System.out.println("2. 라떼");
            System.out.println("3. 장바구니");
            System.out.println("4. 결제");
            System.out.println("0. 주문취소 및 강제종료");
            System.out.print("선택 : ");
            String choice = sc.nextLine().trim();

            if(choice.equals(AMERICANO)) {
                americano.makeAmericano();
                americanoCount++;
            }else if(choice.equals(LATTE)) {
                latte.makeLatte();
                latteCount++;
            }else if(choice.equals(TOTAL_ORDER)) {
                System.out.println("아메리카노 : " + americanoCount + "잔");
                System.out.println("라      떼 : " + latteCount + "잔");
            }else if(choice.equals(PAYMENT)) {
                int totalPay = (americano.getPrice() * americanoCount) + (latte.getPrice() * latteCount);
                System.out.println("아메리카노 : " + americanoCount + "잔 총 : " + (americano.getPrice() * americanoCount));
                System.out.println("라      떼 : " + latteCount + "잔 총 : " + (latte.getPrice() * latteCount));
                System.out.println("총 결제 금액 : " + totalPay + "원 입니다.");
                System.out.println("감사합니다.");
                break;
            }else if(choice.equals(END)) {
                System.out.println("주문을 취소하고, 종료합니다");
                break;
            }else {
                System.out.println("잘못입력하였습니다.");
            }
        }

    }

}
