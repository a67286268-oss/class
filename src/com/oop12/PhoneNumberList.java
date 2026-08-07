package com.oop12;

import javax.swing.*;
import java.util.Scanner;

public class PhoneNumberList {

    static int indexNumber = 0;

    //1. 저장
    public static void save(PhoneNumber[] numbers,Scanner sc) {
        if (indexNumber > numbers.length) {
            System.out.println("저장공간이 가득찼습니다");
            return;
        }
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine().trim();
        System.out.print("번호를 입력해주세요 : ");
        String number = sc.nextLine().trim();

        PhoneNumber num = new PhoneNumber (name, number);
        numbers[indexNumber] = num;
        indexNumber++;
    }

    //2. 전체 조회
    public static void searchAll(PhoneNumber[] numbers) {
        if (indexNumber == 0) {
            System.out.println("저장된 번호가 없습니다.");
            return;
        }
        for (int i = 0; i < indexNumber; i++) {
            System.out.println(numbers[i].getName() + " : " + numbers[i].getPhoneNumber());
        }
    }

    //3. 이름으로 조회
    public static void searchByName(Scanner sc, PhoneNumber[] numbers) {
        int findNum = -1;
        if (indexNumber == 0) {
            System.out.println("저장된 전화번호가 없습니다.");
            return;
        }
        System.out.print("조회할 이름을 입력해주세요 : ");
        String targetName = sc.nextLine().trim();
        for (int i = 0; i < indexNumber; i++) {
            if (numbers[i].getName().equals(targetName)) {
                numbers[i].showInfo();
                findNum = i;
                break;
            }
        }
        if (findNum == -1) {
            System.out.println("검색하신 이름의 전화번호가 없습니다.");
        }
    }

    //4. 전체 삭제
    public static void deleteAll(PhoneNumber[] numbers) {
        if (indexNumber == 0) {
            System.out.println("삭제할 데이터가 없습니다.");
            return;
        }
        System.out.println("=============전체삭제=============");
        for (int i = 0; i < indexNumber; i++) {
            numbers[i] = null;
        }
        indexNumber = 0;
    }
    //5.이름으로 삭제
    public static void deleteByName(Scanner sc, PhoneNumber[] numbers) {
        if (indexNumber == 0) {
            System.out.println("삭제할 데이터가 없습니다.");
            return;
        }
        int target = -1;
        System.out.print("삭제할 전화번호의 이름을 입력해주세요 : ");
        String deleteName = sc.nextLine().trim();
        for (int i = 0; i < indexNumber; i++) {
            if (numbers[i].getName().equals(deleteName)) {
                target = i;
                break;
            }
        }
        if (target == -1) {
            System.out.println("해당이름의 전화번호가 없습니다.");
            return;
        }
        System.out.println("=======삭제대상=======");
        numbers[target].showInfo();

        for (int i = target; i < indexNumber - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[indexNumber - 1] = null;
        indexNumber--;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneNumber[] numbers = new PhoneNumber[100];

        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_NAME = "3";
        final String DELETE_ALL = "4";
        final String DELETE_BY_NAME = "5";
        final String END = "0";

        while (true) {
            System.out.println("=======메뉴=======\n1. 저장\n2. 전체조회\n3. 이름으로 조회\n4. 전체삭제\n5. 이름으로 삭제\n0. 프로그램 종료");
            System.out.print("선택 : ");
            String choice = sc.nextLine().trim();

            if (choice.equals(SAVE)) {
                save(numbers,sc);
            } else if (choice.equals(SEARCH_ALL)) {
                searchAll(numbers);
            } else if (choice.equals(SEARCH_BY_NAME)) {
                searchByName(sc, numbers);
            } else if (choice.equals(DELETE_ALL)) {
                deleteAll(numbers);
            } else if (choice.equals(DELETE_BY_NAME)) {
                deleteByName(sc, numbers);
            } else if (choice.equals(END)) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못입력하셨습니다");
            }

        }
    }

}
