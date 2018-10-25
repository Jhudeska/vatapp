package com.proftaak.vatapp;

import com.proftaak.vatapp.model.ConnectJDBC;
import com.proftaak.vatapp.view.Shape;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        /**
         * This will make an database connection through the getConnection method.
         */
        ConnectJDBC conn =  new ConnectJDBC();
        conn.getConnection();


        /**
         * Shape class and objects
         */
        Shape shape =  new Shape();



        JFrame frame = new JFrame("vatapp1");
        frame.setContentPane(new Shape().panelmain);
    }

}
