package ch06;

import java.util.Scanner;

public class IfTest4 {

    public static void main(String[] args) {

        // 키보드에서 입력 받을 도구 준비
        // Scanner sc = new Scanner(System.in);
        // System.out.println("성적을 입력하세요: ");
        // int score = sc.nextInt();
        // System.out.println("score : " + score);

        // 조건문을 사용해서 입력 받은 값에 따라 학점을 출력하는 코드 입력
        // 문제
        char result;
        // 90점 이상이면 A 출력
        // 80점 이상이면 B 출력
        // 70점 이상이면 C 출력
        // 60점 이상이면 D 출력
        // 59점 이하이면 F 출력
        // 사용자가 값을 잘못 입력하는 경우 방어적 코드를 잘 작성해주어야 한다.
        Scanner sc1 = new Scanner(System.in);
        System.out.print("성적을 입력하세요 : ");
        int score1 = sc1.nextInt();
        if (100 <= score1 || score1 <= 0) {
            System.out.println("잘 못 입력하셨습니다 다시실행하세요.");
            // 실행에 제어권을 반납
            return;
        }
        if (score1 >= 90) {
            result = 'A';
        } else if (score1 >= 80) {
            result = 'B';
        } else if (score1 >= 70) {
            result = 'C';
        } else if (score1 >= 60) {
            result = 'D';
        } else {
            result = 'F';
        }
        // 당신의 학점은 X 입니다
        System.out.println("당신의 학점은 " + result + " 입니다.");


    } // end of main

} // end of class
