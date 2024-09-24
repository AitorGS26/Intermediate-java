/*We start creating the class fot the logical part of the program. */
public class cc_OOP_Object_Oriented_Programming_logical {

    /*As the logical part, here we've to declare the variables and methods of the program.
     * We've to make a program for adding user's two numbers, so we start declaring 3 int type variables.
     * first (user's first number)
     * second (user's second number)
     * answ (the adding result)
     */
    private int first, second, answ;

    /*After that, we need a constructor, putting inside of the brackets the variables we're
     using in both classes, this are going to represent main classes "first" and "second" variables*/
    public cc_OOP_Object_Oriented_Programming_logical(int first, int second) {

        /*Inside the constructor we relate the variables we've just created here
    with the ones in the main class, for telling the program, save the info inside the variables 
    the constructor have locally and save them in this ones, the global variables(main classe's)*/
        this.first = first;
        this.second = second;
    }

    /*We've declared the variables and related them with the ones in the main class so the next step is
    to make the logic they're asking, for that we create the class operation*/
    public void operation() {
        answ = first + second;
    }

    /*finally we add a class for the printing, we could do this at the main class, but
     this will be set the code cleaner*/
    public void print() {
        operation();//Here is mentioned operation class for allowing print class to print answ variable
        System.out.println("The answer is: " + answ);
    }
    //then we return to the main calsss.
}
