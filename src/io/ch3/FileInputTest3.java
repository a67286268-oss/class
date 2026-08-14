package io.ch3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class FileInputTest3 {

    public static void main(String[] args) {
        // 도전 과제 1
        // in.read(byte[] b) 를 사용해서 코드를 완성해보세요

        byte[] b = new byte[1024];

        int readCount;
        LocalDateTime start = LocalDateTime.now();
        try (FileInputStream in = new FileInputStream("assets/a.txt")) {

            while ( (readCount = in.read(b)) != -1 ) {

                for (int i = 0; i < readCount; i++) {
                    System.out.print((char)b[i]);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        LocalDateTime end = LocalDateTime.now();

        long ns1 = ChronoUnit.NANOS.between(start,end);

        System.out.println("걸린시간(ns) : " + ns1);



        LocalDateTime start1 = LocalDateTime.now();

        try (FileInputStream in1 = new FileInputStream("assets/a.txt")) {
            int readData;
            while ( (readData = in1.read()) != -1 ) {
                System.out.print((char)readData);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        LocalDateTime end1 = LocalDateTime.now();
        long ns2 = ChronoUnit.NANOS.between(start1,end1);

        System.out.println("걸린시간(ns) : " + ns2);

    }

}
