package com.oop11;

public class ArrayTest {

    public static void main(String[] args) {

        // 배열(array) : 연관된 데이터를 모아서 통으로 관리하기위한 데이터타입
        // 변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러개의 데이터를 하나의 변수에 저장

        // 문법, 왜
        int[] intArr1 = new int[3]; // [][][] 4바이트 데이터공간을 3개 생성 : 보통 이방법을 사용
        int intArr2[] = new int[3]; // [][][] 같은의미
        // 중요 : 배열 선언이 아닌 사용할려면 반드시 먼저 몇개의 데이터가 들어갈지 배열의 길이를 지정해야 사용가능하다

        intArr1[0] = 10;
        intArr1[1] = 20;
        intArr1[2] = 30;
        // [10] [20] [30] <<이렇게 들어가있는상태
        // intArr1[3] = 40; << intArr1의 배열의 길이는 3칸
        // 3 = 4번째칸을 가르키므로 오류발생 런타임시점에러

        // 배열 사용방법 2번째 : 자주사용X
        int[] gradArray = new int[]{1, 2, 3};
        // 배열 선언과 배열의 값까지 초기화 //[1][2][3]
        int[] gradArray2 = {2, 3, 4}; // new int[]<< 생략가능
        // [2][3][4] << 결과

        // 5개의 크기를 가지는 배열선언
        double[] dArr1 = new double[5]; // [] [] [] [] [] 선언
        dArr1[0] = 0.1; // [0.1] [] [] [] []
        dArr1[1] = 0.2; // [0.1] [0.2] [] [] []

        // tip : 배열의 길이와 인덱스의 크기는 다르다
        // 인덱스의 크기 = n - 1 : 인덱스의 크기는 0번부터 시작하기때문
        // 배열의 길이가 30인 배열의 인덱스의 크기 : 29

        // 문제 1 : char 배열 2개 선언해서 초기화
        char[] cArr = new char[2];
        cArr[0] = '1';
        cArr[1] = '2';

        // 문제 2 : boolean 배열 3개 선언해서 초기화
        boolean[] bArr = new boolean[3];
        bArr[0] = true;
        bArr[1] = false;
        bArr[2] = true;

    }

}
