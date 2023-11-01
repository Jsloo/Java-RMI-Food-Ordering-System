/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fos.Client.Admin.Report;

import Fos.FosInterface;
import java.rmi.Naming;
import java.util.ArrayList;
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
public class Order {
    public PieDataset createDataset()
        {   
            DefaultPieDataset result = new DefaultPieDataset();
            
            try {
                FosInterface dbi = (FosInterface) Naming.lookup("rmi://localhost:2000/OrderReport");
                ArrayList<String[]> resultData = dbi.OrderReport();

                for (String[] row : resultData) {
                    String orderGroup = row[0];
                    int count = Integer.parseInt(row[1]);
                    result.setValue(orderGroup , count);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
             
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
