/*This will be the father class.
 * 
 * As we've learned, there will only be one father class, but there could be more than one
 son or doughter class.

 * In the father class we'll declare the variables or program atributes, and also the methods or
 the program functions.

 ** The example is the following exercise:
    * Make a program using inheritance, a program that will ask for two numbers
    to a user, and one of the classes will do the adding and other the subtraction. printing
    the result in a third class or main class */
package operations;//We use same package for the father and sons

import java.util.Scanner;

public class i_fatherClass {

    /*We start declaring the values where we'll alocate the data user has introduced.
     * also we declare a scanner for allowing the users interaction*/
    protected int valueOne, valueTwo, result;
    Scanner input = new Scanner(System.in);

    //The following function is for asking the user values for the operations.
    public void askData() {
        System.out.print("Introduce your first number: ");
        valueOne = input.nextInt();//The data is a number so we save thank to .nextInt

        System.out.print("Introduce your second number: ");
        valueTwo = input.nextInt();//The data is a number so we save thank to .nextInt
    }

    /*after this we create inside of this package, operations designed package, two doughter classes
     one for doing the adding operation and the other to do the subtraction operation*/
    //The following method show's the result of the operation
    //we return from doughter or son classes, we add the method to show the answer of the adding
    //or the subtraction
    public void showAnswer() {
        System.out.println(result);
    }
}
