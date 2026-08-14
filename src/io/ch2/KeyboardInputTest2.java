package io.ch2;

import java.io.IOException;

public class KeyboardInputTest2 {

    public static void main(String[] args) throws IOException {

        System.out.println("알파벳 여러개를 쓰고 enter를 누르세요");

        int i;
        // ?
        while ( (i = System.in.read()) != '\n' ) {
//            System.out.println("i : " + i);
//            System.out.println("문자 변환 : " + (char)i);
            System.out.print((char)i);
        }

    }

}
