/* Here we'll make the prove of speed of a normal process 
 and a threads process. */
package classes;

public class O_threads_project_normalProcess {

    public static void main(String[] args) {
        //Below is the normal process, you can uncomment and comment the thread one for a comparison

        /*for (int i = 0; i < 5; i++) {
            System.out.println("First process");
        }

        System.out.println("");

        for (int i = 0; i < 5; i++) {
            System.out.println("Second process");.
        }*/
        //Below is thread way to print the process
        process_2 thread2 = new process_2();//if you use extends Thread, you'll use this line
        Thread thread1 = new Thread(new process_1());//This is only for implements runneable

        //Now we've all the data but for starting threads you'll the the following:
        thread2.start();
        thread1.start();

    }

}
