package classes;

public class mainClass {

    public static void main(String[] args) {

        process thread1 = new process(" thread 1");//we comunicate with process making an object with it's name
        process thread2 = new process(" thread 2");//Same for other threads of the same class and for the same function


        /*lASTSTEP.
         * we've two threads for print, 1 and 2, we communicate them with the 
         method threadValue, we've just created in process class, it woll ask for a value
         as we've coded before, it will ask an int to put inside "value"

         now as you can see below, thread 1 will send to value 10 and thread2 will send 4

         Now go to last step in process class
         */
        thread1.threadValue(10);
        thread2.threadValue(4);

        thread1.start();//we start the thread's info simuntaneously.
        thread2.start();

        /*What if I want the thread1 print numbers until 5 and thread2 until 10?
         * For that, we'll send a parameter from here the main class to the for loop
         */
    }

}
