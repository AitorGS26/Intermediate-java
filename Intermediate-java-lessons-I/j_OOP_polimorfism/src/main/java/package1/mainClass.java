package package1;

public class mainClass {

    /*The main class.
     * After doing father and doughters, here is where we'll call all those features and operations
      
     * Here is the thing. */
    public static void main(String[] args) {
        /*As you can see, we start creating an object from adding doughter wha't is communicated with
         father, in this way the operation will be adding.*/
        polimorfism_father messenger_add = new polimorfism_addingDaughter();
        /*We're creating an object called messenger add for comunicating adding doughter and father
         then thid object that is a messenger between classes, use methods for
         * asking data
         * operations methos (in this case an adding)
         * Then show the andswer
         */
        messenger_add.askData();
        messenger_add.operations();
        messenger_add.showAnswer();

        /*Then we do the same as above but the object will come from the doughter subtract, that is inherit of
         father, in this way we'll two of the options available, and with the same operations object but with different
         function.*/
         
        polimorfism_father messenger_subtrackt = new polimorfism_subtractingDaughter();
        messenger_subtrackt.askData();
        messenger_subtrackt.operations();
        messenger_subtrackt.showAnswer();

    }
}
