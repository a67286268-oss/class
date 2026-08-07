package com.oop10;

public class Employee {

    int employeeNumber; // 고유 사원번호
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
        employeeNumber = Company.empSerialNumber;
        Company.empSerialNumber++;
    }

}
