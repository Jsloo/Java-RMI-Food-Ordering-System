
package Fos.Client.User;

import Fos.FosInterface;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.rmi.Naming;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Cart extends javax.swing.JFrame {

    public Cart() {
        initComponents();
        showCart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        clearAll = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cart_panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        placeOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1000, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel2.setText("Order Items");

        clearAll.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        clearAll.setText("Clear All");
        clearAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearAllMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearAll)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clearAll))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 1500));

        cart_panel.setBackground(new java.awt.Color(255, 255, 255));
        cart_panel.setPreferredSize(new java.awt.Dimension(750, 200));

        javax.swing.GroupLayout cart_panelLayout = new javax.swing.GroupLayout(cart_panel);
        cart_panel.setLayout(cart_panelLayout);
        cart_panelLayout.setHorizontalGroup(
            cart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );
        cart_panelLayout.setVerticalGroup(
            cart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1007, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(cart_panel);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        back.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        placeOrder.setBackground(new java.awt.Color(255, 153, 102));
        placeOrder.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        placeOrder.setText("Place Order");
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
        try {
            setVisible(false);
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2002/clearCart");
            dbi.clearCart();
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f,"Order Successfully!");
            new Menu().setVisible(true);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_placeOrderActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void clearAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearAllMouseClicked
        try {
            setVisible(false);
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2002/clearCart");
            dbi.clearCart();
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f,"Clear Cart Successfully!");
            new Menu().setVisible(true);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_clearAllMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }
    
    public void showCart(){
        int xPosition = 50; // Initial horizontal position
        int yPosition = 50; // Vertical position for labels
        int maxItemsPerRow = 1; // Maximum items per row
        int itemCounter = 0; // Counter to track items in the current row

        Font nameFont = new Font("Tahoma", Font.PLAIN, 30); // Adjust the font size here
        Font priceFont = new Font("SansSerif", Font.PLAIN, 26);

        try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2002/showCart");
            ArrayList<String[]>  result = dbi.showCart();
            for (String[] cartData : result) {

                // Create a JLabel for the image
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(cartData[0]).getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
                JLabel imageLabel = new JLabel(imageIcon);
                imageLabel.setBounds(xPosition, yPosition, 250, 250);

                // Create a JLabel for the name
                JLabel nameLabel = new JLabel(cartData[1]);
                nameLabel.setBounds(xPosition + 300, yPosition + 100, 250, 30);
                nameLabel.setFont(nameFont); // Set the font for the name label

                // Create a JLabel for the price
                JLabel priceLabel = new JLabel("Price: RM " + cartData[2]);
                priceLabel.setBounds(xPosition + 300, yPosition + 130, 250, 30);
                priceLabel.setFont(priceFont); // Set the font for the price label
                
                JLabel quantityLabel = new JLabel("Quantity: " + cartData[3]);
                quantityLabel.setBounds(xPosition + 550, yPosition + 100, 250, 30);
                quantityLabel.setFont(nameFont); // Set the font for the price label

                // Add labels to the menu_panel
                cart_panel.add(imageLabel);
                cart_panel.add(nameLabel);
                cart_panel.add(priceLabel);
                cart_panel.add(quantityLabel);

                // Increment the item counter
                itemCounter++;

                // If the maximum items per row is reached, move to the next row
                if (itemCounter >= maxItemsPerRow) {
                    itemCounter = 0; // Reset item counter
                    xPosition = 50; // Reset horizontal position
                    yPosition += 300; // Adjust the vertical gap between rows as needed
                } else {
                    // Adjust horizontal position for the next menu item in the same row
                    xPosition += 300; // Increase as needed to create a gap between menu items in the same row
                }
                cart_panel.setPreferredSize(new Dimension(50, 200));
//                cart_panel.setVerticalScrollBarPolicy(jScrollPane1.VERTICAL_SCROLLBAR_AS_NEEDED);
            }
        }catch(Exception e) {
                e.printStackTrace();
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel cart_panel;
    private javax.swing.JLabel clearAll;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton placeOrder;
    // End of variables declaration//GEN-END:variables
}
