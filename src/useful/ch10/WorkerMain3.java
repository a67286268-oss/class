package useful.ch10;

public class WorkerMain3 {

    public static void main(String[] args) {

        System.out.println("--- main 쓰레드 시작 ---");
        Worker worker1 = new Worker("이상호");
        worker1.start();

        System.out.println("--- main 쓰레드 종료 ---");

    }

}
