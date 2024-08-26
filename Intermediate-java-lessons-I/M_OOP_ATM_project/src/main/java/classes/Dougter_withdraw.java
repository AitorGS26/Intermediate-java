package classes;

public class Dougter_withdraw extends Father_abstract {
//We use override for the abstract class and using it for wothdrawing from the ATM

    @Override
    public void transaction() {

        System.out.print("How much do you want to withdraw? ");
        withdraw();//we call father's withdraw method which has .nextInt for saving users numbers.
        if (withdrawal <= getBalance()) {//getbalance has the amount of money, if it's lower of equal
            transactions = getBalance();//get balance's info compares with transactions
            setBalance(transactions - withdrawal); //we set the balance with this subtraction and then print it
            System.out.println("----------------------------------------");
            System.out.println("You've withdraw: " + withdrawal);
            System.out.println("your actual balance is: " + getBalance());
            System.out.println("----------------------------------------");
        } else {//If we want to eithdraw more than the amount we've below's will appear
            System.out.println("------------------");
            System.out.println("The balance is lower than that amount of money.");
            System.out.println("------------------");
        }

    }

}
