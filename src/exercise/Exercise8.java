package exercise;

public class Exercise8 {

    // 함수 만들기 1
    // 두수의 곱
    static int multiply(int a, int b) {
        int result1 = a * b;
        System.out.println("곱셈결과 : " + result1);
        return result1;
    }

    // 함수 만들기 2
    // 별명과 나이를 출력하는 함수
    static void printInfo(String name, int age) {
        System.out.println("[ 프로필 ]");
        System.out.println(" 이 름 : " + name);
        System.out.println(" 나 이 : " + age);
    }

    // 함수 만들기 3
    // 고정된 경고 메시지를 출력하는 함수 (매개변수 X, 리턴값 X - void)
    static void printNotice() {
        System.out.println("=== [시스템] 시스템 점검 중입니다. ===");
    }

    // 함수 만들기 4
    // 특정 숫자까지의 짝수의 합을 구하는 함수 (반복문 + 조건문)
    static int sumEvenNumbers(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("짝수의 합 : " + sum);
        return sum;
    }

    // 함수 만들기 5
    // 세 수의 평균을 구해주는 함수 (실수타입 double을 반환)
    static double getAverage(double a, double b, double c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("세 수의 평균 : " + avg);
        return avg;
    }

    public static void main(String[] args) {

        System.out.println("========================");
        int result1 = multiply(3, 5);
        System.out.println("========================");

        printInfo("양현재", 29);
        System.out.println("========================");

        printNotice();
        System.out.println("========================");

        int evenSum = sumEvenNumbers(100);
        System.out.println("========================");

        double getAvg = getAverage(3, 6, 1);
    }
}
