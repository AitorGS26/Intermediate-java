package stacklists;

import javax.swing.JOptionPane;

public class mainClass{
    public static void main(String[] args) {
        
    
    int option = 0, node = 0;
    stack stack  = new stack();

    do{
        try {
            option = Integer.parseInt(JOptionPane.showInputDialog(null,"Option Menu\n\n"
            + "1- Introduce nodes\n"
            + "2- Delete nodes\n"
            + "3- Is the stack empty\n"
            + "4- Last value introduced in the stack\n"
            + "5- Amount of stack's nodes\n"
            + "6- Clean up the stack\n"
            + "7- Show stack's data\n"
            + "8- Exit\n\n"));

        switch (option) {
            case 1:
              node=  Integer.parseInt (JOptionPane.showInputDialog(null, "Please introduce the value for saving at the node"));
              stack.introduceNode(node);  
              break;
            case 2:
                if (!stack.emptyStack()) {
                    JOptionPane.showMessageDialog(null, "It has been deleted a node whit numbert " 
                    + stack.deleteNode());
                } else {
                    JOptionPane.showMessageDialog(null, "Stack is empty");
                }
                break;
            case 3:
                if (stack.emptyStack()) {
                    JOptionPane.showMessageDialog(null, "Stack is empty");
                } else {
                    JOptionPane.showMessageDialog(null, "Stack is NOT empty");
                }
                break;
            case 4:
                if (!stack.emptyStack()) {
                    JOptionPane.showMessageDialog(null, "The last value of the stack is " +
                    stack.showInputtedLastValue());
                } else {
                    JOptionPane.showMessageDialog(null, "Stack is empty");
                }
                break;
            case 5:
                    JOptionPane.showMessageDialog(null, stack.showStackSize());
                                    break;
            case 6:
                if (!stack.emptyStack()) {
                    stack.cleanupStack();
                    JOptionPane.showMessageDialog(null, "The stack has succesfully cleaned");
                } else {
                    JOptionPane.showMessageDialog(null, "Stack is empty");
                }
                break;
            case 7:
                stack.showStacksInfo();
                break;
            case 8:
                option = 8;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Wrong option, try again");
                break;
        }
        } catch (NumberFormatException e) {
        }
    }while (option != 8);
}
}