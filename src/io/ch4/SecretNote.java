package io.ch4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;
import java.util.stream.Stream;

public class SecretNote {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=====비밀 메모=====");
        System.out.print("저장할 메모를 입력하세요 : ");
        String input = sc.nextLine();

        String rawEncoded = Base64.getEncoder().encodeToString(input.getBytes(StandardCharsets.UTF_8));
        String encoding = "비밀 암호 : " + rawEncoded;

        byte[] decodedBytes = Base64.getDecoder().decode(rawEncoded);
        String decoding = "해독 암호 : " + new String(decodedBytes, StandardCharsets.UTF_8);

        try (FileOutputStream fos = new FileOutputStream("assets/SecretNote.txt", true)) {
            fos.write((encoding + "\n").getBytes(StandardCharsets.UTF_8));
            fos.write((decoding + "\n").getBytes(StandardCharsets.UTF_8));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sc.close();

    }
}
