package classes;

public class K_superWord {

    public static void main(String[] args) {
        /*As we've exaplained, here we're creating messenger between the doughter class and main method, but,
 we have doughter hello method also calling father's hello method, so depending on
 inside doughter class which is uncommented, that message will appear here, doughters or fathers*/
        doughterClass messenger = new doughterClass();
        messenger.hello();

    }
}
