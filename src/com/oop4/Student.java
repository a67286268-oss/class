package com.oop4;

/**
 * 생성자 (constructor)
 * 객체를 생성할 때 다음과 같은 모양으로 객체를 만들어라고 지시하는것(강제성)
 * 생성자는 객체를 생성할 때 반드시 존재 해야 한다.
 */
public class Student {

    int id;
    String name;
    int grade;

    // 2. 사용자 정의 생성자
     public Student(int n, String s, int g) {
        // 생성자는 객체를 메모리에 올릴 때(인스턴스화) 가장 먼저 실행되는 코드이다
        id = n;
        name = s;
        grade = g;
    }

    public void showInfo() {
        System.out.println("======상태창======");
        System.out.println("학번 : " + id);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
    }

}
