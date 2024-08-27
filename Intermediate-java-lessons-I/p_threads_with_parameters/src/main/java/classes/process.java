/*As we've seen in the previous threads lesson, we've two ways to
 use threads, for now on, I'll be using extends Thread, but you can choose whatever you want.
 
 */
package classes;

public class process extends Thread {//we inherit thread father class

    int num_int;//this is the parameter which will receive info for two threads, for printing to one or other serial numbers

    /*Below we've put this.getname for knowing from which thread is printing the program.
     * but the display is disgusting so we want to personalye it, for that we'll make a builder*/
    public process(String threadName) {//We want to receive the data on thread name and that's a string
        super(threadName);//thank of super word, when we create this classes object the objects will ask for an string, we'll program then and finally print them with the names we want.
    }

    @Override//it will be an abstract class so we've to use @override
    public void run() {//for threads we've learned we've to call run method ans inside of it put the logic
        for (int i = 0; i <= num_int; i++) {
            System.out.println(i + this.getName()); //we print but also ask from what thread is the info
        }
        //Now we've to go to main class
        System.out.println("");
        /*What if I want the thread1 print numbers until 5 and thread2 until 10?
         * 1- we add a global variable called num_int, and put it inside for loop
         this is for distinguish between the data received from thread 1 and thread 2.
         */
    }

    /*We've the global variable num_int, which will recieve info and put it into 
     the for loop, but for communicating them we need to make a method,
     we'll call it threadValue and we declare an object called value inside of it.@interface

     * Inside of the method, we'll compare global variable with this, because
     * we need to have info inside of "this" = value, which is the object inside the method.
     * Now we've to go to main class*/
    public void threadValue(int value) {
        this.num_int = value;
    }
    /*LASTSTEP
     * We've just received from the main class inside of value 10 for thread 1 and 4 for thread2
     * this will be saved inside of num_int 
     * num_int will be inside of the for loop and it will print 10 numbers for thread 1 and 4 for thread 2
     */
}
