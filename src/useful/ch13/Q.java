package useful.ch13;

import java.util.ArrayList;

public class Q {

//    **Q1.** 아래 코드의 출력 결과로 올바른 것은?
//
//            ```java
//    ArrayList<String> list = new ArrayList<>();
//list.add("A");
//list.add("B");
//list.add("C");
//list.remove(1);
//System.out.println(list);
//```
//
//        ```
//        ① [A, B, C]
//            ② [A, C] <<<<<< 2번
//            ③ [B, C]
//            ④ [A, B]
//            ```
//
//            ---
//
//            **Q2.** ArrayList 에서 실제 데이터 개수를 반환하는 메서드는?
//
//            ```
//              ① length
//              ② capacity()
//              ③ size()   <<<< 3번
//              ④ count()
//```
//
//        ---
//
//        **Q3.** 배열과 비교했을 때 ArrayList 의 장점으로 올바른 것은?
//
//            ```
//            ① 배열보다 항상 속도가 빠르다
//            ② 크기가 자동으로 조절되고 삽입/삭제 메서드를 제공한다 <<<2번
//            ③ 기본 타입(int, double)을 바로 저장할 수 있다
//            ④ 인덱스로 접근할 수 없다
//```
//
//        ---
//
//        **Q4.** ArrayList<String> 에서 정수를 add() 하면 어떻게 되나요?
//
//            ```
//            ① 자동으로 String 으로 변환되어 저장된다
//            ② 컴파일 오류가 발생한다 << 2번
//            ③ 런타임 오류가 발생한다
//            ④ 문제 없이 저장된다
//```
//
//        ---
//
//        **Q5.** 아래 코드에서 "바나나" 가 포함되어 있는지 확인하는 메서드로 올바른 것은?
//
//            ```java
//    ArrayList<String> fruits = new ArrayList<>();
//    fruits.add("사과");
//    fruits.add("바나나");
//```
//
//        ```
//        ① fruits.has("바나나")
//        ② fruits.exists("바나나")
//        ③ fruits.contains("바나나") 3번
//        ④ fruits.find("바나나")
//        ```


    // 배열 버전
    // 아래 코드를 ArrayList로 변경
//    String[] users = new String[100];
//    int count = 0;
//    users[count++] = "철수";
//    users[count++] = "영희";
//    users[count++] = "민준";
    public static void main(String[] args) {

        ArrayList<String> users = new ArrayList<>();
        users.add("철수");
        users.add("영희");
        users.add("민준");

    }

//    **Q1.** Vector 가 ArrayList 와 다른 가장 큰 특징은?
//
//            ```
//            ① 더 많은 데이터를 저장할 수 있다
//            ② 모든 메서드가 동기화되어 멀티스레드 환경에서 안전하다   2
//            ③ 더 많은 메서드를 제공한다
//            ④ 제네릭을 사용할 수 없다
//```
//
//        ---
//
//        **Q2.** 소켓 채팅 서버에서 ArrayList 대신 Vector 를 사용하는 이유는?
//
//            ```
//            ① Vector 가 더 빠르기 때문에
//            ② 여러 ClientHandler 스레드가 동시에 접근하면   2
//               ArrayList 는 데이터 손상이 발생할 수 있기 때문에
//            ③ ArrayList 는 PrintWriter 를 저장할 수 없기 때문에
//            ④ Vector 가 더 많은 데이터를 저장할 수 있기 때문에
//```
//
//        ---
//
//        **Q3.** 단일 스레드 프로그램에서 ArrayList 와 Vector 중 무엇이 더 적합한가?
//
//            ```
//            ① Vector (항상 안전하므로)
//            ② ArrayList (동기화 오버헤드 없어 더 빠름)  2
//            ③ 둘 다 동일하다
//            ④ 항상 Vector 를 써야 한다
//```
//
//        ---
//
//        **Q4.** 스레드 충돌(Race Condition) 에 대한 설명으로 올바른 것은?
//
//            ```
//            ① 두 스레드가 순서대로 처리하는 것
//            ② 여러 스레드가 동시에 같은 데이터에 접근해서 데이터가 손상되는 현상  2
//            ③ 스레드가 너무 빠르게 실행되는 현상
//            ④ 스레드가 종료되지 않는 현상
//```
//
//        ---
//
//        **Q5.** 아래 코드에서 Vector 를 ArrayList 로 바꾸면 안 되는 이유는?
//
//            ```java
//    private static Vector<PrintWriter> clientWriters = new Vector<>();
//// 여러 ClientHandler 스레드가 동시에 add(), remove() 호출
//```
//
//        ```
//            ① ArrayList 는 PrintWriter 를 저장할 수 없다
//            ② ArrayList 는 멀티스레드 동시 접근 시 데이터 손상이 발생할 수 있다  2
//            ③ ArrayList 의 크기가 부족하다
//            ④ ArrayList 는 remove() 메서드가 없다
//```






}
