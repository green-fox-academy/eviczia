import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Sierpinsky_Carpet {
    public static void mainDraw(Graphics graphics) {

        int size = WIDTH/3;
        drawSquare(size, graphics);
        int limit = 6;
        drawNineSquares(size/3, limit, graphics);
    }

    private static void drawNineSquares(int size, int limit, Graphics graphics) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        int x = size*(j*3 +1)+l*WIDTH/3;
                        int y= size*(i*3 +1)+k*WIDTH/3;
                        graphics.fillRect(x, y, size, size);
                    }
                }

            }

        }
        if (size> WIDTH/Math.pow(3,limit)) {
            drawNineSquares(size/3, limit, graphics);
        }
    }

    private static void drawSquare(int size, Graphics graphics) {
        int x = size*3/2 - size/2;
        int y= size*3/2 - size/2;
        graphics.fillRect(x, y, size, size);

    }

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