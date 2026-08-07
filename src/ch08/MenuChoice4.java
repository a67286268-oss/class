package ch08;

import java.util.Scanner;

public class MenuChoice4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 엔터(\n) = 개행문자라고 한다
        // 스캐너 활용 = 문자열로 값 받기
        int menuNumber = sc.nextInt(); // 숫자 + 엔터(\n) nextInt는 정수값만 가지고가서 개행문자의 명령이 남는다
        sc.nextLine(); // 개행문자의 소비
        String name = sc.nextLine(); // 문자열 받기



    }

}
