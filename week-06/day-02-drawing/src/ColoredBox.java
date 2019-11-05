import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
//        int boxWidth = 70;
//        int boxHeight = 30
        // Draw a box that has different colored lines on each edge.
        graphics.setColor(Color.ORANGE);
        graphics.drawLine(10, 10, 80, 10);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(10, 10, 10, 40);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(80, 10, 80, 40);
        graphics.setColor(Color.PINK);
        graphics.drawLine(10, 40, 80, 40);
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