package useful.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();

        System.out.println(result.toString());

        List<Integer> result2 = new ArrayList<>();
        for (int num : numbers) {

            if (num % 2 == 0) {
                num *= num;
                result2.add(num);
            }

        }
        System.out.println("result2 : " + result2);

    }
}