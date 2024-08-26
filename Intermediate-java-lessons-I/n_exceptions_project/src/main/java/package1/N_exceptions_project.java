/*We'll make a division, asking the user the numbers, but usig exceptions. */
package package1;

import java.util.Scanner;

public class N_exceptions_project {

    public static void main(String[] args) {

        try {

            System.out.println("Hello World!");
            int value1, value2, result;
            Scanner input = new Scanner(System.in);

            System.out.print("Introduce your first number: ");
            value1 = input.nextInt();

            System.out.print("Introduce your second number: ");
            value2 = input.nextInt();

            result = value1 / value2;

            System.out.print("Your division's result is: " + result);

        } catch (Exception e) {
            System.out.println("Error! " + e);
        } finally {
            System.out.println(" Operation finished!");
        }

    }
}
