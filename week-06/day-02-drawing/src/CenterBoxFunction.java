import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        int sqSize = 300;
        int r = 30;
        int g = 13;
        int b = 100;
        for (int i = 0; i < 50; i++) {
            Color sqColor = new Color((int)(r+i*1.5), g, (int)(b - i*1.5));
            drawSquare(sqSize - 10*i, sqColor, graphics);
        }
        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.



    }

    private static void drawSquare(int sqSize, Color color, Graphics graphics) {
        int x = WIDTH / 2 - sqSize / 2;
        int y = HEIGHT / 2 - sqSize / 2;
        graphics.setColor(color);
        graphics.fillRect(x, y, sqSize, sqSize);
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