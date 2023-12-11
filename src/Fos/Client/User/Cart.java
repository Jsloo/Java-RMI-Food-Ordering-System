
package Fos.Client.User;

import Fos.FosInterface;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.rmi.Naming;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Cart extends javax.swing.JFrame {

    public Cart() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        showCart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cart_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        clearAll = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        placeOrder = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1015, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1010, 590));
        jPanel2.setMinimumSize(new java.awt.Dimension(1010, 590));
        jPanel2.setPreferredSize(new java.awt.Dimension(1010, 590));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1002, 1502));

        cart_panel.setBackground(new java.awt.Color(255, 255, 255));
        cart_panel.setPreferredSize(new java.awt.Dimension(1000, 1500));

        javax.swing.GroupLayout cart_panelLayout = new javax.swing.GroupLayout(cart_panel);
        cart_panel.setLayout(cart_panelLayout);
        cart_panelLayout.setHorizontalGroup(
            cart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        cart_panelLayout.setVerticalGroup(
            cart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(cart_panel);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 980, 360));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clearAll.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        clearAll.setText("Clear All");
        clearAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearAllMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearAllMouseExited(evt);
            }
        });
        jPanel1.add(clearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_small.png"))); // NOI18N
        jLabel5.setText(" BB BreakFast");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1000, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 53));

        placeOrder.setBackground(new java.awt.Color(255, 255, 255));
        placeOrder.setMaximumSize(new java.awt.Dimension(245, 53));
        placeOrder.setMinimumSize(new java.awt.Dimension(245, 53));
        placeOrder.setPreferredSize(new java.awt.Dimension(245, 53));
        placeOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placeOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                placeOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                placeOrderMouseExited(evt);
            }
        });
        placeOrder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Place Order");
        placeOrder.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jPanel3.add(placeOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1010, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Order Items");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void clearAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearAllMouseClicked
        try {
            clearCart();
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f,"Clear Cart Successfully!");
            setVisible(false);
            new Menu().setVisible(true);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_clearAllMouseClicked

    private void placeOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeOrderMouseClicked
        try {
            setVisible(false);
            
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/placeOrder");
            dbi.placeOrder();
            clearCart();
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f,"Order Successfully!");
            new Menu().setVisible(true);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_placeOrderMouseClicked

    private void placeOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeOrderMouseEntered
        placeOrder.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_placeOrderMouseEntered

    private void placeOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeOrderMouseExited
        placeOrder.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_placeOrderMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setForeground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
       back.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_backMouseExited

    private void clearAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearAllMouseEntered
        clearAll.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_clearAllMouseEntered

    private void clearAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearAllMouseExited
        clearAll.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_clearAllMouseExited


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


        Font nameFont = new Font("Tahoma", Font.BOLD, 30); // Adjust the font size here
        Font priceFont = new Font("SansSerif", Font.BOLD, 26);
        try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2001/showCart");
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
//                cart_panel.setPreferredSize(new Dimension(50, 200));
//                cart_panel.setVerticalScrollBarPolicy(jScrollPane1.VERTICAL_SCROLLBAR_AS_NEEDED);
            }
        }catch(Exception e) {
                e.printStackTrace();
            }
    }
    
    public void clearCart(){
        try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/clearCart");
            dbi.clearCart();
        }catch(Exception e) {
            e.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel cart_panel;
    private javax.swing.JLabel clearAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel placeOrder;
    // End of variables declaration//GEN-END:variables
}
