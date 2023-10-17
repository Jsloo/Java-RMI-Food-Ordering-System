
package Fos.Client;

import Fos.FosInterface;
import java.rmi.Naming;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import sun.security.util.Password;

public class Register extends javax.swing.JFrame {

    
    public Register() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Pizza Ordering System");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 50, 411, 44);

        name.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(240, 150, 150, 30);

        jLabel2.setText("UserName: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 150, 70, 20);

        jLabel3.setText("Password : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 190, 80, 30);

        password.setText("jPasswordField1");
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(password);
        password.setBounds(240, 190, 150, 30);

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(140, 250, 100, 30);

        jButton2.setText("Register");
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 250, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
    }//GEN-LAST:event_nameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try{
      
            String nam = name.getText();
            String pass = password.getText();

            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/Login");
            String result = dbi.Login(nam,pass);
            JOptionPane.showMessageDialog(null, result, "success", JOptionPane.INFORMATION_MESSAGE);
            
            
            
        }catch(Exception ex){
            System.out.println("Error");
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_loginActionPerformed

 
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
