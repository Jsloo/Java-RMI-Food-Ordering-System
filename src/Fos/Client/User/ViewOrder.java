package Fos.Client.User;

import Fos.FosInterface;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.rmi.Naming;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ViewOrder extends javax.swing.JFrame {
    public boolean drop = false;
    public ViewOrder() {
        initComponents();
        userViewOrderId();
        pack();
        showUsername();
        setLocationRelativeTo(null);
        dropdown.setVisible(false);
        jComboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    showOrderSummary();
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        dropdown = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ViewOrderHistory = new javax.swing.JPanel();
        nameLabel2 = new javax.swing.JLabel();
        EditProfile = new javax.swing.JPanel();
        nameLabel3 = new javax.swing.JLabel();
        logOut = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        order_panel = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        totalOrder = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1015, 630));
        setMinimumSize(new java.awt.Dimension(1015, 630));
        setPreferredSize(new java.awt.Dimension(1015, 630));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1010, 590));
        jPanel1.setMinimumSize(new java.awt.Dimension(1010, 590));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
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
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

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

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewOrderHistory.setBackground(new java.awt.Color(204, 204, 204));
        ViewOrderHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewOrderHistoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ViewOrderHistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ViewOrderHistoryMouseExited(evt);
            }
        });
        ViewOrderHistory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nameLabel2.setText("View Order");
        ViewOrderHistory.add(nameLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel5.add(ViewOrderHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        EditProfile.setBackground(new java.awt.Color(255, 255, 255));
        EditProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditProfileMouseExited(evt);
            }
        });
        EditProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nameLabel3.setText("Edit Profile");
        EditProfile.add(nameLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel5.add(EditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, 50));

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

        jPanel5.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 50));

        dropdown.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 170));

        jPanel1.add(dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 190, 220));

        order_panel.setBackground(new java.awt.Color(255, 255, 255));
        order_panel.setMinimumSize(new java.awt.Dimension(0, 0));
        order_panel.setPreferredSize(new java.awt.Dimension(800, 1200));

        javax.swing.GroupLayout order_panelLayout = new javax.swing.GroupLayout(order_panel);
        order_panel.setLayout(order_panelLayout);
        order_panelLayout.setHorizontalGroup(
            order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 889, Short.MAX_VALUE)
        );
        order_panelLayout.setVerticalGroup(
            order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(order_panel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 908, 370));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 80, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_small.png"))); // NOI18N
        jLabel5.setText(" BB BreakFast");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Order History");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalOrder.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        totalOrder.setForeground(new java.awt.Color(255, 255, 255));
        totalOrder.setText("Order Total");
        jPanel3.add(totalOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        back.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, 53));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1010, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setForeground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_backMouseExited

    private void nameLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLabelMouseClicked
        if (drop == false){
            dropdown.setVisible(true);
            drop = true;
        }else{
            dropdown.setVisible(false);
            drop = false;
        }
    }//GEN-LAST:event_nameLabelMouseClicked

    private void nameLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLabelMouseEntered
        nameLabel.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_nameLabelMouseEntered

    private void nameLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameLabelMouseExited
        nameLabel.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_nameLabelMouseExited

    private void ViewOrderHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderHistoryMouseClicked

    }//GEN-LAST:event_ViewOrderHistoryMouseClicked

    private void ViewOrderHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderHistoryMouseEntered

    }//GEN-LAST:event_ViewOrderHistoryMouseEntered

    private void ViewOrderHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderHistoryMouseExited

    }//GEN-LAST:event_ViewOrderHistoryMouseExited

    private void EditProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditProfileMouseClicked
        setVisible(false);
        new Profile().setVisible(true);
    }//GEN-LAST:event_EditProfileMouseClicked

    private void EditProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditProfileMouseEntered
        EditProfile.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_EditProfileMouseEntered

    private void EditProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditProfileMouseExited
        EditProfile.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_EditProfileMouseExited

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

    private void logOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseEntered
        logOut.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_logOutMouseEntered

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
        logOut.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_logOutMouseExited

    private void dropdownMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropdownMouseEntered

    }//GEN-LAST:event_dropdownMouseEntered

    private void dropdownMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropdownMouseExited

    }//GEN-LAST:event_dropdownMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrder().setVisible(true);
            }
        });
    }
    
    public void userViewOrderId () {
        try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/userViewOrderId");
            ArrayList<String[]>  result = dbi.userViewOrderId();
            
            jComboBox1.removeAllItems();
            for (String[] row : result) {
                jComboBox1.addItem(row[0]);
            }

            if (jComboBox1.getItemCount() > 0) {
                jComboBox1.setSelectedIndex(jComboBox1.getItemCount() - 1);
                showOrderSummary();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void showOrderSummary() {
        order_panel.removeAll();
        String ID = jComboBox1.getSelectedItem().toString();
 
        int xPosition = 50; 
        int yPosition = 50; 
        int maxItemsPerRow = 1; 
        int itemCounter = 0;
 
        Font nameFont = new Font("SansSerif", Font.BOLD, 30); 
        Font priceFont = new Font("SansSerif", Font.PLAIN, 26);
        Font quantityFont = new Font("SansSerif", Font.PLAIN, 26);
        Font totalFont = new Font("SansSerif", Font.BOLD, 36);
 
        try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/showOrderSummary");
            ArrayList<String[]>  result = dbi.showOrderSummary(ID);
 
            for (String[] orderData : result) {
                
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(orderData[0]).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
                JLabel imageLabel = new JLabel(imageIcon);
                imageLabel.setBounds(xPosition, yPosition, 250, 250);
 
                
                JLabel nameLabel = new JLabel("Name: " + orderData[1]);
                nameLabel.setBounds(xPosition + 300, yPosition + 100, 250, 30);
                nameLabel.setFont(nameFont); 
 
                
                JLabel priceLabel = new JLabel("Price: RM " + orderData[2]);
                priceLabel.setBounds(xPosition + 300, yPosition + 150, 250, 30);
                priceLabel.setFont(priceFont); 
 
                
                JLabel quantityLabel = new JLabel("x " + orderData[3]);
                quantityLabel.setBounds(xPosition + 750, yPosition + 125, 250, 30);
                quantityLabel.setFont(quantityFont); 
 
                
                order_panel.add(imageLabel);
                order_panel.add(nameLabel);
                order_panel.add(priceLabel);
                order_panel.add(quantityLabel);
 
                
                itemCounter++;
 
                
                if (itemCounter >= maxItemsPerRow) {
                    itemCounter = 0; 
                    xPosition = 50; 
                    yPosition += 300; 
                } else {
                    xPosition += 650; 
                }
            }

            String totalAmount = result.get(result.size() - 1)[4];
            totalOrder.setText("Order Total: RM " + totalAmount);
  
            int heightPerOrder = 310; 
            int totalOrders = result.size(); 
            int preferredHeight = totalOrders * heightPerOrder;            
 
            order_panel.setPreferredSize(new Dimension(order_panel.getWidth(), preferredHeight));
            order_panel.revalidate();
            order_panel.repaint();
            jScrollPane1.revalidate();
            jScrollPane1.repaint();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void showUsername(){
        try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/getUsername");
            ArrayList<String[]>  result = dbi.getUsername();
            for (String[] menuData : result) {
                nameLabel.setText(" "+menuData[0]);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EditProfile;
    private javax.swing.JPanel ViewOrderHistory;
    private javax.swing.JLabel back;
    private javax.swing.JPanel dropdown;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logOut;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JPanel order_panel;
    private javax.swing.JLabel totalOrder;
    // End of variables declaration//GEN-END:variables
}
