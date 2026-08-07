package com.oop5;

public class GoingToSchool {

    public static void main(String[] args) {

        Bus bus133 = new Bus(133);
        Bus bus57 = new Bus(57);
        Subway sub2 = new Subway(2);
        Rice rice = new Rice("현미밥",10);
        Student studentKim = new Student("김길동",10000);
        Student studentLee = new Student("이길동",5000);

        studentKim.takeBus(bus133);
        studentLee.takeBus(bus133);
        studentKim.takeSubway(sub2);
        studentLee.takeSubway(sub2);
        studentKim.eat(rice);
        studentLee.eat(rice);

        studentKim.showInfo();
        studentLee.showInfo();
        bus133.showInfo();
        sub2.showInfo();
        rice.showInfo();

    }
}
