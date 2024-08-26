/*
* For OOP, we need to relate two or more classes with the main class.

* This is only possible if we mention variables of the main method on the
new class, and so on.

* Sometimes, or always, the programmer want to put same name to same variable but one is from
the main class and the other no, as we have seen in the previous lesson.
*
* In that lesson we wanted to relate the first number the user has introduced and the second also
with the ones we'd created on the logical side, but when we want to relate them,
how knows the program which is which, for that, we use the this method.
*
* In the logical class,where we're going to add data inside the variables
that come from the main class, we put the this method, for telling the program, that "this"
variables are where we want to allocate the data we're receiving from the main class.
*
*
* For a better understanding, below and in the dd_... the logical part
you can find the following exercise.
*
* Make a program with OOP structure, which calculates the area of a rectangle,
with a user's input for the length.*/

import java.util.Scanner;//we start importing scanner for asking the values of the rectangle to the user

public class d_OOP_the_reserved_word_THIS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//we create input scanner for the user's input

        System.out.print("Introduce the base length: ");
        int base = input.nextInt();/*The info will be numbers so we use .nextInt, we save inside base 
                                    the data the user has introduced inside input scanner*/

        System.out.print("Introduce the rectangle's height: ");
        int height = input.nextInt();/*The info will be numbers so we use .nextInt, we save inside height
                                       the data the user has introducez inside input scanner*/

        //Now we go to the logical part, with the user's data saved

        /*Having finished the logical part, we've to make an object with the name of the logical class
         for having a conection between them, and inside the object we add the scanners two inputs,
         which are the same as logical classes calculation variables, calling this object rectangle.@interface

         We've connected two classes between them with the onject rectangle, so we add print
         method, to the rectangle object, for showing the message with the answe as we've created on the logical class.
         */
        dd_OOP_the_reserved_word_THIS rectangle = new dd_OOP_the_reserved_word_THIS(base, height);
        rectangle.print();
    }
}
