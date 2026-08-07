package com.oop11;

public class ArrayTest2 {

    public static void main(String[] args) {

        String s1 = "안녕";
        String s2 = new String("안녕");

        // 문자열 배열

        // 선언
        String[] names = new String[5];

        //초기화
        names[0] = "김씨";
        names[1] = "나씨";
        names[2] = "박씨";

        // 인덱스 연산자를 사용하여 값을 조회
        System.out.println(names);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // 인덱스 연산자를 사용해 값을 수정
        names[0] = "Mr Kim";
        names[1] = "Mr Na";
        names[2] = "Mr Park";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // 인덱스 연산자를 사용해 삭제 String에서 값이없음 << null;
        // null : 주소가 없다
        names[0] = null;
        names[1] = null;
        names[2] = null;

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]); // << null

        System.out.println(names.length); // 배열의 크기 확인 .length
        System.out.println(names.length - 1); // 인덱스의 크기 확인

    }
}
