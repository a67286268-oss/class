package useful.ch13;

import java.util.ArrayList;
import java.util.List;

public class MyStore {

    public static void main(String[] args) {

        //ArrayList 타입
        ArrayList<String> list1 = new ArrayList<>();

        //List타입
        List<String> list2 = new ArrayList<>();

        //추가 (add)
       // list1.add("사과"); // 마지막 배열로 추가
        // list2.add(0,"포토"); // 지정한 인덱스로 저장

        // 조회
//        list1.get(0);
//        list1.size(); // 배열사이즈 갯수
//        list1.contains("사과"); // 포함 여부 true/false
//        list1.indexOf("사과"); // 위치 반환 없으면 -1
//
//        // 삭제
//        list1.remove("사과"); // 값으로 삭제
//        list1.remove(0); // 인덱스로 삭제
//        list1.clear(); // 전체삭제
//
//        // 확인
//        list1.isEmpty(); // 비어있는지 true/false로 반환

        // list2 사용해서 제공하는 메서드를 직접 작성하고 결과출력
        list2.add("사과");
        list2.add("포도");
        list2.add("복숭아");
        list2.add("자두");

        System.out.println("리스트 사과포함여부 : " + list2.contains("사과"));
        list2.remove("사과");
        System.out.println("리스트 사과삭제 : " + list2.indexOf("사과"));
        list2.clear();
        System.out.println("리스트 삭제확인 : " + list2.isEmpty());


    }
}
