package com.oop15;

public class LibraryMainTest {

    public static void main(String[] args) {

        Book b1 = new Book ("자바의 정석");
        Book b2 = new Book ("수학의 정석");

        Library library1 = new Library(5);
        library1.addBook(b1);
        library1.addBook(b2);
        library1.showBooks();

        System.out.println("도서관패관");

        // 주의 : 이 순간 객체가 사라지는 것이 아니라, GC의 수거 대상이 될 뿐이다.
        library1 = null;

        // 도서관은 사라졌지만 b1, b2는 여전히 살아있다.
        // 즉, b1, b2 변수가 각 Book 객체를 계속 붙잡고 있기 때문에 GC 대상이 안된다.
        // library1.showBooks();
        b1.display();
        b2.display();



    }

}
