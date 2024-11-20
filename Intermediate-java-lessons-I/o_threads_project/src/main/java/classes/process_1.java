/*In java there are two ways to work with threads, we'll se both.
 * First way to use thread
 */
package classes;

/*In this class we'll be using Runnable interface, this provides run() 
method where we'll be defining the thread's task */
public class process_1 implements Runnable {

    /*Run() method is inside Runnable, for giving the task we'll be using
we need first of all @override for editing run method. In this case we add a loop 
which prints first process 5 times*/
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("First process");

        }

    }

}
