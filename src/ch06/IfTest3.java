package ch06;

public class IfTest3 {

    public static void main(String[] args) {

        // if else if else 구문 - 주어진 조건이 여러개 일 때 사용한다.

        int age = 27;

        if (age<=7) {
            System.out.println("어린이 입니다.");
        } else if (age <= 13) {
            System.out.println("초등학생 입니다.");
        } else if (age <= 16) {
            System.out.println("중학생 입니다.");
        } else if (age <= 19) {
            System.out.println("고등학생 입니다.");
        } else {
            // 그 외 나머지
            System.out.println("성인 입니다.");
        }
        System.out.println("프로그램 종료");

    } // end of main

} // end of class
