package fifolists;

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

    public void inputNode(int information) {
        node new_node = new node();
        new_node.info = information;
        new_node.nextNode = null;

        if (emptyList() == true) {

        } else {

        }
    }

}
