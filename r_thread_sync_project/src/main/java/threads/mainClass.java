/*The procedure is the same as the previous lessons, we'll only comment the change
 * In this case the syncronization, it will make a sentence and not random printing
 */
package threads;

public class mainClass {

    public static void main(String[] args) {

        thread_1 thread_1 = new thread_1();
        thread_2 thread_2 = new thread_2();
        thread_3 thread_3 = new thread_3();
        thread_4 thread_4 = new thread_4();

        thread_1.start();
        try {
            thread_1.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("failure at the thread 1 " + e);
        }

        thread_2.start();
        try {
            thread_2.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("failure at the thread 2 " + e);
        }

        thread_3.start();
        try {
            thread_3.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("failure at the thread 3 " + e);
        }

        thread_4.start();
        try {
            thread_4.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("failure at the thread 4 " + e);
        }

    }
}
