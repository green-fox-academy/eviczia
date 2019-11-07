import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.
        int density = 20;
        int w = WIDTH;
        int h = HEIGHT;
        for (int i = 0; i < w; i = i + w / density) {
            for (int j = 1; j <= h; j = j + h / density) {
                if (Math.abs(i - j) == 1) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine(0, i, j, h);
                    graphics.setColor(new Color(200, 32, 255));
                    graphics.drawLine(i, 0, h, j);

                }
            }
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