package ch05;

/**
 * 논리 연산자 ( && , || , ! )
 * && : 그리고 (전부 T일 경우에만 T 나머진 F)
 * || : 또는 (하나라도 T일 경우에는 T 모두 F여야 F)
 * ! : 부정 (T를 F로 / F를 T로 변환)
 */
public class Operation6 {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        // 1. &&
        boolean flag1 = (n1 > 0 && n2 > 0);
        System.out.println(flag1);

        boolean flag2 = (n1 > 0 && n2 < 0);
        System.out.println(flag2);

        System.out.println("-----------------------------------------");

        // 2. ||
        boolean f1 = (n1 > 0 || n2 > 0);
        System.out.println(f1);

        boolean f2 = (n1 > 0 || n2 < 0);
        System.out.println(f2);

        boolean f3 = (n1 < 0 || n2 < 0);
        System.out.println(f3);

        // 3. !
        System.out.println(!true);
        System.out.println(!false);

    }

}
