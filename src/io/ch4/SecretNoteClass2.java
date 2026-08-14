package io.ch4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SecretNoteClass2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=====비밀 메모=====");
        System.out.println("");

        try {
            FileInputStream fis = new FileInputStream("assets/secretNoteClass.txt");

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char)(data - 3));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
