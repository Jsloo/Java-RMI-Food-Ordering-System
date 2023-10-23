
package Fos.Client.Admin;

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
        jLabel4 = new javax.swing.JLabel();
        Textfield_name = new javax.swing.JTextField();
        Textfield_price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBrowser = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        ComboBox_Category = new javax.swing.JComboBox<>();
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

        LouOut.setText("LogOut");
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

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Name :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Price :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Category :");

        btnBrowser.setText("Browse");
        btnBrowser.setName(""); // NOI18N
        btnBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowserActionPerformed(evt);
            }
        });

        imgLabel.setText("              Image");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Image :");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        ComboBox_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Drink" }));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(btnBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6)))
                            .addGap(24, 24, 24)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Textfield_name)
                                .addComponent(Textfield_price)
                                .addComponent(ComboBox_Category, 0, 210, Short.MAX_VALUE)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBrowser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textfield_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textfield_price, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 420, 420));

        jLabel3.setBackground(new java.awt.Color(0, 51, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("View Menu");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        panel2.setBackground(new java.awt.Color(204, 204, 204));

        button1.setLabel("button1");

        button2.setLabel("button2");

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

        btnDelete1.setText("Delete Menu");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel2.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 440, 420));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setText("Menu Management");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 960, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void ViewMenuTable(){

        try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/ViewMenu");
            ArrayList<String[]>  result = dbi.ViewMenu();
           
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
