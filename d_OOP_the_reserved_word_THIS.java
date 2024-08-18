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
that come from the main class, we put the this method, for telling the program, that those
variables are where we eant to allocate the data we're receiving from the main class.
*
*
* For a better understanding, below and in the dd_... the logical part
you can find the following exercise.
*
* Make a program with OOP structure, which calculates the area of a rectangle,
with a user's input for the length.*/

import java.util.Scanner;

public class d_OOP_the_reserved_word_THIS {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

        System.out.print("Introduce the base length: ");
        int base = input.nextInt();

        System.out.print("Introduce the rectangle's height: ");
        int height = input.nextInt();

       dd_OOP_the_reserved_word_THIS rectangle = new dd_OOP_the_reserved_word_THIS(base, height);
       rectangle.print();
    }
}
