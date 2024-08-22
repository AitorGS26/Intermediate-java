package operations;

import java.util.Scanner;

public class i_fatherClass {
    
    protected int valueOne, valueTwo, result;
    Scanner input = new Scanner(System.in);

    //The following method's utility is to ask the user values for the operations.
    public void askData(){
        System.out.print("Introduce your first number: ");
        valueOne = input.nextInt();

        System.out.print("Introduce your second number: ");
        valueTwo = input.nextInt();
    }

    //The following method show's the result of the operation
    public void showAnswer(){
        System.out.println(result);
    }
}
