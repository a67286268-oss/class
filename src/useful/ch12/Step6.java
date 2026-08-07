package useful.ch12;

import javax.swing.text.DateFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Step6 {


    public static void main(String[] args) {

        LocalDate birthDay = LocalDate.of(1998,8,31);
        LocalDate now = LocalDate.now();
        LocalDateTime nowTime = LocalDateTime.now();
        LocalDate xMas = LocalDate.of(2026,12,25);
        Period age = Period.between(birthDay,now);
        long daysBetween = ChronoUnit.DAYS.between(birthDay,now);
        long xMasBetweenDay = ChronoUnit.DAYS.between(now, xMas);

        //1. 생일이 무슨 요일이었는지 (한글로)
        DateTimeFormatter korean = DateTimeFormatter.ofPattern("내 생일 : yyyy년 MM월 dd일 (E)");
        System.out.println(birthDay.format(korean));
        System.out.println("=============================");

        //2. 기준 날짜 시점의 만 나이
        System.out.println("(만) 나이 : " + age.getYears() + "세");
        System.out.println("=============================");

        //3. 태어난 지 총 며칠이 지났는지
        System.out.println("태어난 후 보낸 일(DAY) : " + daysBetween + "일");
        System.out.println("=============================");

        //4. 기준 날짜부터 크리스마스까지 D-day
        System.out.println("오늘부터 크리스마스 D-day : " + xMasBetweenDay + "일");
        System.out.println("=============================");

        //5. 기준 시각을 "2025년 05월 13일 오후 02시 30분" 형식으로 출력
        DateTimeFormatter kor = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분");
        System.out.println(nowTime.format(kor));








    }

}
