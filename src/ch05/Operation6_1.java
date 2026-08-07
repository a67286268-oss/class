package ch05;


public class Operation6_1 {

    public static void main(String[] args) {

        // 쇼핑몰 회원정보
        int uAge = 20; // 나이
        int total = 5000; // 장바구니속 물건가격
        boolean isMember = true; // 회원여부
        int coupon = 2; // 보유 쿠폰

        // 1. 무료 배송 조건: 장바구니 총액이 3만 원 이상이고 회원이어야 함
        boolean freeDelivery = (total >= 30000 && isMember);
        System.out.println("무료 배송 조건 확인 : "+ freeDelivery);

        // 2. 할인 조건: 나이가 19세 이상이거나 쿠폰이 1개 이상 있어야 함
        boolean discount = (uAge >= 19 || coupon >= 1);
        System.out.println("할인 조건 확인 : "+ discount);

        // 3. 구매 제한 조건: 나이가 19세 미만이고 회원이 아닌 경우
        boolean nBuy = !(uAge < 19 && !isMember);
        System.out.println("구매 가능 여부 : "+ nBuy);

        // 4. 이벤트 참여 조건: 장바구니 총액이 5만 원 미만이거나 쿠폰이 3개 미만
        boolean event = (total < 50000 || coupon < 3);
        System.out.println("이벤트 참여 조건 : "+ event);

    }

}
