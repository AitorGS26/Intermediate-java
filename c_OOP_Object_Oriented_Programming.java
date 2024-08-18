/*
* By now, we've been learning structured and procedure programming.

* *This is used in programming for have a better clarity, better quality and better
timing for developing a program

*This uses subroutines and three structures:
*   *sequence
*   *Selection (if, switch)
*   *Iteration (loops: for, while, do-while)


* OOP is a way to design and develop software which wants to imitate
the reality, taking some essential concepts from it.

** The first one is "the object", which traits are:
* the IDENTITY => The name which differenciate an object and another
* the STATE => the characteristics which describes the object
* the BEHAVIOUR => What the object can do

* With this, we're going to explain with an example, for this,
we're going to create two classes, the first one is for declaring the different objects
and variables, the other is for the logical part of the program.
*
* Example, make a program that asks the user for two numbers, then add one to the other.
*
*

*    */

import java.util.Scanner;

public class c_OOP_Object_Oriented_Programming {
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Introduce the first number ");
    int first = input.nextInt();

        System.out.print("Introduce the second number ");
        int second = input.nextInt();
//By here, the procedure is as usual as we've been seen, but, for doing it OOP, next is the key.
/*First of all we've previously created a class with the same name as this one but for the logical part so
the name ends by _logical. Then here for connecting them, we've created an object with the name of
the new class we've created with the name adding and, the variables we'll use for, in this case, the adding
inside of the objects (). there we tell the program, that object want to do something with those variables*/
        cc_OOP_Object_Oriented_Programming_logical adding = new cc_OOP_Object_Oriented_Programming_logical(first, second);
      //After that, we go to the logical class
        adding.print();
//Finally for printing it we mention the logical classes print class, for printing by main method.
    }
}
