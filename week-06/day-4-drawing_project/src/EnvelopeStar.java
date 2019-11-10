import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        int w = WIDTH / 2;
        int h = HEIGHT / 2;
        int units = 40;
        int unitLength = WIDTH / units / 2;

        for (int i = 0; i < units; i++) {
            graphics.drawLine(w, i*unitLength, w-(i+1)*unitLength, h);
            graphics.drawLine(w, i*unitLength, w+(i+1)*unitLength, h);
            graphics.drawLine(w, h + (i+1)*unitLength, i*unitLength, h);
            graphics.drawLine(w, h + (i+1)*unitLength, 2*w-i*unitLength, h);
        }
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