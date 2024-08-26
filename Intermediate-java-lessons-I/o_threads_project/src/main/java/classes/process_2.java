/*In java there are two ways to work with threads, we'll se both.
 * 
 * Second way is to inherit a class of jdk Thread
 */
package classes;

public class process_2 extends Thread {//second way to use threads
//I truly recommend this way, here you inherit, with the other you implement.

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Second process");
        }

    }
}
