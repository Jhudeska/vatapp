package com.proftaak.vatapp.model;

import java.sql.*;


public class ConnectJDBC {

    public Connection getConnection(){

        Connection connection = null;


        System.out.println("Connection called");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vatapp?useSSL=false","root", "");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;

    }


}