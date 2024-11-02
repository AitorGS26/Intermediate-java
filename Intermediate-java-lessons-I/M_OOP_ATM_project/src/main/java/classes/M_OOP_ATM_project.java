package classes;

public class M_OOP_ATM_project {

    public static void main(String[] args) {
        Father_abstract messenger = new Dougter_ask();
        /*All doughter classes are connected with father
          we'll do a messenger between this and sdoughter ask
          this is the one with balance, we use setter method
          and set the initial balance.
          Then we use messenger object to operations method,
          the one wich has all inside of it in the father
          class for making it work.*/
          
        messenger.setBalance(15);
        messenger.operations();
    }
}
