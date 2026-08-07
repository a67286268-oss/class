package com.oop8;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title,String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title,String author,int price) {
        this(title,author);
        this.price = price;
    }


}
