import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillRect(0,0, WIDTH, HEIGHT);

        int size = WIDTH/3;
        int level = 4;
        int cornerX = 0;
        int cornerY = 0;
        graphics.setColor(Color.black);
        splitIntoThree(cornerX, cornerY, size, level, graphics);
    }

    private static void splitIntoThree(int cornerX, int cornerY, int size, int level, Graphics graphics) {
        int w = 3*size;
//        graphics.drawRect(cornerX, cornerY, size*3, size*3);
        graphics.drawLine(cornerX+size, cornerY,  cornerX+size, cornerY+3*size);
        graphics.drawLine(cornerX+2*size, cornerY, cornerX+2*size, cornerY+3*size);
        graphics.drawLine(cornerX, cornerY+size, cornerX+3*size, cornerY+size);
        graphics.drawLine(cornerX, cornerY+2*size, cornerX+3*size, cornerY+2*size);


        while (level>0) {
            level = level-1;
            splitIntoThree(cornerX+size, cornerY, size/3, level, graphics);

            splitIntoThree(cornerX, cornerY+size, size/3, level, graphics);

            splitIntoThree(cornerX+2*size, cornerY+size, size/3, level, graphics);

            splitIntoThree(cornerX+size, cornerY+2*size, size/3, level, graphics);
        }


    }
// TODO


    static int WIDTH = 729;
    static int HEIGHT = 729;

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