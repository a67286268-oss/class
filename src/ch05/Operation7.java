package ch05;

/**
 * 빠른 평가란?
 * 논리 연산에서 첫 번째 조건이 결과를 결정하는 경우
 * 두번째 조건을 평가하지 않는 것
 */

public class Operation7 {

    public static void main(String[] args) {

        int n1 = 5;
        int index = 0;

        // && 를 사용한 빠른평가
        // boolean result = ((n1 = n1 + 10) < 10) && ((index = index + 2) < 10);
        boolean result = ((n1 += 10) < 10) && ((index += 2) < 10);
        System.out.println(n1);
        System.out.println(index); // 첫 번째 조건에서 F가 나오면서 두 번째 조건이 실행하지 않음
        System.out.println(result);

        // || 을 사용한 빠른평가
        // n1은 위에서 실행이 되었기때문에 5가 아닌 15인 상태이다
        // index는 빠른평가로 실행되지 않았기때문에 0인 상태이다
        boolean result2 = ((n1 += 10) < 10) || ((index += 2) < 10);
        System.out.println(n1);
        System.out.println(index);
        System.out.println(result2);

        // 문제
        // 1. 빠른 평가 수식을 스스로 만들어보고 결과를 확인하는 코드 작성
        int n2 = 0;
        int n3 = 0;

        boolean result3 = ((n2 -= 5) == 0) && ((n3 += 3) == 3);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(result3);

    }

}
