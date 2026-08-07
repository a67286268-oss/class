package com.oop8;

public class Person {

    //this의 3가지 사용방법
    // 1. 자기 자신의 주소를 가르킨다.
    // 2. 생성자에서 다른 생성자를 호출할 수 있다.
    // 3. 자기 자신의 주소값 return 값으로 반환 가능.

    private String name;
    private int age;
    private String phone;
    private String gender; // F,M

    // 생성자 1. this 사용방법
    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    // 생성자 2. this 사용방법
    public Person(String name, int age, String phone) {
        // this.name = name;
        // this.age = age;
        this(name,age);
        this.phone = phone;
    }

    // 생성자 2-1(복습) this 사용법
    public Person(String name,int age,String phone,String gender) {
        this(name,age,phone);
        this.gender = gender;
    }

    // 메서드를 통해 자기자신에 주소값 반환 시켜야 하는 경우 this를 사용할수있다.

}
