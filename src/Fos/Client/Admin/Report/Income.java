/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fos.Client.Admin.Report;

import Fos.FosInterface;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.rmi.Naming;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author User
 */
public class Income {
    public String day;
    public Income(String date){
        day = date;
    }
    
    public PieDataset createDataset()
        {   
            DefaultPieDataset result = new DefaultPieDataset();
            try (Socket socket = new Socket("localhost", 4909);
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

               String date = day;
               out.writeObject(date);
               out.flush();

               ArrayList<String[]> resultData = (ArrayList<String[]>) in.readObject();

               for (String[] row : resultData) {
                    String revenueGroup = row[0];
                    double count = Double.parseDouble(row[1]);
                    result.setValue(revenueGroup , count);
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
//            DefaultPieDataset result = new DefaultPieDataset();
//            System.out.println(day);
////            try {
////                FosInterface dbi = (FosInterface) Naming.lookup("rmi://localhost:2000/RevenueReport");
////                ArrayList<String[]> resultData = dbi.RevenueReport(day);
////
////                for (String[] row : resultData) {
////                    String revenueGroup = row[0];
////                    double count = Double.parseDouble(row[1]);
////                    result.setValue(revenueGroup , count);
////                }
////            } catch (Exception e) {
////                e.printStackTrace();
////            }
             
            return result;
        }
    public JFreeChart createChart(PieDataset dataset, String title){
        JFreeChart chart = ChartFactory.createPieChart3D(title, dataset, true,true, false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
}
