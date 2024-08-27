package threads;

public class thread_3 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("s n");

            try {
                thread_1.sleep(1000);
            } catch (Exception e) {
                System.out.println("failure in thread 1" + e);
            }
        }
    }

}
