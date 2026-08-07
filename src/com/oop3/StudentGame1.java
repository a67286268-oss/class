package com.oop3;

public class StudentGame1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = 1547;
        s1.studentName = "양현";
        s1.address = "재송동";
        s1.showInfo();

        System.out.println("--------------------------------");
        // 연습 문제
        // 1. 시험을 친다. (메서드 설계)호출
        s1.english = 90;
        s1.korean = 85;
        s1.math = 90;
        s1.studyStart();
        System.out.println("---------------------------------");

        // 2. 청소를 한다. (메서드 설계)호출
        s1.clean();


    }

}
