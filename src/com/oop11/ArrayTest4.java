package com.oop11;

public class ArrayTest4 {

    public static void main(String[] args) {

        // 문자열 배열

        // 선언
        String[] names = new String[10];

        //초기화
        names[0] = "김씨";
        names[1] = "나씨";
        names[2] = "박씨";
        names[9] = "최씨";

        // 요소만 출력하도록 코드를 수정
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                continue;
            }
            System.out.println(names[i]);

        }

    }
}
