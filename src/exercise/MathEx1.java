package exercise;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class MathEx1 {



    public static void main(String[] args) {

        final String MUL = "1";
        final String ADD = "2";
        final String SUB = "3";
        final String DIV = "4";
        final String END = "5";

        Scanner sc = new Scanner(System.in);

        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;

        while (true) {
            System.out.println("====람 다====");
            System.out.println("====메 뉴====");
            System.out.println("1. 곱하기 2. 더하기 3. 빼기 4. 나누기 5. 종료");
            System.out.print("연산 선택 : ");
            String choice = sc.nextLine().trim();

            if (choice.equals(MUL)) {
                System.out.print("x의 값 입력 : ");
                int a = sc.nextInt();
                System.out.print("y의 값 입력 : ");
                int b = sc.nextInt();

                System.out.println("곱하기 : " + mul.op(a,b));

            } else if (choice.equals(ADD)) {
                System.out.print("x의 값 입력 : ");
                int a = sc.nextInt();
                System.out.print("y의 값 입력 : ");
                int b = sc.nextInt();

                System.out.println("더하기 : " + add.op(a,b));

            } else if (choice.equals(SUB)) {
                System.out.print("x의 값 입력 : ");
                int a = sc.nextInt();
                System.out.print("y의 값 입력 : ");
                int b = sc.nextInt();

                System.out.println("빼 기 : " + sub.op(a,b));
            } else if (choice.equals(DIV)) {
                System.out.print("x의 값 입력 : ");
                int a = sc.nextInt();
                System.out.print("y의 값 입력 : ");
                int b = sc.nextInt();

                if (a != 0 && b !=0) {
                    System.out.println();
                    System.out.println("나누기 : " + div.op(a,b));
                } else {
                    System.out.println();
                    System.out.println("0을 나눌수 없습니다");
                }
            } else if (choice.equals(END)) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("잘못입력했습니다.");
            }
        }




    }

}
