package useful.ch17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDemo6 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5,4,2,1,3);

        // 오름차순
        List<Integer> asc = nums.stream()
                .sorted()
                .toList();

        System.out.println(asc);

        // 내림차순
        List<Integer> desc = nums.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(desc);

    }
}
