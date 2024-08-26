/*It all starts here, the father class.
 * Normally we won't name any class with father, son or daughter in a real project, this is only 
 for a better understanding. 

 * In the father class, we'll do all the logic of the program, we declare here the variables and methods
 for later using them in the doughter clasess. */
package package1;
//The scanner is imported for asking data to the user.

import java.util.Scanner;

/*The class will be abstract, this is for telling it that inside will be an abstract method 
for polymorfism*/
public abstract class polimorfism_father {

    /*here we declare the variables (the correct for polymorfism and inheritance is declaring 
    them as protected)*/
    protected int valueOne, valueTwo, result;
    Scanner input = new Scanner(System.in);

    //Here we declare the method to ask data to the user with scanner.
    public void askData() {
        System.out.print("Introduce the first number: ");
        valueOne = input.nextInt();

        System.out.print("Introduce the second number: ");
        valueTwo = input.nextInt();

    }

    /*After declaring the values and connecting them to the data introduced by the user with scanner
     we declare the abstract method, called operations, that will save both the add and the subtraction.*/
    public abstract void operations();

    //as we can see the above method is finished by; this is because we can't declare inside of it.
    //for declaring something like the result we'll do another public method like below.
    public void showAnswer() {
        System.out.println(result);
    }
}
