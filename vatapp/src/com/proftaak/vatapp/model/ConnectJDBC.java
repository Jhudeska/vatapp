package model;

import java.sql.*;


public class ConnectJDBC {
    public Connection conn;

    public Connection getConnection(){

        String dbName="vatapp";
        String userName="root";
        String password="";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:http://vatapp:8888/"+dbName,userName,password);

        } catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }


}

