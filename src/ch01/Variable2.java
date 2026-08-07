package ch01;

/**
 * 복습 : 변수란 값을 담을 수 있는 메모리상자
 * 1. 변수 선언
 * 2. 변수에 값을 대입
 * 3. 변수에 접근 : (변수이름)
 */
public class Variable2 {

    // 메인 함수(실행의 시작 점)
    public static void main(String[] args) {

        // 변수를 만들 때 규칙이 있습니다
        // 1. 대소문자를 명확히 구분하며 길이에 제한이 없다.
        int age = 10; // 변수에 선언과 동시에 초기화(값을 대입)
        // int age = 10; 같은 중괄호{} 영역안에서는 동일한 변수를 선언할 수 없다.
        int aGe = 10;
        int aGE = 10;

        // 2. 자바에서 사용하는 예약어는 사용할 수 없다.
        // int, double, for, while, list ... 미리 선점되어 있는 단어는 변수로 사용할 수 없다.
        // int for; << 오류발생

        // 3. 특수문자는 _(언더바) , $(달러) 표기만 사용가능
        int _count;
        // int *count; : *은 변수 선언시 사용 불가
        int $_tel;
        int tel_count_$age;

    } // end of main

} // end of class
