import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
    public static void mainDraw(Graphics graphics) {

        int n = 3;
        int w = WIDTH;
        int h = HEIGHT;
        splitIntoThree(w, h, n, graphics);
    }

    private static void splitIntoThree(int w, int h, int n, Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillRect(0,0, WIDTH, HEIGHT);

        int startX = 0;
        int startY = 0;

        w = w /n;
        h = h /n;
        graphics.setColor(Color.black);
        drawLines(startX, startY, w, h, n, graphics);
    }

    private static void drawLines(int startX, int startY, int w, int h, int n, Graphics graphics) {
        if (w == w/n/n/n/n/n) {
            return;
        }
        for (int i = 1; i < n; i++) {
            graphics.drawLine(startX + i * w, startY, startX + i * w, startY + n * h);
            graphics.drawLine(startX, startY + i * h,  startX + n * w, startY + i * h);
            startX = startX + i * w;
            startY = startY + i* h;
            drawLines(startX, startY, w/n, h/n, n, graphics);
        }

    }


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