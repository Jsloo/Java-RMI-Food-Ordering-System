
package Fos.Client.Admin;

import Fos.Client.Admin.Report.Report;
import Fos.Client.User.Login;
import Fos.FosInterface;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.rmi.Naming;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Manage_Order extends javax.swing.JFrame {

    public Manage_Order() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        ViewOrderId ();
        ShowOrderTable();

        combo_box_id.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    ShowOrderTable();
                }
            }
        });   
    }

    public void ViewOrderId () {
         try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/ViewOrderId");
            ArrayList<String[]>  result = dbi.ViewOrderId();
            
            for (String[] row : result) {
                combo_box_id.addItem(row[0]);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void ShowOrderTable() {
        try {
            String ID = combo_box_id.getSelectedItem().toString();
            FosInterface dbi = (FosInterface) Naming.lookup("rmi://localhost:2000/ViewOrderHistoryItem");
            ArrayList<Object> result = dbi.ViewOrderHistoryItem(ID);
            DefaultTableModel menuTable = (DefaultTableModel) Order_Table.getModel();
            menuTable.setRowCount(0);

            if (!result.isEmpty() && result.get(0) instanceof Object[]) {
                Object[] orderDetails = (Object[]) result.get(0);

                Label_Amount.setText("RM " + orderDetails[0]);

                for (int i = 1; i < result.size(); i++) {
                    Object row = result.get(i);
                    if (row instanceof Object[]) {
                        Object[] menuRow = (Object[]) row;
                        Object[] menu = new Object[]{menuRow[0], menuRow[1], menuRow[2]};
                        menuTable.addRow(menu);
                    }
                }
            }

            Label_Number_Item.setText(Integer.toString(Order_Table.getRowCount()));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
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
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Order_Table = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        Label_Number_Item = new javax.swing.JLabel();
        Label_Amount = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        combo_box_id = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1190, 571));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 571));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Menu Management");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 250, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
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

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setText("Order Management");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Order_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(Order_Table);
        if (Order_Table.getColumnModel().getColumnCount() > 0) {
            Order_Table.getColumnModel().getColumn(0).setPreferredWidth(200);
            Order_Table.getColumnModel().getColumn(1).setPreferredWidth(10);
            Order_Table.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 430, 400));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setToolTipText("");
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Number_Item.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Label_Number_Item.setForeground(new java.awt.Color(255, 255, 255));
        Label_Number_Item.setToolTipText("");
        jPanel6.add(Label_Number_Item, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, 20));

        Label_Amount.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Label_Amount.setForeground(new java.awt.Color(255, 255, 255));
        Label_Amount.setToolTipText("");
        jPanel6.add(Label_Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Number of Item :");
        jLabel6.setToolTipText("");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Amount (RM) :");
        jLabel7.setToolTipText("");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        combo_box_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_box_idActionPerformed(evt);
            }
        });
        jPanel6.add(combo_box_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order ID :");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 370, 400));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 930, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        
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

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        setVisible(false);
        Manage_Menu info = new Manage_Menu();
        info.setVisible(true);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_jPanel5MouseExited

    private void combo_box_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_box_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_box_idActionPerformed
 


   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Amount;
    private javax.swing.JLabel Label_Number_Item;
    private javax.swing.JButton LouOut;
    private javax.swing.JTable Order_Table;
    private javax.swing.JComboBox<String> combo_box_id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
