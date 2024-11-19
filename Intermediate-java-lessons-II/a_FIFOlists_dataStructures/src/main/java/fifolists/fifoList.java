package fifolists;

import javax.swing.JOptionPane;

/*After node class, we'll come to this fifoList class
 which will have the functions of the program*/
public class fifoList {

    private node BeginningNode, finalNode; //We start declaring the different variables
    String nodeList = "";

    public fifoList() {
        /*When the program starts, it won't have any nodes inside, so the nodes will be null state */
        BeginningNode = null;
        finalNode = null;
    }

    //Function for knowing if the list is empty
    public boolean emptyList() { //if the beginning node is null, the list will be empty so this function will return true
        if (BeginningNode == null) {
            return true;
        } else {
            return false;
        }
    } //now we've the first function, we'll know if the list is empty or not

    //Function for introducing nodes to list
    public void inputNode(int information) { //information here will be the input of the user
        //we start creating a node type object, called new node, for saving user's input
        node new_node = new node();
        /*As we've learned in node class nodes have two fields, information and a pointer 
        to the next node, here information is saved in new_node's information field,
        On the other side the field that is a pointer is null because by now the pointer 
        is not pointing to anywhere */
        new_node.information = information;
        new_node.nextNode = null;
        /*Here we've the next conditional case, if the node list is empty, 
         the beggining node and the final node will be the same, new node.*/
        if (emptyList() == true) {
            BeginningNode = new_node;
            finalNode = new_node;
        } else {
            /*If not, if the list is not empty, we attach new node to the last node at the list, like the next node
         and we convert that new node that we've attached in the final node, waiting a new input for attaching
         a new node and so on*/

            finalNode.nextNode = new_node;
            finalNode = new_node;
        }
    }

    //Function for etracting node
    public int extract() {
        /*if the list is NOT empty, the information inside Begiining node will be saven in the information variable  */
        if (!emptyList()) {
            int information = BeginningNode.information;
            /*If the beginning node and final node area equal, so there is only one node
             if that's the case, both will be null and the node will be removed*/
            if (BeginningNode == finalNode) {
                BeginningNode = null;
                finalNode = null;
            } else {
                /*If there are multiple nodes, for example 3 nodes A, B, C, all of them have it's information and
             the pointer to next node, in this case A -> B -> C ->
             The following line means thet the next node of the beginning node (A), in this case (B) now will be the beginning node
             and A will be "deleted", the new structure will be B -> C -> */
                BeginningNode = BeginningNode.nextNode;
            }
            /*At the first lines of this function we've we've achieved the beginning node's info inside information variable, now the program
             will return that info after erasing the first node. as we've explained above, the user will see the first node's 
             info and then that node will be deleted*/
            return information;
        } else {
            //if the list is empty, the following will return that empty list
            return Integer.MAX_VALUE;
        }
    }

    //Function for showing the lists content
    public void showContent() {
        /*We start creating routeNode and saving beginning node inside, this routeNode will be the one who will
         "travel" through the node list*/
        node routeNode = BeginningNode;
        String invertedList = "";
        /*Now we start a loop that says that while routeNode points to a valid node (one inside the list of nodes,
         user has inputted) the information of that routenode will save inside nodeList variable, as we've seen
         at first routeNode will have the information of the beginning node so that will be the first node list's data.
         After that, routenode's nextNode will be routeNode's new value. and the loop will start again until 
         routeNode arrives at the final node which nextNode will be null and the program will be out of the loop.  */
        while (routeNode != null) {
            nodeList += routeNode.information + " ";
            routeNode = routeNode.nextNode;
        }


        /*Now we've all the user's inputted data inside nodelist, and the next line will split it separated by spaces and 
         will save that information inside chain array*/
        String chain[] = nodeList.split(" ");

        /*int i = chain.length - 1 => this will ad the LAST value of the chain array to I value.
         As we know the array list always star by 0 so if the array list has 5 elements the last elemet will be 4 and the first one 0,
         thats the reason we've i>=0 (the loop will continue until i reaches the first element of the list, 0 position)
         i-- it ill be decreasin until it arrives to 0 position
         and all of this data, 4 - 3 - 2 - 1 - 0 will be sved inside inverted list separateb by spaces
         */
        for (int i = chain.length - 1; i >= 0; i--) {
            invertedList += " " + chain[i];
        }

        /*Here we create a JOptionpane and it will show inverted list and finalli nodelist will set to empty, preparing it 
        to next time the function is called */
        JOptionPane.showMessageDialog(null, invertedList);
        nodeList = "";
    }

}
