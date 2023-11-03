
package Fos.Client.User;

import Fos.FosInterface;
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

        item_details = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        spinner_quantity = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbutton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1250, 500));
        setPreferredSize(new java.awt.Dimension(580, 750));

        item_details.setBackground(new java.awt.Color(255, 255, 255));
        item_details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        name.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        name.setText("jLabel4");

        price.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        price.setText("jLabel5");

        javax.swing.GroupLayout item_detailsLayout = new javax.swing.GroupLayout(item_details);
        item_details.setLayout(item_detailsLayout);
        item_detailsLayout.setHorizontalGroup(
            item_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item_detailsLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(item_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addComponent(image)
                    .addGroup(item_detailsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(price)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        item_detailsLayout.setVerticalGroup(
            item_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item_detailsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        spinner_quantity.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spinner_quantity.setValue(1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_page(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Quantity : ");

        jbutton1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jbutton1.setText("Add to Cart");
        jbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(item_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addComponent(spinner_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jbutton1)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(item_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(spinner_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbutton1)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton1ActionPerformed
        try{
            value = (Integer) spinner_quantity.getValue();
            addCart(id, value);
            setVisible(false);
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f,"Add to Cart Successfully!");
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbutton1ActionPerformed

    private void back_page(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_page
        setVisible(false);
    }//GEN-LAST:event_back_page

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item_Popup(null).setVisible(true);
            }
        });
    }
    
    public void cart(String[] menu){
        image.setIcon(new ImageIcon(menu[4]));
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
    private javax.swing.JLabel image;
    private javax.swing.JPanel item_details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbutton1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel price;
    private javax.swing.JSpinner spinner_quantity;
    // End of variables declaration//GEN-END:variables
}
