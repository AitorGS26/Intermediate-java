package threads;

public class thread_2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("va i");

            try {
                thread_1.sleep(1000);
            } catch (Exception e) {
                System.out.println("failure in thread 1" + e);
            }
        }
    }

}
