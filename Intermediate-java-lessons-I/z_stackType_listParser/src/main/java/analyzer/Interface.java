package analyzer;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Interface extends JFrame implements ActionListener{

    private JTextField textField;
    private JButton button;

    public Interface(){
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(20,10,350,25);
        add(textField);

        button = new JButton();
        button.setBounds(20,80,100,30);
        add(button);
        button.addActionListener(this);
    }
    
    public void actionPerformed (ActionEvent e){
        if (e.getSource()== button) {
            System.exit(0);
            
        } else {
        }
    }
    public boolean validateExpression(){
        Stacks stack = new Stacks();
        String chain = textField.getText();

        for (int i =0; i<chain.length(); i++){
            if (chain.charAt(i) == '(' || chain.charAt(i)== ) {
                
            } else {

            }
        }
    }

    public static void main(String[]args){
        Interface box = new Interface();
        box.setBounds(500,500,400,150);
        box.setVisible(true);
        box.setResizable(false);
        box.setLocationRelativeTo(null);
    }

}
