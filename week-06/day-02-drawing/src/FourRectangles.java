import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i < 4; i++) {
            int sideH = (int) (Math.random()*(WIDTH+1));
            int sideV = (int) (Math.random()*(HEIGHT+1));
            int startX = (int) (Math.random()*(WIDTH+1));
            int startY = (int) (Math.random()*(HEIGHT+1));
            Color rectColor = new Color((int) (Math.random()*256),(int) (Math.random()*256),(int) (Math.random()*256));
            drawRectangle (startX, startY, sideH, sideV, rectColor, graphics);
        }
    }

    private static void drawRectangle(int startX, int startY, int sideH, int sideV, Color rectColor, Graphics graphics) {
        graphics.setColor(rectColor);
        graphics.fillRect(startX, startY, (startX + sideH), (startY + sideV));
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