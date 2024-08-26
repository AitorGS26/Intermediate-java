//this will be the main class
package main;

/*We import two son classes, and not the father class, the explanation is simple.
 
* Imagin two of your friend have an inheritance by their grandpa.
 * When you have to ask for money where will you go? 
 * When we import, we import from the place we'll be asking for the data,
 as if you need money you aren't going to your friend's grandpa to ask for it.
 you'll ask the ones who have the inheritance*/
import operations.i_sonClass_adding;
import operations.i_sonClass_subtraction;

public class I_inheritance_project {

    public static void main(String[] args) {
        /*We create an object for beign the messenger between the adding class
         * we add the askdata method for having the numbers the user has introduced
         * Then we add showAnswer data with the result of the adding, without coding anithing in the main method         */
        i_sonClass_adding messenger_adding = new i_sonClass_adding();
        messenger_adding.askData();
        messenger_adding.adding();
        System.out.print("The result of the adding is: ");
        messenger_adding.showAnswer();
        /*This will be the same as above but with the subtraction doughter class */
        i_sonClass_subtraction messenger_subtraction = new i_sonClass_subtraction();
        messenger_subtraction.askData();
        messenger_subtraction.subtraction();
        System.out.print("The result of the subtraction is: ");
        messenger_subtraction.showAnswer();
    }
    /*The way to connect the father and doughters will be to have the classes in the same package
     and to use extends to allow doughters using the variables and methods of the father.

     * Then to connect to the main class, in another package, the main class will 
     import the classes as librarys, then creating an object with the name of the 
     doughter classes this one will act as a messenger between packages
     and taking the encapsuling in account, we could use some articles and methods in the main class.*/
}
