package package1;

public class Thread_2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("e");

            try {
                Thread_2.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Warning! look thread 2 " + e);
            }
        }
    }
}
