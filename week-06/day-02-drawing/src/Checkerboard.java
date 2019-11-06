import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        graphics.setColor(Color.WHITE);
        int littleSqSide = WIDTH/8; // side size for the 32 little squares
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) { // iteration to draw 32 little white squares
                if ((i+j) % 2 == 0) { // check the sum of x,y starting coordinates of little square
                    graphics.setColor(Color.BLACK); // if it's an even number, change colour to black
                graphics.fillRect(i*littleSqSide, j*littleSqSide, littleSqSide, littleSqSide ); //draw the squares
                }
            }
        graphics.drawRect(0,0, WIDTH, HEIGHT); // draw frame for checkerboard
        }
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