package classes;

public class Dougter_withdraw extends Father_abstract {

    @Override
    public void transaction() {

        System.out.print("How much do you want to withdraw? ");
        withdraw();
        if (withdrawal <= getBalance()) {
            transactions = getBalance();
            setBalance(transactions - withdrawal);
            System.out.println("----------------------------------------");
            System.out.println("You've withdraw: " + withdrawal);
            System.out.println("your actual balance is: " + getBalance());
            System.out.println("----------------------------------------");
        } else {
            System.out.println("------------------");
            System.out.println("The balance is lower than that amount of money.");
            System.out.println("------------------");
        }

    }

}
