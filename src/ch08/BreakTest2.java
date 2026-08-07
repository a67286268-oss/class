package ch08;

import java.util.Scanner;

public class BreakTest2 {

    public static void main(String[] args) {

        // 문제
        // 1. 1~100 까지 반복문 진행
        // 2. 그중 3의 배수만 출력
        // 3. 50이상이 되면 반복문 종료
        // 4. for문으로 코드 작성

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            } else if (i >= 50) {
                break;
            }
        }
        System.out.println();

        int end = 0;
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int start = 0; start <= end; start++) {
            if (start == 0) {
                System.out.print("시작 값을 입력하세요 : ");
                start = sc.nextInt();
                System.out.print("마지막 값을 입력하세요 : ");
                end = sc.nextInt();

                if (start > end) {
                    System.out.println("오류 : 시작값은 마지막값보다 클 수 없습니다.");
                    return;
                }
            }
            sum += start;
        }
        System.out.println("합 : " + sum);

    }

}
