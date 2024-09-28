package package1;

public class Thread_4 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("l");

            try {
                Thread_4.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Warning! look thread 4 " + e);
            }
        }
    }
}
