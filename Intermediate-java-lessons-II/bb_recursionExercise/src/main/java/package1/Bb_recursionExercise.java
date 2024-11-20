/*In this exercise we'll be searching a number's factorial, which means the result of the multiply of
  that number's all previous entire numbers except 0*/

 /*Exercise:
 * Make a program in java which calculates the factorial of any entire number, with recursion, 
  the number will be introduced by the user*/
package package1;

import java.util.Scanner;

public class Bb_recursionExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce a number for it's factorial calculation: ");
        int number = input.nextInt();

        recursionFactorial recursion = new recursionFactorial();

        int factorial = recursion.factorial(number);
        System.out.println("Factorial number of " + number + " is " + factorial);
    }
}
