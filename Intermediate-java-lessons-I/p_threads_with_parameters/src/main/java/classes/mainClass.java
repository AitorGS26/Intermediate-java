package classes;

public class mainClass {

    public static void main(String[] args) {

        /*Here at main class we make 2 objects of process class, thread 1 and thread 2 */
        process thread1 = new process(" thread 1");
        process thread2 = new process(" thread 2");

        /*As we've seen in process clas tha threadValue method, has an in value inside.
     Here we add threadValue method to the objects we've created, objects that have the properties of process class
     and we add the value we want, in this case 10 for thread 1 and 4 for thread 2.
     this values will be saved inside num_int in process class, which has threadValue method 
     then num_int with it's value will will do what we've said in the loop we've created at process class    */
        thread1.threadValue(10);
        thread2.threadValue(4);

        thread1.start();//Finally we start the thread's info simuntaneously
        thread2.start();

    }

}
