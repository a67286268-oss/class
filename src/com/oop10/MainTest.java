package com.oop10;

public class MainTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee("김씨","개발팀");
        Employee emp2 = new Employee("이씨","디자인팀");
        Employee emp3 = new Employee("강씨","보안팀");

        System.out.println(emp1.employeeNumber);
        System.out.println(emp2.employeeNumber);
        System.out.println(emp3.employeeNumber);


    }
}
