package ch07;

public class ForTest1 {

    public static void main(String[] args) {

        // 반복문 - 반복적인 패턴을 보인다면 반복문으로 만들어보자

        // 0~9까지 화면에 출력하세요.
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println("------------------------------");

        // 초기화식; 조건식(true / false); 증감식() << 마지막에는 ; 사용안함
        for (int i=0; i < 10; i++) {
            // 수행 구문; 조건식이 true라면 실행이 된다.
            // 1. i = 0;
            // 2. i가 10보다 작다면 (true라면) 실행한다.
            // 3. 그 후 ++i 적용
            // 4. i가 10이상이 되면 (false가 되면) 종료.
            System.out.println(i);
        }

    }

}
