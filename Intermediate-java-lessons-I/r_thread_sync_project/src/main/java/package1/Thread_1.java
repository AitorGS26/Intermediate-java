/*Here it all starts. We start declaring the class with extends Thread for inheriting the class */
package package1;

public class Thread_1 extends Thread {

    @Override //As we've seen when we do polimorfism we've to put the word override, for editing some Thread function
    public void run() { //Here we start with run method which is inside Thread class

        /*For this project we want to print 5 times the word hello, each letter in a different thread
         and syncronyze them. For that we start each thread class with a for loop*/
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + ": H");
            /* We want to syncronize them so we put a sleep of a second in each class for printing them at
             the same time.
             * REMEMBER: MAKING SLEEP IS ALWAYS INSIDE A TRY-CATHCH STRUCTURE.*/
            try {
                Thread_1.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Warning! look thread 1 " + e);
            }
            /*All thread classes are same as this one but with different letter to print and
            different timming in sleeping. */
        }
    }
}
