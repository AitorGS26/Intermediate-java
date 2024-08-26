//We've the same package at this class and at the logic class so they'll be connected by that.
package com.ee_OOP_encapsulation_Logic;

import java.util.Scanner;//we're going to ask for info to the user, so we need scanner

public class eee_OOP_encapsulation_Starter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//we declare input scannner for asking the user

        System.out.println("Color or white clothes?");
        System.out.println("Introduce 1 for white clothes or 2 for color clothes");
        /*Clothe type here is new variable, not the same as in the functions part, this is because 
they were private*/
        int clotheType = input.nextInt();

        System.out.println("How much kg?");
        int kg = input.nextInt();
        /*We declare an object with the name of the logicclass, this will be the messenger between two
         classes, we add the variables we've the user's data inside for having the comunication between classes
         and then the logic part will work.
         After finishing the logic part it will return and messenger will call to the print method to print 
         the messages of the state of the washer.
         */
        ee_OOP_encapsulation_Logic messenger = new ee_OOP_encapsulation_Logic(kg, clotheType);
        messenger.setclotheType(2);
        /*we've declared setclotheType on the logical part, 
                                                and now we modify the result of the user's election to 
                                                always appearing intense.*/
        System.out.println("The type of the clothes is: " + messenger.getclotheType());
        //we've put the return on clothe type so above will appear the clothe type user has selected
        messenger.finishedCycle();//Final message.
    }
}
