import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        int sqSize = WIDTH;
        int[] rgb = {0, 0, 0};
        int[][] rainbowRGB = new int[3][12];
        rainbowRGB = {
                {255, 0, 127},
                {255, 0, 255},
                {127, 0, 255},
                {0,	0, 255},
                0, 128, 255
                0	255	255
                0	255	128
                0	255	0
                128	255	0
                255	255	0
                255	128	0
                255	0	0
        }
// https://docs.google.com/spreadsheets/d/1NpioqSTNIQ6nWKUh1Cye7D5O3qjlpyJZhuZs2XleGkY/edit?usp=sharing
// this is my RGB chart for a rainbow, source: https://www.rapidtables.com/web/color/RGB_Color.html
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 3; j++) {
                rgb[j] += 10;
            }
            drawRainbowSq(sqSize, rgb, graphics);
            sqSize -= 20;
        }


        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

    }

    private static void drawRainbowSq(int sqSize, int[] rgb, Graphics graphics) {
        graphics.setColor(new Color(rgb[0], rgb[1], rgb[2]));
        graphics.fillRect((WIDTH/2 - sqSize/2), (HEIGHT/2 - sqSize/2), sqSize, sqSize);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}