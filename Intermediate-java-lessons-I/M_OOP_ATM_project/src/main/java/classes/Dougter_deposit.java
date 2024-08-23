package classes;

public class Dougter_deposit extends Father_abstract {

    @Override
    public void transaction() {
        System.out.print("How much do you want to deposit? ");
        deposit();

        transactions = getBalance();
        setBalance(transactions + deposit);
        System.out.println("----------------------------------------");
        System.out.println("You've done a " + deposit + "€ deposit");
        System.out.println("Your actual balance is: " + getBalance());
        System.out.println("----------------------------------------");
    }

}
