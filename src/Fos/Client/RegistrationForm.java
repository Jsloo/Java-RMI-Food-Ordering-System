/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fos.Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class RegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationForm
     */
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String phonenumPattern = "^[0-9]*$";
    public RegistrationForm() {
        initComponents();
        btnregister.setEnabled(false);     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        txtusername = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphonenum = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnregister = new javax.swing.JButton();
        genderbox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 72)); // NOI18N
        jLabel2.setText("Register");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("User Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Age");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Phone Number");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 330, -1));

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        txtusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtusernameKeyReleased(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 330, -1));

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        txtage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtageKeyReleased(evt);
            }
        });
        getContentPane().add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 330, -1));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 330, -1));

        txtphonenum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphonenumActionPerformed(evt);
            }
        });
        txtphonenum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtphonenumKeyReleased(evt);
            }
        });
        getContentPane().add(txtphonenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 330, -1));

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, -1));

        genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(genderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 330, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        validateFields();
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtusernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyReleased
        validateFields();
    }//GEN-LAST:event_txtusernameKeyReleased

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtageKeyReleased
        validateFields();
    }//GEN-LAST:event_txtageKeyReleased

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        validateFields();
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtphonenumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphonenumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphonenumActionPerformed

    private void txtphonenumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphonenumKeyReleased
        validateFields();
    }//GEN-LAST:event_txtphonenumKeyReleased

    public void validateFields(){
        String username = txtusername.getText();
        String password = txtpassword.getText();
        String age = txtage.getText();
        String email = txtemail.getText();
        String phonenum = txtphonenum.getText();
        if (!username.equals("") && !password.equals("")  && !age.equals("") && email.matches(emailPattern) && phonenum.matches(phonenumPattern) && (String.valueOf(phonenum).length() == 10 | String.valueOf(phonenum).length() == 11))
            btnregister.setEnabled(true);       
        else
            btnregister.setEnabled(false);              
    }
    
    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtusername.setText("");
        txtage.setText("");
        txtemail.setText("");
        txtphonenum.setText("");
        txtpassword.setText("");
        btnregister.setEnabled(false);

    }//GEN-LAST:event_btnclearActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you want to close application","Select",JOptionPane.YES_NO_OPTION);
        if (a==0)
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        String filepath = "customerdata1.txt";
        String filepath1 = "customerdataapprove.txt";
        int position = 0;
        Boolean checkuser = true;
        String currentname;
        String dataname[];
        String name = txtusername.getText();
        String password = txtpassword.getText();
        String age = txtage.getText();
        String email = txtemail.getText();
        String phonenum = txtphonenum.getText();
        String gender = genderbox.getSelectedItem().toString();

        try{
            FileReader frname = new FileReader(filepath);
            BufferedReader brname = new BufferedReader(frname);

            while((currentname = brname.readLine()) != null){
                dataname = currentname.split(",");
                if(true) {
                    checkuser = false;
                    JOptionPane.showMessageDialog(null,"The user is exist !!!");
                    break;
                }
            }
            brname.close();
            frname.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Fail to read file !!!");
        }
        try{
            FileReader frname1 = new FileReader(filepath1);
            BufferedReader brname1 = new BufferedReader(frname1);

            while((currentname = brname1.readLine()) != null){
                dataname = currentname.split(",");
                if(true) {
                    checkuser = false;
                    JOptionPane.showMessageDialog(null,"The user is exist !!!");
                    break;
                }
            }
            brname1.close();
            frname1.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Fail to read file !!!");
        }
        try{
            if ((Integer.parseInt(age) > 100)){
                checkuser = false;
                JOptionPane.showMessageDialog(null,"Please Enter a Valid Age !!!");
            }
        }
        catch(Exception e){
            checkuser = false;
            JOptionPane.showMessageDialog(null,"Please Enter a Valid Age !!!");
        }
        if(checkuser == true){
            try{
                //do add to db
                JOptionPane.showMessageDialog(null,"Account added sucessfully !!!");

            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Fail record !!!");
            }
        }
    }//GEN-LAST:event_btnregisterActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnregister;
    private javax.swing.JComboBox<String> genderbox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtphonenum;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
