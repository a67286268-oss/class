package ch08;

public class ContinueTest3 {

    public static void main(String[] args) {
        int i;


        // 369 게임 1~30까지 세되,
        // 3,6,9 가 들어가는 숫자는 "짝!"이라고 외칩니다.
        for (i = 1; i <= 30; i++) {
            int C = 0;
            int one = i % 10;
            int ten = (i / 10) % 10;
            if (one == 3 || one == 6 || one == 9) {
                C++;
            }
            if (ten == 3 || ten == 6 || ten == 9) {
                C++;
            }
            if (C == 0) {
                System.out.println(i);
            } else if (C == 1) {
                System.out.println("짝");
            } else if (C == 2) {
                System.out.println("짝짝");
            }
        }

        // 샘플 테스트 코드
        // 나머지 연산자와 10이라는 숫자를 활용하면 끝 자리를 추출할 수 있다.
        //System.out.println(23 % 10); // 23 / 10 = 2 >> 3
        //System.out.println(27 % 10); // 23 / 10 = 2 >> 7
        //System.out.println(29 % 10); // 23 / 10 = 2 >> 9

    }

}
