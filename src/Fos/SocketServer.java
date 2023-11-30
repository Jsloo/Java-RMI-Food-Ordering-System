/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class SocketServer {
    
    private static final int PORT_NUMBER = 4909;
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT_NUMBER)) {
            System.out.println("Server is listening on port " + PORT_NUMBER);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(() -> handleClient(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket clientSocket) {
        try (ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
             ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream())) {

            String date = (String) in.readObject();

            ArrayList<String[]> revenueDataList = generateRevenueReport(date);

            out.writeObject(revenueDataList);
            out.flush();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String[]> generateRevenueReport(String date) {
        ArrayList<String[]> revenueDataList = new ArrayList<>();
        Integer day = 0;
        if (date.equals("Today")){
            day = 0;
        }else if(date.equals("Week")){
            day = 6;
        }else if(date.equals("Month")){
            day = 30;
        }else if(date.equals("Year")){
            day = 364;
        }
        
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos")) {
            LocalDate todayDate = LocalDate.now();
            LocalDate startDate = todayDate.minusDays(day); 
            String revenueScript = "SELECT m.category, SUM(m.price * oi.quantity) as total_revenue " +
                      "FROM order_history oh " +
                      "JOIN order_history_item oi ON oh.id = oi.order_id " +
                      "JOIN menu m ON oi.menu_id = m.id " +
                      "WHERE oh.date BETWEEN '" + startDate + "' AND '" + todayDate + "' " +
                      "GROUP BY m.category " +
                      "ORDER BY total_revenue DESC";
            

            try (PreparedStatement statement = conn.prepareStatement(revenueScript)) {
                ResultSet RevenueResult = statement.executeQuery();
                while (RevenueResult.next()) {
                    String category = RevenueResult.getString("CATEGORY");
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    String totalRevenue = decimalFormat.format(RevenueResult.getDouble("total_revenue"));
                    String[] data = { category, totalRevenue };
                    revenueDataList.add(data);
                }
            }
        }catch (Exception e) {
            String[] errorData = { "Error", e.toString() };
            revenueDataList.add(errorData);
        }

        return revenueDataList;
    }
}
