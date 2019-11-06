import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]
        int sqSide = 10;
        int startX = 10;
        int startY = 10;
        int repeat = 6;
        Color fillColor = new Color(160, 0, 255);
        Color frameColor = Color.BLACK;
        for (int i = 0; i < 6; i++) {
            graphics.setColor(fillColor);
            graphics.fillRect(startX, startY, sqSide, sqSide);
            graphics.setColor(frameColor);
            graphics.drawRect(startX, startY, sqSide, sqSide);
            startX += sqSide;
            startY += sqSide;
            sqSide *= 1.5;
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