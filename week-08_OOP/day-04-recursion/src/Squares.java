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
        int cornerX = 0;
        int cornerY = 0;
        graphics.setColor(Color.black);
        splitIntoThree(cornerX, cornerY, size, level, graphics);
        level = level-1;
        cornerX = size;
        cornerY = 0;
        splitIntoThree(cornerX, cornerY, size/3, level, graphics);

        cornerX = 0;
        cornerY = size;
        splitIntoThree(cornerX, cornerY, size/3, level, graphics);

        cornerX = size;
        cornerY = 2*size;
        splitIntoThree(cornerX, cornerY, size/3, level, graphics);

        cornerX = 2*size;
        cornerY = size;
        splitIntoThree(cornerX, cornerY, size/3, level, graphics);
    }

    private static void splitIntoThree(int cornerX, int cornerY, int size, int level, Graphics graphics) {
/*        if (size == size /(Math.pow(n, level))) {
            return;
        }*/
        int w = 3*size;
        graphics.drawLine(cornerX+size, cornerY,  cornerX+size, cornerY+3*size);
        graphics.drawLine(cornerX+2*size, cornerY, cornerX+2*size, cornerY+3*size);
        graphics.drawLine(cornerX, cornerY+size, cornerX+3*size, cornerY+size);
        graphics.drawLine(cornerX, cornerY+2*size, cornerX+3*size, cornerY+2*size);

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