package com.oop7;

import java.util.Scanner;

public class GoingToSchoolMenu {

    public static void main(String[] args) {
        int error = 0;
        Scanner sc = new Scanner(System.in);
        final int EAT = 1;
        final int BUS = 2;
        final int SUBWAY = 3;
        final int MY_INFO = 4;
        final int END = 0;

        System.out.print("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();

        Student student = new Student(name, 5500);
        Rice kimchi = new Rice("김치볶음밥", 3000);
        Rice vegetable = new Rice("야채볶음밥", 2500);
        Bus bus133 = new Bus(133, 1000);
        Subway line1 = new Subway(1, 1200);

        while (true) {
            System.out.println();
            System.out.println("행동 패턴");
            System.out.println("1. 밥먹기");
            System.out.println("2. 버스타기");
            System.out.println("3. 지하철타기");
            System.out.println("4. 내 정보");
            System.out.println("5. 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();
            System.out.println();

            if (choice == EAT) {
                while (true) {
                    System.out.println("1.김치볶음밥\n2.야채볶음밥");
                    System.out.print("선택 : ");
                    int choice1 = sc.nextInt();
                    System.out.println();

                    if (choice1 == 1) {
                        student.eat(kimchi);
                        error = 0;
                        break;

                    } else if (choice1 == 2) {
                        student.eat2(vegetable);
                        error = 0;
                        break;

                    } else {
                        System.out.println("잘못 입력하셨습니다");
                        error++;
                    }
                    if (error >= 3) {
                        System.out.println(error + "번연속 잘못입력하셨습니다. 다시 선택해주세요");
                        break;
                    }
                }

            } else if (choice == BUS) {
                student.takeBus(bus133);
                error = 0;

            } else if (choice == SUBWAY) {
                student.takeSubway(line1);
                error = 0;

            } else if (choice == MY_INFO) {
                student.showInfo();
                error = 0;

            } else if (choice == END) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못입력하셨습니다");
                error++;

                if (error >= 3) {
                    System.out.println(error + "번연속 잘못입력하셨습니다. 프로그램을 종료합니다.");
                    break;
                }

            }
        }

    }

}
