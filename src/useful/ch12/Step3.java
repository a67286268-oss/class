package useful.ch12;

import java.time.LocalDate;
import java.time.Period;

public class Step3 {

    public static void main(String[] args) {

        // Period - 나이와 D-day 구하기

        LocalDate birth = LocalDate.of(2000,5,12);
        LocalDate today = LocalDate.of(2026, 8, 7);

        // Period 클래스 년,월,일 세개의 int를 하나로 묶어서 담는 상자
        Period age = Period.between(birth,today);

        System.out.println("나이 : " + age.getYears() + "세");
        System.out.println("나이정확하게 : " + age.getYears() + "년 0" + age.getMonths() + "개월 " + age.getDays() + "일");

    }

}
