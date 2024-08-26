/*This is going to be a little projet of a simulator for an ATM,
 it will have all the parts of this course, all the things we've been learning.

 * First of all the simulator will include next fuctions for the user:
 * 1- balance inquiry
 * 2- cash withdrawal
 * 3- cash deposit
 * 4- finish or exit
  
  
 * The project will include the following concepts of the lessons we've been studying.
  
 * * OOP paradigm
 * * Encapsuling
 * * Setter and Getter methods
 * * Inheritance
 * * Polimorfism
 * * Variable scope.*/
package classes;

/*As we've seen, our projects until now, we start all by the father class, where will be
 all the atributes and methods of the program, which we will have inheritance, we've called 
 like that because it also will be abstract.*/
import java.util.Scanner;

public abstract class Father_abstract {

    /*We've going to have inheritance at the atributes, and for declaring them, 
    they'll be protected*/
    protected int transactions, withdrawal, deposit;
    protected static int balance;
    Scanner input = new Scanner(System.in);

    /*Abrove, we've global variables, the interaction of the user with the ATM will be
 as protected
 
 * Below, we've declared the first method(function) of our program, it will be operations,
 where inside there will be the option menu which the user will use.*/
    public void operations() {

        /*The following variables, are local variables, they only will work inside "operations" method.
         As we've seen they have to be declared, which means = 0;  */
        int flag = 0;
        int selection = 0;
        /* The above variables, flag and selecion will have the following use.*/


 /* Flag will have the value 0 at the beggining, when the user press any of the option,
 it will change the value to 1 and it will be outside the do-while loop, but, when the user choose an
 option, and finish it's interaction, the menu will appear as a loop again, for giving him the 
 opportunity of choose a new option, for that we'll do 2 do-while loops. */
        do {
            do {
                System.out.println("Choose your option:");
                System.out.println("    1. Balance inquiry");
                System.out.println("    2. Cash withdrawal");
                System.out.println("    3. Cash deposit");
                System.out.println("    4. Exit");
                selection = input.nextInt();

                if (selection >= 1 && selection <= 4) {
                    flag = 1;
                } else {
                    System.out.println("------------------");
                    System.out.println("Incorrect Option");
                    System.out.println("------------------");
                }
            } while (flag == 0);
            //This 4 functions will be done after the doughter classes
            if (selection == 1) {

                Father_abstract messenger = new Dougter_ask();
                messenger.transaction();

            } else if (selection == 2) {
                Father_abstract messenger = new Dougter_withdraw();
                messenger.transaction();

            } else if (selection == 3) {
                Father_abstract messenger = new Dougter_deposit();
                messenger.transaction();

            } else if (selection == 4) {
                System.out.println("------------------");
                System.out.println("Bye, have a nice day");
                System.out.println("------------------");
                flag = 2;
            }

        } while (flag != 2);//While flag is not 2 the loop will not finish, it only will be 2 
        //when the user presses 4 for exit.
    }

    //The following method, is for asking the amount of money the user want to withdraw
    public void withdraw() {
        withdrawal = input.nextInt();
    }

    public void deposit() {
        deposit = input.nextInt();
    }
//Abstract method, after introducing this method, we've added abstract to the class,
//Inside transaction abstract method will be the principal doughter classes functions

    public abstract void transaction();

//Setter and Getter methods
    public int getBalance() {/*we use getbalance for saving the new values of the balance, after user 
                               has done a deposit or a withdraw*/
        return balance;
    }
//parameters are local, this is the reason we can use balance in below's method.

    public void setBalance(int balance) {//we use the set method to set a the balance amount previously because it's protected
        this.balance = balance;
    }

}
