
package analyzer;

public class Stacks {
    private Nodes inputtedLastValue;


public Stacks(){
    inputtedLastValue = null;
}

//Function for Introduce nodes in the stack
public void introduce(char value){

    Nodes new_node = new Nodes();
    new_node.info = value;

    if (inputtedLastValue == null) {
        new_node.nextNode = null;
        inputtedLastValue = new_node;        
    } else {

        new_node.nextNode = inputtedLastValue;
        inputtedLastValue = new_node;
        
    }
}

//Function for extract from the stack
public char extractNode(){
    if (inputtedLastValue == null) {
        char information = inputtedLastValue.info;
        inputtedLastValue = inputtedLastValue.nextNode;
        return information;
    } else {
        return Character.MAX_VALUE;
    }
}

//Function for looking if the stack is empty
public boolean emptyStack(){
    return inputtedLastValue == null;
}
}
