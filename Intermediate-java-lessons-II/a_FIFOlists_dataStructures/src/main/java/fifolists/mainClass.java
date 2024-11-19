package fifolists;

import javax.swing.JOptionPane;

public class mainClass {

    public static void main(String[] args) {
        int option = 0, node_information = 0;

        fifoList fifolist = new fifoList();

        do {
            try {

                option = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Option menu\n\n"
                        + "1. Insert node\n"
                        + "2. Extract node\n"
                        + "3. Show list's content\n"
                        + "4. Exit\n\n"));

                switch (option) {
                    case 1:
                        node_information = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Please introduce the desired value"));
                        fifolist.inputNode(node_information);
                        break;
                    case 2:
                        if (!fifolist.emptyList()) {
                            JOptionPane.showMessageDialog(null, "The node's value is: " + fifolist.extract());
                        } else {
                            JOptionPane.showMessageDialog(null, "List is empty");
                        }
                        break;
                    case 3:
                        fifolist.showContent();
                        break;
                    case 4:
                        option = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "This is not available");
                        break;
                }

            } catch (NumberFormatException e) {
            }
        } while (option != 4);
    }

}
