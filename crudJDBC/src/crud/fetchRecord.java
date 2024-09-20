/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.sql.*;

/**
 *
 * @author Rahul
 */
public class fetchRecord {

    public static void main(String[] args) {
        Connection con = null;
        try {
            //Loading Drivers
            Class.forName("oracle.jdbc.OracleDriver");
            
            //establishing connection
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "rm");
            
            //firing query
            String sql = "SELECT * FROM student";
            Statement stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
        	//Iterating records
        	while(rs.next())
         	{
           		System.out.println(rs.getString("id") + " " + rs.getString("name")
			 + " " + rs.getString("age"));
         	}
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
