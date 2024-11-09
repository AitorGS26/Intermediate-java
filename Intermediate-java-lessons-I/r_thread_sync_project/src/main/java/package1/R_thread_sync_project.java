/*In this project we'll print the word hello with syncronyzed threads.@interface
 
 * For doing this, we've created 5 thread classes and a main class inside the same package.
 * We start from thread 1 son in this moment look at that class. 
 */
package package1;

public class R_thread_sync_project {

    public static void main(String[] args) {
        /*We come here directly after creating all Thread classes. 
        
         * We connect thread classes with this, main class*/
        Thread_1 thread1 = new Thread_1();
        Thread_2 thread2 = new Thread_2();
        Thread_3 thread3 = new Thread_3();
        Thread_4 thread4 = new Thread_4();
        Thread_5 thread5 = new Thread_5();


        /*Now, as we've learned in the thread status lesson, we've threads created
         and in "new" state because they only have been created and syncronized. for starting them
         we've to add the start method as below*/
        thread1.start();
        /*After proving this code, I've noticed that syncronizing it was being more difficult
         than expected, the problem was I was putting same sleep time in the this thread objects
         and in the thread classes. The correct way that has make the program work is 
         to play with timmings until we've the result that appears when you start the program.

         Here for the moment I don't have a scientific answer about how to sync well, my recomendation
         is to try different timmings and look the results until you have the timming you need.*/
        try {
            thread1.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Warning! look thread 1 " + e);
        }
        thread2.start();
        try {
            thread2.sleep(140);
        } catch (InterruptedException e) {
            System.out.println("Warning! look thread 2 " + e);
        }
        thread3.start();
        try {
            thread3.sleep(120);
        } catch (InterruptedException e) {
            System.out.println("Warning! look thread 3 " + e);
        }
        thread4.start();
        try {
            thread4.sleep(120);
        } catch (InterruptedException e) {
            System.out.println("Warning! look thread 4 " + e);
        }
        thread5.start();
        try {
            thread5.sleep(110);
        } catch (InterruptedException e) {
            System.out.println("Warning! look thread 5 " + e);
        }

    }
}
