package ch02;

/**
 * 문자 데이터 타입
 * char 자료형 크기는 2byte입니다
 */
public class DataType2 {

    public static void main(String[] args) {

        // 기본 자료형 - 문자타입(사실은 정수형)
        // 문자를 저장할 때 사용한다
        // 단 하나의 문자만 저장할 수 있다.
        char charBox ='가';
        // char charBox2 ='가나'; [][][][][][][][] [][][][][][][][]
        System.out.println(charBox);

        System.out.println('a');
        System.out.println('b');
        System.out.println('c');
        System.out.println("d");

        char Ea = 'A'; // [][][][] << 65저장
        System.out.println((int)Ea);
        // char Eb = "B"; "" 쌍따옴표는 문자가아닌 문자들이 모인 문자열을 나타냄(String)

    }
} // end of class
