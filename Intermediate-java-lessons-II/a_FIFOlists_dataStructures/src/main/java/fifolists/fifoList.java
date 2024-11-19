package fifolists;

import javax.swing.JOptionPane;

public class fifoList {

    private node listBeginningNode, listfinalNode;
    String list = "";

    public fifoList() {
        listBeginningNode = null;
        listfinalNode = null;
    }

    //Function for knowing if the list is empty
    public boolean emptyList() {
        if (listBeginningNode == null) {
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
            listBeginningNode = new_node;
            listfinalNode = new_node;
        } else {
            listfinalNode.nextNode = new_node;
            listfinalNode = new_node;
        }
    }

    //Function for etracting node
    public int extract() {
        if (!emptyList()) {
            int information = listBeginningNode.information;

            if (listBeginningNode == listfinalNode) {
                listBeginningNode = null;
                listfinalNode = null;
            } else {
                listBeginningNode = listBeginningNode.nextNode;
            }
            return information;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    //Function for showing the lists content
    public void showContent() {
        node routeNode = listBeginningNode;
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
