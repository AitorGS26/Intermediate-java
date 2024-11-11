package stacklists;

import javax.swing.JOptionPane;

/*This class will be the one who will create the behaviour os a stack list */
public class stack{

    nodes InputtedLastValue;//Declaration: node for knowing last value and if the list is empty
    int size = 0; //Declaration: an entire number with size name and 0 value
    String list = "";//Declaration: string for the list's data


/*Builder for this class => */
    public stack(){
        InputtedLastValue = null;
        size = 0;
    }

/*FUNCTIONS 

 * Function for knowing when the stack is empty*/

 public boolean emptyStack(){
   
    return InputtedLastValue == null; //if it's null it will be true, if not, false
 }

//Function for introducing a node in the stack

public void introduceNode(int node){
     nodes new_node = new nodes (node);
    new_node.nextNode = InputtedLastValue;
    InputtedLastValue = new_node;
    size++;
}
//Function for deleting a node from the stack
public int deleteNode(){
    int aux = InputtedLastValue.info;
    InputtedLastValue = InputtedLastValue.nextNode;
    size--;
    return aux;
}
//Function for knowing inputted last value
public int showInputtedLastValue(){
    return InputtedLastValue.info;
}

//Function for knowing stack's size
public int showStackSize(){
    return size;
}

//function for cleaning up the stack
public void cleanupStack(){
    while(!emptyStack()){
        deleteNode();
    }
}


//Function for knowing the info of the stack
public void showStacksInfo(){
    nodes way = InputtedLastValue;
    while (way != null){
        list += way.info + "\n";
        way = way.nextNode;
    }
    JOptionPane.showMessageDialog(null, list);
    list = "";
}


}
