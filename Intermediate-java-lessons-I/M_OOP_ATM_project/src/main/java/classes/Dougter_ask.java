package classes;

public class Dougter_ask extends Father_abstract {

    /*We use extends of the father class for overriding it's transaction abstract method */
    @Override
    public void transaction() {
        System.out.println("------------------------");
        System.out.println("Your actual balance is: " + balance);
        System.out.println("------------------------");
    }

}
