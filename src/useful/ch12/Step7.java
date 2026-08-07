package useful.ch12;

import swing.ch04.ColorChangeFrame;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Step7 {

    public static void main(String[] args) {
        int sum = 0;

        LocalDateTime start = LocalDateTime.now();

        for (int i = 1; i <= 100_000_000; i++) {

            sum += i;

        }

        LocalDateTime end = LocalDateTime.now();

        long ms = ChronoUnit.MILLIS.between(start,end);

        System.out.println("코드 완성 시간(ms) : " + ms);
        System.out.println("결과값 : " + sum);


    }
}
