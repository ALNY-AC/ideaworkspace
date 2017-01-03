package com.yjh.Main;

import javax.swing.*;

/**
 * Created by asus on 2017/1/2.
 */
public class TEST extends JFrame {

    public static void main(String[] args) {
        TEST t = new TEST("asd", 1000, 600);
    }


    /**
     * @param w 宽度
     * @param h 高度
     */
    public TEST(String title, int w, int h) {
        super(title);
        setSize(w, h);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }


}
