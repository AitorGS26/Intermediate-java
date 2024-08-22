//this will be the main class

package main;
/*We import two son classes, and not the father class, the explanation is simple.
 * Imagin two of your friend have an inheritance by their grandpa.
 * When you have to ask for money where will you go? 
 * When we import, we import from the place we'll be asking for the data,
 as if you need money you aren't going to your friend's grandpa to ask for it.
*/
import operations.i_sonClass_adding;
import operations.i_sonClass_subtraction;

public class I_inheritance_project {
    public static void main(String[] args) {
        i_sonClass_adding messenger_adding = new i_sonClass_adding();
        messenger_adding.askData();
        messenger_adding.adding();
        System.out.print("The result of the adding is: ");
        messenger_adding.showAnswer();

        i_sonClass_subtraction messenger_subtraction = new i_sonClass_subtraction();
        messenger_subtraction.askData();
        messenger_subtraction.subtraction();
        System.out.print("The result of the subtraction is: ");
        messenger_subtraction.showAnswer();
    }
}
