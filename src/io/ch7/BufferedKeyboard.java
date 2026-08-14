package io.ch7;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class BufferedKeyboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("저장할 데이터를 입력해주세요 : ");
        String save = sc.nextLine().trim();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("assets/Buffered.txt"));
            bw.write(save + "\n");
            bw.flush();
            System.out.println(save + "저장 완료");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
