package com.company;

import javax.swing.*;
import java.awt.*;
public class Histogram extends JPanel {
    private JFrame frame;
    int arraySize;
    int [] intArray;
    int maxSize = 0;
    public Histogram(int[] iArray, int arraySize){
        this.arraySize = arraySize;
        this.intArray  = new int[arraySize];
        intArray = iArray;
        // initialise the window
        frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        for(int x = 0 ; x < arraySize ; x++){
            if(intArray[x] * 10 > maxSize){
                maxSize = intArray[x] * 10;
            }
        }
        frame.setSize(300,  300);

        // create the canvas that will hold the actual graphics
        frame.getContentPane().add(this);

        // display the frame AFTER adding the panel to prevent drawing glitches
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        int left;    // hard-coded just for testing
        int top = maxSize; //the top of tallest rectangle is top of the window
        int width = 40;
        int height;
        g.setColor(Color.red);
        //g.fillRect(left, top, width, height);
        for(int x = 0 ; x < arraySize ; x++){
            left = x * 50; //point of each rectangle is equally split
            height = intArray[x] *10; //scaling up the int values for gui
            g.fillRect(left, top - height, width, height );import javax.swing.*;
import java.awt.*;
            public class Histogram extends JPanel{
                private JFrame frame;
                int arraySize;
                int [] intArray;
                int maxSize = 0;
                public Histogram(int[] iArray, int arraySize){
                    this.arraySize = arraySize;
                    this.intArray  = new int[arraySize];
                    intArray = iArray;
                    frame = new JFrame("Demo");
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    for(int x = 0 ; x < arraySize ; x++){
                        if(intArray[x] * 10 > maxSize){
                            maxSize = intArray[x] * 10;
                        }
                    }
                    frame.setSize(300,  300);

                    frame.getContentPane().add(this);

                    frame.setVisible(true);
                }

                @Override
                public void paintComponent(Graphics g) {
                    int left;
                    int top = maxSize;
                    int width = 40;
                    int height;
                    g.setColor(Color.red);
                    for(int x = 0 ; x < arraySize ; x++){
                        left = x * 50;
                        height = intArray[x] *10;

                        g.fillRect(left, top - height, width, height );
                    }
                }
            }
        }
    }
}