import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillRect(0,0, WIDTH, HEIGHT);

        int n = 3;
        int size = WIDTH/3;
        int level = 5;
        graphics.setColor(Color.black);
        splitIntoThree(size, n, level, graphics);
    }

    private static void splitIntoThree(int size, int n, int level, Graphics graphics) {
        if (size == size /(Math.pow(n, level))) {
            return;
        }
        graphics.drawLine(WIDTH/2-size/2, 0, WIDTH/2-size/2, HEIGHT);
        graphics.drawLine(WIDTH/2+size/2, 0, WIDTH/2+size/2, HEIGHT);
        graphics.drawLine(0, HEIGHT/2-size/2, WIDTH, HEIGHT/2-size/2);
        graphics.drawLine(0, HEIGHT/2+size/2, WIDTH, HEIGHT/2+size/2);

        splitIntoThree(size/n, n, level -1, graphics);

    }
// TODO


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