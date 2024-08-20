package com.ee_OOP_encapsulation_Logic;
import java.util.Scanner;

public class eee_OOP_encapsulation_Starter {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Color or white clothes?");
        System.out.println("Introduce 1 for white clothes or 2 for color clothes");

        int clotheType = input.nextInt();

        System.out.println("How much kg?");
        int kg = input.nextInt();

        ee_OOP_encapsulation_Logic messenger = new ee_OOP_encapsulation_Logic(kg, clotheType);
        messenger.finishedCycle();
    }    
}
