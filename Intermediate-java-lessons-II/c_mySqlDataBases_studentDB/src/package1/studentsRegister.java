/*In today's lesson, we start working with databases, for that we've previously created
a database with xampp, also we've to work with gui.

* By now I've been using VScode, but this don't give us the possibility to make the
gui handly and only by coding source, this will be long and tedious so I've
downloaded Netbeans, which provide us an option to make the window manually and visually

* This is very usefull, it allow us to concentrate in the functionality of the 
program and Netbeans do the window's code.

* We're learning MySql, this code will be inside od jButton1ActionPerformed and
 jButton4Actionperformed, this two will be the buttons that have some functions conected to
the database, all the other code are variables and names, added automatically by netbeans
when we create the guay manually and visually.*/

package package1;

import java.sql.*; //We've to import sql library for allowing the program working with the databases we're working with
import javax.swing.JOptionPane; 

public class studentsRegister extends javax.swing.JFrame {

    public studentsRegister() { //The constructor inits the components we've created visually at netbeans
        initComponents();
        this.setLocationRelativeTo(null);//for centering the windown when opened
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_group = new javax.swing.JTextField();
        txt_studentCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modify");

        jButton3.setText("Delete");

        jLabel2.setText("Student Group");

        jLabel3.setText("Introduce Student's code");

        label_status.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton4.setText("search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txt_group, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                                .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton2))
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txt_studentCode)
                                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(label_status)
                                        .addComponent(jButton4))
                                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_studentCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addComponent(label_status)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*When we work with databases, is importat to put the code inside of a try-catch*/
        try {
            /*First of all we need to connect to our database, DriverManager.getConnection is for that
             * Inside the (), we add JDBC which means java database conectivity, mysql:// is because we're using mysql
             * Then we add the route, in this case localhost and then 3 ARGUMENTS, which are URL, username and password.
             * In this case we're proving it locally so URL will be localhost/first_db (first:db is the name of the database)
             * in this case there isn't an username or password, so we add root as username and "" as password*/            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/first_db", "root", "");
            
            /*jButton1 is for INSERT new students data, the following code is for that.
             *PreparedStatement is a type of statement for having security inserting the need values, 
             * we create an object of that and connect it, the ? are the placeholders of the values we'll insert
             * in this case ID NAME and GROUP, that's the reason why are 3 ?*/
            PreparedStatement pst = connection.prepareStatement("insert into students values(?,?,?)");
            /*We use setString method to set the values to each placeholder
             * The first argument is the index of the placeholder, it starts by 1.
             * the others are values to set, name and group*/
            pst.setString(1, "0");//When we created the database we set auto-incrementing, so it will start from 0 and increments by itself
            pst.setString(2, txt_name.getText().trim());//it gets the text of the field txt_name which is student's name
            pst.setString(3, txt_group.getText().trim());//same as name but with student's group
            pst.executeUpdate();//execute update is for executing the INSERT query
            //a query is a way to ask a database for specific information to instruct it to perform an action on the data
            
            //After getting the data from the fields, we add the following for clearing them
            txt_name.setText("");
            txt_group.setText("");
            //after clearing the fields, if it has worked there will appear success message
            label_status.setText("Success");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /*By now we've added the function to the insert button, and the data of name and group fields, 
     will be saved in our database.
    
     * Next step is to select the data we need and make it appear inside the same fields we've saved from.
     * imagine we've a list of 300 students, we want to select the data of the student 150 and know which is,
    for that is jButton4's function. Fist of all we add all the data and then with this we read what we want*/
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            //First of all we connect the fucntion to the database as before
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/first_db", "root", "");
            
            /*The previous button's statement was to insert data in the database, now the statement is going to be SELECT
             * the following code is for that.
             select * from students where ID = ? - this means select all from students (the table of the database) where id is ? (? means user's decision's input)*/
            PreparedStatement pst = connection.prepareStatement("select * from students where ID = ?");
            
            
            /*We get the user's id from txt_studentCode field */
            pst.setString(1, txt_studentCode.getText().trim());
            
            /*By now we've the id and we add the following code to execute the selected query*/
            ResultSet resultSet = pst.executeQuery();
            
            /*We add an if statement, this is if the data we have matches with an student's id 
            is will appeat in name's field, and same with group.
            If any id matches it will appear the message Not registered*/
            if (resultSet.next()) {
                txt_name.setText(resultSet.getString("StudentName"));
                txt_group.setText(resultSet.getString("StudentGroup"));
            } else {
                JOptionPane.showMessageDialog(null, "Not registered");
            }

        } catch (Exception e) {
            e.printStackTrace(); // This will print the error details to the console
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage()); // For user-friendly errors
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentsRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentsRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentsRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentsRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentsRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_group;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_studentCode;
    // End of variables declaration//GEN-END:variables
}
