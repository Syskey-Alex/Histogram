package com.company;

import javax.swing.*;
import java.awt.*;
public class Histogram extends JPanel {
    private JFrame frame;
    int arraySize;
    int[] intArray;
    int maxSize = 0;

    public Histogram(int[] iArray, int arraySize) {
        this.arraySize = arraySize;
        this.intArray = new int[arraySize];
        intArray = iArray;
        //make window
        frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //make for loop that is able to reiterate through the rectangles and check the max height.
        for (int x = 0; x < arraySize; x++) {
            if (intArray[x] * 10 > maxSize) {
                maxSize = intArray[x] * 10;
            }
        }
        frame.setSize(300, 300);

        //holds actual graph
        frame.getContentPane().add(this);

        //prevents glitches if displayed after all frames
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        //hardcoded variables to test data
        int left;   
        //top of graph is the biggest size the rectangle can reach
        int top = maxSize; 
        int width = 40;
        int height;
        g.setColor(Color.red);
        
        
        for (int x = 0; x < arraySize; x++) {
            left = x * 50; 
            height = intArray[x] * 10; 
            //do top - height for graph to be correct way around
            g.fillRect(left, top - height, width, height);

        }
    }
}
