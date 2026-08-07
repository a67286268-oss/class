package com.oop6;

public class AccountMainTest {

    public static void main(String[] args) {

        Account ac = new Account();

        ac.withdraw(5_000);
        System.out.println();
        ac.deposit(10_000);
        System.out.println();
        ac.deposit(-1000);
        System.out.println();
        ac.withdraw(5000);
        System.out.println();
        ac.showInfo();

        // 접근 지시자가 필요한이유
        // 가상 시나리오
        // 나는 객체의 행동인 입금하는 기능을 만들어 두었는데
        // 신입이 실수로 입금 하는 기능이 아닌 직접 변수에 접근 값을 수정한다면
        // 의도하지않은 결과를 발생시킬수있다

        // System.out.println("-------------------");
        // ac.balance = 10_000; // private로 변경 실수예방
        // ac.showInfo();

        // 변수에 직접 접근해서 값을 수정할 경우 실수할 가능성이 높다.
        // 그래서 우리는 변수에 private를 설정해서 필드에 안보이게 하는게 좋다

    }
}
