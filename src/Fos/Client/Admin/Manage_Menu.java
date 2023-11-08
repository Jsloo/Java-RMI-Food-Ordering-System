
package Fos.Client.Admin;

import Fos.Client.Admin.Report.Report;
import static Fos.Client.Admin.Manage_Menu.path;
import Fos.Client.User.Login;
import Fos.FosInterface;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.File;
import java.rmi.Naming;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class Manage_Menu extends javax.swing.JFrame {
    public static String path;
    public static boolean condition = false; 

    public Manage_Menu() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        ViewMenuTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        LouOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        Textfield_name = new javax.swing.JTextField();
        Textfield_price = new javax.swing.JTextField();
        btnBrowser = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        ComboBox_Category = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        Menu_Table = new javax.swing.JTable();
        btnDelete1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1190, 571));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 571));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Menu Management");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 250, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 56));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Order Management");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(250, 56));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Report");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_small.png"))); // NOI18N
        jLabel12.setText("  BB BreakFast");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 230, 40));

        LouOut.setBackground(new java.awt.Color(255, 255, 204));
        LouOut.setText("Log Out");
        LouOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LouOutActionPerformed(evt);
            }
        });
        jPanel1.add(LouOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 540));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(940, 571));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Add Menu");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        panel1.setBackground(new java.awt.Color(0, 102, 102));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel1.add(Textfield_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 210, 32));
        panel1.add(Textfield_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 210, 32));

        btnBrowser.setBackground(new java.awt.Color(255, 255, 204));
        btnBrowser.setText("Browse");
        btnBrowser.setName(""); // NOI18N
        btnBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowserActionPerformed(evt);
            }
        });
        panel1.add(btnBrowser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 110, -1));

        btnSave.setBackground(new java.awt.Color(255, 255, 204));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 97, 35));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category :");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 90, 37));

        btnCancel.setBackground(new java.awt.Color(255, 255, 204));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        panel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 91, 35));

        ComboBox_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Drink" }));
        panel1.add(ComboBox_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 210, 31));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Image :");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 65, 37));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Name :");
        panel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 65, 37));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Price :");
        panel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 65, 37));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLabel.setBackground(new java.awt.Color(255, 153, 153));
        imgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(imgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 144, 131));

        panel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 160, 150));

        jPanel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 420, 420));

        jLabel3.setBackground(new java.awt.Color(0, 51, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("View Menu");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        panel2.setBackground(new java.awt.Color(0, 102, 102));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button1.setLabel("button1");
        panel2.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        button2.setLabel("button2");
        panel2.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        Menu_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Category", "Id", "Path"
            }
        ));
        Menu_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Menu_Table);
        if (Menu_Table.getColumnModel().getColumnCount() > 0) {
            Menu_Table.getColumnModel().getColumn(0).setResizable(false);
            Menu_Table.getColumnModel().getColumn(1).setResizable(false);
            Menu_Table.getColumnModel().getColumn(1).setPreferredWidth(0);
            Menu_Table.getColumnModel().getColumn(2).setResizable(false);
            Menu_Table.getColumnModel().getColumn(3).setMinWidth(0);
            Menu_Table.getColumnModel().getColumn(3).setPreferredWidth(0);
            Menu_Table.getColumnModel().getColumn(3).setMaxWidth(0);
            Menu_Table.getColumnModel().getColumn(4).setMinWidth(0);
            Menu_Table.getColumnModel().getColumn(4).setPreferredWidth(0);
            Menu_Table.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        panel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 29, 377, 311));

        btnDelete1.setBackground(new java.awt.Color(255, 255, 204));
        btnDelete1.setText("Delete Menu");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        panel2.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 358, 139, 35));

        jPanel2.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 440, 420));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setText("Menu Management");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 960, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void ViewMenuTable(){

        try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/displayMenu");
            ArrayList<String[]>  result = dbi.displayMenu();

            DefaultTableModel menuTable = (DefaultTableModel) Menu_Table.getModel();
            menuTable.setRowCount(0);

            for(String[] row : result) {
                Object[] menu = new Object[] {row[1],row[2],row[3],row[0],row[4]};
                menuTable.addRow(menu);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private boolean validation(String name, String price, String category, String imagePath) {

        if (name.isEmpty() || name.length() > 255) {
            JOptionPane.showMessageDialog(null, "Name is required and must be less than 255 characters", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {
            double parsedPrice = Double.parseDouble(price);
            if (parsedPrice <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Price must be a valid positive number", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (category.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Category is required", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (imagePath == null || imagePath.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select an image", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private void btnBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowserActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("PNG JPG AND JPEG","png","jpeg","jpg");
        fileChooser.addChoosableFileFilter(fnef);
        int load = fileChooser.showOpenDialog(null);

        if(load == fileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            path =selectedFile.getAbsolutePath();
            ImageIcon imageIcon = new ImageIcon(path);
            Image img =imageIcon.getImage().getScaledInstance(250,250,Image.SCALE_SMOOTH);
            imgLabel.setIcon(new ImageIcon(img));
        }

    }//GEN-LAST:event_btnBrowserActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String name = Textfield_name.getText();
        String category = ComboBox_Category.getSelectedItem().toString();
        String price = Textfield_price.getText();
        String imagePath = path;

        if (validation(name, price, category, imagePath)) {
            if ( condition == false){
                try {

                    FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/SaveMenu");
                    String result = dbi.SaveMenu(imagePath,name,Double.parseDouble(price),category);
                   if (result.equals("success")){
                       JOptionPane.showMessageDialog(null, "Menu Add Success", "success", JOptionPane.INFORMATION_MESSAGE);
                       imgLabel.setIcon(null);
                       Textfield_name.setText("");
                       Textfield_price.setText("");
                       ViewMenuTable();
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Menu Add Fail", "error", JOptionPane.INFORMATION_MESSAGE);
                   }
                } catch (Exception e) {

                   e.printStackTrace();
                }

            }else{
                try {
                    int selectedRow = Menu_Table.getSelectedRow();
                    String id = Menu_Table.getValueAt(selectedRow, 3).toString();
                    FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/UpdateMenu");
                    String result = dbi.UpdateMenu(id,name,price,category,imagePath);
                    if (result.equals("success")){
                        JOptionPane.showMessageDialog(null, "Menu Update Success", "success", JOptionPane.INFORMATION_MESSAGE);
                        imgLabel.setIcon(null);
                        Textfield_name.setText("");
                        Textfield_price.setText("");
                        ViewMenuTable();                
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Menu Update Fail", "error", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }   
            }
        }
        
        
        


    }//GEN-LAST:event_btnSaveActionPerformed


    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        int selectedRow = Menu_Table.getSelectedRow();
        if (selectedRow >= 0) {
            String name = Menu_Table.getValueAt(selectedRow, 0).toString();
            try {
                FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/DeleteMenu");
                String result = dbi.DeleteMenu(name);
                if (result.equals("success")){
                    JOptionPane.showMessageDialog(null, "Menu Delete Success", "success", JOptionPane.INFORMATION_MESSAGE);
                    imgLabel.setIcon(null);
                    Textfield_name.setText("");
                    Textfield_price.setText("");
                    ViewMenuTable();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Menu Delete Fail", "error", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }   
        }    
            
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Textfield_name.setText("");
        Textfield_price.setText("");
        imgLabel.setIcon(null);
        condition = false;

    }//GEN-LAST:event_btnCancelActionPerformed

    private void Menu_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_TableMouseClicked
        int selectedRow = Menu_Table.getSelectedRow();

        Textfield_name.setText(Menu_Table.getValueAt(selectedRow, 0).toString());
        Textfield_price.setText(Menu_Table.getValueAt(selectedRow, 1).toString());
        ComboBox_Category.setSelectedItem(Menu_Table.getValueAt(selectedRow, 2).toString());
        ImageIcon icon = new ImageIcon(Menu_Table.getValueAt(selectedRow, 4).toString());
        Image img = icon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        imgLabel.setIcon(new ImageIcon(img));
        condition = true;
        
    }//GEN-LAST:event_Menu_TableMouseClicked
    
    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        setVisible(false);
        Manage_Order info = new Manage_Order();
        info.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        setVisible(false);
        Report info = new Report();
        info.setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void LouOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LouOutActionPerformed
        try{
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/LogOut");
            String result = dbi.LogOut();
            JOptionPane.showMessageDialog(null, result, "success", JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
            Login info = new Login();
            info.setVisible(true);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_LouOutActionPerformed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_jPanel5MouseExited
    
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
            java.util.logging.Logger.getLogger(Manage_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_Category;
    private javax.swing.JButton LouOut;
    private javax.swing.JTable Menu_Table;
    private javax.swing.JTextField Textfield_name;
    private javax.swing.JTextField Textfield_price;
    private javax.swing.JButton btnBrowser;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnSave;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
