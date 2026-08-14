package io.ch6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {

    public static void main(String[] args) {


        String sourceFilePath = "assets/Screenshots.zip";
        String destinationFilePath = "assets/img1_copy.zip";
        long startTime = System.nanoTime();

        try (FileOutputStream fos = new FileOutputStream(destinationFilePath);
             FileInputStream fis = new FileInputStream(sourceFilePath)) {
            int data;
            while ( (data = fis.read()) != -1 ) {
                fos.write(data);
            }
            System.out.println("파일 복사 완료");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("나노 초 : " + duration);
        System.out.println("초 값 : " + duration / 1_000_000_000.0);


    } // end of main
}