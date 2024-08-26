/*
* By now, we've been learning structured and procedure programming.

* *Structured and procedure programming is used in programming for have a better clarity,
better quality and better timing for developing a program

*This uses subroutines and three structures:
*   *sequence (The program will read in sequence, from right to left and up to down)
*   *Selection (if, switch)
*   *Iteration (loops: for, while, do-while)


* OOP (Object oriented programming) is a way to design and develop software which wants to imitate
the reality, taking some essential concepts from it.

** The first one is "the object", which traits are:

* the IDENTITY => The name which differenciate an object and another (String girlName = Mary; (Here Mary is the identity of the girlName))
* the STATE => the characteristics which describes the object (int age = 20; - String hairColour = blonde;)
* the BEHAVIOUR => What the object can do(public void walkMountain{
                                          coffeOn = true;
                                          } She can walk a mountain, when she takes her coffee)

* With this, we're going to explain with an example, for this,
we're going to create two classes, the first one is for declaring the different objects
and variables, the other is for the logical part of the program.
*
* Example, make a program that asks the user for two numbers, then add one to the other.*/

import java.util.Scanner;

public class c_OOP_Object_Oriented_Programming {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//we start declaring the scanner for user's input.

        System.out.print("Introduce the first number ");
        int first = input.nextInt();//we ask for first number and we save it inside first variable

        System.out.print("Introduce the second number ");
        int second = input.nextInt();//sam for second number and we save it inside second varible.

        /*By here, the procedure is as usual as we've been seen, but, for doing it OOP, next is the key.
*First of all we've previously created a class called also "first" but in the call that ends by _logical. 
Then here for connecting them, we've created an object with the name of the logical class. Calling it adding
and saving inside of it*/
        cc_OOP_Object_Oriented_Programming_logical adding = new cc_OOP_Object_Oriented_Programming_logical(first, second);
        //After that, we go to the logical class, we see the andwer in print class, we've done the logical part there
        //we print the data inside "adding" object with the info of the logical part and this part both inside.
        adding.print();
//Finally for printing it we mention the logical classes print class, for printing by main method.
    }
}
