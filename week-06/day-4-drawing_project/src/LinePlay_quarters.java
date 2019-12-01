import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay_quarters {
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void mainDraw(Graphics graphics) {
        int density = 15;
        int w = WIDTH / 2;
        drawImage(density, w, graphics);
    }

    private static void drawImage(int density, int w, Graphics graphics) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int startX = i * w;
                int startY = j * w;
                lineplay(startX, startY, density, w, graphics);
            }
        }
    }

    private static void lineplay(int startX, int startY, int density, int w, Graphics graphics) {
        for (int i = 0; i < w + startX; i += w / density) {
            for (int j = 1; j <= w + startY; j += w / density) {
                if (Math.abs(i - j) == 1) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine(startX, startY + i, startX + j + w / density, startY + w);
                    graphics.setColor(new Color(200, 32, 255));
                    graphics.drawLine(startX + i, startY, startX + w, startY + j + w / density);
                }
            }
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