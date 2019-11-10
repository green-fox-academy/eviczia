import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay_quarters {
    public static void mainDraw(Graphics graphics) {
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.
        int density = 20;
        int splitInto = 4;
        int w = WIDTH/splitInto*2;
        int h = HEIGHT/splitInto*2;
        int startX = 0;
        int startY = 0;
        drawImage(startX, startY, density, w, h, splitInto, graphics);

    }

    private static void drawImage(int startX, int startY, int density, int w, int h, int splitInto, Graphics graphics) {
        for (int i = 0; i < 2; i++) {
                startX = startX + i*w;
                startY = startY + i*h;
                lineplayNE(startX, startY, density, w, h, graphics);
                lineplaySW(startX, startY, density, w, h, graphics);
        }
    }

    private static void lineplaySW(int startX, int startY, int density, int w, int h, Graphics graphics) {
        for (int i = startX; i < w; i = i + w / density) {
            for (int j = startY + 1; j <= h; j = j + h / density) {
                if (Math.abs(i - j) == 1) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine(startX, i, j, h);
                }
            }
        }
    }

    private static void lineplayNE(int startX, int startY, int density, int w, int h, Graphics graphics) {
        for (int i = startX; i < w; i = i + w / density) {
            for (int j = startY + 1; j <= h; j = j + h / density) {
                if (Math.abs(i - j) == 1) {
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