package ch07;

public class WhileTest1 {

    public static void main(String[] args) {

        // 무한루프를 조심해야함
        int i = 1;
        while(i<10) {
            System.out.println("값 = " + i);
            // 조건식의 처리가 없다면 무한히 반복
            i++;
        }
        System.out.println("-----------------------------------");

        int n1 = 1;
        int sum1 = 0;
        while (n1 <=10) {
            sum1 += n1;
            n1++;
        }
        System.out.println("합 : " + sum1);

    }

}
