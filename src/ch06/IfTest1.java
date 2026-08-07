package ch06;

public class IfTest1 {

    public static void main(String[] args) {

        // 만약 ... 이라면 >>> if, if else, if else if else
        // 주어진 조건에 따라서 실행이 다르게 이루어 지도록 구현할 수 있다.
        boolean f1 = true;

        // 단독 if 구문
        if (f1) {
            // 수행 구문
            System.out.println("주어진 식이 true이면 실행 됨");
        } // end of if

        System.out.println("프로그램을 종료 합니다.");

        // 중요 : 단독 if 구문은  >> 수행 구문이 실행될 수 도 있고 안될 수 도 있다.
    } // end of main

} // end of class
