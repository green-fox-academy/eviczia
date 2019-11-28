import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Sierpinsky_Carpet {
    public static void mainDraw(Graphics graphics) {

        int size = WIDTH/3;
        drawSquare(size, graphics);
        drawNineSquares(size/3, graphics);
    }

    private static void drawNineSquares(int size, Graphics graphics) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int x = size*(j*3 +1);
                int y= size*(i*3 +1);
                graphics.fillRect(x, y, size, size);


            }

        }


    }

    private static void drawSquare(int size, Graphics graphics) {
        int x = size*3/2 - size/2;
        int y= size*3/2 - size/2;

        graphics.fillRect(x, y, size, size);

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