package Fos.Client.User;

import Fos.FosInterface;
import java.rmi.Naming;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.xml.bind.ValidationException;


public class SignUp extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String phonenumPattern = "^[0-9]*$";
    public SignUp() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        
        errorUserName.setVisible(false);
        errorPassword.setVisible(false);
        errorAge.setVisible(false);
        errorEmail.setVisible(false);
        errorPhoneNumber.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        genderbox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphonenum = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnregister = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        errorPassword = new javax.swing.JLabel();
        errorUserName = new javax.swing.JLabel();
        errorAge = new javax.swing.JLabel();
        errorEmail = new javax.swing.JLabel();
        errorPhoneNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 500));
        setPreferredSize(new java.awt.Dimension(920, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon1.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, 140));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("BB BreakFast");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(420, 424));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

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
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 320, 30));

        genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel2.add(genderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 140, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Sign Up");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

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
        jPanel2.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 160, 30));

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
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 320, 30));

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
        jPanel2.add(txtphonenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 320, 30));

        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 320, 30));

        btnregister.setBackground(new java.awt.Color(0, 102, 102));
        btnregister.setForeground(new java.awt.Color(255, 255, 255));
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        btnclear.setBackground(new java.awt.Color(0, 102, 102));
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel2.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        btnback.setBackground(new java.awt.Color(0, 102, 102));
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel2.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("User Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Gender");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Age");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Email");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Phone Number");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        errorPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorPassword.setForeground(new java.awt.Color(255, 51, 51));
        errorPassword.setText("*Password is required");
        jPanel2.add(errorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 120, -1));

        errorUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorUserName.setForeground(new java.awt.Color(255, 51, 51));
        errorUserName.setText("*User Name is required");
        jPanel2.add(errorUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 130, -1));

        errorAge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorAge.setForeground(new java.awt.Color(255, 51, 51));
        errorAge.setText("*Age is required");
        jPanel2.add(errorAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 160, -1));

        errorEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorEmail.setForeground(new java.awt.Color(255, 51, 51));
        errorEmail.setText("*Email is required");
        jPanel2.add(errorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 160, -1));

        errorPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorPhoneNumber.setForeground(new java.awt.Color(255, 51, 51));
        errorPhoneNumber.setText("*Phone Number is required");
        jPanel2.add(errorPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 230, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 560, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased

    }//GEN-LAST:event_txtpasswordKeyReleased

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtusernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusernameKeyReleased

    }//GEN-LAST:event_txtusernameKeyReleased

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtageKeyReleased

    }//GEN-LAST:event_txtageKeyReleased

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased

    }//GEN-LAST:event_txtemailKeyReleased

    private void txtphonenumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphonenumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphonenumActionPerformed

    private void txtphonenumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphonenumKeyReleased

    }//GEN-LAST:event_txtphonenumKeyReleased

    public void validateFields() throws ValidationException {
        boolean hasError = false;
        String age = txtage.getText();
        String email = txtemail.getText();
        String phonenum = txtphonenum.getText();
        
        //name
        if (txtusername.getText().isEmpty()) {
            errorUserName.setVisible(true);  
            hasError = true;
        }else{
            errorUserName.setVisible(false); 
        }
        
        //pass
        if (txtpassword.getText().isEmpty()) {
            errorPassword.setVisible(true);
            hasError = true;
        }else{
            errorPassword.setVisible(false); 
        }
        
        //age
        if (age.isEmpty()) {
            errorAge.setText("*Age is required");
            errorAge.setVisible(true);
            hasError = true;
        }
        else{
            try {
                Integer.parseInt(age);
                errorAge.setVisible(false); 
                hasError = false;
            } catch (NumberFormatException e) {
                errorAge.setText("    *Invalid Age");
                errorAge.setVisible(true);
                hasError = true;
            } 
        } 

        //email
        if (email.isEmpty()) {
            errorEmail.setText("*Email is required");
            errorEmail.setVisible(true);
            hasError = true;
        }
        else if(!(email.matches(emailPattern))){
            errorEmail.setText("     *Invalid Email");
            errorEmail.setVisible(true);
            hasError = true;
        }
        else{
            errorEmail.setVisible(false); 
        }
        
        //phone
        if (phonenum.isEmpty()) {
            errorPhoneNumber.setText("*Phone Number is required");
            errorPhoneNumber.setVisible(true);
            hasError = true;
        }else if(!(phonenum.matches(phonenumPattern) && (String.valueOf(phonenum).length() == 10 | String.valueOf(phonenum).length() == 11))){
            errorPhoneNumber.setText("    *Invalid Phone Number");
            errorPhoneNumber.setVisible(true);
            hasError = true;
        }
        else{
            errorPhoneNumber.setVisible(false); 
        }

        if(hasError){
            throw new ValidationException("");
        }
    }
    
    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtusername.setText("");
        txtage.setText("");
        txtemail.setText("");
        txtphonenum.setText("");
        txtpassword.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        setVisible(false);
        Login info = new Login();
        info.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    
    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        try{
            validateFields();
            String name = txtusername.getText();
            String password = txtpassword.getText();
            Integer age = Integer.parseInt(txtage.getText());
            String email = txtemail.getText();
            String phonenum = txtphonenum.getText();
            String gender = genderbox.getSelectedItem().toString();

            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/Register");
            String result = dbi.Register(name,password,age,email,phonenum,gender);
            JOptionPane.showMessageDialog(null, result, "success", JOptionPane.INFORMATION_MESSAGE);
            
            if (result.equals("Register Successful!")){
                setVisible(false);
                Login info = new Login();
                info.setVisible(true);
            }
                
            

        } catch (ValidationException ex) {
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        

    }//GEN-LAST:event_btnregisterActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnregister;
    private javax.swing.JLabel errorAge;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JLabel errorPassword;
    private javax.swing.JLabel errorPhoneNumber;
    private javax.swing.JLabel errorUserName;
    private javax.swing.JComboBox<String> genderbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtphonenum;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
