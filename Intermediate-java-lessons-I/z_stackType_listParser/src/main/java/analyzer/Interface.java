package analyzer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Interface extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton button;

    public Interface() {
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(20, 10, 350, 25);
        add(textField);
        textField.setText("{3*(7-6)-{3*7}-[6-3]}");

        button = new JButton();
        button.setBounds(20, 80, 100, 30);
        add(button);
        button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(null, "The formula is OK");

        } else {
            JOptionPane.showMessageDialog(null, "The formula is not OK");

        }

    }

    public boolean validateExpression() {
        Stacks stack = new Stacks();
        String chain = textField.getText();

        for (int i = 0; i < chain.length(); i++) {
            if (chain.charAt(i) == '(' || chain.charAt(i) == '[' || chain.charAt(i) == '{') {
                stack.introduce(chain.charAt(i));
            } else {
                if (chain.charAt(i) == ')') {
                    if (stack.extractNode() != '(') {
                        return false;
                    }
                } else {
                    if (chain.charAt(i) == ']') {
                        if (stack.extractNode() != '[') {
                            return false;
                        }
                    } else {
                        if (chain.charAt(i) == '{') {
                            if (stack.extractNode() != '}') {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return stack.emptyStack();
    }

    public static void main(String[] args) {
        Interface box = new Interface();
        box.setBounds(500, 500, 400, 150);
        box.setVisible(true);
        box.setResizable(false);
        box.setLocationRelativeTo(null);
    }

}
