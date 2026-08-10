package useful.ch15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordBook {

    public static void main(String[] args) {

        Map<String, String> words = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        final String ADD = "1";
        final String SEARCH = "2";
        final String SEE_ALL = "3";
        final String END = "4";

        words.put("apple","사과");
        words.put("banana","바나나");
        words.put("cherry","체리");

        while (true) {
            System.out.println("======영어 단어장=====");
            System.out.println("1.단어추가 2.단어검색 3.전체출력 4.종료");
            System.out.print("선택 : " );
            String choice = sc.nextLine().trim();
            if (choice.equals(ADD)) {

                System.out.print("영어단어를 입력하세요 : ");
                String english = sc.nextLine();
                System.out.print("한글뜻을 입력하세요 : ");
                String korean = sc.nextLine();

                words.put(english,korean);

            } else if (choice.equals(SEARCH)) {

                System.out.println("=== 단어 검색 프로그램 ===");
                System.out.print("검색할 단어를 입력하세요 : ");
                String searchWord = sc.nextLine().trim();

                if (words.containsKey(searchWord)) {
                    String meaning = words.get(searchWord);
                    System.out.println("뜻: " + meaning);
                } else {
                    System.out.println("-> 사전에 등록되지 않은 단어입니다.");
                }
            } else if (choice.equals(SEE_ALL)) {
                System.out.println(words);
            } else if (choice.equals(END)) {
                System.out.println("종료합니다");
                break;
            } else {
                System.out.println("잘못입력하셨습니다");
            }
        }

    }
}
