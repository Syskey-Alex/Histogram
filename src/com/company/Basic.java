package com.company;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

public class Basic extends JPanel {
    private JFrame frame;
    private int[] values;

    public Basic(int width, int height, int[]) {

        // initialise the window
        frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 300);

        // create the canvas that will hold the actual graphics
        frame.getContentPane().add(this);

        // display the frame AFTER adding the panel to prevent drawing glitches
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        int left = 50;    // hard-coded just for testing
        int top = 80;
        int height = 150;
        int width = 40;

        g.setColor(Color.CYAN);
        g.fillRect(left, top, width, height);


        if (int[] value :values) {
            g.fillRect(left, top, height, width);
            left == width + 5;

frame.repaint();

        }
public void makeItGreen() {
            barColor = Color.green;
            // more efficient than 
            frame.repaint();
        }

    }
}

