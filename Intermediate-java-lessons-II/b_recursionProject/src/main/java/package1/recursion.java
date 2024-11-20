package package1;

public class recursion {

    /*As we've seen in recursion theorical class, for making well recurison in java we've call a method inside same method
     * 
     * We'll start creating "print method" with an int argument inside, we've called it value.
     */
    public void print(int value) {
        /*Value will be the argument that will allow us to control the amount of times the recursion will act.
         * In this case value will be printing until it's value is 5
         * 
         */
        if (value <= 5) {
            System.out.println(value + " ");
            print(value + 1);//here we add an increase to value, this will be increasing until the if statement is met

        }
    }
}
