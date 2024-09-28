package package1;

import java.util.Scanner;

public class ClassConstructor {

    public ClassConstructor() {

        Scanner input = new Scanner(System.in);
        String name = "";

        System.out.print("Which is your name? ");
        name = input.nextLine();
        System.out.println("Your name is: " + name);
    }
}
