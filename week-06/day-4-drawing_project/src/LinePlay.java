import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void mainDraw(Graphics graphics) {
        int density = 20;
        int w = WIDTH;
        int startX = 0;
        int startY = 0;
        lineplay(startX, startY, density, w, graphics);
    }

    private static void lineplay(int startX, int startY, int density, int w, Graphics graphics) {
        for (int i = 0; i < w; i += w / density) {
            for (int j = 1; j <= w; j += w / density) {
                drawColouredLine(startX, startY, density, w, graphics, i, j);
            }
        }
    }

    static void drawColouredLine(int startX, int startY, int density, int w, Graphics graphics, int i, int j) {
        if (Math.abs(i - j) == 1) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(startX, startY + i, startX + j + w / density, startY + w);
            graphics.setColor(new Color(200, 32, 255));
            graphics.drawLine(startX + i, startY, startX + w, startY + j + w / density);
        }
    }

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