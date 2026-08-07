package ch05;

public class Operation8 {

    public static void main(String[] args) {

        int n1 = 7; // n1이 홀수인지 짝수인지 구별
        char r1 = (n1 % 2 == 0) ? '짝' : '홀';
        System.out.println(r1);

        boolean isOk = (5 > 3) ? true : false;
        System.out.println(isOk);

        // 두 수중에 큰 수를 max라는 변수에 담으세요
        int max = (10 > 1) ? 10 : 1;
        System.out.println(max);

        int n2 = 100;
        int n3 = 300;
        int m1 = 0;
        // n2 와 n3 값을 비교해서 더 큰수를 m1에 담으세요
        // 단 삼항연산자 사용
        m1 = (n2 > n3) ? n2 : n3;
        System.out.println(m1);

    }

}
