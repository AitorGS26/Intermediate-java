/*In java there are two ways to work with threads, we'll se both.
 * 
 * First way to use thread
 */
package classes;

public class process_1 implements Runnable {//We use implements runnable 

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("First process");
            
        }

    }

}
