package package1;

public class Thread_5 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("o");

            try {
                Thread_5.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Warning! look thread 5 " + e);
            }
        }
    }
}
