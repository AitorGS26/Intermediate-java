/* By now, we've been learning structured and procedural programming.

 * Structured and procedural programming is used in programming for have a better clarity,
   better quality and better timing for developing a program

 * This uses subroutines and three structures:

    * Sequence (The program will read in sequence, from right to left and up to down)
    * Selection (if, switch)
    * Iteration (loops: for, while, do-while)


 * OOP (Object oriented programming) is a way to design and develop software which wants to imitate
the reality, taking some essential concepts from it.

** The first one is "the object", which traits are:

* the IDENTITY => The name which identify the object (String girlName = Mary; (Here Mary is the identity of the girlName))
* the STATE => the characteristics which describes the object (int age = 20; - String hairColour = blonde;)
* the BEHAVIOUR => What the object can do(public void walkMountain{
                                          coffeOn = true;
                                          } She can walk a mountain, when she takes her coffee)

* For having a good behaviour in this and because an object will have so much behaviours and options
  we use different classes an we relate them, this is for a clear view of all the features of the "object"

    * We're going to create two classes, the first one is for declaring the different objects
      and variables, the other is for the logical part of the program.

* Example, make a program that asks the user for two numbers, then add one to the other.*/

import java.util.Scanner;

public class c_OOP_Object_Oriented_Programming {

    public static void main(String[] args) {
        /*When we arrive to this point, we've to pass to cc_OOP_Object_oriented_programming_logical
         for seeing the logical part behind this pages variables.*/

 /*The main class will start asking user info for making it work */
        Scanner input = new Scanner(System.in);//We start declaring the scanner for user's input.

        System.out.print("Introduce the first number ");
        int first = input.nextInt();//We ask for first number and we save it inside first (global)variable

        System.out.print("Introduce the second number ");
        int second = input.nextInt();//sam for second number and we save it inside second (global)varible.

        /*By here, the procedure is as usual as we've been seen, but, for doing it OOP, next is the key.
        *First of all we've previously created a variable called "first" but in the logical class.

        Then here for connecting them, we've created an object with the name of the logical class.
        Calling it adding and saving inside of it*/
        cc_OOP_Object_Oriented_Programming_logical adding = new cc_OOP_Object_Oriented_Programming_logical(first, second);

        /*As two classes are connected by abroves object and the constructor of the logical class 
        we print the data inside "adding" object with the info we've inside of print (opration class 
        is also inside print if you remember)*/
        adding.print();
    }
}
/*This is the way of connecting two classes for having it more clear and object oriented.
 * At the main class we declare user's inputs, and the scanner for it, also the firt and second variables
 which we pretend to connect with the logical classes variables.*/
