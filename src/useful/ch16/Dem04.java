package useful.ch16;

public class Dem04 {
    public static void main(String[] args) {

        MathOperation add = (x, y) -> {return x + y;};

        MathOperation sub = (x ,y) -> x - y;

        // 주의: 만약 여러줄이 필요하다면 중괄호와 return 그대로 써야 한다.
        MathOperation divide = (x, y) -> {
            if (y == 0) {
                System.out.println("0으로 나눌 수 없습니다");
                return 0;
            }
            return  x / y;
        };

        System.out.println(add.operate(10, 10));
        System.out.println(sub.operate(10, 10));
        System.out.println(divide.operate(10, 10));


    }
}
