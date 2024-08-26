package classes;

public class Dougter_deposit extends Father_abstract {

    /*We use extends of the father class for overriding it's transaction abstract method */
    @Override
    public void transaction() {
        System.out.print("How much do you want to deposit? ");
        deposit();//we call father's deposit method, we have there .nextInt for users number introduction

        transactions = getBalance();//now we get the balance adding the deposit to the balance
        setBalance(transactions + deposit);
        System.out.println("----------------------------------------");
        System.out.println("You've done a " + deposit + "€ deposit");
        System.out.println("Your actual balance is: " + getBalance());
        System.out.println("----------------------------------------");
    }

}
