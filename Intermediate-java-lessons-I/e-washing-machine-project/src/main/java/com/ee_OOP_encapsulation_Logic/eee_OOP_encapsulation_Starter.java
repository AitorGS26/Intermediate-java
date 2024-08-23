package com.ee_OOP_encapsulation_Logic; //As we have the same package as before, they'll be connected as a library

import java.util.Scanner;

public class eee_OOP_encapsulation_Starter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Color or white clothes?");
        System.out.println("Introduce 1 for white clothes or 2 for color clothes");

        int clotheType = input.nextInt(); //Clothe type here is new variable, not the same as in the functions part, this is because they were private.

        System.out.println("How much kg?");
        int kg = input.nextInt();

        ee_OOP_encapsulation_Logic messenger = new ee_OOP_encapsulation_Logic(kg, clotheType);
        messenger.setclotheType(2); //we've declared this on the logical part, and now we modify the result of the user's election to always appearing intense. 
        System.out.println("The type of the clothes is: " + messenger.getclotheType());
        messenger.finishedCycle();
    }
}
