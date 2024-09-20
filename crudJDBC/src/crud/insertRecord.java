package crud;
import java.io.*;
import java.sql.*;
/**
 *
 * @author Rahul
 */
public class insertRecord {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        
        System.out.println("Enter Student Id: ");
        int sid = Integer.parseInt(dis.readLine());
        System.out.println("Enter Student Name: ");
        String sname = dis.readLine();
        System.out.println("Enter Student Age: ");
        int sage = Integer.parseInt(dis.readLine());
        
        Connection con = null;
        
        try {
            //Loading Drivers
            Class.forName("oracle.jdbc.OracleDriver");
            
            //establishing connection
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "rm");
            
            //creating query
            String query = "INSERT INTO student values("+sid+",'"+sname+"',"+sage+")";
            Statement stmt = con.createStatement();
            stmt.executeQuery(query);
            
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("1 Row Inserted");
    }
}
