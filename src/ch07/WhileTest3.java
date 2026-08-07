package ch07;

import java.util.Scanner;

public class WhileTest3 {

    public static void main(String[] args) {

        // while문을 활용하여
        // 1. 1~10을 더해서 55 출력
        // 2. 끝 값을 직접 입력하여 연산
        Scanner sc = new Scanner (System.in);
        System.out.print("끝 값을 입력하시오 : ");

        int start = 0;
        int end = sc.nextInt();
        int sum = 0;

        while (start <= end) {
            sum += start;
            start++;
        }

        System.out.println("합 : "+ sum);

    }

}
