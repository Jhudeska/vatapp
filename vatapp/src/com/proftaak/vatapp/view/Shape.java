package com.proftaak.vatapp.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shape {

    /**
     * Shape class fields or atributes
     */
    private JPanel panelmain;
    private JButton save_btn;
    private JButton load_btn;
    private JButton calc_total_btn;
    private JButton remove_btn;
    private JTextArea textarea_search_shape;
    private JComboBox dropdown_choose_shape;
    private JTextField textfield_shape_content;
    private JTextField textfield_total_shapes_content;
    private JLabel vat_label;


    /**
     * Constructor
     */
    public Shape() {

            this.panelmain = panelmain;


        save_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        calc_total_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        remove_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        load_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
