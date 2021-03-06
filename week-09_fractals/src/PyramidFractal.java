import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PyramidFractal {
    public static void mainDraw(Graphics graphics) {

        int n = 3;
        int w = WIDTH;
        int h = HEIGHT;

        splitIntoThree(w, h, n, graphics);
    }

    private static void splitIntoThree(int w, int h, int n, Graphics graphics) {


        for (int i = 0; i < n; i++) {
            graphics.drawLine(i * w, 0, i * w, n * h);
            graphics.drawLine(0, i * h, n * w, i * h);
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