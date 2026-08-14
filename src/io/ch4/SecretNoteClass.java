package io.ch4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SecretNoteClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=====비밀 메모=====");
        System.out.print("저장할 메모를 입력하세요 : ");
        String input = sc.nextLine();

        try (FileOutputStream fos = new FileOutputStream("assets/secretNoteClass.txt", true)) {
        byte[] original = input.getBytes();
        byte[] encrypted = new byte[original.length];

        for (int i = 0; i < original.length; i++) {
            encrypted[i] = (byte)(original[i] + 3);
        }
        fos.write(encrypted);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sc.close();

    }

}
