package useful.ch17;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo1 {

    public static void main(String[] args) {

//        List<Integer> ages = new ArrayList<>();
//        ages.add(20);
//        ages.add(23);
//        ages.add(26);
        // 1. 지금까지 배운것
        List<Integer> ages = Arrays.asList(20,23,18,11,16,40);
        List<Integer> adultAges = new ArrayList<>();
        for (int age : ages) {
            if (age >= 18) {
                adultAges.add(age);
            }
        }
        System.out.println("for문 : " + adultAges);

        // 2. Stream방식
        // 오직 함수형 인터페이스 안에 추상메서드의 매개변수가 하나라면 소괄호도 생략가능
        List<Integer> adultAges2 = ages
                .stream()
                .filter(age -> age >= 18)
                .toList();
        System.out.println("stream : " + adultAges2);

    }
}
