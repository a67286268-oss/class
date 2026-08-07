package exercise;

public class Exercise0 {

    public static void main(String[] args) {

        // 2중for문
        // 0 1 2
        // 0 1 2 << 출력
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 별자리
        /*
        *
        ***
        *****
        *******
        (역으로도)
         */
        int i, j;
        for (i = 1; i <= 7; i += 2) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 7; i >= 1; i -= 2) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
