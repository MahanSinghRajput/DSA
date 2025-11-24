package JDBC;

import java.sql.*;

public class examples {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driverClassName = "";
        String url = "";
        String username = "";
        String password = "";
        String query = "";

        //Load driver class
        Class.forName(driverClassName);

        //Obtain a connection
        Connection con = DriverManager.getConnection(url,username,password);

        //Obtain a statement
        Statement st = con.createStatement();

        //Execute the query
        int count = st.executeUpdate(query);
        System.out.println("Number of rows affected by the query " + count);

        //Closing the connection as the requirement with connection is completed
        con.close();
    }
}
