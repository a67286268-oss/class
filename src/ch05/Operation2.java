package ch05;

public class Operation2 {

    public static void main(String[] args) {

        System.out.println(5 + 3);
        System.out.println(5 - 3);
        System.out.println(5 * 3);
        System.out.println(5 / 3); // 결과가 1인 이유는 int / int 이기때문에 int값으로 출력
        System.out.println(5 / (double)3); // 소숫점까지 보기위해선 두개중 하나를 형변환 해줘야함
        System.out.println(5 % 3);

        //문제
        //1. (12+3) / 3을 화면에 출력, 단 결과값을 변수에 담아서 출력
        double n1 = (12+3) / 3;
        System.out.println("(12+3) / 3 = " + n1);

        //2. (25 % 2) 값을 화면에 출력
        int n2 = 25 % 2;
        System.out.println("25 % 2 = " + n2);
        // 나머지 연산자는 해당하는 값이 홀수인지 짝수인지 판별할 때 유용하다
        // 어떤 수를 2로 나누었을때 값이 0이면 짝수 1이면 홀수로 판별가능 ex : boolean

        //3. 7896456 값이 홀수 인지 짝수인지 화면에 1또는 0으로 출력
        int n3 = 7896456 % 2;
        System.out.println(n3);


    }

}
