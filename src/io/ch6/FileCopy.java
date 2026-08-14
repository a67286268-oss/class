package io.ch6;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {

        readFile();

    }

    // 파일 복사기능
    // 단 파일은
    public static void readFile() {

        try {
            FileInputStream readFile = new FileInputStream("assets/Screenshots.zip");
            FileOutputStream copyFile = new FileOutputStream("assets/CopyFile.zip",true);
            int data;
            byte[] buffer = new byte[8192];
            while ((data = readFile.read(buffer)) != -1) {
                copyFile.write(buffer, 0, data);
                System.out.println("복사완료 : " + copyFile);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
