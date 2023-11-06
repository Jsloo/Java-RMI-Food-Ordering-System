
package Fos.Client.User;

import Fos.FosInterface;
import java.awt.Image;
import java.rmi.Naming;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Item_Popup extends javax.swing.JFrame {

    public Integer id;
    public Integer value;
    
    public Item_Popup(String[] menu) {
        try{
        initComponents();
        pack();
        setLocationRelativeTo(null);
        cart(menu);
        id = Integer.parseInt(menu[0]);

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbutton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        spinner_quantity = new javax.swing.JSpinner();
        back = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        price = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1250, 500));
        setMaximumSize(new java.awt.Dimension(450, 560));
        setMinimumSize(new java.awt.Dimension(450, 560));
        setPreferredSize(new java.awt.Dimension(450, 560));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 488));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 488));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 488));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbutton2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jbutton2.setText("Add to Cart");
        jbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity : ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        spinner_quantity.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        spinner_quantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spinner_quantity.setValue(1);
        jPanel2.add(spinner_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 60, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 450, 140));

        back.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        image.setMaximumSize(new java.awt.Dimension(250, 250));
        image.setMinimumSize(new java.awt.Dimension(250, 250));
        image.setPreferredSize(new java.awt.Dimension(250, 250));
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name.setText("jLabel4");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        price.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        price.setText("jLabel5");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void jbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton2ActionPerformed
        try{
            value = (Integer) spinner_quantity.getValue();
            addCart(id, value);
            setVisible(false);
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f,"Add to Cart Successfully!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbutton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item_Popup(null).setVisible(true);
            }
        });
    }
    
    public void cart(String[] menu){
//        image.setIcon(new ImageIcon(menu[4]));
        ImageIcon originalIcon = new ImageIcon(menu[4]);
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        image.setIcon(scaledIcon);
        name.setText(menu[1]);
        price.setText("Price: RM " + menu[2]);
    }
    
    public void addCart(int id, int value){
        try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/addToCart");
            String run = dbi.addToCart(id, value);
            System.out.println(run);
        }catch(Exception e) {
            e.printStackTrace();
        }
        
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbutton2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel price;
    private javax.swing.JSpinner spinner_quantity;
    // End of variables declaration//GEN-END:variables
}
