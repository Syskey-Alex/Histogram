package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Basic extends JPanel {
    private JFrame frame;
    private int[] values = new int[]{1,2,3,4,5};
private int padding=20;
private double labelPadding=12;
    public Basic(int width, int height) {

        // initialise the window
        frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 300);

        // create the canvas that will hold the actual graphics
        frame.getContentPane().add(this);

        // display the frame AFTER adding the panel to prevent drawing glitches
        frame.setVisible(true);

        // initialise the window
        frame = new JFrame("Demo 2");
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
    }
public void paintComponent2(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
double xScale = ((double)getWidth()-(3*padding)-(labelPadding)/(values.size()-1));
double yScale = ((double)getHeight()-2*padding-labelPadding)/(getMaximumValues()-getMinimumValues());

List graphPoints = new ArrayList<>();
for(int i =0; i < values.size();i++){
    int x1 = (int)(i*xScale +padding+labelPadding);
}

        int left2 = 70;
    int top2 = 90;
    int height2 = 180;
    int width2 = 50;
    g.setColor(Color.RED);
    g.fillRect(left2, top2, height2, width2);

}

    private double getMinimumValues() {
    double minValue = Double.MAX_VALUE;
    for(int value: values){
        minValue= Math.min(minValue,value);
    }
    return minValue;
    }

    private double getMaximumValues() {
    double maxValue = Double.MIN_VALUE;
    for(int value: values){
        maxValue = Math.max(maxValue,value);
    }
    return maxValue;

    }
//      if (int[] value :values) {
 //      g.fillRect(left, top, height, width);
 //      left == width + 5;
 //      frame.repaint();


public static void outputHistogram(){
        int k = 0;
        for(int i=0; i <9; i++) {
            System.out.println((i*10+1)+"-"+(i*10+10)+":"+"\t");
        for(int j=1; j<=i;j++)
            System.out.print("@");

        System.out.println();
        }
}


        public void makeItGreen(Color barColor) {
            barColor = Color.green;
            // more efficient than
        frame.repaint();
        }

   }

