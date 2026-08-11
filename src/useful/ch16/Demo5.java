package useful.ch16;

public class Demo5 {

    public static void main(String[] args) {

        MathOperation add1 = new MathOperation() {
            @Override
            public int operate(int x, int y) {
                return x + y;
            }
        };

        // 람다식
        MathOperation add2 = (int x, int y) -> x + y;

        System.out.println("익명클래스 : "  + add1.operate(100,100));
        System.out.println("람다표현식 : "  + add2.operate(100,100));


    }
}
