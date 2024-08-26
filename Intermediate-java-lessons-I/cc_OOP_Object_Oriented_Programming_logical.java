
public class cc_OOP_Object_Oriented_Programming_logical {

    /*Here we create 3 variables, first, second and answ for
the answer of the adding, we create them as private.*/
    private int first, second, answ;

    /*After that, we need a constructor, and inside () we add the same variables we've created for knowing with one
 * cases with the other, we only need the first and second numbers we're going to ask for to the user
     */
    public cc_OOP_Object_Oriented_Programming_logical(int first, int second) {
        /*Inside the constructor we relate the variables we've just created here
with the ones in the main class, for telling the program, save the info inside the variables 
the constructor have locally and save them in this ones, the global variables*/
        this.first = first;
        this.second = second;
    }

    /*After that, we do another class for the operation, as below, we add void because we need 
 * the class to send info back
     */
    public void operation() {
        answ = first + second;
    }
    //finally a class for the printing, we want to print operation.

    public void print() {
        operation();
        System.out.println("The answer is: " + answ);
    }
    //then we return to the main calsss.
}
