/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fos.Client.Admin.Report;

import Fos.Client.Admin.Manage_Menu;
import Fos.Client.Admin.Manage_Order;
import Fos.Client.User.Login;
import Fos.FosInterface;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.rmi.Naming;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;

public class Report extends javax.swing.JFrame {

    public Report() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        revenueReport();
        
        AgeReport objAge = new AgeReport();
        objAge.start();
        GenderReport objGender = new GenderReport();
        objGender.start();
        OrderReport objOrder = new OrderReport();
        objOrder.start();
        GeneralReport objGeneral = new GeneralReport();
        objGeneral.start();

    }

    class AgeReport extends Thread{
        public void age() throws InterruptedException
        {
            try {
                FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/AgeReport");
                ArrayList<String[]>  result = dbi.AgeReport();

                DefaultTableModel model = (DefaultTableModel) ageTable.getModel();

                int rowCountToDisplay = Math.min(result.size(), 3); 

                for (int i = 0; i < rowCountToDisplay; i++) {
                    String[] row = result.get(i);
                    Object[] rowData = new Object[]{row[0], row[1]};
                    model.addRow(rowData);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        @Override
        public void run()
        {
            try {
                age();
            } catch (InterruptedException ex) {
                Logger.getLogger(AgeReport.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    class GenderReport extends Thread{
        public void gender() throws InterruptedException
        {
            try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/GenderReport");
            ArrayList<String[]>  result = dbi.GenderReport();

            
            DefaultTableModel model = (DefaultTableModel) genderTable.getModel();

            
            int rowCountToDisplay = Math.min(result.size(), 3); 

            for (int i = 0; i < rowCountToDisplay; i++) {
                String[] row = result.get(i);
                Object[] rowData = new Object[]{row[0], row[1]};
                model.addRow(rowData);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        @Override
        public void run()
        {
            try {
                gender();
            } catch (InterruptedException ex) {
                Logger.getLogger(GenderReport.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    class OrderReport extends Thread{
        public void order() throws InterruptedException
        {
            try {
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/OrderReport");
            ArrayList<String[]>  result = dbi.OrderReport();
            
            DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
            model.setRowCount(0);
            int rowCountToDisplay = Math.min(result.size(), 3); 

            for (int i = 0; i < rowCountToDisplay; i++) {
                String[] row = result.get(i);
                Object[] rowData = new Object[]{row[0], row[1]};
                model.addRow(rowData);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        @Override
        public void run()
        {
            try {
                order();
            } catch (InterruptedException ex) {
                Logger.getLogger(OrderReport.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    class GeneralReport extends Thread{
        public void general() throws InterruptedException
        {
            try{
            FosInterface dbi = (FosInterface)Naming.lookup("rmi://localhost:2000/Report");
            ArrayList<String> result = dbi.Report();

            txtTotalCus.setText(result.get(0));
            txtTotalRevenue.setText("RM" + result.get(1));
            txtTotalOrder.setText(result.get(2));
        }catch(Exception e){
            
        }
        }
        @Override
        public void run()
        {
            try {
                general();
            } catch (InterruptedException ex) {
                Logger.getLogger(GeneralReport.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtTotalRevenue = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        revenueTable = new javax.swing.JTable();
        revenueCombo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalCus = new javax.swing.JLabel();
        btnAgePie = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ageTable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        genderTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTotalOrder = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LouOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 545));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(920, 520));
        jPanel1.setPreferredSize(new java.awt.Dimension(940, 571));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Goudy Stout", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ToTal revenue:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("details");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 70, 20));

        txtTotalRevenue.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtTotalRevenue.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalRevenue.setText("RM19022.34");
        jPanel2.add(txtTotalRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Top 3 Income Category:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        revenueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(revenueTable);
        if (revenueTable.getColumnModel().getColumnCount() > 0) {
            revenueTable.getColumnModel().getColumn(0).setResizable(false);
            revenueTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 260, 80));

        revenueCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Today", "Week", "Month", "Year" }));
        revenueCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                revenueComboItemStateChanged(evt);
            }
        });
        revenueCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revenueComboActionPerformed(evt);
            }
        });
        jPanel2.add(revenueCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 70, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(470, 90, 420, 200);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Goudy Stout", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ToTal Customer:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtTotalCus.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtTotalCus.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalCus.setText("54");
        jPanel3.add(txtTotalCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        btnAgePie.setBackground(new java.awt.Color(255, 255, 255));
        btnAgePie.setText("details");
        btnAgePie.setBorderPainted(false);
        btnAgePie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgePieActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgePie, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 70, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Top 3 Age Group:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        ageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ageTable.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(ageTable);
        if (ageTable.getColumnModel().getColumnCount() > 0) {
            ageTable.getColumnModel().getColumn(0).setResizable(false);
            ageTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 290, 80));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("details");
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 70, 20));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        genderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(genderTable);
        if (genderTable.getColumnModel().getColumnCount() > 0) {
            genderTable.getColumnModel().getColumn(0).setResizable(false);
            genderTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 290, 60));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(40, 90, 370, 420);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Goudy Stout", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ToTal Order:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txtTotalOrder.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtTotalOrder.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalOrder.setText("203");
        jPanel4.add(txtTotalOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("details");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 70, 20));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Top 3 Total Order:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(0).setResizable(false);
            orderTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 260, 80));

        jPanel1.add(jPanel4);
        jPanel4.setBounds(470, 300, 420, 210);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("Report");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 20, 140, 44);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 540));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(250, 571));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Manage Menu");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 250, 50));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(250, 56));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Order Management");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 50));

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));
        jPanel8.setPreferredSize(new java.awt.Dimension(250, 56));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Report");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_small.png"))); // NOI18N
        jLabel16.setText("  BB BreakFast");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 230, 40));

        LouOut.setBackground(new java.awt.Color(255, 255, 204));
        LouOut.setText("Log Out");
        LouOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LouOutActionPerformed(evt);
            }
        });
        jPanel5.add(LouOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void revenueReport(){
        try (Socket socket = new Socket("localhost", 4909);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

            String date = revenueCombo.getSelectedItem().toString();
            out.writeObject(date);
            out.flush();

            ArrayList<String[]> result = (ArrayList<String[]>) in.readObject();

            DefaultTableModel model = (DefaultTableModel) revenueTable.getModel();
            model.setRowCount(0);
            int rowCountToDisplay = Math.min(result.size(), 3); 

            for (int i = 0; i < rowCountToDisplay; i++) {
                String[] row = result.get(i);
                Object[] rowData = new Object[]{row[0], row[1]};
                model.addRow(rowData);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }       
    }
    

    
    private void btnAgePieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgePieActionPerformed
        JFrame frame = new JFrame("Age Distribution Chart");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Age ageChart = new Age();
        ChartPanel chartPanel = new ChartPanel(ageChart.createChart(ageChart.createDataset(), "Age Groups"));
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));

        frame.getContentPane().add(chartPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_btnAgePieActionPerformed

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        setVisible(false);
        Manage_Order info = new Manage_Order();
        info.setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked

    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        setVisible(false);
        Manage_Menu info = new Manage_Menu();
        info.setVisible(true);
    }//GEN-LAST:event_jPanel6MouseClicked

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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFrame frame = new JFrame("Gender Chart");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Gender genderChart = new Gender();
        ChartPanel chartPanel = new ChartPanel(genderChart.createChart(genderChart.createDataset(), "Gender"));
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));

        frame.getContentPane().add(chartPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame frame = new JFrame("Revenue Chart");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Income revenueChart = new Income(revenueCombo.getSelectedItem().toString());
        ChartPanel chartPanel = new ChartPanel(revenueChart.createChart(revenueChart.createDataset(), "Revenue"));
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));

        frame.getContentPane().add(chartPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFrame frame = new JFrame("Order Chart");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Order orderChart = new Order();
        ChartPanel chartPanel = new ChartPanel(orderChart.createChart(orderChart.createDataset(), "Order"));
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));

        frame.getContentPane().add(chartPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        jPanel7.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
       jPanel6.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        jPanel6.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_jPanel6MouseExited

    private void revenueComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revenueComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_revenueComboActionPerformed

    private void revenueComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_revenueComboItemStateChanged
        revenueReport();
    }//GEN-LAST:event_revenueComboItemStateChanged

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LouOut;
    private javax.swing.JTable ageTable;
    private javax.swing.JButton btnAgePie;
    private javax.swing.JTable genderTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable orderTable;
    private javax.swing.JComboBox<String> revenueCombo;
    private javax.swing.JTable revenueTable;
    private javax.swing.JLabel txtTotalCus;
    private javax.swing.JLabel txtTotalOrder;
    private javax.swing.JLabel txtTotalRevenue;
    // End of variables declaration//GEN-END:variables
}
