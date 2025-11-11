package JDBC;

import java.sql.*;

public class JDBC_Demo {
    public static void main(String[] args) {
        String url = "";
        String user = "";
        String password = "";
        try{
            Connection con = (Connection) DriverManager.getConnection(url,user,password);
            System.out.println("Connection created with bank database.");
            Statement stmt = (Statement) con.createStatement();
            String strInsert = "insert into customer values(1,'abc',20)";
            //stmt.executeUpdate(strInsert);
            int val = stmt.executeUpdate(strInsert);
            if(val > 0) System.out.println("Value inserted successfully");
            String up = "Update customer set bal = 4000, name = 'Sumit Ku' where ";
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
