package com.oop12;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class MyBookStore {

    // 현재 상황 추적
    static int lastIndexNumber = 0;

    // 전체 조회
    public static void readAll(Book[] books) {
        if (lastIndexNumber == 0) {
            System.out.println("저장된 책이 없습니다");
            return;
        }

        System.out.println("전체조회");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
            }
        }
    }

    // 전체 삭제
    public static void deleteAll(Book[] books) {
        System.out.println("전체삭제");
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
        lastIndexNumber = 0;
    }

    // 저장
    public static void save(Scanner sc, Book[] books) {
        if (lastIndexNumber > books.length) {
            System.out.println("저장공간이 부족합니다.");
            return;
        }

        System.out.println("책의 제목을 입력하세요");
        String title = sc.nextLine();
        System.out.println("책의 저자를 입력하세요");
        String author = sc.nextLine();

        Book book = new Book(title, author);
        books[lastIndexNumber] = book;
        lastIndexNumber++;
    }


    // 선택 조회
    public static void search(Scanner sc, Book[] books) {
        System.out.println("선택조회");
        System.out.print("조회할 책 제목을 입력해주세요 : ");
        String targetTitle = sc.nextLine();
        boolean isFind = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                // 문자열 비교는 반드시 equals사용
                // 문자열의 앞뒤 공백 자동제거 = trim()
                // 공백 사피 공백 엔스 공백 => 사피 공백 엔스 (앞뒤만제거)
                if (books[i].getTitle().equals(targetTitle.trim())) {
                    System.out.println("검색 결과 확인");
                    books[i].showInfo();
                    isFind = true;
                    break;
                }
            }
        }
        // isFind -> true or false
        if (!isFind) {
            System.out.println("검색한 책이 존재하지 않습니다.");
        }
    }

    // 선택 삭제
    public static void DeleteSelected(Scanner sc, Book[] books) {
        if (lastIndexNumber == 0) {
            System.out.println("삭제할 책이 없습니다");
            return;
        }
        System.out.print("삭제할 책 제목을 입력해주세요 : ");
        String targetTitle = sc.nextLine().trim();
        int targetIndex = -1; // -1 = 못 찾았다 라는 약속값
        for (int i = 0; i < lastIndexNumber; i++) {
            if(books[i] != null && books[i].getTitle().equals(targetTitle)) {
                targetIndex = i;
                break;
            }
        }
        if (targetIndex == -1) {
            System.out.println("해당 제목의 책을 찾을 수 없습니다");
            return;
        }

        System.out.println("[삭제대상]");
        books[targetIndex].showInfo();

        // 3단계 : 삭제할 자리 뒤에 있는 요소들을 한 칸씩 앞으로 당겨서 삭제할 대상 덮어 쓰기
        // [A][B][C][D] ---> 1 인덱스 삭제 ---> [A][C][D][D]
        for (int i = targetIndex; i < lastIndexNumber -1; i++) {
            books[i] = books[i + 1];
            // [B] ---> 1번째 인덱스  =   [C] ---> 2번째 인덱스 를 덮어 쓰기
        }

        // 4단계 : 맨 뒤 칸을 비우고 실제 개수를 하나 줄인다 (라이스 인덱스 번호 재 갱신)
        // [A][C][D][null]
        books[lastIndexNumber - 1] = null;
        lastIndexNumber--; // 관리하고 있는 인덱스 번호 - 1 처리
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[100];

        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화꽃이 피었습니다", "김진명");
        books[2] = new Book("흐르는 강물처럼", "파울로코엘료");
        books[3] = new Book("리딩으로 리드하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");
        // 샘플 데이터가 5개 이므로 인덱스 관리 번호로 사용
        lastIndexNumber = 5;

        boolean flag = true;

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String DELETE_SELECT = "5";
        final String END = "0";

        while (flag) {
            System.out.println("===== 메뉴 선택 =====");
            System.out.println("1 : 저장");
            System.out.println("2 : 전체조회");
            System.out.println("3 : 선택조회");
            System.out.println("4 : 전체삭제");
            System.out.println("5 : 선택삭제");
            System.out.println("0 : 종료");
            System.out.print("선택 : ");
            String select = sc.nextLine();

            if (select.equals(SAVE)) {
                save(sc, books);
            } else if (select.equals(SEARCH_ALL)) {
                readAll(books);
            } else if (select.equals(SEARCH_BY_TITLE)) {
                search(sc, books);
            } else if (select.equals(DELETE_ALL)) {
                deleteAll(books);
            } else if (select.equals(DELETE_SELECT)) {
                DeleteSelected(sc, books);
            } else if (select.equals(END)) {
                System.out.println("종료");
                flag = false;
            } else {
                System.out.println("잘못된 선택입니다");
            }
        }

    }

}
