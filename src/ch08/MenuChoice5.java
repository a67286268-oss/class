package ch08;

import java.util.Scanner;

public class MenuChoice5 {

    public static void main(String[] args) {

        // 도전과제 : 프로그램 종료시에 메뉴를 ?번 선택했습니다. 출력
        // 1~4번 선택시에만 횟수로 인정
        // 잘못된 입력 3번시 강제종료
        // 3번 이전에
/*
“1.등록 2.조회 3.수정 4.삭제 0.종료”
- 사용자가 옵션 번호를 입력하면, 해당 옵션에 대한 메시지를 출력합니다.
 예를 들어, 사용자가 '1'을 선택하면 "등록을 선택했습니다."라고 출력합니다.
- 사용자가 '0'을 선택하면 "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료합니다.
- 사용자가 유효하지 않은 번호를 입력하면 "**잘못된 입력입니다.
다시 선택해주세요**."라고 안내하고 다시 메뉴 선택을 할 수 있도록 합니다.
- Scanner, while 그리고 if 구문을 활용해서 프로그램을 완성하세요.*/

        Scanner sc = new Scanner(System.in);

        final int CREATE = 1;
        final int READ = 2;
        final int UPDATE = 3;
        final int DELETE = 4;
        final int END = 0;
        int count = 0;
        int error = 0;
        final int LIMIT = 3;
        int reset = 0;
        String name = null;

        while (true) {
            System.out.println("\n메뉴선택");
            System.out.println("번호를 입력해 주세요. 1.등록 2.조회 3.수정 4.삭제 0.종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == CREATE) {
                System.out.println("등록을 선택했습니다.");
                // name 변수에 스캐너를 사용해서 이름을 등록
                if (name != null) {
                    System.out.println("이미 이름이 등록되어 있습니다.");
                } else {
                    System.out.print("이름을 입력해주세요 : ");
                    name = sc.nextLine();
                }

            } else if (choice == READ) {
                System.out.println("조회를 선택했습니다.");
                // name안에 담겨진 값을 출력
                if (name == null) {
                    System.out.println("이름을 먼저 등록해주세요");
                } else {
                    System.out.println("이름 : " + name);
                }

            } else if (choice == UPDATE) {
                System.out.println("수정를 선택했습니다.");
                // name을 수정
                if (name == null) {
                    System.out.println("이름을 먼저 등록해주세요");
                } else {
                    System.out.print("수정할 이름을 적어주세요 : ");
                    name = sc.nextLine();
                }

            } else if (choice == DELETE) {
                System.out.println("삭제를 선택했습니다.");
                // name을 삭제
                if (name == null) {
                    System.out.println("이름이 없습니다.");
                } else {
                    System.out.println("등록한 이름이 삭제되었습니다.");
                    name = null;
                }

            } else if (choice == END) {
                System.out.println("메뉴를 " + count + "번 선택했습니다.");
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                error++;
                if (error == LIMIT) {
                    System.out.println(LIMIT + "번 잘 못 입력하셨습니다. 프로그램을 강제종료합니다.");
                    break;
                }
                System.out.println("**잘못된 입력입니다.다시 선택해주세요**");
            }

            if (choice <= 4 && choice >= 1) {
                count++;
                error = reset;
            }

        }

        // 스캐너 닫기 (자원 절약)
        sc.close();

    }

}
