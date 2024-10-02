
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class x_graphicalInterface extends JFrame implements ActionListener {

    private JTextField textField1;
    private JLabel label1;
    private JButton button1;

    public x_gui() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label1 = new JLabel("message");
        label1.setBounds(15, 10, 100, 30);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(80, 16, 190, 20);
        add(textField1);

        button1 = new JButton("show");
        button1.setBounds(10, 60, 100, 30);
        add(button1);
        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            String chain = textField1.getText();
            JOptionPane.showMessageDialog(null, chain);
        }
    }

    public static void main(String[] args) {
        x_gui graphicalInterface = new x_gui();
        graphicalInterface.setBounds(0, 0, 300, 150);
        graphicalInterface.setVisible(true);
        graphicalInterface.setLocationRelativeTo(null);

    }
}
