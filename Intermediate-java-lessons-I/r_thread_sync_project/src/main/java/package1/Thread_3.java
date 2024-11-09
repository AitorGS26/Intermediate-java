package package1;

public class Thread_3 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("l");

            try {
                Thread_3.sleep(1005);
            } catch (InterruptedException e) {
                System.out.println("Warning! look thread 3 " + e);
            }
        }
    }

}
