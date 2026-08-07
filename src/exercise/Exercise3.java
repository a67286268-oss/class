package exercise;

public class Exercise3 {

    public static void main(String[] args) {

        // 할인된 가격을 화면에 출력하는 코드 작성
        final double Original_Price = 59.99;
        final double Discount_Rate = 0.30; //30퍼센트 할인
        // Discount_Rate는 추후 변경될수있다 할인율변경

        // 할인 계산식 준비
        double Discount1 = Original_Price * (1 - Discount_Rate);

        double Discount2 = Original_Price * Discount_Rate;
        double Result1 = Original_Price - Discount2;

        // 할인된 금액을 변수에 담에서 화면에 출력 (단 정수값으로 출력)
        System.out.println((int)Discount1);

        System.out.println((int)Result1);

    }

}
