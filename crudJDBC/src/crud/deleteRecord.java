/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.io.*;
import java.sql.*;
/**
 *
 * @author Rahul
 */
public class deleteRecord {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        
        System.out.println("Enter Student Id to be Deleted: ");
        int sid = Integer.parseInt(dis.readLine());
        
        Connection con = null;
        try {
            //Loading Drivers
            Class.forName("oracle.jdbc.OracleDriver");
            
            //establishing connection
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "rm");
            
            //preparing statement
            String query = "DELETE from student Where id="+sid+" ";
            Statement stmt = con.createStatement();
            stmt.executeQuery(query);
            
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        System.err.println("Data Deleted !");
    }
}
