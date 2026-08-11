package useful.ch17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Stream API 지연 실행
// 중간 연산은 호출해도 그즉시 실행안되고 최종 연산이 호출될때 한꺼번에 실행
public class StreamLazyDemo3 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3);

        // 중간 연산만 호출
        System.out.println("1. 중간 연산만 호출");
        Stream<Integer> stream1 = nums.stream()
                .filter(n -> {
                    System.out.println("2. filter 실행 : " + n);
                    return n % 2 == 1;
                });

        System.out.println("===========> 호출?");
        System.out.println("3. 최종 연산");
        stream1.forEach( n -> System.out.println(" forEach 구문 실행(최종연산) : " + n));
    }
}
