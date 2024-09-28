package package1;

import java.util.Scanner;

public class NoConstructorClass {

    private Scanner input = new Scanner(System.in);
    String name = "";

    public void askName() {
        System.out.print("Which is your name? ");
        name = input.nextLine();
    }

    public void print() {
        System.out.println("Your name is: " + name);
    }
}
