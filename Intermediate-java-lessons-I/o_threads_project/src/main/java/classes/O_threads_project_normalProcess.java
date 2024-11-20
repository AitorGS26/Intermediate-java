/* Here we'll make the prove of speed of a normal process 
 and a threads process. */
package classes;

public class O_threads_project_normalProcess {

    public static void main(String[] args) {

        /*Here we're creating a new Thread type object, the reason we put new
        process_1() is to give to thread1 new object the properties of process_1.
        If we don't add new process_1() inside the brackets we would have created a thread object
        without instructions to follow */
        Thread thread1 = new Thread(new process_1());

        /*At process_2 class we've inherit a built-in thread class with extends Thread
         this class is now a thread itself, here we're create "thread2" object which 
         has the properties of process_2, we're comunicating with process_2 with this object */
        process_2 thread2 = new process_2();

        /*At theis moment, as we've seen above, we've the two thread classes connected with main class
        and we only need to call the run method of each one, this is done with .start() method*/
        thread2.start();
        thread1.start();

        /*Below you can see a normal printing process of two loops, without threads.
        You can uncomment and comment the thread way for a comparison

         * if the process that runs is the normal one "without threads, it will print 
           five times first process and then the same with second process."*/

 /*for (int i = 0; i <= 5; i++) {
            System.out.println("First process");
        }

        System.out.println("");

        for (int i = 0; i < 5; i++) {
            System.out.println("Second process");.
        }*/
    }

}
