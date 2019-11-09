import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int base =20;
        int w = WIDTH - (WIDTH % base);
        int n = w / base;
        int[] xStCoord = new int[n];
        int[] yStCoord = new int[n];
        int[] xEndCoord = new int[n];
        int[] yEndCoord = new int[n];
        xStCoord[0] = WIDTH/2;
        yStCoord[0] = 20;
        xEndCoord[0] = xStCoord[0];
        yEndCoord[0] = yStCoord[0];
        int height = (int)(Math.sqrt(3)/2*base);
        int h = height * (n-1);

        for (int i = 1; i < n -1; i++) {
            xStCoord[i] = xStCoord[0] - i*base /2;
            yStCoord[i] = yStCoord[0] + i*height;
            xEndCoord[i] = xEndCoord[0] + i*base /2;
            yEndCoord[i] = yEndCoord[0] + i*height;
            graphics.drawLine(xStCoord[i], yStCoord[i], xEndCoord[i], yEndCoord[i]);
            graphics.drawLine(xEndCoord[i-1], yEndCoord[i-1], (WIDTH - w) / 2 + i * base, yStCoord[0] + height*(n-2));
            graphics.drawLine(xStCoord[i-1], yStCoord[i-1], WIDTH - (WIDTH - w) / 2 - i * base, yStCoord[0] + height*(n-2));
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