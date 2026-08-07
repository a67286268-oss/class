package useful.ch10;

public class Worker3 extends Thread implements Runnable{

    String name;

    public Worker3(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("worker : " + name + " : " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
