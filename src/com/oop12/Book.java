package com.oop12;

public class Book {

    private String title;
    private String author;
    private int totalPage; // 값이없을때 0
    // 대문자로 시작하는 참조 변수 : null

    // 이 생성자는 외부에서 호출불가 private이기 때문
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int totalPage) {
        this(title, author);
        this.totalPage = totalPage;
    }

    // getter - 읽기만 가능
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void showInfo() {
        System.out.println("책정보");
        System.out.println("     제목 : " + title);
        System.out.println("     저자 : " + author);
        if (totalPage != 0) {
            System.out.println("총 페이지 : " + totalPage);
        }
    }

}
