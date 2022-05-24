package com.company;
import javax.swing.*;
import java.awt.*;

public class Basic extends JPanel {

    private JFrame frame;

    public Basic(int width, int height) {
        // initialise the window
        frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 300);

        // create the canvas that will hold the actual graphics
        frame.getContentPane().add(this);

        // display the frame AFTER adding the panel to prevent drawing glitches
        frame.setVisible(true);
    }

    //@Override
    //public void paintComponent(Graphics g) {
    //    int left = 10;    // hard-coded just for testing
    //    int top = 70;
    //    int width = 20;
    //    int height = 100;

 //       g.setColor(Color.red);
//        g.fillRect(left, top, width, height);
  //     for (int i = 0; i <= 100; i++) {
   //         g.setColor(Color.RED);
   //         g.fillRect(left, top, width, height);
    //        g.fillRect(left + 1, top + 1, width + 1, height + 1);
     //   }
   // }
}