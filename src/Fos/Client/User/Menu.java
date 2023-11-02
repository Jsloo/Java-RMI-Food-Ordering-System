
package Fos.Client.User;

import Fos.FosInterface;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cart = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        menu_panel = new javax.swing.JScrollPane();
        menu_panel1 = new javax.swing.JPanel();
        logOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1000, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 68)); // NOI18N
        jLabel1.setText("Menu");
        jLabel1.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goFoodMenu(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Food");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(87, 76));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBeverageMenu(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Beverage");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cart.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        cart.setText("Cart");
        cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cart)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(cart)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nameLabel.setText("Username");

        menu_panel.setBackground(new java.awt.Color(255, 255, 255));

        menu_panel1.setBackground(new java.awt.Color(255, 255, 255));
        menu_panel1.setMinimumSize(new java.awt.Dimension(300, 700));
        menu_panel1.setPreferredSize(new java.awt.Dimension(1000, 1500));

        javax.swing.GroupLayout menu_panel1Layout = new javax.swing.GroupLayout(menu_panel1);
        menu_panel1.setLayout(menu_panel1Layout);
        menu_panel1Layout.setHorizontalGroup(
            menu_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        menu_panel1Layout.setVerticalGroup(
            menu_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );

        menu_panel.setViewportView(menu_panel1);

        logOut.setText("Log Out");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logOut, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(4, 4, 4)
                        .addComponent(logOut)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE)
                .addContainerGap())
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
        FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2002/LogOut");
        dbi.LogOut();
        setVisible(false);
        new Login().setVisible(true);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_logOutMouseClicked

    private void cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseClicked
        setVisible(false);
        new Cart().setVisible(true);
    }//GEN-LAST:event_cartMouseClicked


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

    Font nameFont = new Font("Tahoma", Font.PLAIN, 30); // Adjust the font size here
    Font priceFont = new Font("SansSerif", Font.PLAIN, 26);
        
    try {
        FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2002/displayMenu");
        ArrayList<String[]>  result = dbi.displayMenu();
        for (String[] menuData : result) {
            
            // Create a JLabel for the image
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(menuData[4]).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
            JLabel imageLabel = new JLabel(imageIcon);
            imageLabel.setBounds(xPosition, yPosition, 250, 250);

            // Create a JLabel for the name
            JLabel nameLabel = new JLabel(menuData[1]);
            nameLabel.setBounds(xPosition, yPosition + 265, 250, 30);
            nameLabel.setFont(nameFont); // Set the font for the name label

            // Create a JLabel for the price
            JLabel priceLabel = new JLabel("Price: RM " + menuData[2]);
            priceLabel.setBounds(xPosition, yPosition + 300, 250, 30);
            priceLabel.setFont(priceFont); // Set the font for the price label

            // Add labels to the menu_panel
            menu_panel1.add(imageLabel);
            menu_panel1.add(nameLabel);
            menu_panel1.add(priceLabel);

            // Add a MouseListener to the image label
            imageLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Handle the click event
                    System.out.println("Clicked on menu with ID: " + menuData[0]);
                    Item_Popup item = new Item_Popup(menuData);
//                    System.out.println(Arrays.deepToString(menuData));

                    item.setVisible(true);
                    // You can perform actions based on the menuID
                }
            });

            // Increment the item counter
            itemCounter++;

            // If the maximum items per row is reached, move to the next row
            if (itemCounter >= maxItemsPerRow) {
                itemCounter = 0; // Reset item counter
                xPosition = 50; // Reset horizontal position
                yPosition += 350; // Adjust the vertical gap between rows as needed
            } else {
                // Adjust horizontal position for the next menu item in the same row
                xPosition += 300; // Increase as needed to create a gap between menu items in the same row
            }
            menu_panel.setPreferredSize(new Dimension(50, 200));
            menu_panel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        }
    }catch(Exception e) {
            e.printStackTrace();
        }
}

public void showUsername(){
    try {
        FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2002/getUsername");
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
    private javax.swing.JLabel cart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logOut;
    private javax.swing.JScrollPane menu_panel;
    private javax.swing.JPanel menu_panel1;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
