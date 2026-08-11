package useful.ch16;

class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }
}
// 원래 방식 : 두수를 더하거나 뺄려면 클래스를 설계하고 객체를 만들고 메서드를 호출하는
// 3단계를 거처야한다



public class Demo2 {


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("10 + 5 = " +calculator.add(10,5));
        System.out.println("10 - 5 = " +calculator.subtract(10,5));

    }
}
