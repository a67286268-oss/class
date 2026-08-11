package useful.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {
        // 컬렉션
        List<String> list = Arrays.asList("사과","포도","바나나");
        Stream<String> s1 = list.stream();
        // 배열
        String[] arr = {"사과","포도","바나나"};
        Stream<String> s2 = Arrays.stream(arr);
        //값을 직접 나열
        Stream<String> s3 = Stream.of("사과","포도","바나나");

        System.out.println("s1의 개수 : " + s1.count());
        System.out.println("s2의 개수 : " + s2.count());
        System.out.println("s3의 개수 : " + s3.count());

        System.out.println("원본 : " + list);
        // 스트림을 만들고 사용해도 원본은 그대로
    }
}
