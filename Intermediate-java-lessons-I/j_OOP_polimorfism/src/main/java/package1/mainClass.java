package package1;

public class mainClass {
    /*The main class.
     * After doing father and doughters, here is where we'll call all those features and operations
     * 
     * Here is the thing. 
     */
    public static void main(String[] args) {
        /*As you can see, we start creating an object from adding doughter wha't is communicated with
         father, in this way the opration will be adding.
         */
        polimorfism_father messenger_add = new polimorfism_addingDaughter();
        messenger_add.askData();
        messenger_add.operations();
        messenger_add.showAnswer();

        /*Then we do the same as above but the object will come from the doughter subtract, that is daughter of
         father, in this way we'll two of the options available, and with the same operations object.
         */

        polimorfism_father messenger_subtrackt = new polimorfism_subtractingDaughter();
        messenger_subtrackt.askData();
        messenger_subtrackt.operations();
        messenger_subtrackt.showAnswer();

        
    }
}
