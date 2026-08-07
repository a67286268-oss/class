package ch07;

public class ForTest3 {

    public static void main(String[] args) {

        // 1~ 100까지 수 중 총합을 구하시오
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("합 : " + sum);

        // 홀수의 합
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("합 : " + sum);

        // 반복문에 증감식을 2씩 증가 시켜보자
        for (int i = 0; i < 10; i += 2) {
            System.out.println("2씩증가 + " + i);
        }

        //문제 - 화면에 10 9 8 7 6 5 4 3 2 1 을 출력하는 코드를 작성하시오.
        //단 for문 활용
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        // 2중for문
        // 0 1 2
        // 0 1 2 << 출력
        for (int i =0; i<2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(j);
            }
        }

    }

}


