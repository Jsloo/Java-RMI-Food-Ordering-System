
package Fos.Client.User;

import Fos.FosInterface;
import java.awt.event.FocusEvent;
import javax.swing.JOptionPane;

import java.rmi.*;
import java.util.ArrayList;
import javax.xml.bind.ValidationException;
public class Profile extends javax.swing.JFrame {
    
    public boolean drop = false;
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String phonenumPattern = "^[0-9]*$";
    public Profile() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        showUsername();
        errorUserName.setVisible(false);
        errorAge.setVisible(false);
        errorEmail.setVisible(false);
        errorPhoneNumber.setVisible(false);
        dropdown.setVisible(false);
        try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/GetProfile");
            ArrayList<String>  result = dbi.GetProfile();

            txtusername.setText(result.get(0));
            txtemail.setText(result.get(1));
            genderbox.setSelectedItem(result.get(2));
            txtphonenum.setText(result.get(3));
            txtage.setText(result.get(4));
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        dropdown = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        EditProfile = new javax.swing.JPanel();
        nameLabel2 = new javax.swing.JLabel();
        logOut = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        genderbox = new javax.swing.JComboBox<>();
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
        errorUserName = new javax.swing.JLabel();
        errorAge = new javax.swing.JLabel();
        errorEmail = new javax.swing.JLabel();
        errorPhoneNumber = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(1000, 300));
        setMinimumSize(new java.awt.Dimension(1015, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(1010, 590));
        jPanel4.setMinimumSize(new java.awt.Dimension(1010, 590));
        jPanel4.setPreferredSize(new java.awt.Dimension(1010, 590));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_small.png"))); // NOI18N
        jLabel1.setText(" BB BreakFast");
        jLabel1.setToolTipText("");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        nameLabel.setText("Username");
        nameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nameLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameLabelMouseExited(evt);
            }
        });
        jPanel4.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        dropdown.setBackground(new java.awt.Color(255, 255, 255));
        dropdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dropdownMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dropdownMouseExited(evt);
            }
        });
        dropdown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EditProfile.setBackground(new java.awt.Color(204, 204, 204));
        EditProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nameLabel2.setText("Edit Profile");
        EditProfile.add(nameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(EditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, 50));

        logOut.setBackground(new java.awt.Color(255, 255, 255));
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutMouseExited(evt);
            }
        });
        logOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logout.setText("Log Out");
        logOut.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        dropdown.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 120));

        jPanel4.add(dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 190, 170));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

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
        jPanel5.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 320, 30));

        genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel5.add(genderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 140, 30));

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
        jPanel5.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 160, 30));

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
        jPanel5.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 320, 30));

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
        jPanel5.add(txtphonenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 320, 30));

        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });
        jPanel5.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 320, 30));

        btnregister.setBackground(new java.awt.Color(255, 255, 255));
        btnregister.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel5.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        btnclear.setBackground(new java.awt.Color(255, 255, 255));
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel5.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        btnback.setBackground(new java.awt.Color(255, 255, 255));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel5.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("User Name");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Gender");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Age");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Email");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Phone Number");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        errorUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorUserName.setForeground(new java.awt.Color(255, 51, 51));
        errorUserName.setText("*User Name is required");
        jPanel5.add(errorUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 130, -1));

        errorAge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorAge.setForeground(new java.awt.Color(255, 51, 51));
        errorAge.setText("*Age is required");
        jPanel5.add(errorAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 160, -1));

        errorEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorEmail.setForeground(new java.awt.Color(255, 51, 51));
        errorEmail.setText("*Email is required");
        jPanel5.add(errorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 160, -1));

        errorPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorPhoneNumber.setForeground(new java.awt.Color(255, 51, 51));
        errorPhoneNumber.setText("*Phone Number is required");
        jPanel5.add(errorPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 230, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edit Profile");
        jLabel2.setToolTipText("");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 960, 460));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased

    }//GEN-LAST:event_txtpasswordKeyReleased

       
    
    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        try{
            validateFields();
            String name = txtusername.getText();
            String password = txtpassword.getText();
            Integer age = Integer.parseInt(txtage.getText());
            String email = txtemail.getText();
            String phonenum = txtphonenum.getText();
            String gender = genderbox.getSelectedItem().toString();
            if (password.equals("")){
                password = null;
            }
            
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/UpdateProfile");
            String result = dbi.UpdateProfile(name,password,age,email,phonenum,gender);
            JOptionPane.showMessageDialog(null, result, "success", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
            Login info = new Login();
            info.setVisible(true);

        } catch (ValidationException ex) {
            
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnregisterActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtusername.setText("");
        txtage.setText("");
        txtemail.setText("");
        txtphonenum.setText("");
        txtpassword.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        setVisible(false);
        Menu info = new Menu();
        info.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void dropdownMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropdownMouseExited

    }//GEN-LAST:event_dropdownMouseExited

    private void dropdownMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropdownMouseEntered

    }//GEN-LAST:event_dropdownMouseEntered

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/LogOut");
            dbi.LogOut();
            setVisible(false);
            new Login().setVisible(true);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_logOutMouseClicked

    private void nameLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLabelMouseExited
        nameLabel.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_nameLabelMouseExited

    private void nameLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLabelMouseEntered
        nameLabel.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_nameLabelMouseEntered

    private void nameLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLabelMouseClicked
        if (drop == false){
            dropdown.setVisible(true);
            drop = true;
        }else{
            dropdown.setVisible(false);
            drop = false;
        }
    }//GEN-LAST:event_nameLabelMouseClicked

    private void logOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseEntered
        logOut.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_logOutMouseEntered

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
        logOut.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_logOutMouseExited
 
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new Profile().setVisible(true);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
    


public void showUsername(){
    try {
        FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/getUsername");
        ArrayList<String[]>  result = dbi.getUsername();
        for (String[] menuData : result) {
            nameLabel.setText(menuData[0]);
        }
    }catch(Exception e) {
        e.printStackTrace();
    }
}


    
//    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EditProfile;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnregister;
    private javax.swing.JPanel dropdown;
    private javax.swing.JLabel errorAge;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JLabel errorPhoneNumber;
    private javax.swing.JLabel errorUserName;
    private javax.swing.JComboBox<String> genderbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel logOut;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtphonenum;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
