
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

    public Menu() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        showUsername();
        showMenu();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cart = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu_panel = new javax.swing.JScrollPane();
        menu_panel1 = new javax.swing.JPanel();

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

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(81, 51));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBeverageMenu(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Beverage");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel2FocusLost(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goFoodMenu(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Food");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 50));

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

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 980, 90));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nameLabel.setText("Username");
        jPanel4.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        logOut.setText("Log Out");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });
        jPanel4.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Menu");
        jLabel1.setToolTipText("");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goFoodMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goFoodMenu
        // TODO add your handling code here:
    }//GEN-LAST:event_goFoodMenu

    private void goBeverageMenu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBeverageMenu
//        
//        Menu_Beverage beverage = new Menu_Beverage();
//        beverage.setVisible(true);
        
    }//GEN-LAST:event_goBeverageMenu

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

    private void jPanel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusGained
      
    }//GEN-LAST:event_jPanel2FocusGained

    private void jPanel2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusLost
        
    }//GEN-LAST:event_jPanel2FocusLost

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
            imageLabel.setBounds(0, 0, 250, 250);
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
            imageLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    System.out.println("Clicked on menu with ID: " + menuData[0]);
                    Item_Popup item = new Item_Popup(menuData);
                    item.setVisible(true);
                }
            });

            // Set position and size of the green panel
            greenPanel.setBounds(xPosition, yPosition, 250, 320);

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
            nameLabel.setText(menuData[0]);
        }
    }catch(Exception e) {
        e.printStackTrace();
    }
}


    
//    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logOut;
    private javax.swing.JScrollPane menu_panel;
    private javax.swing.JPanel menu_panel1;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
