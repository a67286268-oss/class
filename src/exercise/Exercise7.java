package exercise;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

/*        [요구사항]
1. (설계 분석)아메리카노의 단가는 2,500원입니다.
수량에 따른 총 금액을 계산하고, 3잔 이상 구매 시 '특별 스탬프'를 출력하는 로직을 구성하십시오.
2. (프로그램 구현) Scanner를 사용하여 수량을 입력받고,
 if문과 이중 for문을 활용하여 다음을 출력하십시오.

◦ 총 금액 계산 결과
◦ 3잔 이상일 경우 3행 3열의 별(*) 사각형 모양 스탬프
◦ 예시)
총 결제 금액: 7500원
3잔 이상 구매 서비스 스탬프 발급:
* * *
* * *
* * *

3. (오류 수정 및 예외 처리)사용자가 수량에 0 또는 음수를 입력할 경우,
 "1잔 이상 주문해야 합니다."라는 경고 메시지를 출력하고 다시 입력받을 수 있도록 처리하십시오.*/
        Scanner sc = new Scanner(System.in);

        final int AMERICANO = 1;
        final int LATTE = 2;
        final int PAYMENT = 3;
        final int END = 4;
        final int LIMIT = 3;
        final int AMERICANO_PRICE = 2500;
        final int LATTE_PRICE = 3500;

        int totalPrice = 0;
        int error = 0;


        while (true) {
            System.out.println("메뉴판\n 1.아메리카노 2,500원\n 2.라떼 3,500원\n 3.결제\n 4.종료");
            System.out.print(Define.menu);
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == AMERICANO) { // 아메리카노
                System.out.println("아메리카노를 선택하셨습니다.");
                System.out.print("수량을 입력해주세요 : ");
                int amount = sc.nextInt();
                sc.nextLine();
                totalPrice += (AMERICANO_PRICE * amount);

            } else if (choice == LATTE) { // 라떼
                System.out.println("라떼를 선택하셨습니다.");
                System.out.print("수량을 입력해주세요 : ");
                int amount = sc.nextInt();
                sc.nextLine();
                totalPrice += (LATTE_PRICE * amount);

            } else if (choice == PAYMENT) { // 결제
                System.out.println("결제금액 : " + totalPrice + "원 입니다.");
                if (totalPrice >= 7500) {
                    System.out.println("7500원 이상 구매하셔서 이벤트 스탬프가 지급됩니다.");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println(Define.thanks);
                    break;
                } else if (totalPrice == 0){
                    System.out.println("주문하신 내용이 없습니다.");
                } else {
                    System.out.println(Define.thanks);
                    break;
                }
            } else if (choice == END) { // 종료
                System.out.println("주문을 취소합니다. 안녕히가세요.");
                break;
            } else {
                System.out.println("잘 못 입력하셨습니다. \n다시 입력해 주세요.");
                error++;
                if (error >= LIMIT) {
                    System.out.println(error + "번 잘 못 입력하셨습니다. 다시 주문해주세요.");
                    break;
                }
            }
        }
    }
}

