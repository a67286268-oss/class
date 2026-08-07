package com.oop3;

public class Student {

    int math;
    int korean;
    int english;
    int studentId;
    String studentName;
    String address;

    void study() {
        System.out.println("학생이 공부를 합니다");
    }

    void breakTime() {
        System.out.println("학생이 휴식을 합니다");
    }

    void showInfo() {
        System.out.println("-----상태창-----");
        System.out.println("학생 ID : " + studentId);
        System.out.println("학생 이름 : " + studentName);
        System.out.println("학생 주소 : " + address);
    }

    void studyStart() {
        System.out.println("시험을 칩니다");
        System.out.println("국어 : " + korean);
        System.out.println("수학 : " + math);
        System.out.println("영어 : " + english);
    }

    void clean() {
        System.out.println("청소를 합니다");
    }

}
