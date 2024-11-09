/*In the basic lesson, we learned to use swing library for making 
 graphical user interfaces, today we'll make a throwback and make a simple
 gui where when you write some text it will show you in a bigger way*/
package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/*Librarys for using suddenly*/

public class x_gui extends JFrame implements ActionListener {

    private JTextField textField1;
    private JLabel label1;
    private JButton button1;
//We start declaring the variables for the gui

//As we've learned we have to create a builder with same name as class
    public x_gui() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //when the window closes, the program ends

        //Then we start giving form to different parts
        //label
        label1 = new JLabel("message");
        label1.setBounds(15, 10, 100, 30);
        add(label1);

        //text field
        textField1 = new JTextField();
        textField1.setBounds(80, 16, 190, 20);
        add(textField1);

        //button
        button1 = new JButton("show");
        button1.setBounds(10, 60, 100, 30);
        add(button1);
        button1.addActionListener(this);
    }

    //we declare the method for action event 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {//when we click button 1
            String chain = textField1.getText();
            //the program save the text in textfield1 inside chain
            JOptionPane.showMessageDialog(null, chain);
            //for showing the message
        }
    }

    public static void main(String[] args) {
        //here the main method and window's preferences.
        x_gui graphicalInterface = new x_gui();
        graphicalInterface.setBounds(0, 0, 300, 150);
        graphicalInterface.setVisible(true);
        graphicalInterface.setLocationRelativeTo(null);

    }
}
