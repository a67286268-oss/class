package ch08;

public class BreakTest1 {

    public static void main(String[] args) {

        // 중간에 멈추는 break 구문
        // 만약 i 값이 7이라면 중간에 멈춰라
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 7) {
                break;
            }
        }

        System.out.println("--------------------------------");

        // 문제 1. 100 ~ 200까지 화면에 출력하는 코드를 작성
        // 2. 단 151에 도달했다면 반복을 멈춰주세요
        // 3. while구문 사용
        int start = 100;
        int end = 200;
        while (start <= end) {
            System.out.println(start);
            start++;
            if (start == 151) {
                break;
            }

        }

    }

}
