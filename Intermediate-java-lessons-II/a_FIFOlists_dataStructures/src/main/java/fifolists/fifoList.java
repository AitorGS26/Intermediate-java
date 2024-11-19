package fifolists;

import javax.swing.JOptionPane;

public class fifoList {

    private node BeginningNode, finalNode;
    String list = "";

    public fifoList() {
        BeginningNode = null;
        finalNode = null;
    }

    //Function for knowing if the list is empty
    public boolean emptyList() {
        if (BeginningNode == null) {
            return true;
        } else {
            return false;
        }
    }

    //Function for introducing nodes to list
    public void inputNode(int information) {
        node new_node = new node();
        new_node.information = information;
        new_node.nextNode = null;

        if (emptyList() == true) {
            BeginningNode = new_node;
            finalNode = new_node;
        } else {
            finalNode.nextNode = new_node;
            finalNode = new_node;
        }
    }

    //Function for etracting node
    public int extract() {
        if (!emptyList()) {
            int information = BeginningNode.information;

            if (BeginningNode == finalNode) {
                BeginningNode = null;
                finalNode = null;
            } else {
                BeginningNode = BeginningNode.nextNode;
            }
            return information;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    //Function for showing the lists content
    public void showContent() {
        node routeNode = BeginningNode;
        String invertedList = "";

        while (routeNode != null) {
            list += routeNode.information + " ";
            routeNode = routeNode.nextNode;
        }

        String chain[] = list.split(" "); //invert the chain of characters, the space is for a correct invert of the list

        for (int i = chain.length - 1; i >= 0; i--) {
            invertedList += " " + chain[i];
        }

        JOptionPane.showMessageDialog(null, invertedList);
        list = "";
    }

}
