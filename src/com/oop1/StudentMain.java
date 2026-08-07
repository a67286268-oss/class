package com.oop1;

public class StudentMain {

    public static void main(String[] args) {

        // 내가 설계한 클래스를 메모리에 직접 올려보자.
        // JVM메모에 올릴수있다.
        Student s1 = new Student();
        Student s2 = new Student();

        int grade = 10;
        double height = 1.1;

        System.out.println("grade :" + grade);
        System.out.println("height :" + height);
    }
}
