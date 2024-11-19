package fifolists;

import javax.swing.JOptionPane;

/*We've created a class wich has nodes, with it's information and it's pointer.
 *We've created a class with the functions of the program and the behaviour of the nodes
 *Now we'll achive all this and print the different cases for the users't interface
 */
public class mainClass {

    public static void main(String[] args) {
        /*Option will be user's decision option and node information stores de data to insert in a node */
        int option = 0, node_information = 0;

        fifoList fifolist = new fifoList(); //this calls the class where the functions are, to have them in this class, also called Inheritance.

        do {
            try {

                option = Integer.parseInt(JOptionPane.showInputDialog(null, //this  convert's user option into int type variable and stores into option variable
                        "Option menu\n\n"
                        + "1. Insert node\n"
                        + "2. Extract node\n"
                        + "3. Show list's content\n"
                        + "4. Exit\n\n"));

                switch (option) { //here we have the different cases, depending on user's election
                    case 1:
                        node_information = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Please introduce the desired value"));//user will see this message and that string will be converted into Int and saved inside node_information
                        fifolist.inputNode(node_information); //with the information saved, this case will call fifolist's inputNode function
                        break;
                    case 2:
                        if (!fifolist.emptyList()) {
                            /*If the fifolist is not empty, this case will call didolist's extract function and it will show the value ofthe node that was the beginning node
                         then it will be deleted and replaced by nextNode, that now will be beginning node, as we've learned in fifolist class
                             */
                            JOptionPane.showMessageDialog(null, "The node's value is: " + fifolist.extract());
                        } else {
                            //if the list is empty, it will show the next message
                            JOptionPane.showMessageDialog(null, "List is empty");
                        }
                        break;
                    case 3:
                        fifolist.showContent(); //this case calls fifolist's showcontent function, showing to the user the list of nodes that are saved
                        break;
                    case 4:
                        option = 4; //option 4 will close the program, this is because the do while loop is over when it's = 4
                        break;
                    default:
                        //if the user's input is a different option that available ones nex message will appear
                        JOptionPane.showMessageDialog(null, "This is not available");
                        break;
                }

            } catch (NumberFormatException e) {
            }
        } while (option != 4);
    }

}
