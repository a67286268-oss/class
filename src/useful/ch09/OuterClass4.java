package useful.ch09;

public class OuterClass4 {

    Runnable runnable;

    public OuterClass4() {
        // 익명 내부 클래스를 사용해서 인터페이스나 추상 클래스를 마치 실제 객체처럼 생성할수있다.
        // 익명 구현 클래스
        // runnable = new Runnable(); << 안됨
        new Runnable() {
            @Override
            public void run() {
                System.out.println("동작 정의같은걸 할수있다");
            }
        };
    }

    public static void main(String[] args) {

        new OuterClass4(); // 이름이 없는상태이다 (익명클래스)

    }
}
