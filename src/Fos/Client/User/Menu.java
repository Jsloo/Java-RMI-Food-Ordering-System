
package Fos.Client.User;

import Fos.FosInterface;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

import java.rmi.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Menu extends javax.swing.JFrame {
    
    public boolean drop = false;
    public Menu() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        dropdown.setVisible(false);
        showUsername();
        showMenu();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        dropdown = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ViewOrderHistory = new javax.swing.JPanel();
        nameLabel2 = new javax.swing.JLabel();
        EditProfile = new javax.swing.JPanel();
        nameLabel3 = new javax.swing.JLabel();
        logOut = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cart = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu_panel = new javax.swing.JScrollPane();
        menu_panel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(1000, 300));
        setMaximumSize(new java.awt.Dimension(1015, 630));
        setMinimumSize(new java.awt.Dimension(1015, 630));
        setPreferredSize(new java.awt.Dimension(1015, 630));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(1010, 590));
        jPanel4.setMinimumSize(new java.awt.Dimension(1010, 590));
        jPanel4.setPreferredSize(new java.awt.Dimension(1010, 590));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewOrderHistory.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel4.add(dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 190, 220));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cart.setBackground(new java.awt.Color(255, 255, 255));
        cart.setForeground(new java.awt.Color(255, 255, 255));
        cart.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cartFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cartFocusLost(evt);
            }
        });
        cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartgoFoodMenu(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cart.png"))); // NOI18N

        javax.swing.GroupLayout cartLayout = new javax.swing.GroupLayout(cart);
        cart.setLayout(cartLayout);
        cartLayout.setHorizontalGroup(
            cartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );
        cartLayout.setVerticalGroup(
            cartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 80, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 90));

        menu_panel.setBackground(new java.awt.Color(255, 255, 255));

        menu_panel1.setBackground(new java.awt.Color(255, 255, 255));
        menu_panel1.setMinimumSize(new java.awt.Dimension(300, 700));
        menu_panel1.setPreferredSize(new java.awt.Dimension(1000, 1500));

        javax.swing.GroupLayout menu_panel1Layout = new javax.swing.GroupLayout(menu_panel1);
        menu_panel1.setLayout(menu_panel1Layout);
        menu_panel1Layout.setHorizontalGroup(
            menu_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menu_panel1Layout.setVerticalGroup(
            menu_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menu_panel.setViewportView(menu_panel1);

        jPanel4.add(menu_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 980, 410));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_small.png"))); // NOI18N
        jLabel5.setText(" BB BreakFast");
        jLabel5.setToolTipText("");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cartFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cartFocusGained

    private void cartFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cartFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cartFocusLost

    private void cartgoFoodMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartgoFoodMenu
        setVisible(false);
        new Cart().setVisible(true);
    }//GEN-LAST:event_cartgoFoodMenu

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

    private void dropdownMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropdownMouseEntered

    }//GEN-LAST:event_dropdownMouseEntered

    private void dropdownMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropdownMouseExited

    }//GEN-LAST:event_dropdownMouseExited

    private void ViewOrderHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderHistoryMouseClicked
        setVisible(false);
        new ViewOrder().setVisible(true);
    }//GEN-LAST:event_ViewOrderHistoryMouseClicked

    private void logOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseEntered
        logOut.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_logOutMouseEntered

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
        logOut.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_logOutMouseExited

    private void ViewOrderHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderHistoryMouseEntered
        ViewOrderHistory.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_ViewOrderHistoryMouseEntered

    private void ViewOrderHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrderHistoryMouseExited
        ViewOrderHistory.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_ViewOrderHistoryMouseExited

    private void cartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseEntered
        cart.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_cartMouseEntered

    private void cartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseExited
        cart.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_cartMouseExited

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


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new Menu().setVisible(true);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }


public void showMenu(){
    int xPosition = 50; // Initial horizontal position
    int yPosition = 50; // Vertical position for labels
    int maxItemsPerRow = 3; // Maximum items per row
    int itemCounter = 0; // Counter to track items in the current row

    Font nameFont = new Font("Tahoma", Font.BOLD, 30); // Adjust the font size here
    Font priceFont = new Font("SansSerif", Font.BOLD, 26);
        
    try {
        FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/displayMenu");
        ArrayList<String[]>  result = dbi.displayMenu();

        for (String[] menuData : result) {
            
            JPanel greenPanel = new JPanel();
            greenPanel.setBackground(new java.awt.Color(0,102,102));
            greenPanel.setLayout(null); // Set layout to null for absolute positioning

            // Create image label
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(menuData[4]).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setBounds(5, 5, 240, 240);
            greenPanel.add(imageLabel); // Add image label to the green panel

            // Create name label
            JLabel nameLabel = new JLabel(menuData[1]);
            nameLabel.setBounds(10, 255, 230, 30);
            nameLabel.setFont(nameFont);
            nameLabel.setForeground(Color.WHITE);
            greenPanel.add(nameLabel); // Add name label to the green panel

            // Create price label
            JLabel priceLabel = new JLabel("Price: RM " + menuData[2]);
            priceLabel.setBounds(10, 290, 230, 30);
            priceLabel.setForeground(Color.WHITE);
            priceLabel.setFont(priceFont);
            greenPanel.add(priceLabel); // Add price label to the green panel

            // Add MouseListener to the image label
            greenPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Item_Popup item = new Item_Popup(menuData);
                    item.setVisible(true);
                }
                
                @Override
                public void mouseEntered(MouseEvent e) {
                    greenPanel.setBackground(new java.awt.Color(0,153,153));
                    imageLabel.setBounds(10, 10, 230, 230);
                }
                
                @Override
                public void mouseExited(MouseEvent e) {
                    greenPanel.setBackground(new java.awt.Color(0,102,102));
                    imageLabel.setBounds(5, 5, 240, 240);
                }
            });

            // Set position and size of the green panel
            greenPanel.setBounds(xPosition, yPosition, 250, 330);

            // Add the green panel to menu_panel1
            menu_panel1.add(greenPanel);

            // Increment the item counter and update positions
            itemCounter++;
            if (itemCounter >= maxItemsPerRow) {
                itemCounter = 0;
                xPosition = 50;
                yPosition += 350;
            } else {
                xPosition += 300;
            }
        }
    }catch(Exception e) {
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


    
//    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EditProfile;
    private javax.swing.JPanel ViewOrderHistory;
    private javax.swing.JPanel cart;
    private javax.swing.JPanel dropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel logOut;
    private javax.swing.JLabel logout;
    private javax.swing.JScrollPane menu_panel;
    private javax.swing.JPanel menu_panel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    // End of variables declaration//GEN-END:variables
}
