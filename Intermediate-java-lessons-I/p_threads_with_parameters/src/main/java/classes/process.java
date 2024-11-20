/*As we've seen in the previous threads lesson, we've two ways to
 use threads, for now on, I'll be using extends Thread, this is because java only allows inheriting from one class*/
package classes;

public class process extends Thread {//we inherit thread father class

    /*num_int variable will save the number of times run() method will iterate, this will give us the
     control of how many numbers will the thread be printing */
    int num_int;

    /* This is a constructor which takes String threadname as an argument, inside of it with
    super() we'll be calling the constructor of father class, and save the name into this classes threadname String*/
    public process(String threadName) {
        super(threadName);

    }

    /*The following is the "heart" of the thread, run() methos is the one
    which will have the function we need the thread do.
    In this case we want to print i with it's name and it will be printing "num_int" times
     */
    @Override
    public void run() {
        for (int i = 0; i <= num_int; i++) {
            System.out.println(i + this.getName());//this.getname will print i's name each time

        }

        System.out.println("");

    }

    /*threadValue method will allow us to set the value of num int from outside, from other class that's not process class*/
    public void threadValue(int value) {
        this.num_int = value;
    }
    /*threadvalue will come from other class, value is the data that the method is receiving*/
}
