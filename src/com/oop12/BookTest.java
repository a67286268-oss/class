package com.oop12;

public class BookTest {

    public static void main(String[] args) {

        Book[] books = new Book[10];
        books[0] = new Book("플러터UI실전", "김근호", 300);
        books[1] = new Book("무궁화꽃이 피었습니다","김진명",500);
        books[2] = new Book("흐르는 강물처럼","파울로코엘료",250);
        books[3] = new Book("리딩으로 리드하라","이지성",450);
        books[4] = new Book("사피엔스","유발하라리",850);

        books[9] = new Book("홍길동전","허균",350);

        // books[0] 인덱스에 있는 객체의 title
        // 객체 안에 접근해서 정보 가져오기
//        String title1 = books[0].getTitle();
//        String author1 = books[0].getAuthor();
//        int totalPage1 = books[0].getTotalPage();

        for (int i = 0; i <books.length; i++) {
            // books[i].getTitle();
            // 방어코드
            if (books[i] == null) {
                continue;
            }
            System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
            // NullPointerException오류 : 객체를 생성하지 않았거나 가르키는 주소가 없을때
        }

    }

    static int lastIndexNumber = 0;

    // 전체 조회기능(R)
    public static void readAll() {

    }

    // 저장 기능(C)
    public static void save() {

    }

    // 수정 기능(U)
    public static void update() {

    }

    // 전체 삭제 기능 (D)
    public static void delete() {

    }


    // 심화

    // 선택 조회

    // 선택 삭제

}


