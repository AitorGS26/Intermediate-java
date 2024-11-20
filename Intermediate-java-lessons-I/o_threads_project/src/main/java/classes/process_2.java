package classes;

/*The other way to use threads is to inherit thread class, which is a built-in class inside
 Java's JDK. As we've seen in process one, here we've alro run() method, we'll make an override
 for editing it and giving the method the task we want, in this case we add another loop
 for printing second process five times*/
public class process_2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Second process");
        }

    }
}
